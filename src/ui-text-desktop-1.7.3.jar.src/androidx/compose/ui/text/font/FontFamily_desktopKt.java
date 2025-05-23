/*    */ package androidx.compose.ui.text.font;
/*    */ 
/*    */ import androidx.compose.runtime.Stable;
/*    */ import androidx.compose.ui.text.ExperimentalTextApi;
/*    */ import androidx.compose.ui.text.platform.JetBrainsRuntimeFontFamilies;
/*    */ import androidx.compose.ui.text.platform.SystemFont;
/*    */ import java.util.Locale;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\032\022\020\000\032\004\030\0010\0012\006\020\002\032\0020\003H\007\032\020\020\004\032\0020\0012\006\020\002\032\0020\003H\007¨\006\005"}, d2 = {"EmbeddedFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "familyName", "", "FontFamily", "ui-text"})
/*    */ public final class FontFamily_desktopKt
/*    */ {
/*    */   @ExperimentalTextApi
/*    */   @Stable
/*    */   @NotNull
/*    */   public static final FontFamily FontFamily(@NotNull String familyName) {
/* 46 */     Intrinsics.checkNotNullParameter(familyName, "familyName");
/*    */     
/* 48 */     SystemFont[] arrayOfSystemFont = new SystemFont[18]; arrayOfSystemFont[0] = new SystemFont(familyName, FontWeight.Companion.getW100(), FontStyle.Companion.getNormal-_-LCdwA(), null); arrayOfSystemFont[1] = 
/* 49 */       new SystemFont(familyName, FontWeight.Companion.getW200(), FontStyle.Companion.getNormal-_-LCdwA(), null);
/* 50 */     arrayOfSystemFont[2] = new SystemFont(familyName, FontWeight.Companion.getW300(), FontStyle.Companion.getNormal-_-LCdwA(), null);
/* 51 */     arrayOfSystemFont[3] = new SystemFont(familyName, FontWeight.Companion.getW400(), FontStyle.Companion.getNormal-_-LCdwA(), null);
/* 52 */     arrayOfSystemFont[4] = new SystemFont(familyName, FontWeight.Companion.getW500(), FontStyle.Companion.getNormal-_-LCdwA(), null);
/* 53 */     arrayOfSystemFont[5] = new SystemFont(familyName, FontWeight.Companion.getW600(), FontStyle.Companion.getNormal-_-LCdwA(), null);
/* 54 */     arrayOfSystemFont[6] = new SystemFont(familyName, FontWeight.Companion.getW700(), FontStyle.Companion.getNormal-_-LCdwA(), null);
/* 55 */     arrayOfSystemFont[7] = new SystemFont(familyName, FontWeight.Companion.getW800(), FontStyle.Companion.getNormal-_-LCdwA(), null);
/* 56 */     arrayOfSystemFont[8] = new SystemFont(familyName, FontWeight.Companion.getW900(), FontStyle.Companion.getNormal-_-LCdwA(), null);
/* 57 */     arrayOfSystemFont[9] = new SystemFont(familyName, FontWeight.Companion.getW100(), FontStyle.Companion.getItalic-_-LCdwA(), null);
/* 58 */     arrayOfSystemFont[10] = new SystemFont(familyName, FontWeight.Companion.getW200(), FontStyle.Companion.getItalic-_-LCdwA(), null);
/* 59 */     arrayOfSystemFont[11] = new SystemFont(familyName, FontWeight.Companion.getW300(), FontStyle.Companion.getItalic-_-LCdwA(), null);
/* 60 */     arrayOfSystemFont[12] = new SystemFont(familyName, FontWeight.Companion.getW400(), FontStyle.Companion.getItalic-_-LCdwA(), null);
/* 61 */     arrayOfSystemFont[13] = new SystemFont(familyName, FontWeight.Companion.getW500(), FontStyle.Companion.getItalic-_-LCdwA(), null);
/* 62 */     arrayOfSystemFont[14] = new SystemFont(familyName, FontWeight.Companion.getW600(), FontStyle.Companion.getItalic-_-LCdwA(), null);
/* 63 */     arrayOfSystemFont[15] = new SystemFont(familyName, FontWeight.Companion.getW700(), FontStyle.Companion.getItalic-_-LCdwA(), null);
/* 64 */     arrayOfSystemFont[16] = new SystemFont(familyName, FontWeight.Companion.getW800(), FontStyle.Companion.getItalic-_-LCdwA(), null);
/* 65 */     arrayOfSystemFont[17] = new SystemFont(familyName, FontWeight.Companion.getW900(), FontStyle.Companion.getItalic-_-LCdwA(), null);
/*    */     return new FontListFontFamily(CollectionsKt.listOf((Object[])arrayOfSystemFont));
/*    */   }
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
/*    */   @ExperimentalTextApi
/*    */   @Stable
/*    */   @Nullable
/*    */   public static final FontFamily EmbeddedFontFamily(@NotNull String familyName) {
/* 91 */     Intrinsics.checkNotNullParameter(familyName, "familyName"); Intrinsics.checkNotNullExpressionValue(familyName.toLowerCase(Locale.ROOT), "toLowerCase(...)"); return (FontFamily)JetBrainsRuntimeFontFamilies.INSTANCE.getEmbeddedFamilies().get(familyName.toLowerCase(Locale.ROOT));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\FontFamily_desktopKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */