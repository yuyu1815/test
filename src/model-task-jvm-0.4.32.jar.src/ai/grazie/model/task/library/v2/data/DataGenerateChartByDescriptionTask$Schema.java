/*    */ package ai.grazie.model.task.library.v2.data;
/*    */ 
/*    */ import ai.grazie.model.task.id.TaskSchemaDescriptor;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R4\020\003\032\"\022\036\022\034\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\b\b\001\022\004\030\0010\b0\0050\004X\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b\021\020\022R\021\020\023\032\0020\024¢\006\b\n\000\032\004\b\025\020\026¨\006\027"}, d2 = {"Lai/grazie/model/task/library/v2/data/DataGenerateChartByDescriptionTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "", "getAll", "()Ljava/util/List;", "dataframe", "Lai/grazie/model/task/library/v2/data/DataframeInfoAttr;", "getDataframe", "()Lai/grazie/model/task/library/v2/data/DataframeInfoAttr;", "plotDescription", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getPlotDescription", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "plottingFramework", "Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "getPlottingFramework", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "model-task"})
/*    */ public final class Schema
/*    */   implements TaskSchemaDescriptor
/*    */ {
/*    */   @NotNull
/* 26 */   public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text plotDescription = new AttributeDescriptor.Text("plotDescription"); @NotNull public final AttributeDescriptor.Text getPlotDescription() { return plotDescription; } @NotNull
/* 27 */   private static final DataframeInfoAttr dataframe = new DataframeInfoAttr("dataframe"); @NotNull public final DataframeInfoAttr getDataframe() { return dataframe; } @NotNull
/* 28 */   private static final AttributeDescriptor.OptText plottingFramework = new AttributeDescriptor.OptText("plottingFramework"); @NotNull public final AttributeDescriptor.OptText getPlottingFramework() { return plottingFramework; } @NotNull
/*    */   private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> all; @NotNull
/* 30 */   public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[3]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)plotDescription; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)dataframe; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)plottingFramework; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\data\DataGenerateChartByDescriptionTask$Schema.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */