/*    */ package ai.grazie.model.task.library.v2.data;
/*    */ import ai.grazie.model.task.exec.TaskCall;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\003\bÇ\002\030\0002\0020\001:\001\016B\007\b\002¢\006\002\020\002J\"\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\n\b\002\020\r\032\004\030\0010\nR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\017"}, d2 = {"Lai/grazie/model/task/library/v2/data/DataGenerateChartByDescriptionTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "plotDescription", "", "dataframe", "Lai/grazie/model/task/library/v2/data/DataframeInfo;", "plottingFramework", "Schema", "model-task"})
/*    */ public final class DataGenerateChartByDescriptionTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 12 */   public static final DataGenerateChartByDescriptionTask INSTANCE = new DataGenerateChartByDescriptionTask(); @NotNull private static final TaskName name = new TaskName("data-generate-chart-by-description"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */   
/*    */   @NotNull
/* 16 */   public final TaskCall default(@NotNull String plotDescription, @NotNull DataframeInfo dataframe, @Nullable String plottingFramework) { Intrinsics.checkNotNullParameter(plotDescription, "plotDescription"); Intrinsics.checkNotNullParameter(dataframe, "dataframe"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new DataGenerateChartByDescriptionTask$default$1(plotDescription, dataframe, plottingFramework))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 17 */   static final class DataGenerateChartByDescriptionTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)DataGenerateChartByDescriptionTask.Schema.INSTANCE.getPlotDescription(), this.$plotDescription);
/* 18 */       $this$build.add((AttributeDescriptor)DataGenerateChartByDescriptionTask.Schema.INSTANCE.getDataframe(), this.$dataframe);
/* 19 */       $this$build.add((AttributeDescriptor)DataGenerateChartByDescriptionTask.Schema.INSTANCE.getPlottingFramework(), this.$plottingFramework); }
/*    */     
/*    */     DataGenerateChartByDescriptionTask$default$1(String $plotDescription, DataframeInfo $dataframe, String $plottingFramework) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R4\020\003\032\"\022\036\022\034\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\b\b\001\022\004\030\0010\b0\0050\004X\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b\021\020\022R\021\020\023\032\0020\024¢\006\b\n\000\032\004\b\025\020\026¨\006\027"}, d2 = {"Lai/grazie/model/task/library/v2/data/DataGenerateChartByDescriptionTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "", "getAll", "()Ljava/util/List;", "dataframe", "Lai/grazie/model/task/library/v2/data/DataframeInfoAttr;", "getDataframe", "()Lai/grazie/model/task/library/v2/data/DataframeInfoAttr;", "plotDescription", "Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "getPlotDescription", "()Lai/grazie/utils/attributes/AttributeDescriptor$Text;", "plottingFramework", "Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "getPlottingFramework", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptText;", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 26 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final AttributeDescriptor.Text plotDescription = new AttributeDescriptor.Text("plotDescription"); @NotNull public final AttributeDescriptor.Text getPlotDescription() { return plotDescription; } @NotNull
/* 27 */     private static final DataframeInfoAttr dataframe = new DataframeInfoAttr("dataframe"); @NotNull public final DataframeInfoAttr getDataframe() { return dataframe; } @NotNull
/* 28 */     private static final AttributeDescriptor.OptText plottingFramework = new AttributeDescriptor.OptText("plottingFramework"); @NotNull private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> all; @NotNull public final AttributeDescriptor.OptText getPlottingFramework() { return plottingFramework; }
/*    */     @NotNull
/* 30 */     public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[3]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)plotDescription; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)dataframe; arrayOfAttributeDescriptor[2] = (AttributeDescriptor)plottingFramework; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\data\DataGenerateChartByDescriptionTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */