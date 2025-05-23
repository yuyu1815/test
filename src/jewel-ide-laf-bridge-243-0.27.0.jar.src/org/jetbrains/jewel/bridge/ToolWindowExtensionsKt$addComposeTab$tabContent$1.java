/*    */ package org.jetbrains.jewel.bridge;
/*    */ 
/*    */ import androidx.compose.runtime.Composable;
/*    */ import androidx.compose.runtime.ComposableTarget;
/*    */ import androidx.compose.runtime.Composer;
/*    */ import androidx.compose.runtime.ComposerKt;
/*    */ import com.intellij.openapi.wm.ToolWindow;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.functions.Function3;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ final class ToolWindowExtensionsKt$addComposeTab$tabContent$1
/*    */   implements Function2<Composer, Integer, Unit>
/*    */ {
/*    */   @Composable
/*    */   @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/*    */   public final void invoke(Composer $composer, int $changed) {
/* 21 */     if (($changed & 0x3) != 2 || !$composer.getSkipping()) { if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(666448734, $changed, -1, "org.jetbrains.jewel.bridge.addComposeTab.<anonymous> (ToolWindowExtensions.kt:20)");  ToolWindowExtensionsKt$addComposeTab$tabContent$1$scope$1 scope = 
/* 22 */         new ToolWindowExtensionsKt$addComposeTab$tabContent$1$scope$1(this.$this_addComposeTab);
/*    */ 
/*    */ 
/*    */       
/* 26 */       this.$content.invoke(scope, $composer, Integer.valueOf(0)); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  } else { $composer.skipToGroupEnd(); }
/*    */   
/*    */   }
/*    */   
/*    */   ToolWindowExtensionsKt$addComposeTab$tabContent$1(Function3<ToolWindowScope, Composer, Integer, Unit> $content, ToolWindow $receiver) {}
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\023\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003*\001\000\b\n\030\0002\0020\001R\024\020\002\032\0020\0038VX\004¢\006\006\032\004\b\004\020\005¨\006\006"}, d2 = {"org/jetbrains/jewel/bridge/ToolWindowExtensionsKt$addComposeTab$tabContent$1$scope$1", "Lorg/jetbrains/jewel/bridge/ToolWindowScope;", "toolWindow", "Lcom/intellij/openapi/wm/ToolWindow;", "getToolWindow", "()Lcom/intellij/openapi/wm/ToolWindow;", "ide-laf-bridge"})
/*    */   public static final class ToolWindowExtensionsKt$addComposeTab$tabContent$1$scope$1 implements ToolWindowScope {
/*    */     ToolWindowExtensionsKt$addComposeTab$tabContent$1$scope$1(ToolWindow $receiver) {}
/*    */     
/*    */     public ToolWindow getToolWindow() {
/*    */       return this.$this_addComposeTab;
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ide-laf-bridge-243-0.27.0.jar!\org\jetbrains\jewel\bridge\ToolWindowExtensionsKt$addComposeTab$tabContent$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */