/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.runtime.Stable;
/*     */ import androidx.compose.ui.text.style.Hyphens;
/*     */ import androidx.compose.ui.text.style.LineBreak;
/*     */ import androidx.compose.ui.text.style.LineHeightStyle;
/*     */ import androidx.compose.ui.text.style.TextAlign;
/*     */ import androidx.compose.ui.text.style.TextIndent;
/*     */ import androidx.compose.ui.text.style.TextIndentKt;
/*     */ import androidx.compose.ui.text.style.TextMotion;
/*     */ import androidx.compose.ui.unit.LayoutDirection;
/*     */ import androidx.compose.ui.unit.TextUnit;
/*     */ import androidx.compose.ui.unit.TextUnitKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000X\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\007\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\032 \020\003\032\0020\0042\006\020\005\032\0020\0042\006\020\006\032\0020\0042\006\020\007\032\0020\bH\007\032&\020\t\032\004\030\0010\n2\b\020\005\032\004\030\0010\n2\b\020\006\032\004\030\0010\n2\006\020\007\032\0020\bH\002\032\030\020\013\032\0020\0042\006\020\f\032\0020\0042\006\020\r\032\0020\016H\000\032f\020\017\032\0020\004*\0020\0042\006\020\020\032\0020\0212\006\020\022\032\0020\0232\006\020\024\032\0020\0012\b\020\025\032\004\030\0010\0262\b\020\027\032\004\030\0010\n2\b\020\030\032\004\030\0010\0312\006\020\032\032\0020\0332\006\020\034\032\0020\0352\b\020\036\032\004\030\0010\037H\000ø\001\000¢\006\004\b \020!\032\030\020\"\032\004\030\0010\n*\0020\0042\b\020#\032\004\030\0010\nH\002\"\020\020\000\032\0020\001X\004¢\006\004\n\002\020\002\002\007\n\005\b¡\0360\001¨\006$"}, d2 = {"DefaultLineHeight", "Landroidx/compose/ui/unit/TextUnit;", "J", "lerp", "Landroidx/compose/ui/text/ParagraphStyle;", "start", "stop", "fraction", "", "lerpPlatformStyle", "Landroidx/compose/ui/text/PlatformParagraphStyle;", "resolveParagraphStyleDefaults", "style", "direction", "Landroidx/compose/ui/unit/LayoutDirection;", "fastMerge", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "platformStyle", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "lineBreak", "Landroidx/compose/ui/text/style/LineBreak;", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "fastMerge-j5T8yCg", "(Landroidx/compose/ui/text/ParagraphStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/ParagraphStyle;", "mergePlatformStyle", "other", "ui-text"})
/*     */ @SourceDebugExtension({"SMAP\nParagraphStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyleKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n*L\n1#1,543:1\n251#2:544\n*S KotlinDebug\n*F\n+ 1 ParagraphStyle.kt\nandroidx/compose/ui/text/ParagraphStyleKt\n*L\n505#1:544\n*E\n"})
/*     */ public final class ParagraphStyleKt
/*     */ {
/*  35 */   private static final long DefaultLineHeight = TextUnit.Companion.getUnspecified-XSAIIZE();
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
/*     */   @Stable
/*     */   @NotNull
/*     */   public static final ParagraphStyle lerp(@NotNull ParagraphStyle start, @NotNull ParagraphStyle stop, float fraction) {
/* 435 */     Intrinsics.checkNotNullParameter(start, "start"); Intrinsics.checkNotNullParameter(stop, "stop");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 444 */     if (start.getTextIndent() == null) start.getTextIndent(); 
/* 445 */     if (stop.getTextIndent() == null) stop.getTextIndent();  super(SpanStyleKt.lerpTextUnitInheritable-C3pnCVY(start.getLineHeight-XSAIIZE(), stop.getLineHeight-XSAIIZE(), fraction), start.getTextIndent(), TextIndent.Companion.getNone(), TextIndentKt.lerp(stop.getTextIndent(), TextIndent.Companion.getNone(), 
/* 446 */           fraction), 
/*     */         
/* 448 */         lerpPlatformStyle(start.getPlatformStyle(), stop.getPlatformStyle(), fraction), 
/* 449 */         SpanStyleKt.<LineHeightStyle>lerpDiscrete(
/* 450 */           start.getLineHeightStyle(), 
/* 451 */           stop.getLineHeightStyle(), 
/* 452 */           fraction), (
/*     */         
/* 454 */         (LineBreak)SpanStyleKt.<LineBreak>lerpDiscrete(LineBreak.box-impl(start.getLineBreak-rAG3T2k()), LineBreak.box-impl(stop.getLineBreak-rAG3T2k()), fraction)).unbox-impl(), (
/* 455 */         (Hyphens)SpanStyleKt.<Hyphens>lerpDiscrete(Hyphens.box-impl(start.getHyphens-vmbZdU8()), Hyphens.box-impl(stop.getHyphens-vmbZdU8()), fraction)).unbox-impl(), 
/* 456 */         SpanStyleKt.<TextMotion>lerpDiscrete(start.getTextMotion(), stop.getTextMotion(), fraction), (DefaultConstructorMarker)null);
/*     */     return ((TextAlign)SpanStyleKt.<TextAlign>lerpDiscrete(TextAlign.box-impl(start.getTextAlign-e0LSkKk()), TextAlign.box-impl(stop.getTextAlign-e0LSkKk()), fraction)).unbox-impl();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final PlatformParagraphStyle lerpPlatformStyle(PlatformParagraphStyle start, PlatformParagraphStyle stop, float fraction) {
/* 465 */     if (start == null && stop == null) return null; 
/* 466 */     if (start == null); PlatformParagraphStyle startNonNull = PlatformParagraphStyle.Companion.getDefault();
/* 467 */     if (stop == null); PlatformParagraphStyle stopNonNull = PlatformParagraphStyle.Companion.getDefault();
/* 468 */     return DesktopTextStyle_skikoKt.lerp(startNonNull, stopNonNull, fraction);
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final ParagraphStyle resolveParagraphStyleDefaults(@NotNull ParagraphStyle style, @NotNull LayoutDirection direction) {
/* 474 */     Intrinsics.checkNotNullParameter(style, "style"); Intrinsics.checkNotNullParameter(direction, "direction");
/*     */ 
/*     */ 
/*     */     
/* 478 */     if (style.getTextIndent() == null) style.getTextIndent();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 483 */     if (style.getTextMotion() == null) style.getTextMotion();  super(TextUnitKt.isUnspecified--R2X_6o(style.getLineHeight-XSAIIZE()) ? DefaultLineHeight : style.getLineHeight-XSAIIZE(), style.getTextIndent(), TextIndent.Companion.getNone(), (TextIndent)style.getPlatformStyle(), (PlatformParagraphStyle)style.getLineHeightStyle(), LineBreak.equals-impl0(style.getLineBreak-rAG3T2k(), LineBreak.Companion.getUnspecified-rAG3T2k()) ? LineBreak.Companion.getSimple-rAG3T2k() : style.getLineBreak-rAG3T2k(), Hyphens.equals-impl0(style.getHyphens-vmbZdU8(), Hyphens.Companion.getUnspecified-vmbZdU8()) ? Hyphens.Companion.getNone-vmbZdU8() : style.getHyphens-vmbZdU8(), style.getTextMotion(), TextMotion.Companion.getStatic(), (DefaultConstructorMarker)null);
/*     */     return TextAlign.equals-impl0(style.getTextAlign-e0LSkKk(), TextAlign.Companion.getUnspecified-e0LSkKk()) ? TextAlign.Companion.getStart-e0LSkKk() : style.getTextAlign-e0LSkKk();
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
/*     */   @NotNull
/*     */   public static final ParagraphStyle fastMerge-j5T8yCg(@NotNull ParagraphStyle $this$fastMerge_u2dj5T8yCg, int textAlign, int textDirection, long lineHeight, @Nullable TextIndent textIndent, @Nullable PlatformParagraphStyle platformStyle, @Nullable LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, @Nullable TextMotion textMotion) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '$this$fastMerge'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: iload_1
/*     */     //   7: getstatic androidx/compose/ui/text/style/TextAlign.Companion : Landroidx/compose/ui/text/style/TextAlign$Companion;
/*     */     //   10: invokevirtual getUnspecified-e0LSkKk : ()I
/*     */     //   13: invokestatic equals-impl0 : (II)Z
/*     */     //   16: ifne -> 30
/*     */     //   19: iload_1
/*     */     //   20: aload_0
/*     */     //   21: invokevirtual getTextAlign-e0LSkKk : ()I
/*     */     //   24: invokestatic equals-impl0 : (II)Z
/*     */     //   27: ifeq -> 207
/*     */     //   30: lload_3
/*     */     //   31: lstore #12
/*     */     //   33: iconst_0
/*     */     //   34: istore #14
/*     */     //   36: lload #12
/*     */     //   38: invokestatic isUnspecified--R2X_6o : (J)Z
/*     */     //   41: ifne -> 48
/*     */     //   44: iconst_1
/*     */     //   45: goto -> 49
/*     */     //   48: iconst_0
/*     */     //   49: ifeq -> 63
/*     */     //   52: lload_3
/*     */     //   53: aload_0
/*     */     //   54: invokevirtual getLineHeight-XSAIIZE : ()J
/*     */     //   57: invokestatic equals-impl0 : (JJ)Z
/*     */     //   60: ifeq -> 207
/*     */     //   63: aload #5
/*     */     //   65: ifnull -> 80
/*     */     //   68: aload #5
/*     */     //   70: aload_0
/*     */     //   71: invokevirtual getTextIndent : ()Landroidx/compose/ui/text/style/TextIndent;
/*     */     //   74: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   77: ifeq -> 207
/*     */     //   80: iload_2
/*     */     //   81: getstatic androidx/compose/ui/text/style/TextDirection.Companion : Landroidx/compose/ui/text/style/TextDirection$Companion;
/*     */     //   84: invokevirtual getUnspecified-s_7X-co : ()I
/*     */     //   87: invokestatic equals-impl0 : (II)Z
/*     */     //   90: ifne -> 104
/*     */     //   93: iload_2
/*     */     //   94: aload_0
/*     */     //   95: invokevirtual getTextDirection-s_7X-co : ()I
/*     */     //   98: invokestatic equals-impl0 : (II)Z
/*     */     //   101: ifeq -> 207
/*     */     //   104: aload #6
/*     */     //   106: ifnull -> 121
/*     */     //   109: aload #6
/*     */     //   111: aload_0
/*     */     //   112: invokevirtual getPlatformStyle : ()Landroidx/compose/ui/text/PlatformParagraphStyle;
/*     */     //   115: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   118: ifeq -> 207
/*     */     //   121: aload #7
/*     */     //   123: ifnull -> 138
/*     */     //   126: aload #7
/*     */     //   128: aload_0
/*     */     //   129: invokevirtual getLineHeightStyle : ()Landroidx/compose/ui/text/style/LineHeightStyle;
/*     */     //   132: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   135: ifeq -> 207
/*     */     //   138: iload #8
/*     */     //   140: getstatic androidx/compose/ui/text/style/LineBreak.Companion : Landroidx/compose/ui/text/style/LineBreak$Companion;
/*     */     //   143: invokevirtual getUnspecified-rAG3T2k : ()I
/*     */     //   146: invokestatic equals-impl0 : (II)Z
/*     */     //   149: ifne -> 164
/*     */     //   152: iload #8
/*     */     //   154: aload_0
/*     */     //   155: invokevirtual getLineBreak-rAG3T2k : ()I
/*     */     //   158: invokestatic equals-impl0 : (II)Z
/*     */     //   161: ifeq -> 207
/*     */     //   164: iload #9
/*     */     //   166: getstatic androidx/compose/ui/text/style/Hyphens.Companion : Landroidx/compose/ui/text/style/Hyphens$Companion;
/*     */     //   169: invokevirtual getUnspecified-vmbZdU8 : ()I
/*     */     //   172: invokestatic equals-impl0 : (II)Z
/*     */     //   175: ifne -> 190
/*     */     //   178: iload #9
/*     */     //   180: aload_0
/*     */     //   181: invokevirtual getHyphens-vmbZdU8 : ()I
/*     */     //   184: invokestatic equals-impl0 : (II)Z
/*     */     //   187: ifeq -> 207
/*     */     //   190: aload #10
/*     */     //   192: ifnull -> 211
/*     */     //   195: aload #10
/*     */     //   197: aload_0
/*     */     //   198: invokevirtual getTextMotion : ()Landroidx/compose/ui/text/style/TextMotion;
/*     */     //   201: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   204: ifne -> 211
/*     */     //   207: iconst_1
/*     */     //   208: goto -> 212
/*     */     //   211: iconst_0
/*     */     //   212: istore #11
/*     */     //   214: iload #11
/*     */     //   216: ifne -> 221
/*     */     //   219: aload_0
/*     */     //   220: areturn
/*     */     //   221: lload_3
/*     */     //   222: invokestatic isUnspecified--R2X_6o : (J)Z
/*     */     //   225: ifeq -> 235
/*     */     //   228: aload_0
/*     */     //   229: invokevirtual getLineHeight-XSAIIZE : ()J
/*     */     //   232: goto -> 236
/*     */     //   235: lload_3
/*     */     //   236: lstore #12
/*     */     //   238: aload #5
/*     */     //   240: dup
/*     */     //   241: ifnonnull -> 249
/*     */     //   244: pop
/*     */     //   245: aload_0
/*     */     //   246: invokevirtual getTextIndent : ()Landroidx/compose/ui/text/style/TextIndent;
/*     */     //   249: astore #14
/*     */     //   251: iload_1
/*     */     //   252: getstatic androidx/compose/ui/text/style/TextAlign.Companion : Landroidx/compose/ui/text/style/TextAlign$Companion;
/*     */     //   255: invokevirtual getUnspecified-e0LSkKk : ()I
/*     */     //   258: invokestatic equals-impl0 : (II)Z
/*     */     //   261: ifne -> 268
/*     */     //   264: iload_1
/*     */     //   265: goto -> 272
/*     */     //   268: aload_0
/*     */     //   269: invokevirtual getTextAlign-e0LSkKk : ()I
/*     */     //   272: istore #15
/*     */     //   274: iload_2
/*     */     //   275: getstatic androidx/compose/ui/text/style/TextDirection.Companion : Landroidx/compose/ui/text/style/TextDirection$Companion;
/*     */     //   278: invokevirtual getUnspecified-s_7X-co : ()I
/*     */     //   281: invokestatic equals-impl0 : (II)Z
/*     */     //   284: ifne -> 291
/*     */     //   287: iload_2
/*     */     //   288: goto -> 295
/*     */     //   291: aload_0
/*     */     //   292: invokevirtual getTextDirection-s_7X-co : ()I
/*     */     //   295: istore #16
/*     */     //   297: aload_0
/*     */     //   298: aload #6
/*     */     //   300: invokestatic mergePlatformStyle : (Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/PlatformParagraphStyle;)Landroidx/compose/ui/text/PlatformParagraphStyle;
/*     */     //   303: astore #17
/*     */     //   305: aload #7
/*     */     //   307: dup
/*     */     //   308: ifnonnull -> 316
/*     */     //   311: pop
/*     */     //   312: aload_0
/*     */     //   313: invokevirtual getLineHeightStyle : ()Landroidx/compose/ui/text/style/LineHeightStyle;
/*     */     //   316: astore #18
/*     */     //   318: iload #8
/*     */     //   320: getstatic androidx/compose/ui/text/style/LineBreak.Companion : Landroidx/compose/ui/text/style/LineBreak$Companion;
/*     */     //   323: invokevirtual getUnspecified-rAG3T2k : ()I
/*     */     //   326: invokestatic equals-impl0 : (II)Z
/*     */     //   329: ifne -> 337
/*     */     //   332: iload #8
/*     */     //   334: goto -> 341
/*     */     //   337: aload_0
/*     */     //   338: invokevirtual getLineBreak-rAG3T2k : ()I
/*     */     //   341: istore #19
/*     */     //   343: iload #9
/*     */     //   345: getstatic androidx/compose/ui/text/style/Hyphens.Companion : Landroidx/compose/ui/text/style/Hyphens$Companion;
/*     */     //   348: invokevirtual getUnspecified-vmbZdU8 : ()I
/*     */     //   351: invokestatic equals-impl0 : (II)Z
/*     */     //   354: ifne -> 362
/*     */     //   357: iload #9
/*     */     //   359: goto -> 366
/*     */     //   362: aload_0
/*     */     //   363: invokevirtual getHyphens-vmbZdU8 : ()I
/*     */     //   366: istore #20
/*     */     //   368: aload #10
/*     */     //   370: dup
/*     */     //   371: ifnonnull -> 379
/*     */     //   374: pop
/*     */     //   375: aload_0
/*     */     //   376: invokevirtual getTextMotion : ()Landroidx/compose/ui/text/style/TextMotion;
/*     */     //   379: astore #21
/*     */     //   381: new androidx/compose/ui/text/ParagraphStyle
/*     */     //   384: dup
/*     */     //   385: iload #15
/*     */     //   387: iload #16
/*     */     //   389: lload #12
/*     */     //   391: aload #14
/*     */     //   393: aload #17
/*     */     //   395: aload #18
/*     */     //   397: iload #19
/*     */     //   399: iload #20
/*     */     //   401: aload #21
/*     */     //   403: aconst_null
/*     */     //   404: invokespecial <init> : (IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformParagraphStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   407: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #504	-> 6
/*     */     //   #505	-> 30
/*     */     //   #544	-> 36
/*     */     //   #505	-> 52
/*     */     //   #506	-> 63
/*     */     //   #507	-> 80
/*     */     //   #508	-> 104
/*     */     //   #509	-> 121
/*     */     //   #510	-> 138
/*     */     //   #511	-> 164
/*     */     //   #512	-> 190
/*     */     //   #504	-> 212
/*     */     //   #514	-> 214
/*     */     //   #515	-> 219
/*     */     //   #519	-> 221
/*     */     //   #520	-> 228
/*     */     //   #522	-> 235
/*     */     //   #519	-> 236
/*     */     //   #524	-> 238
/*     */     //   #525	-> 251
/*     */     //   #527	-> 274
/*     */     //   #528	-> 297
/*     */     //   #529	-> 305
/*     */     //   #530	-> 318
/*     */     //   #531	-> 343
/*     */     //   #532	-> 368
/*     */     //   #518	-> 381
/*     */     //   #525	-> 385
/*     */     //   #527	-> 387
/*     */     //   #519	-> 389
/*     */     //   #524	-> 391
/*     */     //   #528	-> 393
/*     */     //   #529	-> 395
/*     */     //   #530	-> 397
/*     */     //   #531	-> 399
/*     */     //   #532	-> 401
/*     */     //   #518	-> 404
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   36	13	14	$i$f$isSpecified--R2X_6o	I
/*     */     //   33	16	12	$this$isSpecified$iv	J
/*     */     //   214	194	11	requiresAlloc	Z
/*     */     //   0	408	0	$this$fastMerge_u2dj5T8yCg	Landroidx/compose/ui/text/ParagraphStyle;
/*     */     //   0	408	1	textAlign	I
/*     */     //   0	408	2	textDirection	I
/*     */     //   0	408	3	lineHeight	J
/*     */     //   0	408	5	textIndent	Landroidx/compose/ui/text/style/TextIndent;
/*     */     //   0	408	6	platformStyle	Landroidx/compose/ui/text/PlatformParagraphStyle;
/*     */     //   0	408	7	lineHeightStyle	Landroidx/compose/ui/text/style/LineHeightStyle;
/*     */     //   0	408	8	lineBreak	I
/*     */     //   0	408	9	hyphens	I
/*     */     //   0	408	10	textMotion	Landroidx/compose/ui/text/style/TextMotion;
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
/*     */   private static final PlatformParagraphStyle mergePlatformStyle(ParagraphStyle $this$mergePlatformStyle, PlatformParagraphStyle other) {
/* 539 */     if ($this$mergePlatformStyle.getPlatformStyle() == null) return other; 
/* 540 */     if (other == null) return $this$mergePlatformStyle.getPlatformStyle(); 
/* 541 */     return $this$mergePlatformStyle.getPlatformStyle().merge(other);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\ParagraphStyleKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */