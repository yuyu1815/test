/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\007\n\000\032\034\020\000\032\0020\0012\b\020\002\032\004\030\0010\0032\b\020\004\032\004\030\0010\005H\000\032\036\020\006\032\0020\0052\006\020\007\032\0020\0052\006\020\b\032\0020\0052\006\020\t\032\0020\n\032\036\020\006\032\0020\0032\006\020\007\032\0020\0032\006\020\b\032\0020\0032\006\020\t\032\0020\n¨\006\013"}, d2 = {"createPlatformTextStyle", "Landroidx/compose/ui/text/PlatformTextStyle;", "spanStyle", "Landroidx/compose/ui/text/PlatformSpanStyle;", "paragraphStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "lerp", "start", "stop", "fraction", "", "ui-text"})
/*     */ @JvmName(name = "DesktopTextStyle_skikoKt")
/*     */ public final class DesktopTextStyle_skikoKt
/*     */ {
/*     */   @NotNull
/*     */   public static final PlatformTextStyle createPlatformTextStyle(@Nullable PlatformSpanStyle spanStyle, @Nullable PlatformParagraphStyle paragraphStyle) {
/*  71 */     return new PlatformTextStyle(spanStyle, paragraphStyle);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final PlatformParagraphStyle lerp(@NotNull PlatformParagraphStyle start, @NotNull PlatformParagraphStyle stop, float fraction) {
/* 164 */     Intrinsics.checkNotNullParameter(start, "start"); Intrinsics.checkNotNullParameter(stop, "stop"); return start;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final PlatformSpanStyle lerp(@NotNull PlatformSpanStyle start, @NotNull PlatformSpanStyle stop, float fraction) {
/* 185 */     Intrinsics.checkNotNullParameter(start, "start"); Intrinsics.checkNotNullParameter(stop, "stop"); if (Intrinsics.areEqual(start.getTextDecorationLineStyle-Gch4ia8(), stop.getTextDecorationLineStyle-Gch4ia8())) return start;
/*     */     
/* 187 */     return new PlatformSpanStyle(
/* 188 */         SpanStyleKt.<TextDecorationLineStyle>lerpDiscrete(
/* 189 */           start.getTextDecorationLineStyle-Gch4ia8(), 
/* 190 */           stop.getTextDecorationLineStyle-Gch4ia8(), 
/* 191 */           fraction), null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\DesktopTextStyle_skikoKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */