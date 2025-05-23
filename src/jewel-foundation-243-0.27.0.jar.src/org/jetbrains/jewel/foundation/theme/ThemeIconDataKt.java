/*    */ package org.jetbrains.jewel.foundation.theme;
/*    */ 
/*    */ import androidx.compose.ui.graphics.Color;
/*    */ import java.util.Locale;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\002\020\016\n\000\032\016\020\000\032\004\030\0010\001*\0020\002H\000¨\006\003"}, d2 = {"toColorOrNull", "Landroidx/compose/ui/graphics/Color;", "", "foundation"})
/*    */ @SourceDebugExtension({"SMAP\nThemeIconData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemeIconData.kt\norg/jetbrains/jewel/foundation/theme/ThemeIconDataKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"})
/*    */ public final class ThemeIconDataKt
/*    */ {
/*    */   @Nullable
/*    */   public static final Color toColorOrNull(@NotNull String $this$toColorOrNull) {
/* 40 */     Intrinsics.checkNotNullParameter($this$toColorOrNull, "<this>"); Intrinsics.checkNotNullExpressionValue($this$toColorOrNull.toLowerCase(Locale.ROOT), "toLowerCase(...)"); String it = StringsKt.removePrefix(StringsKt.removePrefix($this$toColorOrNull.toLowerCase(Locale.ROOT), "#"), "0x"); int $i$a$-let-ThemeIconDataKt$toColorOrNull$1 = 0; switch (it.length()) { case 3: case 4: case 6: case 8: default: break; }  String str1 = null; if (str1 != null) { Long long_ = StringsKt.toLongOrNull(str1, 16);
/* 41 */       if (long_ != null) { long l = long_.longValue();
/*    */         
/* 43 */         int $i$a$-let-ThemeIconDataKt$toColorOrNull$2 = 0; }
/*    */        }
/*    */     
/*    */     return null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\theme\ThemeIconDataKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */