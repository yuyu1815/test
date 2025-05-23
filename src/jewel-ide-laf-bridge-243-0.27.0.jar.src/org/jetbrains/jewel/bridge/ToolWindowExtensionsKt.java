/*    */ package org.jetbrains.jewel.bridge;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import com.intellij.openapi.wm.ToolWindow;
/*    */ import com.intellij.ui.content.Content;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000.\n\000\n\002\020\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\032M\020\000\032\0020\001*\0020\0022\n\b\003\020\003\032\004\030\0010\0042\b\b\002\020\005\032\0020\0062\b\b\002\020\007\032\0020\0062\034\020\b\032\030\022\004\022\0020\n\022\004\022\0020\0010\t¢\006\002\b\013¢\006\002\b\f¢\006\002\020\r¨\006\016"}, d2 = {"addComposeTab", "", "Lcom/intellij/openapi/wm/ToolWindow;", "tabDisplayName", "", "isLockable", "", "isCloseable", "content", "Lkotlin/Function1;", "Lorg/jetbrains/jewel/bridge/ToolWindowScope;", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/runtime/Composable;", "(Lcom/intellij/openapi/wm/ToolWindow;Ljava/lang/String;ZZLkotlin/jvm/functions/Function3;)V", "ide-laf-bridge"})
/*    */ public final class ToolWindowExtensionsKt {
/*    */   @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
/*    */   public static final void addComposeTab(@NotNull ToolWindow $this$addComposeTab, @TabTitle @Nullable String tabDisplayName, boolean isLockable, boolean isCloseable, @NotNull Function3<? super ToolWindowScope, ? super Composer, ? super Integer, Unit> content) {
/* 16 */     Intrinsics.checkNotNullParameter($this$addComposeTab, "<this>"); Intrinsics.checkNotNullParameter(content, "content"); CompatibilityKt.enableNewSwingCompositing();
/*    */ 
/*    */     
/* 19 */     Intrinsics.checkNotNullExpressionValue($this$addComposeTab.getContentManager().getFactory().createContent(
/* 20 */           JewelComposePanelKt.JewelToolWindowComposePanel$default(null, (Function2)ComposableLambdaKt.composableLambdaInstance(666448734, true, new ToolWindowExtensionsKt$addComposeTab$tabContent$1(content, $this$addComposeTab)), 1, null), 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 28 */           tabDisplayName, 
/* 29 */           isLockable), "createContent(...)"); Content tabContent = $this$addComposeTab.getContentManager().getFactory().createContent(JewelComposePanelKt.JewelToolWindowComposePanel$default(null, (Function2)ComposableLambdaKt.composableLambdaInstance(666448734, true, new ToolWindowExtensionsKt$addComposeTab$tabContent$1(content, $this$addComposeTab)), 1, null), tabDisplayName, isLockable);
/*    */     
/* 31 */     tabContent.setCloseable(isCloseable);
/* 32 */     $this$addComposeTab.getContentManager().addContent(tabContent);
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */   static final class ToolWindowExtensionsKt$addComposeTab$tabContent$1 implements Function2<Composer, Integer, Unit> {
/*    */     @Composable
/*    */     @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */     public final void invoke(Composer $composer, int $changed) {
/*    */       if (($changed & 0x3) != 2 || !$composer.getSkipping()) {
/*    */         if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventStart(666448734, $changed, -1, "org.jetbrains.jewel.bridge.addComposeTab.<anonymous> (ToolWindowExtensions.kt:20)"); 
/*    */         ToolWindowExtensionsKt$addComposeTab$tabContent$1$scope$1 scope = new ToolWindowExtensionsKt$addComposeTab$tabContent$1$scope$1(this.$this_addComposeTab);
/*    */         this.$content.invoke(scope, $composer, Integer.valueOf(0));
/*    */         if (ComposerKt.isTraceInProgress())
/*    */           ComposerKt.traceEventEnd(); 
/*    */       } else {
/*    */         $composer.skipToGroupEnd();
/*    */       } 
/*    */     }
/*    */     
/*    */     ToolWindowExtensionsKt$addComposeTab$tabContent$1(Function3<ToolWindowScope, Composer, Integer, Unit> $content, ToolWindow $receiver) {}
/*    */     
/*    */     @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\023\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003*\001\000\b\n\030\0002\0020\001R\024\020\002\032\0020\0038VX\004¢\006\006\032\004\b\004\020\005¨\006\006"}, d2 = {"org/jetbrains/jewel/bridge/ToolWindowExtensionsKt$addComposeTab$tabContent$1$scope$1", "Lorg/jetbrains/jewel/bridge/ToolWindowScope;", "toolWindow", "Lcom/intellij/openapi/wm/ToolWindow;", "getToolWindow", "()Lcom/intellij/openapi/wm/ToolWindow;", "ide-laf-bridge"})
/*    */     public static final class ToolWindowExtensionsKt$addComposeTab$tabContent$1$scope$1 implements ToolWindowScope {
/*    */       ToolWindowExtensionsKt$addComposeTab$tabContent$1$scope$1(ToolWindow $receiver) {}
/*    */       
/*    */       public ToolWindow getToolWindow() {
/*    */         return this.$this_addComposeTab;
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\ToolWindowExtensionsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */