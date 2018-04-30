package crafttweaker.api.block;

import crafttweaker.annotations.ZenDoc;
import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.data.IData;
import stanhebben.zenscript.annotations.*;

/**
 * Block interface. Used to interact with blocks in the world.
 *
 * @author Stan Hebben
 */
@ZenRegister
@ZenClass("crafttweaker.block.IBlock")
@ZenDoc(PackageName = "crafttweaker.block.IBlock",
        ObjectGetters = { "Casting an IItemStack as IBlock. (Using the C#as keyword or the C#asBlock() method)",
                          "Using the C#getBlock(x,y,z) on an IWorld object.",
                          "Using C#getBlock() on ContentTweaker's ICTBlockState." })
public interface IBlock extends IBlockPattern {

    /**
     * Gets the block definition.
     *
     * @return block definition
     */

    @ZenDoc(PackageName = "crafttweaker.neato.danO", ObjectGetters = { "I", "mean", "this", "is", "cool" }, ExampleUsages = { "C#<minecraft:stone>.asBlock().definition; Returns: IBlockDefinition" }, AdditionalNotes = "Pretty cool don't ya think?")
    @ZenGetter("definition")
    IBlockDefinition getDefinition();

    @ZenDoc(ExampleUsages = { "C#<minecraft:stone>.asBlock().meta; Returns: int" })
    @ZenGetter("meta")
    int getMeta();

    @ZenDoc(ExampleUsages = { "C#<minecraft:stone>.asBlock().data; Returns: IData" })
    @ZenGetter("data")
    IData getTileData();
}
