/*
 * This file is part of MineTweaker API, licensed under the MIT License (MIT).
 * 
 * Copyright (c) 2014 MineTweaker <http://minetweaker3.powerofbytes.com>
 */
package org.openzen.zencode.symbolic.expression.partial;

import java.util.ArrayList;
import java.util.List;
import org.openzen.zencode.runtime.IAny;
import org.openzen.zencode.symbolic.symbols.MemberVirtualSymbol;
import org.openzen.zencode.symbolic.scope.IMethodScope;
import org.openzen.zencode.symbolic.expression.IPartialExpression;
import org.openzen.zencode.symbolic.symbols.IZenSymbol;
import org.openzen.zencode.symbolic.member.IGetter;
import org.openzen.zencode.symbolic.member.ISetter;
import org.openzen.zencode.symbolic.method.IMethod;
import org.openzen.zencode.symbolic.type.IZenType;
import org.openzen.zencode.symbolic.unit.SymbolicFunction;
import org.openzen.zencode.util.CodePosition;

/**
 *
 * @author Stan
 * @param <E>
 * @param <T>
 */
public class PartialVirtualMember<E extends IPartialExpression<E, T>, T extends IZenType<E, T>>
		extends AbstractPartialExpression<E, T>
{
	private final E target;

	private final String name;

	private IGetter<E, T> getter;
	private ISetter<E, T> setter;
	private final List<IMethod<E, T>> methods;

	public PartialVirtualMember(CodePosition position, IMethodScope<E, T> scope, E target, String name)
	{
		super(position, scope);

		this.target = target;
		this.name = name;
		this.methods = new ArrayList<IMethod<E, T>>();
	}

	private PartialVirtualMember(CodePosition position, IMethodScope<E, T> scope, PartialVirtualMember<E, T> original)
	{
		super(position, scope);

		this.target = original.target;
		this.name = original.name;
		this.methods = original.methods;
	}

	public E getTarget()
	{
		return target;
	}

	public String getName()
	{
		return name;
	}

	public void setGetter(IGetter<E, T> getter)
	{
		this.getter = getter;
	}

	public void setSetter(ISetter<E, T> setter)
	{
		this.setter = setter;
	}

	public void addMethod(IMethod<E, T> method)
	{
		methods.add(method);
	}

	public boolean isEmpty()
	{
		return getter == null && setter == null && methods.isEmpty();
	}

	public PartialVirtualMember<E, T> makeVariant(CodePosition position, IMethodScope<E, T> scope)
	{
		return new PartialVirtualMember<E, T>(position, scope, this);
	}

	@Override
	public E eval()
	{
		if (getter == null)
			throw new UnsupportedOperationException("This member is not a property or not readable");

		return getter.compileGet(getPosition(), getScope()).eval();
	}

	@Override
	public E assign(CodePosition position, E other)
	{
		if (setter == null)
			throw new UnsupportedOperationException("This member is not a properly or not writeable");

		return setter.compile(position, getScope(), other);
	}

	@Override
	public IPartialExpression<E, T> getMember(CodePosition position, String name)
	{
		if (getter == null)
			throw new UnsupportedOperationException("This member is not a property or not readable");

		return getter.compileGet(getPosition(), getScope()).getMember(position, name);
	}

	@Override
	public List<IMethod<E, T>> getMethods()
	{
		return methods;
	}

	@Override
	public IPartialExpression<E, T> call(CodePosition position, IMethod<E, T> method, List<E> arguments)
	{
		return method.callVirtual(position, getScope(), target, arguments);
	}

	@Override
	public IZenSymbol<E, T> toSymbol()
	{
		return new MemberVirtualSymbol<E, T>(this);
	}

	@Override
	public T getType()
	{
		if (getter == null)
			return null;

		return getter.getType();
	}

	@Override
	public T toType(List<T> genericTypes)
	{
		return null;
	}

	@Override
	public IPartialExpression<E, T> via(SymbolicFunction<E, T> function)
	{
		return this;
	}

	@Override
	public IAny getCompileTimeValue()
	{
		IAny ctTarget = target.getCompileTimeValue();
		if (ctTarget == null)
			return null;
		
		return ctTarget.memberGet(name);
	}
}