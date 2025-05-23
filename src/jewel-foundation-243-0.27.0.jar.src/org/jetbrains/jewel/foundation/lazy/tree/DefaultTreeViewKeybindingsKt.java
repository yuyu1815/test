/*    */ package org.jetbrains.jewel.foundation.lazy.tree;
/*    */ 
/*    */ import androidx.compose.ui.input.pointer.PointerEvent_skikoKt;
/*    */ import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.skiko.OsArch_jvmKt;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\030\002\n\002\030\002\n\002\020\013\n\002\030\002\n\002\030\002\n\002\b\006\",\020\000\032\027\022\004\022\0020\002\022\004\022\0020\0030\001j\002`\005¢\006\002\b\0048F¢\006\f\022\004\b\006\020\007\032\004\b\b\020\t*,\020\n\"\023\022\004\022\0020\002\022\004\022\0020\0030\001¢\006\002\b\0042\023\022\004\022\0020\002\022\004\022\0020\0030\001¢\006\002\b\004¨\006\013"}, d2 = {"DefaultWindowsTreeViewClickModifierHandler", "Lkotlin/Function1;", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "", "Lkotlin/ExtensionFunctionType;", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeViewClickModifierHandler;", "getDefaultWindowsTreeViewClickModifierHandler$annotations", "()V", "getDefaultWindowsTreeViewClickModifierHandler", "()Lkotlin/jvm/functions/Function1;", "TreeViewClickModifierHandler", "foundation"})
/*    */ public final class DefaultTreeViewKeybindingsKt
/*    */ {
/*    */   private static final boolean _get_DefaultWindowsTreeViewClickModifierHandler_$lambda$0(PointerKeyboardModifiers <this>) {
/* 62 */     return (
/* 63 */       OsArch_jvmKt.getHostOs().isWindows() || OsArch_jvmKt.getHostOs().isLinux()) ? PointerEvent_skikoKt.isCtrlPressed-5xRPYO0(<this>.unbox-impl()) : (
/* 64 */       OsArch_jvmKt.getHostOs().isMacOS() ? PointerEvent_skikoKt.isMetaPressed-5xRPYO0(<this>.unbox-impl()) : false);
/*    */   } @NotNull
/*    */   public static final Function1<PointerKeyboardModifiers, Boolean> getDefaultWindowsTreeViewClickModifierHandler() {
/* 67 */     return DefaultTreeViewKeybindingsKt::_get_DefaultWindowsTreeViewClickModifierHandler_$lambda$0;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\DefaultTreeViewKeybindingsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */