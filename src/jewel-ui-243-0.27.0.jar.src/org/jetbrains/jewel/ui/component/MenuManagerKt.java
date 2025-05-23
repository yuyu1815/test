/*    */ package org.jetbrains.jewel.ui.component;
/*    */ 
/*    */ import androidx.compose.runtime.CompositionLocalKt;
/*    */ import androidx.compose.runtime.ProvidableCompositionLocal;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\030\002\n\002\b\003\"\027\020\000\032\b\022\004\022\0020\0020\001¢\006\b\n\000\032\004\b\003\020\004¨\006\005"}, d2 = {"LocalMenuManager", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lorg/jetbrains/jewel/ui/component/MenuManager;", "getLocalMenuManager", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "ui"})
/*    */ public final class MenuManagerKt
/*    */ {
/*    */   @NotNull
/* 48 */   private static final ProvidableCompositionLocal<MenuManager> LocalMenuManager = CompositionLocalKt.staticCompositionLocalOf(MenuManagerKt::LocalMenuManager$lambda$0); @NotNull public static final ProvidableCompositionLocal<MenuManager> getLocalMenuManager() { return LocalMenuManager; } private static final MenuManager LocalMenuManager$lambda$0() {
/* 49 */     throw new IllegalStateException("No MenuManager provided. Have you forgotten the theme?".toString());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\MenuManagerKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */