/*    */ package org.jetbrains.jewel.ui.painter;
/*    */ 
/*    */ import androidx.compose.runtime.Immutable;
/*    */ import java.util.Locale;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.text.StringsKt;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\000\n\002\020\013\n\002\030\002\n\000\bg\030\0002\0020\001J\f\020\002\032\0020\003*\0020\004H\026¨\006\005"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/BitmapPainterHint;", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "canApply", "", "Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;", "ui"})
/*    */ @Immutable
/*    */ public interface BitmapPainterHint
/*    */   extends PainterHint
/*    */ {
/*    */   boolean canApply(@NotNull PainterProviderScope paramPainterProviderScope);
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls
/*    */   {
/*    */     public static boolean canApply(@NotNull BitmapPainterHint $this, @NotNull PainterProviderScope $receiver) {
/* 42 */       Intrinsics.checkNotNullParameter($receiver, "$receiver"); Intrinsics.checkNotNullExpressionValue(StringsKt.substringAfterLast$default($receiver.getPath(), '.', null, 2, null).toLowerCase(Locale.ROOT), "toLowerCase(...)"); String str = StringsKt.substringAfterLast$default($receiver.getPath(), '.', null, 2, null).toLowerCase(Locale.ROOT);
/* 43 */       return !(Intrinsics.areEqual(str, "svg") || 
/* 44 */         Intrinsics.areEqual(str, "xml"));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\BitmapPainterHint.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */