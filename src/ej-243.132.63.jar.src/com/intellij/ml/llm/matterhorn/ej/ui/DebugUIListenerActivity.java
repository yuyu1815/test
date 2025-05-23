/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.wm.ToolWindow;
/*    */ import com.intellij.openapi.wm.ToolWindowManager;
/*    */ import kotlin.Metadata;
/*    */ import kotlinx.coroutines.Job;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/DebugUIListenerActivity;", "Lcom/intellij/openapi/startup/ProjectActivity;", "<init>", "()V", "execute", "", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class DebugUIListenerActivity implements ProjectActivity {
/*    */   @Nullable
/*    */   public Object execute(@NotNull Project project, @NotNull Continuation $completion) {
/* 15 */     if (ApplicationKt.getApplication().isInternal()) {
/* 16 */       project.getMessageBus().connect(MatterhornServiceScope.Companion.getScope(project)).subscribe(
/* 17 */           TaskServiceImpl.Companion.getTOPIC(), 
/* 18 */           new DebugUIListenerActivity$execute$2(project));
/*    */     }
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
/*    */     
/* 32 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   public static final int $stable;
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/DebugUIListenerActivity$execute$2", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskListener;", "beforeTaskStarted", "", "context", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "job", "Lkotlinx/coroutines/Job;", "ej-ui"})
/*    */   public static final class DebugUIListenerActivity$execute$2 implements TaskListener {
/*    */     DebugUIListenerActivity$execute$2(Project $project) {}
/*    */     
/*    */     public void beforeTaskStarted(RootExecutionContext context, Job job) {
/*    */       // Byte code:
/*    */       //   0: aload_1
/*    */       //   1: ldc 'context'
/*    */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   6: aload_2
/*    */       //   7: ldc 'job'
/*    */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */       //   12: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*    */       //   15: aload_0
/*    */       //   16: getfield $project : Lcom/intellij/openapi/project/Project;
/*    */       //   19: aload_1
/*    */       //   20: aload_2
/*    */       //   21: <illegal opcode> run : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlinx/coroutines/Job;)Ljava/lang/Runnable;
/*    */       //   26: invokeinterface invokeAndWait : (Ljava/lang/Runnable;)V
/*    */       //   31: return
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #21	-> 12
/*    */       //   #29	-> 31
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   0	32	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/DebugUIListenerActivity$execute$2;
/*    */       //   0	32	1	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*    */       //   0	32	2	job	Lkotlinx/coroutines/Job;
/*    */     }
/*    */     
/*    */     private static final void beforeTaskStarted$lambda$0(Project $project, RootExecutionContext $context, Job $job) {
/*    */       ToolWindowManager twm = ToolWindowManager.Companion.getInstance($project);
/*    */       ToolWindow toolWindow = twm.getToolWindow("Matterhorn");
/*    */       if (toolWindow != null) {
/*    */         MatterhornToolWindowPanel toolWindowPanel = (MatterhornToolWindowPanel)toolWindow.getContentManager().getContents()[0].getUserData(MatterhornToolWindowFactoryKt.getMATTERHORN_KEY());
/*    */         if (toolWindowPanel != null) {
/*    */           toolWindowPanel.updatePanel($context, $job, null);
/*    */         } else {
/*    */         
/*    */         } 
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\DebugUIListenerActivity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */