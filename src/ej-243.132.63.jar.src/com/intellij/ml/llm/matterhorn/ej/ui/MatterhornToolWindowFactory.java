/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ 
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.ui.content.ContentManager;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b\007\030\000 \0172\0020\0012\0020\002:\001\017B\007¢\006\004\b\003\020\004J\026\020\005\032\0020\0062\006\020\007\032\0020\bH@¢\006\002\020\tJ\020\020\n\032\0020\0062\006\020\007\032\0020\bH\027J\030\020\013\032\0020\f2\006\020\007\032\0020\b2\006\020\r\032\0020\016H\026¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowFactory;", "Lcom/intellij/openapi/wm/ToolWindowFactory;", "Lcom/intellij/openapi/project/DumbAware;", "<init>", "()V", "isApplicableAsync", "", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isApplicable", "createToolWindowContent", "", "toolWindow", "Lcom/intellij/openapi/wm/ToolWindow;", "Companion", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class MatterhornToolWindowFactory implements ToolWindowFactory, DumbAware {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   public static final int $stable;
/*    */   
/*    */   @Nullable
/* 16 */   public Object isApplicableAsync(@NotNull Project project, @NotNull Continuation $completion) { return Boxing.boxBoolean(Registry.Companion.is("matterhorn.artifact.debug.ui", false)); } @NotNull
/*    */   public static final String ID = "Matterhorn"; @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/MatterhornToolWindowFactory$Companion;", "", "<init>", "()V", "ID", "", "ej-ui"})
/*    */   public static final class Companion {
/*    */     private Companion() {} } @Deprecated(message = "Use isApplicableAsync")
/*    */   public boolean isApplicable(@NotNull Project project) {
/* 21 */     Intrinsics.checkNotNullParameter(project, "project"); return Registry.Companion.is("matterhorn.artifact.debug.ui", false);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
/* 27 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(toolWindow, "toolWindow"); MatterhornToolWindowPanel matterhornToolWindowPanel = new MatterhornToolWindowPanel(project);
/* 28 */     Intrinsics.checkNotNullExpressionValue(toolWindow.getContentManager(), "getContentManager(...)"); ContentManager contentManager = toolWindow.getContentManager();
/* 29 */     Intrinsics.checkNotNullExpressionValue(contentManager.getFactory().createContent((JComponent)matterhornToolWindowPanel, null, false), "createContent(...)"); Content content = contentManager.getFactory().createContent((JComponent)matterhornToolWindowPanel, null, false);
/*    */     
/* 31 */     content.putUserData(MatterhornToolWindowFactoryKt.getMATTERHORN_KEY(), matterhornToolWindowPanel);
/*    */     
/* 33 */     contentManager.addContent(content);
/* 34 */     content.setDisposer(matterhornToolWindowPanel);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\MatterhornToolWindowFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */