/*    */ package org.jetbrains.jewel.ui.painter;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*    */ public final class DefaultImpls
/*    */ {
/*    */   public static boolean canApply(@NotNull BitmapPainterHint $this, @NotNull PainterProviderScope $receiver) {
/* 42 */     Intrinsics.checkNotNullParameter($receiver, "$receiver"); Intrinsics.checkNotNullExpressionValue(StringsKt.substringAfterLast$default($receiver.getPath(), '.', null, 2, null).toLowerCase(Locale.ROOT), "toLowerCase(...)"); String str = StringsKt.substringAfterLast$default($receiver.getPath(), '.', null, 2, null).toLowerCase(Locale.ROOT);
/* 43 */     return !(Intrinsics.areEqual(str, "svg") || 
/* 44 */       Intrinsics.areEqual(str, "xml"));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\BitmapPainterHint$DefaultImpls.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */