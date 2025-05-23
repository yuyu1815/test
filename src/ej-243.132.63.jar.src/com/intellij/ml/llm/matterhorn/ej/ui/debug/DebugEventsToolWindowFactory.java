/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.debug;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.util.registry.Registry;
/*    */ import com.intellij.openapi.wm.ToolWindow;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.jewel.bridge.ToolWindowScope;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\026\020\b\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\tJ\020\020\n\032\0020\0132\006\020\f\032\0020\rH\026J\030\020\016\032\0020\0132\006\020\006\032\0020\0072\006\020\f\032\0020\rH\026¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/debug/DebugEventsToolWindowFactory;", "Lcom/intellij/openapi/wm/ToolWindowFactory;", "<init>", "()V", "isApplicable", "", "project", "Lcom/intellij/openapi/project/Project;", "isApplicableAsync", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "init", "", "toolWindow", "Lcom/intellij/openapi/wm/ToolWindow;", "createToolWindowContent", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class DebugEventsToolWindowFactory implements ToolWindowFactory {
/*    */   public boolean isApplicable(@NotNull Project project) {
/* 19 */     Intrinsics.checkNotNullParameter(project, "project"); return Registry.Companion.is("matterhorn.artifact.debug.ui", false);
/*    */   } public static final int $stable;
/*    */   @Nullable
/*    */   public Object isApplicableAsync(@NotNull Project project, @NotNull Continuation $completion) {
/* 23 */     return Boxing.boxBoolean(Registry.Companion.is("matterhorn.artifact.debug.ui", false));
/*    */   }
/*    */   
/*    */   public void init(@NotNull ToolWindow toolWindow) {
/* 27 */     Intrinsics.checkNotNullParameter(toolWindow, "toolWindow"); super.init(toolWindow);
/*    */   }
/*    */   
/*    */   public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
/* 31 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(toolWindow, "toolWindow"); CoroutineScope scope = CoroutineScopeKt.CoroutineScope((CoroutineContext)Dispatchers.getDefault());
/* 32 */     EventLogService eventLogService = EventLogService.Companion.getInstance(project);
/* 33 */     EventLogViewModel viewModel = new EventLogViewModel(eventLogService, scope);
/*    */     
/* 35 */     ToolWindowExtensionsKt.addComposeTab$default(toolWindow, null, false, false, (Function3)ComposableLambdaKt.composableLambdaInstance(1709579362, true, new DebugEventsToolWindowFactory$createToolWindowContent$1(viewModel)), 7, null); } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class DebugEventsToolWindowFactory$createToolWindowContent$1 implements Function3<ToolWindowScope, Composer, Integer, Unit> { @Composable @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/* 36 */     public final void invoke(ToolWindowScope $this$addComposeTab, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter($this$addComposeTab, "$this$addComposeTab"); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1709579362, $changed, -1, "com.intellij.ml.llm.matterhorn.ej.ui.debug.DebugEventsToolWindowFactory.createToolWindowContent.<anonymous> (DebugEventsToolwindow.kt:35)");  DebugEventsPageKt.EventLogScreen(this.$viewModel, $composer, 0); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  }
/*    */ 
/*    */     
/*    */     DebugEventsToolWindowFactory$createToolWindowContent$1(EventLogViewModel $viewModel) {} }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\debug\DebugEventsToolWindowFactory.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */