/*    */ package com.intellij.ml.llm.matterhorn.ej.idea;
/*    */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import java.util.List;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\020 \n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\b&\030\0002\0020\001B\023\022\n\020\002\032\006\022\002\b\0030\003¢\006\004\b\004\020\005J\026\020\006\032\0020\0072\006\020\b\032\0020\tH@¢\006\002\020\nJ,\020\013\032\0020\0072\006\020\f\032\0020\r2\f\020\016\032\b\022\004\022\0020\r0\0172\006\020\020\032\0020\021H@¢\006\002\020\022J2\020\023\032\b\022\004\022\0020\0240\0172\006\020\f\032\0020\r2\f\020\016\032\b\022\004\022\0020\r0\0172\006\020\020\032\0020\021H@¢\006\002\020\022J<\020\025\032\n\022\002\b\003\022\002\b\0030\0262\006\020\f\032\0020\r2\006\020\027\032\0020\r2\f\020\016\032\b\022\004\022\0020\r0\0172\006\020\020\032\0020\021H@¢\006\002\020\030J\036\020\031\032\0020\0072\f\020\016\032\b\022\004\022\0020\r0\0172\006\020\020\032\0020\021H\002J\b\020\032\032\0020\033H$J\024\020\034\032\0020\007*\0020\0332\006\020\020\032\0020\021H\004¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaAgentMatterhornStarterBase;", "Lcom/intellij/ml/llm/matterhorn/ej/core/EvaluationMatterhornStarterBase;", "artifactType", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ArtifactType;)V", "beforeProjectOpened", "", "projectDir", "Ljava/nio/file/Path;", "(Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "configureProject", "name", "", "args", "", "context", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "(Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateProject", "Lcom/intellij/ml/llm/matterhorn/ProjectProblem;", "buildArtifactRequest", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "task", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logStarterInfo", "getLogger", "Lcom/intellij/openapi/diagnostic/Logger;", "projectInformation", "ej-idea"})
/*    */ public abstract class IdeaAgentMatterhornStarterBase extends EvaluationMatterhornStarterBase {
/*    */   public IdeaAgentMatterhornStarterBase(@NotNull ArtifactType artifactType) {
/* 11 */     super(artifactType);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object beforeProjectOpened(@NotNull Path projectDir, @NotNull Continuation<? super Unit> $completion) {
/*    */     return beforeProjectOpened$suspendImpl(this, projectDir, $completion);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object configureProject(@NotNull String name, @NotNull List<String> args, @NotNull RootExecutionContext context, @NotNull Continuation<? super Unit> $completion) {
/*    */     return configureProject$suspendImpl(this, name, args, context, $completion);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object validateProject(@NotNull String name, @NotNull List<String> args, @NotNull RootExecutionContext context, @NotNull Continuation<? super List<ProjectProblem>> $completion) {
/*    */     return validateProject$suspendImpl(this, name, args, context, $completion);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object buildArtifactRequest(@NotNull String name, @NotNull String task, @NotNull List<String> args, @NotNull RootExecutionContext context, @NotNull Continuation<? super ArtifactRequest<?, ?>> $completion) {
/*    */     return buildArtifactRequest$suspendImpl(this, name, task, args, context, $completion);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private final void logStarterInfo(List args, RootExecutionContext context) {
/* 46 */     getLogger().info("Args: " + args);
/* 47 */     projectInformation(getLogger(), context);
/*    */   }
/*    */   @NotNull
/*    */   protected abstract Logger getLogger();
/*    */   
/*    */   protected final void projectInformation(@NotNull Logger $this$projectInformation, @NotNull RootExecutionContext context) {
/* 53 */     Intrinsics.checkNotNullParameter($this$projectInformation, "<this>"); Intrinsics.checkNotNullParameter(context, "context"); Project project = context.getService().getProject();
/* 54 */     ProjectRootManager rootManager = ProjectRootManager.getInstance(project);
/* 55 */     $this$projectInformation.info("Launching for Project: " + project);
/* 56 */     $this$projectInformation.info("    project SDK: " + rootManager.getProjectSdk());
/* 57 */     Intrinsics.checkNotNullExpressionValue(rootManager.getContentRootsFromAllModules(), "getContentRootsFromAllModules(...)"); $this$projectInformation.info("    content roots from all modules: " + ArraysKt.joinToString$default((Object[])rootManager.getContentRootsFromAllModules(), null, null, null, 0, null, null, 63, null));
/* 58 */     Intrinsics.checkNotNullExpressionValue(rootManager.getContentSourceRoots(), "getContentSourceRoots(...)"); $this$projectInformation.info("    source roots: " + ArraysKt.joinToString$default((Object[])rootManager.getContentSourceRoots(), null, null, null, 0, null, null, 63, null));
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "IdeaAgentMatterhornStarterBase.kt", l = {14}, i = {0}, s = {"L$0"}, n = {"projectDir"}, m = "beforeProjectOpened$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaAgentMatterhornStarterBase")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class IdeaAgentMatterhornStarterBase$beforeProjectOpened$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     IdeaAgentMatterhornStarterBase$beforeProjectOpened$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return IdeaAgentMatterhornStarterBase.beforeProjectOpened$suspendImpl(IdeaAgentMatterhornStarterBase.this, null, (Continuation<? super Unit>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "IdeaAgentMatterhornStarterBase.kt", l = {32, 32}, i = {0}, s = {"L$0"}, n = {"importer"}, m = "validateProject$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaAgentMatterhornStarterBase")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class IdeaAgentMatterhornStarterBase$validateProject$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     IdeaAgentMatterhornStarterBase$validateProject$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return IdeaAgentMatterhornStarterBase.validateProject$suspendImpl(IdeaAgentMatterhornStarterBase.this, null, null, null, (Continuation<? super List<ProjectProblem>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\IdeaAgentMatterhornStarterBase.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */