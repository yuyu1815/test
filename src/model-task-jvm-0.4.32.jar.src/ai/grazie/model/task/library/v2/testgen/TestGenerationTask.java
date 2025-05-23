/*    */ package ai.grazie.model.task.library.v2.testgen;
/*    */ import ai.grazie.model.task.exec.TaskParametersBuilder;
/*    */ import ai.grazie.model.task.library.testgen.TestGenerationContextMetadata;
/*    */ import ai.grazie.model.task.library.testgen.TestSuiteMetadata;
/*    */ import ai.grazie.model.task.library.testgen.UserRequestMetadata;
/*    */ import ai.grazie.model.task.library.testgen.attributes.TestGenerationContextMetadataAttr;
/*    */ import ai.grazie.utils.attributes.AttributeDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\0020\001:\001\017B\007\b\002¢\006\002\020\002J&\020\007\032\0020\b2\006\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\016R\024\020\003\032\0020\004X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\020"}, d2 = {"Lai/grazie/model/task/library/v2/testgen/TestGenerationTask;", "Lai/grazie/model/task/id/TaskNameDescriptor;", "()V", "name", "Lai/grazie/model/task/id/TaskName;", "getName", "()Lai/grazie/model/task/id/TaskName;", "default", "Lai/grazie/model/task/exec/TaskCall;", "context", "Lai/grazie/model/task/library/testgen/TestGenerationContextMetadata;", "previousTestSuite", "Lai/grazie/model/task/library/testgen/TestSuiteMetadata;", "userRequest", "Lai/grazie/model/task/library/testgen/UserRequestMetadata;", "Schema", "model-task"})
/*    */ public final class TestGenerationTask implements TaskNameDescriptor {
/*    */   @NotNull
/* 13 */   public static final TestGenerationTask INSTANCE = new TestGenerationTask(); @NotNull private static final TaskName name = new TaskName("test-generation"); @NotNull public TaskName getName() { return name; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final TaskCall default(@NotNull TestGenerationContextMetadata context, @Nullable TestSuiteMetadata previousTestSuite, @Nullable UserRequestMetadata userRequest) {
/* 20 */     Intrinsics.checkNotNullParameter(context, "context"); return new TaskCall(getName().tag(Default.INSTANCE.getTag()), TaskParameters.Companion.build(new TestGenerationTask$default$1(context, previousTestSuite, userRequest))); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/model/task/exec/TaskParametersBuilder;", "invoke"})
/* 21 */   static final class TestGenerationTask$default$1 extends Lambda implements Function1<TaskParametersBuilder, Unit> { public final void invoke(TaskParametersBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.add((AttributeDescriptor)TestGenerationTask.Schema.INSTANCE.getContext(), this.$context);
/* 22 */       $this$build.add((AttributeDescriptor)TestGenerationTask.Schema.INSTANCE.getPreviousTestSuite(), this.$previousTestSuite);
/* 23 */       $this$build.add((AttributeDescriptor)TestGenerationTask.Schema.INSTANCE.getUserRequest(), this.$userRequest); }
/*    */      TestGenerationTask$default$1(TestGenerationContextMetadata $context, TestSuiteMetadata $previousTestSuite, UserRequestMetadata $userRequest) {
/*    */       super(1);
/*    */     } }
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002R$\020\003\032\022\022\016\022\f\022\b\b\001\022\004\030\0010\0060\0050\004X\004¢\006\b\n\000\032\004\b\007\020\bR\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\013\020\fR\021\020\r\032\0020\016¢\006\b\n\000\032\004\b\017\020\020R\021\020\021\032\0020\022¢\006\b\n\000\032\004\b\023\020\024¨\006\025"}, d2 = {"Lai/grazie/model/task/library/v2/testgen/TestGenerationTask$Schema;", "Lai/grazie/model/task/id/TaskSchemaDescriptor;", "()V", "all", "", "Lai/grazie/utils/attributes/AttributeDescriptor$Json;", "", "getAll", "()Ljava/util/List;", "context", "Lai/grazie/model/task/library/testgen/attributes/TestGenerationContextMetadataAttr;", "getContext", "()Lai/grazie/model/task/library/testgen/attributes/TestGenerationContextMetadataAttr;", "previousTestSuite", "Lai/grazie/model/task/library/testgen/attributes/TestSuiteMetadataAttr;", "getPreviousTestSuite", "()Lai/grazie/model/task/library/testgen/attributes/TestSuiteMetadataAttr;", "userRequest", "Lai/grazie/model/task/library/testgen/attributes/UserRequestMetadataAttr;", "getUserRequest", "()Lai/grazie/model/task/library/testgen/attributes/UserRequestMetadataAttr;", "model-task"})
/*    */   public static final class Schema implements TaskSchemaDescriptor { @NotNull
/* 29 */     public static final Schema INSTANCE = new Schema(); @NotNull private static final TestGenerationContextMetadataAttr context = new TestGenerationContextMetadataAttr("context"); @NotNull public final TestGenerationContextMetadataAttr getContext() { return context; } @NotNull
/* 30 */     private static final TestSuiteMetadataAttr previousTestSuite = new TestSuiteMetadataAttr("previousTestSuite"); @NotNull public final TestSuiteMetadataAttr getPreviousTestSuite() { return previousTestSuite; } @NotNull
/* 31 */     private static final UserRequestMetadataAttr userRequest = new UserRequestMetadataAttr("userRequest"); @NotNull private static final List<AttributeDescriptor.Json<? extends Object>> all; @NotNull public final UserRequestMetadataAttr getUserRequest() { return userRequest; }
/*    */     @NotNull
/* 33 */     public List<AttributeDescriptor.Json<? extends Object>> getAll() { return all; } static { AttributeDescriptor.Json[] arrayOfJson = new AttributeDescriptor.Json[3]; arrayOfJson[0] = (AttributeDescriptor.Json)context; arrayOfJson[1] = (AttributeDescriptor.Json)previousTestSuite; arrayOfJson[2] = (AttributeDescriptor.Json)userRequest; all = CollectionsKt.listOf((Object[])arrayOfJson); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\testgen\TestGenerationTask.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */