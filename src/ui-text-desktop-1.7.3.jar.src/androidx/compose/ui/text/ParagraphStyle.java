/*     */ package androidx.compose.ui.text;
/*     */ import androidx.compose.ui.text.style.Hyphens;
/*     */ import androidx.compose.ui.text.style.LineBreak;
/*     */ import androidx.compose.ui.text.style.LineHeightStyle;
/*     */ import androidx.compose.ui.text.style.TextAlign;
/*     */ import androidx.compose.ui.text.style.TextDirection;
/*     */ import androidx.compose.ui.text.style.TextIndent;
/*     */ import androidx.compose.ui.text.style.TextMotion;
/*     */ import androidx.compose.ui.unit.TextUnit;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b3\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\016\n\000\b\007\030\0002\0020\001Bq\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\b\b\002\020\006\032\0020\007\022\n\b\002\020\b\032\004\030\0010\t\022\n\b\002\020\n\032\004\030\0010\013\022\n\b\002\020\f\032\004\030\0010\r\022\n\b\002\020\016\032\004\030\0010\017\022\n\b\002\020\020\032\004\030\0010\021\022\n\b\002\020\022\032\004\030\0010\023¢\006\002\020\024B5\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\b\b\002\020\006\032\0020\007\022\n\b\002\020\b\032\004\030\0010\t¢\006\002\020\025BM\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\b\b\002\020\006\032\0020\007\022\n\b\002\020\b\032\004\030\0010\t\022\n\b\002\020\n\032\004\030\0010\013\022\n\b\002\020\f\032\004\030\0010\r¢\006\002\020\026Be\b\027\022\n\b\002\020\002\032\004\030\0010\003\022\n\b\002\020\004\032\004\030\0010\005\022\b\b\002\020\006\032\0020\007\022\n\b\002\020\b\032\004\030\0010\t\022\n\b\002\020\n\032\004\030\0010\013\022\n\b\002\020\f\032\004\030\0010\r\022\n\b\002\020\016\032\004\030\0010\017\022\n\b\002\020\020\032\004\030\0010\021¢\006\002\020\027Bg\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007\022\n\b\002\020\b\032\004\030\0010\t\022\n\b\002\020\n\032\004\030\0010\013\022\n\b\002\020\f\032\004\030\0010\r\022\b\b\002\020\016\032\0020\017\022\b\b\002\020\020\032\0020\021\022\n\b\002\020\022\032\004\030\0010\023¢\006\002\020\030Jr\020;\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\0132\n\b\002\020\f\032\004\030\0010\r2\b\b\002\020\016\032\0020\0172\b\b\002\020\020\032\0020\0212\n\b\002\020\022\032\004\030\0010\023ø\001\000¢\006\004\b<\020=J@\020;\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\0052\b\b\002\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\tH\007ø\001\000¢\006\004\b>\020?JX\020;\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\0052\b\b\002\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\0132\n\b\002\020\f\032\004\030\0010\rH\007ø\001\000¢\006\004\b@\020AJp\020;\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\0052\b\b\002\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\0132\n\b\002\020\f\032\004\030\0010\r2\n\b\002\020\016\032\004\030\0010\0172\n\b\002\020\020\032\004\030\0010\021H\007ø\001\000¢\006\004\bB\020CJ|\020;\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\n\b\002\020\004\032\004\030\0010\0052\b\b\002\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\0132\n\b\002\020\f\032\004\030\0010\r2\n\b\002\020\016\032\004\030\0010\0172\n\b\002\020\020\032\004\030\0010\0212\n\b\002\020\022\032\004\030\0010\023H\007ø\001\000¢\006\004\bD\020EJ\023\020F\032\0020G2\b\020H\032\004\030\0010\001H\002J\b\020I\032\0020JH\026J\024\020K\032\0020\0002\n\b\002\020H\032\004\030\0010\000H\007J\021\020L\032\0020\0002\006\020H\032\0020\000H\002J\b\020M\032\0020NH\026R\"\020\031\032\004\030\0010\0218GX\004ø\001\000ø\001\001¢\006\f\022\004\b\032\020\033\032\004\b\034\020\035R\"\020\036\032\004\030\0010\0178GX\004ø\001\000ø\001\001¢\006\f\022\004\b\037\020\033\032\004\b \020!R\"\020\"\032\004\030\0010\0038GX\004ø\001\000ø\001\001¢\006\f\022\004\b#\020\033\032\004\b$\020%R\"\020&\032\004\030\0010\0058GX\004ø\001\000ø\001\001¢\006\f\022\004\b'\020\033\032\004\b(\020)R\031\020\020\032\0020\021ø\001\000ø\001\001¢\006\n\n\002\020,\032\004\b*\020+R\031\020\016\032\0020\017ø\001\000ø\001\001¢\006\n\n\002\020,\032\004\b-\020+R\031\020\006\032\0020\007ø\001\000ø\001\001¢\006\n\n\002\0200\032\004\b.\020/R\023\020\f\032\004\030\0010\r¢\006\b\n\000\032\004\b1\0202R\023\020\n\032\004\030\0010\013¢\006\b\n\000\032\004\b3\0204R\031\020\002\032\0020\003ø\001\000ø\001\001¢\006\n\n\002\020,\032\004\b5\020+R\031\020\004\032\0020\005ø\001\000ø\001\001¢\006\n\n\002\020,\032\004\b6\020+R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b7\0208R\023\020\022\032\004\030\0010\023¢\006\b\n\000\032\004\b9\020:\002\013\n\005\b¡\0360\001\n\002\b!¨\006O"}, d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "Landroidx/compose/ui/unit/TextUnit;", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "platformStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineBreak", "Landroidx/compose/ui/text/style/LineBreak;", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "deprecated_boxing_hyphens", "getHyphens-EaSxIns$annotations", "()V", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "deprecated_boxing_lineBreak", "getLineBreak-LgCVezo$annotations", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", "deprecated_boxing_textAlign", "getTextAlign-buA522U$annotations", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "deprecated_boxing_textDirection", "getTextDirection-mmuk1to$annotations", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getHyphens-vmbZdU8", "()I", "I", "getLineBreak-rAG3T2k", "getLineHeight-XSAIIZE", "()J", "J", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformParagraphStyle;", "getTextAlign-e0LSkKk", "getTextDirection-s_7X-co", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", "copy", "copy-ykzQM6k", "(IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-Elsmlbk", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-xPh5V4g", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-ciSxzs0", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/ParagraphStyle;", "copy-NH1kkwU", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "equals", "", "other", "hashCode", "", "merge", "plus", "toString", "", "ui-text"})
/*     */ @Immutable
/*     */ public final class ParagraphStyle {
/*     */   private final int textAlign;
/*     */   private final int textDirection;
/*     */   private final long lineHeight;
/*     */   @Nullable
/*     */   private final TextIndent textIndent;
/*     */   @Nullable
/*     */   private final PlatformParagraphStyle platformStyle;
/*     */   @Nullable
/*     */   private final LineHeightStyle lineHeightStyle;
/*     */   private final int lineBreak;
/*     */   private final int hyphens;
/*     */   @Nullable
/*     */   private final TextMotion textMotion;
/*     */   public static final int $stable;
/*     */   
/*     */   public final int getTextAlign-e0LSkKk() {
/*     */     return this.textAlign;
/*     */   }
/*     */   
/*     */   public final int getTextDirection-s_7X-co() {
/*     */     return this.textDirection;
/*     */   }
/*     */   
/*     */   public final long getLineHeight-XSAIIZE() {
/*     */     return this.lineHeight;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final TextIndent getTextIndent() {
/*     */     return this.textIndent;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final PlatformParagraphStyle getPlatformStyle() {
/*     */     return this.platformStyle;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final LineHeightStyle getLineHeightStyle() {
/*     */     return this.lineHeightStyle;
/*     */   }
/*     */   
/*     */   public final int getLineBreak-rAG3T2k() {
/*     */     return this.lineBreak;
/*     */   }
/*     */   
/*     */   private ParagraphStyle(int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, TextMotion textMotion) {
/*  68 */     this.textAlign = textAlign;
/*  69 */     this.textDirection = textDirection;
/*  70 */     this.lineHeight = lineHeight;
/*  71 */     this.textIndent = textIndent;
/*  72 */     this.platformStyle = platformStyle;
/*  73 */     this.lineHeightStyle = lineHeightStyle;
/*  74 */     this.lineBreak = lineBreak;
/*  75 */     this.hyphens = hyphens;
/*  76 */     this.textMotion = textMotion;
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
/* 200 */     if (!TextUnit.equals-impl0(this.lineHeight, TextUnit.Companion.getUnspecified-XSAIIZE()))
/*     */     {
/* 202 */       if (!((TextUnit.getValue-impl(this.lineHeight) >= 0.0F) ? 1 : 0)) { int $i$a$-check-ParagraphStyle$1 = 0; String str = 
/* 203 */           "lineHeight can't be negative (" + TextUnit.getValue-impl(this.lineHeight) + ')';
/*     */         throw new IllegalStateException(str.toString()); }
/*     */     
/*     */     }
/*     */   }
/*     */   
/*     */   public final int getHyphens-vmbZdU8() {
/*     */     return this.hyphens;
/*     */   }
/*     */   
/*     */   @Stable
/*     */   @NotNull
/*     */   public final ParagraphStyle merge(@Nullable ParagraphStyle other) {
/* 216 */     if (other == null) return this;
/*     */     
/* 218 */     return ParagraphStyleKt.fastMerge-j5T8yCg(this, 
/* 219 */         other.textAlign, 
/* 220 */         other.textDirection, 
/* 221 */         other.lineHeight, 
/* 222 */         other.textIndent, 
/* 223 */         other.platformStyle, 
/* 224 */         other.lineHeightStyle, 
/* 225 */         other.lineBreak, 
/* 226 */         other.hyphens, 
/* 227 */         other.textMotion);
/*     */   } @Nullable
/*     */   public final TextMotion getTextMotion() {
/*     */     return this.textMotion;
/*     */   }
/*     */   @Stable
/*     */   @NotNull
/*     */   public final ParagraphStyle plus(@NotNull ParagraphStyle other) {
/* 235 */     Intrinsics.checkNotNullParameter(other, "other"); return merge(other);
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
/*     */   @JvmName(name = "getTextAlign-buA522U")
/*     */   @Nullable
/*     */   public final TextAlign getTextAlign-buA522U() {
/*     */     return TextAlign.box-impl(this.textAlign);
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
/*     */   @JvmName(name = "getTextDirection-mmuk1to")
/*     */   @Nullable
/*     */   public final TextDirection getTextDirection-mmuk1to() {
/*     */     return TextDirection.box-impl(this.textDirection);
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
/*     */   @JvmName(name = "getHyphens-EaSxIns")
/*     */   @Nullable
/*     */   public final Hyphens getHyphens-EaSxIns() {
/*     */     return Hyphens.box-impl(this.hyphens);
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
/*     */   @JvmName(name = "getLineBreak-LgCVezo")
/*     */   @Nullable
/*     */   public final LineBreak getLineBreak-LgCVezo() {
/*     */     return LineBreak.box-impl(this.lineBreak);
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
/*     */   private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
/*     */     this((textAlign != null) ? textAlign.unbox-impl() : TextAlign.Companion.getUnspecified-e0LSkKk(), (textDirection != null) ? textDirection.unbox-impl() : TextDirection.Companion.getUnspecified-s_7X-co(), lineHeight, textIndent, platformStyle, lineHeightStyle, (lineBreak != null) ? lineBreak.unbox-impl() : LineBreak.Companion.getUnspecified-rAG3T2k(), (hyphens != null) ? hyphens.unbox-impl() : Hyphens.Companion.getUnspecified-vmbZdU8(), textMotion, (DefaultConstructorMarker)null);
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
/*     */   private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent) {
/*     */     this((textAlign != null) ? textAlign.unbox-impl() : TextAlign.Companion.getUnspecified-e0LSkKk(), (textDirection != null) ? textDirection.unbox-impl() : TextDirection.Companion.getUnspecified-s_7X-co(), lineHeight, textIndent, (PlatformParagraphStyle)null, (LineHeightStyle)null, LineBreak.Companion.getUnspecified-rAG3T2k(), Hyphens.Companion.getUnspecified-vmbZdU8(), (TextMotion)null, (DefaultConstructorMarker)null);
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
/*     */   private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle) {
/*     */     this((textAlign != null) ? textAlign.unbox-impl() : TextAlign.Companion.getUnspecified-e0LSkKk(), (textDirection != null) ? textDirection.unbox-impl() : TextDirection.Companion.getUnspecified-s_7X-co(), lineHeight, textIndent, platformStyle, lineHeightStyle, LineBreak.Companion.getUnspecified-rAG3T2k(), Hyphens.Companion.getUnspecified-vmbZdU8(), (TextMotion)null, (DefaultConstructorMarker)null);
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
/*     */   private ParagraphStyle(TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
/*     */     this((textAlign != null) ? textAlign.unbox-impl() : TextAlign.Companion.getUnspecified-e0LSkKk(), (textDirection != null) ? textDirection.unbox-impl() : TextDirection.Companion.getUnspecified-s_7X-co(), lineHeight, textIndent, platformStyle, lineHeightStyle, (lineBreak != null) ? lineBreak.unbox-impl() : LineBreak.Companion.getUnspecified-rAG3T2k(), (hyphens != null) ? hyphens.unbox-impl() : Hyphens.Companion.getUnspecified-vmbZdU8(), (TextMotion)null, (DefaultConstructorMarker)null);
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
/*     */   @NotNull
/*     */   public final ParagraphStyle copy-ykzQM6k(int textAlign, int textDirection, long lineHeight, @Nullable TextIndent textIndent, @Nullable PlatformParagraphStyle platformStyle, @Nullable LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, @Nullable TextMotion textMotion) {
/* 358 */     return new ParagraphStyle(
/* 359 */         textAlign, 
/* 360 */         textDirection, 
/* 361 */         lineHeight, 
/* 362 */         textIndent, 
/* 363 */         platformStyle, 
/* 364 */         lineHeightStyle, 
/* 365 */         lineBreak, 
/* 366 */         hyphens, 
/* 367 */         textMotion, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/* 372 */     if (this == other) return true; 
/* 373 */     if (!(other instanceof ParagraphStyle)) return false;
/*     */     
/* 375 */     if (!TextAlign.equals-impl0(this.textAlign, ((ParagraphStyle)other).textAlign)) return false; 
/* 376 */     if (!TextDirection.equals-impl0(this.textDirection, ((ParagraphStyle)other).textDirection)) return false; 
/* 377 */     if (!TextUnit.equals-impl0(this.lineHeight, ((ParagraphStyle)other).lineHeight)) return false; 
/* 378 */     if (!Intrinsics.areEqual(this.textIndent, ((ParagraphStyle)other).textIndent)) return false; 
/* 379 */     if (!Intrinsics.areEqual(this.platformStyle, ((ParagraphStyle)other).platformStyle)) return false; 
/* 380 */     if (!Intrinsics.areEqual(this.lineHeightStyle, ((ParagraphStyle)other).lineHeightStyle)) return false; 
/* 381 */     if (!LineBreak.equals-impl0(this.lineBreak, ((ParagraphStyle)other).lineBreak)) return false; 
/* 382 */     if (!Hyphens.equals-impl0(this.hyphens, ((ParagraphStyle)other).hyphens)) return false; 
/* 383 */     if (!Intrinsics.areEqual(this.textMotion, ((ParagraphStyle)other).textMotion)) return false;
/*     */     
/* 385 */     return true;
/*     */   }
/*     */   
/*     */   public int hashCode() {
/* 389 */     int result = TextAlign.hashCode-impl(this.textAlign);
/* 390 */     result = 31 * result + TextDirection.hashCode-impl(this.textDirection);
/* 391 */     result = 31 * result + TextUnit.hashCode-impl(this.lineHeight);
/* 392 */     result = 31 * result + ((this.textIndent != null) ? this.textIndent.hashCode() : 0);
/* 393 */     result = 31 * result + ((this.platformStyle != null) ? this.platformStyle.hashCode() : 0);
/* 394 */     result = 31 * result + ((this.lineHeightStyle != null) ? this.lineHeightStyle.hashCode() : 0);
/* 395 */     result = 31 * result + LineBreak.hashCode-impl(this.lineBreak);
/* 396 */     result = 31 * result + Hyphens.hashCode-impl(this.hyphens);
/* 397 */     result = 31 * result + ((this.textMotion != null) ? this.textMotion.hashCode() : 0);
/* 398 */     return result;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/* 404 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$toString_u24lambda_u241 = stringBuilder1; int $i$a$-buildString-ParagraphStyle$toString$1 = 0;
/* 405 */     $this$toString_u24lambda_u241.append("ParagraphStyle(");
/* 406 */     $this$toString_u24lambda_u241.append("textAlign=" + TextAlign.toString-impl(this.textAlign) + ", ");
/* 407 */     $this$toString_u24lambda_u241.append("textDirection=" + TextDirection.toString-impl(this.textDirection) + ", ");
/* 408 */     $this$toString_u24lambda_u241.append("lineHeight=" + TextUnit.toString-impl(this.lineHeight) + ", ");
/* 409 */     $this$toString_u24lambda_u241.append("textIndent=" + this.textIndent + ", ");
/* 410 */     $this$toString_u24lambda_u241.append("platformStyle=" + this.platformStyle + ", ");
/* 411 */     $this$toString_u24lambda_u241.append("lineHeightStyle=" + this.lineHeightStyle + ", ");
/* 412 */     $this$toString_u24lambda_u241.append("lineBreak=" + LineBreak.toString-impl(this.lineBreak) + ", ");
/* 413 */     $this$toString_u24lambda_u241.append("hyphens=" + Hyphens.toString-impl(this.hyphens) + ", ");
/* 414 */     $this$toString_u24lambda_u241.append("textMotion=" + this.textMotion);
/* 415 */     $this$toString_u24lambda_u241.append(")");
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*     */     return stringBuilder1.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\ParagraphStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */