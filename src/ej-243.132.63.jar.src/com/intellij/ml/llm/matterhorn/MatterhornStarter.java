/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import java.nio.file.Path;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\bf\030\0002\0020\001J.\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013H¦@¢\006\002\020\fJ\026\020\r\032\0020\0162\006\020\017\032\0020\020H@¢\006\002\020\021J,\020\022\032\0020\0162\006\020\n\032\0020\0132\f\020\023\032\b\022\004\022\0020\0130\0242\006\020\025\032\0020\003H@¢\006\002\020\026J2\020\027\032\b\022\004\022\0020\0300\0242\006\020\n\032\0020\0132\f\020\023\032\b\022\004\022\0020\0130\0242\006\020\025\032\0020\003H@¢\006\002\020\026J<\020\031\032\n\022\002\b\003\022\002\b\0030\0322\006\020\n\032\0020\0132\006\020\033\032\0020\0132\f\020\023\032\b\022\004\022\0020\0130\0242\006\020\025\032\0020\003H¦@¢\006\002\020\034¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/MatterhornStarter;", "", "createRootContext", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "project", "Lcom/intellij/openapi/project/Project;", "llmProxy", "Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "name", "", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "beforeProjectOpened", "", "projectDir", "Ljava/nio/file/Path;", "(Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "configureProject", "args", "", "context", "(Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateProject", "Lcom/intellij/ml/llm/matterhorn/ProjectProblem;", "buildArtifactRequest", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "task", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
/*    */ public interface MatterhornStarter {
/*    */   @Nullable
/*    */   Object createRootContext(@NotNull Project paramProject, @NotNull LLMProxy paramLLMProxy, @NotNull MatterhornPropertyProvider paramMatterhornPropertyProvider, @NotNull String paramString, @NotNull Continuation<? super RootExecutionContext> paramContinuation);
/*    */   
/*    */   @Nullable
/*    */   Object beforeProjectOpened(@NotNull Path paramPath, @NotNull Continuation<? super Unit> paramContinuation);
/*    */   
/*    */   @Nullable
/*    */   Object configureProject(@NotNull String paramString, @NotNull List<String> paramList, @NotNull RootExecutionContext paramRootExecutionContext, @NotNull Continuation<? super Unit> paramContinuation);
/*    */   
/*    */   @Nullable
/*    */   Object validateProject(@NotNull String paramString, @NotNull List<String> paramList, @NotNull RootExecutionContext paramRootExecutionContext, @NotNull Continuation<? super List<ProjectProblem>> paramContinuation);
/*    */   
/*    */   @Nullable
/*    */   Object buildArtifactRequest(@NotNull String paramString1, @NotNull String paramString2, @NotNull List<String> paramList, @NotNull RootExecutionContext paramRootExecutionContext, @NotNull Continuation<? super ArtifactRequest<?, ?>> paramContinuation);
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls {
/*    */     @Nullable
/* 31 */     public static Object beforeProjectOpened(@NotNull MatterhornStarter $this, @NotNull Path projectDir, @NotNull Continuation $completion) { return Unit.INSTANCE; }
/*    */     @Nullable
/* 33 */     public static Object configureProject(@NotNull MatterhornStarter $this, @NotNull String name, @NotNull List args, @NotNull RootExecutionContext context, @NotNull Continuation $completion) { return Unit.INSTANCE; } @Nullable
/*    */     public static Object validateProject(@NotNull MatterhornStarter $this, @NotNull String name, @NotNull List args, @NotNull RootExecutionContext context, @NotNull Continuation $completion) {
/* 35 */       return CollectionsKt.emptyList();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\MatterhornStarter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */