/*    */ package ai.grazie.model.task.library.v2.data;
/*    */ import ai.grazie.model.task.exec.TaskCall;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.id.TaskName;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003\bÇ\002\030\0002\0020\001:\001\016B\007\b\002¢\006\002\020\002J\037\020\007\032\0020\b2\006\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\f¢\006\002\020\rR\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\017"}, d2 = {"Lai/grazie/model/task/library/v2/data/DataGenerateVegaChartTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "dataframe", "Lai/grazie/model/task/library/v2/data/DataframeInfo;", "numberOfCharts", "", "(Lai/grazie/model/task/library/v2/data/DataframeInfo;Ljava/lang/Integer;)Lai/grazie/model/task/exec/TaskCall;", "Schema", "model-task"})
/*    */ public final class DataGenerateVegaChartTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 12 */   public static final DataGenerateVegaChartTask INSTANCE = new DataGenerateVegaChartTask(); @NotNull private static final TaskName name = new TaskName("data-generate-vega-chart"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */   
/*    */   @NotNull
/* 16 */   public final TaskCall default(@NotNull DataframeInfo dataframe, @Nullable Integer numberOfCharts) { Intrinsics.checkNotNullParameter(dataframe, "dataframe"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new DataGenerateVegaChartTask$default$1(dataframe, numberOfCharts))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 17 */   static final class DataGenerateVegaChartTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)DataGenerateVegaChartTask.Schema.INSTANCE.getDataframe(), this.$dataframe);
/* 18 */       Integer integer1 = this.$numberOfCharts, integer2 = this.$numberOfCharts; int $this$invoke_u24lambda_u240 = integer1.intValue(), $i$a$-run-DataGenerateVegaChartTask$default$1$1 = 0;
/* 19 */       $this$build.add((AttributeDescriptor)DataGenerateVegaChartTask.Schema.INSTANCE.getNumberOfCharts(), integer2); }
/*    */     
/*    */     DataGenerateVegaChartTask$default$1(DataframeInfo $dataframe, Integer $numberOfCharts) {
/*    */       super(1);
/*    */     } }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R4\020\003\032\"\022\036\022\034\022\006\b\001\022\0020\006\022\006\b\001\022\0020\007\022\b\b\001\022\004\030\0010\b0\0050\004X\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\r\020\016R\021\020\017\032\0020\020¢\006\b\n\000\032\004\b\021\020\022¨\006\023"}, d2 = {"Lai/grazie/model/task/library/v2/data/DataGenerateVegaChartTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor;", "Lai/grazie/utils/attributes/Attributes$Key;", "Lai/grazie/utils/attributes/Attributes$Value;", "", "getAll", "()Ljava/util/List;", "dataframe", "Lai/grazie/model/task/library/v2/data/DataframeInfoAttr;", "getDataframe", "()Lai/grazie/model/task/library/v2/data/DataframeInfoAttr;", "numberOfCharts", "Lai/grazie/utils/attributes/AttributeDescriptor$OptInt;", "getNumberOfCharts", "()Lai/grazie/utils/attributes/AttributeDescriptor$OptInt;", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 27 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final DataframeInfoAttr dataframe = new DataframeInfoAttr("dataframe"); @NotNull public final DataframeInfoAttr getDataframe() { return dataframe; } @NotNull
/* 28 */     private static final AttributeDescriptor.OptInt numberOfCharts = new AttributeDescriptor.OptInt("numberOfCharts"); @NotNull private static final List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> all; @NotNull public final AttributeDescriptor.OptInt getNumberOfCharts() { return numberOfCharts; }
/*    */     @NotNull
/* 30 */     public List<AttributeDescriptor<? extends Attributes.Key, ? extends Attributes.Value, ? extends Object>> getAll() { return all; } static { AttributeDescriptor[] arrayOfAttributeDescriptor = new AttributeDescriptor[2]; arrayOfAttributeDescriptor[0] = (AttributeDescriptor)dataframe; arrayOfAttributeDescriptor[1] = (AttributeDescriptor)numberOfCharts; all = CollectionsKt.listOf((Object[])arrayOfAttributeDescriptor); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\data\DataGenerateVegaChartTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */