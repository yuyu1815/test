/*    */ package org.jetbrains.jewel.ui.painter;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bw\030\000 \0052\0020\001:\001\005J\f\020\002\032\0020\003*\0020\004H\026\001\006\006\007\b\t\n\013¨\006\f"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/PainterHint;", "", "canApply", "", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "None", "Lorg/jetbrains/jewel/ui/painter/BitmapPainterHint;", "Lorg/jetbrains/jewel/ui/painter/PainterHint$None;", "Lorg/jetbrains/jewel/ui/painter/PainterPathHint;", "Lorg/jetbrains/jewel/ui/painter/PainterWrapperHint;", "Lorg/jetbrains/jewel/ui/painter/SvgPainterHint;", "Lorg/jetbrains/jewel/ui/painter/XmlPainterHint;", "ui"})
/*    */ @Immutable
/*    */ public interface PainterHint
/*    */ {
/*    */   @NotNull
/*    */   public static final None None = None.$$INSTANCE;
/*    */   
/*    */   boolean canApply(@NotNull PainterProviderScope paramPainterProviderScope);
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls
/*    */   {
/*    */     public static boolean canApply(@NotNull PainterHint $this, @NotNull PainterProviderScope $receiver) {
/* 22 */       Intrinsics.checkNotNullParameter($receiver, "$receiver"); return true;
/*    */     }
/*    */   }
/*    */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\030\002\n\000\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\0020\005*\0020\006H\026J\b\020\007\032\0020\bH\026¨\006\t"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/PainterHint$None;", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "<init>", "()V", "canApply", "", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "toString", "", "ui"})
/* 26 */   public static final class None implements PainterHint { public boolean canApply(@NotNull PainterProviderScope $this$canApply) { Intrinsics.checkNotNullParameter($this$canApply, "<this>"); return false; } @NotNull
/*    */     public String toString() {
/* 28 */       return "None";
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\PainterHint.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */