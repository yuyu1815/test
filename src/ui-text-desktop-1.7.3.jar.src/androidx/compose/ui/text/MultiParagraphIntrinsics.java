/*     */ package androidx.compose.ui.text;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_skikoKt;
/*     */ import androidx.compose.ui.text.font.Font;
/*     */ import androidx.compose.ui.text.font.FontFamily;
/*     */ import androidx.compose.ui.text.style.TextDirection;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.LazyThreadSafetyMode;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\t\n\002\030\002\n\002\b\002\b\007\030\0002\0020\001B;\b\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\022\020\006\032\016\022\n\022\b\022\004\022\0020\t0\b0\007\022\006\020\n\032\0020\013\022\006\020\f\032\0020\r¢\006\002\020\016B9\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\022\020\006\032\016\022\n\022\b\022\004\022\0020\t0\b0\007\022\006\020\n\032\0020\013\022\006\020\017\032\0020\020¢\006\002\020\021J\030\020&\032\0020'2\006\020\004\032\0020'2\006\020(\032\0020'H\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\022\020\023R\024\020\024\032\0020\0258VX\004¢\006\006\032\004\b\026\020\027R\032\020\030\032\b\022\004\022\0020\0310\007X\004¢\006\b\n\000\032\004\b\032\020\033R\033\020\034\032\0020\0358VX\002¢\006\f\n\004\b \020!\032\004\b\036\020\037R\033\020\"\032\0020\0358VX\002¢\006\f\n\004\b$\020!\032\004\b#\020\037R\035\020\006\032\016\022\n\022\b\022\004\022\0020\t0\b0\007¢\006\b\n\000\032\004\b%\020\033¨\006)"}, d2 = {"Landroidx/compose/ui/text/MultiParagraphIntrinsics;", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/TextStyle;Ljava/util/List;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "hasStaleResolvedFonts", "", "getHasStaleResolvedFonts", "()Z", "infoList", "Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "getInfoList$ui_text", "()Ljava/util/List;", "maxIntrinsicWidth", "", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth$delegate", "Lkotlin/Lazy;", "minIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth$delegate", "getPlaceholders", "resolveTextDirection", "Landroidx/compose/ui/text/ParagraphStyle;", "defaultStyle", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n916#2:155\n917#2,5:164\n151#3,3:156\n33#3,4:159\n154#3:163\n155#3:169\n38#3:170\n156#3:171\n101#3,2:172\n33#3,6:174\n103#3:180\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics\n*L\n96#1:155\n96#1:164,5\n96#1:156,3\n96#1:159,4\n96#1:163\n96#1:169\n96#1:170\n96#1:171\n121#1:172,2\n121#1:174,6\n121#1:180\n*E\n"})
/*     */ public final class MultiParagraphIntrinsics
/*     */   implements ParagraphIntrinsics
/*     */ {
/*     */   @NotNull
/*     */   private final AnnotatedString annotatedString;
/*     */   @NotNull
/*     */   private final List<AnnotatedString.Range<Placeholder>> placeholders;
/*     */   @NotNull
/*     */   private final Lazy minIntrinsicWidth$delegate;
/*     */   @NotNull
/*     */   private final Lazy maxIntrinsicWidth$delegate;
/*     */   @NotNull
/*     */   private final List<ParagraphIntrinsicInfo> infoList;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public MultiParagraphIntrinsics(@NotNull AnnotatedString annotatedString, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, @NotNull Density density, @NotNull FontFamily.Resolver fontFamilyResolver) {
/*  47 */     this.annotatedString = annotatedString;
/*     */     
/*  49 */     this.placeholders = placeholders;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  75 */     this.minIntrinsicWidth$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new MultiParagraphIntrinsics$minIntrinsicWidth$2());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  81 */     this.maxIntrinsicWidth$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new MultiParagraphIntrinsics$maxIntrinsicWidth$2());
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  94 */     ParagraphStyle paragraphStyle = style.toParagraphStyle();
/*  95 */     AnnotatedString annotatedString1 = this.annotatedString;
/*  96 */     MultiParagraphIntrinsics multiParagraphIntrinsics = this; int $i$f$mapEachParagraphStyle = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 155 */     List<AnnotatedString.Range<ParagraphStyle>> $this$fastMap$iv$iv = AnnotatedStringKt.normalizedParagraphStyles(annotatedString1, paragraphStyle); int $i$f$fastMap = 0;
/*     */     
/* 157 */     ArrayList<ParagraphIntrinsicInfo> target$iv$iv = new ArrayList($this$fastMap$iv$iv.size());
/* 158 */     List<AnnotatedString.Range<ParagraphStyle>> $this$fastForEach$iv$iv$iv = $this$fastMap$iv$iv; int $i$f$fastForEach = 0;
/*     */     
/* 160 */     int index$iv$iv$iv = 0, i = $this$fastForEach$iv$iv$iv.size(); if (index$iv$iv$iv < i) {
/* 161 */       Object<ParagraphStyle> item$iv$iv$iv = (Object<ParagraphStyle>)$this$fastForEach$iv$iv$iv.get(index$iv$iv$iv);
/* 162 */       Object<ParagraphStyle> it$iv$iv = item$iv$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv$iv = 0;
/* 163 */       AnnotatedString.Range range1 = (AnnotatedString.Range)it$iv$iv; ArrayList<ParagraphIntrinsicInfo> arrayList = target$iv$iv; int $i$a$-fastMap-AnnotatedStringKt$mapEachParagraphStyle$1$iv = 0;
/* 164 */       AnnotatedString annotatedString$iv = AnnotatedStringKt.access$substringWithoutParagraphStyles(annotatedString1, 
/* 165 */           range1.getStart(), 
/* 166 */           range1.getEnd());
/*     */       
/* 168 */       AnnotatedString.Range range2 = range1; AnnotatedString annotatedString2 = annotatedString$iv; int $i$a$-mapEachParagraphStyle-MultiParagraphIntrinsics$1 = 0;
/*     */     } 
/*     */     
/* 171 */     multiParagraphIntrinsics.infoList = target$iv$iv; } public boolean getHasStaleResolvedFonts() { List<ParagraphIntrinsicInfo> $this$fastAny$iv = this.infoList;
/*     */     int $i$f$fastAny = 0;
/* 173 */     List<ParagraphIntrinsicInfo> $this$fastForEach$iv$iv = $this$fastAny$iv; int $i$f$fastForEach = 0;
/*     */     
/* 175 */     int index$iv$iv = 0, i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i);
/*     */     return false; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final AnnotatedString getAnnotatedString() {
/*     */     return this.annotatedString;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
/*     */     return this.placeholders;
/*     */   }
/*     */   
/*     */   @Deprecated(message = "Font.ResourceLoader is deprecated, call with fontFamilyResolver", replaceWith = @ReplaceWith(expression = "MultiParagraphIntrinsics(annotatedString, style, placeholders, density, fontFamilyResolver)", imports = {}))
/*     */   public MultiParagraphIntrinsics(@NotNull AnnotatedString annotatedString, @NotNull TextStyle style, @NotNull List<AnnotatedString.Range<Placeholder>> placeholders, @NotNull Density density, @NotNull Font.ResourceLoader resourceLoader) {
/*     */     this(annotatedString, style, placeholders, density, DelegatingFontLoaderForDeprecatedUsage_skikoKt.createFontFamilyResolver(resourceLoader));
/*     */   }
/*     */   
/*     */   public float getMinIntrinsicWidth() {
/*     */     Lazy lazy = this.minIntrinsicWidth$delegate;
/*     */     return ((Number)lazy.getValue()).floatValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\007\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"})
/*     */   @SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$minIntrinsicWidth$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n171#2,13:155\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$minIntrinsicWidth$2\n*L\n76#1:155,13\n*E\n"})
/*     */   static final class MultiParagraphIntrinsics$minIntrinsicWidth$2 extends Lambda implements Function0<Float> {
/*     */     @NotNull
/*     */     public final Float invoke() {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield this$0 : Landroidx/compose/ui/text/MultiParagraphIntrinsics;
/*     */       //   4: invokevirtual getInfoList$ui_text : ()Ljava/util/List;
/*     */       //   7: astore_2
/*     */       //   8: iconst_0
/*     */       //   9: istore_3
/*     */       //   10: nop
/*     */       //   11: aload_2
/*     */       //   12: invokeinterface isEmpty : ()Z
/*     */       //   17: ifeq -> 24
/*     */       //   20: aconst_null
/*     */       //   21: goto -> 136
/*     */       //   24: aload_2
/*     */       //   25: iconst_0
/*     */       //   26: invokeinterface get : (I)Ljava/lang/Object;
/*     */       //   31: astore #4
/*     */       //   33: aload #4
/*     */       //   35: checkcast androidx/compose/ui/text/ParagraphIntrinsicInfo
/*     */       //   38: astore #5
/*     */       //   40: iconst_0
/*     */       //   41: istore #6
/*     */       //   43: aload #5
/*     */       //   45: invokevirtual getIntrinsics : ()Landroidx/compose/ui/text/ParagraphIntrinsics;
/*     */       //   48: invokeinterface getMinIntrinsicWidth : ()F
/*     */       //   53: fstore #5
/*     */       //   55: iconst_1
/*     */       //   56: istore #6
/*     */       //   58: aload_2
/*     */       //   59: invokestatic getLastIndex : (Ljava/util/List;)I
/*     */       //   62: istore #7
/*     */       //   64: iload #6
/*     */       //   66: iload #7
/*     */       //   68: if_icmpgt -> 134
/*     */       //   71: aload_2
/*     */       //   72: iload #6
/*     */       //   74: invokeinterface get : (I)Ljava/lang/Object;
/*     */       //   79: astore #8
/*     */       //   81: aload #8
/*     */       //   83: checkcast androidx/compose/ui/text/ParagraphIntrinsicInfo
/*     */       //   86: astore #9
/*     */       //   88: iconst_0
/*     */       //   89: istore #10
/*     */       //   91: aload #9
/*     */       //   93: invokevirtual getIntrinsics : ()Landroidx/compose/ui/text/ParagraphIntrinsics;
/*     */       //   96: invokeinterface getMinIntrinsicWidth : ()F
/*     */       //   101: fstore #9
/*     */       //   103: fload #5
/*     */       //   105: fload #9
/*     */       //   107: invokestatic compare : (FF)I
/*     */       //   110: ifge -> 121
/*     */       //   113: aload #8
/*     */       //   115: astore #4
/*     */       //   117: fload #9
/*     */       //   119: fstore #5
/*     */       //   121: iload #6
/*     */       //   123: iload #7
/*     */       //   125: if_icmpeq -> 134
/*     */       //   128: iinc #6, 1
/*     */       //   131: goto -> 71
/*     */       //   134: aload #4
/*     */       //   136: checkcast androidx/compose/ui/text/ParagraphIntrinsicInfo
/*     */       //   139: astore_1
/*     */       //   140: aload_1
/*     */       //   141: ifnull -> 162
/*     */       //   144: aload_1
/*     */       //   145: invokevirtual getIntrinsics : ()Landroidx/compose/ui/text/ParagraphIntrinsics;
/*     */       //   148: astore_2
/*     */       //   149: aload_2
/*     */       //   150: ifnull -> 162
/*     */       //   153: aload_2
/*     */       //   154: invokeinterface getMinIntrinsicWidth : ()F
/*     */       //   159: goto -> 163
/*     */       //   162: fconst_0
/*     */       //   163: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */       //   166: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #76	-> 0
/*     */       //   #155	-> 10
/*     */       //   #156	-> 11
/*     */       //   #157	-> 24
/*     */       //   #158	-> 33
/*     */       //   #77	-> 43
/*     */       //   #158	-> 53
/*     */       //   #159	-> 55
/*     */       //   #160	-> 71
/*     */       //   #161	-> 81
/*     */       //   #77	-> 91
/*     */       //   #161	-> 101
/*     */       //   #162	-> 103
/*     */       //   #163	-> 113
/*     */       //   #164	-> 117
/*     */       //   #159	-> 121
/*     */       //   #167	-> 134
/*     */       //   #76	-> 136
/*     */       //   #78	-> 140
/*     */       //   #76	-> 144
/*     */       //   #78	-> 145
/*     */       //   #76	-> 159
/*     */       //   #78	-> 162
/*     */       //   #76	-> 166
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   43	10	6	$i$a$-fastMaxBy-MultiParagraphIntrinsics$minIntrinsicWidth$2$1	I
/*     */       //   40	13	5	it	Landroidx/compose/ui/text/ParagraphIntrinsicInfo;
/*     */       //   91	10	10	$i$a$-fastMaxBy-MultiParagraphIntrinsics$minIntrinsicWidth$2$1	I
/*     */       //   88	13	9	it	Landroidx/compose/ui/text/ParagraphIntrinsicInfo;
/*     */       //   81	40	8	e$iv	Ljava/lang/Object;
/*     */       //   103	18	9	v$iv	F
/*     */       //   58	76	6	i$iv	I
/*     */       //   10	126	3	$i$f$fastMaxBy	I
/*     */       //   33	103	4	maxElem$iv	Ljava/lang/Object;
/*     */       //   55	81	5	maxValue$iv	F
/*     */       //   8	128	2	$this$fastMaxBy$iv	Ljava/util/List;
/*     */       //   0	167	0	this	Landroidx/compose/ui/text/MultiParagraphIntrinsics$minIntrinsicWidth$2;
/*     */     }
/*     */     
/*     */     MultiParagraphIntrinsics$minIntrinsicWidth$2() {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   public float getMaxIntrinsicWidth() {
/*     */     Lazy lazy = this.maxIntrinsicWidth$delegate;
/*     */     return ((Number)lazy.getValue()).floatValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\007\n\002\b\002\020\000\032\0020\001H\n¢\006\004\b\002\020\003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"})
/*     */   @SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$maxIntrinsicWidth$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,154:1\n171#2,13:155\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsics$maxIntrinsicWidth$2\n*L\n82#1:155,13\n*E\n"})
/*     */   static final class MultiParagraphIntrinsics$maxIntrinsicWidth$2 extends Lambda implements Function0<Float> {
/*     */     @NotNull
/*     */     public final Float invoke() {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield this$0 : Landroidx/compose/ui/text/MultiParagraphIntrinsics;
/*     */       //   4: invokevirtual getInfoList$ui_text : ()Ljava/util/List;
/*     */       //   7: astore_2
/*     */       //   8: iconst_0
/*     */       //   9: istore_3
/*     */       //   10: nop
/*     */       //   11: aload_2
/*     */       //   12: invokeinterface isEmpty : ()Z
/*     */       //   17: ifeq -> 24
/*     */       //   20: aconst_null
/*     */       //   21: goto -> 136
/*     */       //   24: aload_2
/*     */       //   25: iconst_0
/*     */       //   26: invokeinterface get : (I)Ljava/lang/Object;
/*     */       //   31: astore #4
/*     */       //   33: aload #4
/*     */       //   35: checkcast androidx/compose/ui/text/ParagraphIntrinsicInfo
/*     */       //   38: astore #5
/*     */       //   40: iconst_0
/*     */       //   41: istore #6
/*     */       //   43: aload #5
/*     */       //   45: invokevirtual getIntrinsics : ()Landroidx/compose/ui/text/ParagraphIntrinsics;
/*     */       //   48: invokeinterface getMaxIntrinsicWidth : ()F
/*     */       //   53: fstore #5
/*     */       //   55: iconst_1
/*     */       //   56: istore #6
/*     */       //   58: aload_2
/*     */       //   59: invokestatic getLastIndex : (Ljava/util/List;)I
/*     */       //   62: istore #7
/*     */       //   64: iload #6
/*     */       //   66: iload #7
/*     */       //   68: if_icmpgt -> 134
/*     */       //   71: aload_2
/*     */       //   72: iload #6
/*     */       //   74: invokeinterface get : (I)Ljava/lang/Object;
/*     */       //   79: astore #8
/*     */       //   81: aload #8
/*     */       //   83: checkcast androidx/compose/ui/text/ParagraphIntrinsicInfo
/*     */       //   86: astore #9
/*     */       //   88: iconst_0
/*     */       //   89: istore #10
/*     */       //   91: aload #9
/*     */       //   93: invokevirtual getIntrinsics : ()Landroidx/compose/ui/text/ParagraphIntrinsics;
/*     */       //   96: invokeinterface getMaxIntrinsicWidth : ()F
/*     */       //   101: fstore #9
/*     */       //   103: fload #5
/*     */       //   105: fload #9
/*     */       //   107: invokestatic compare : (FF)I
/*     */       //   110: ifge -> 121
/*     */       //   113: aload #8
/*     */       //   115: astore #4
/*     */       //   117: fload #9
/*     */       //   119: fstore #5
/*     */       //   121: iload #6
/*     */       //   123: iload #7
/*     */       //   125: if_icmpeq -> 134
/*     */       //   128: iinc #6, 1
/*     */       //   131: goto -> 71
/*     */       //   134: aload #4
/*     */       //   136: checkcast androidx/compose/ui/text/ParagraphIntrinsicInfo
/*     */       //   139: astore_1
/*     */       //   140: aload_1
/*     */       //   141: ifnull -> 162
/*     */       //   144: aload_1
/*     */       //   145: invokevirtual getIntrinsics : ()Landroidx/compose/ui/text/ParagraphIntrinsics;
/*     */       //   148: astore_2
/*     */       //   149: aload_2
/*     */       //   150: ifnull -> 162
/*     */       //   153: aload_2
/*     */       //   154: invokeinterface getMaxIntrinsicWidth : ()F
/*     */       //   159: goto -> 163
/*     */       //   162: fconst_0
/*     */       //   163: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */       //   166: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #82	-> 0
/*     */       //   #155	-> 10
/*     */       //   #156	-> 11
/*     */       //   #157	-> 24
/*     */       //   #158	-> 33
/*     */       //   #83	-> 43
/*     */       //   #158	-> 53
/*     */       //   #159	-> 55
/*     */       //   #160	-> 71
/*     */       //   #161	-> 81
/*     */       //   #83	-> 91
/*     */       //   #161	-> 101
/*     */       //   #162	-> 103
/*     */       //   #163	-> 113
/*     */       //   #164	-> 117
/*     */       //   #159	-> 121
/*     */       //   #167	-> 134
/*     */       //   #82	-> 136
/*     */       //   #84	-> 140
/*     */       //   #82	-> 144
/*     */       //   #84	-> 145
/*     */       //   #82	-> 159
/*     */       //   #84	-> 162
/*     */       //   #82	-> 166
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   43	10	6	$i$a$-fastMaxBy-MultiParagraphIntrinsics$maxIntrinsicWidth$2$1	I
/*     */       //   40	13	5	it	Landroidx/compose/ui/text/ParagraphIntrinsicInfo;
/*     */       //   91	10	10	$i$a$-fastMaxBy-MultiParagraphIntrinsics$maxIntrinsicWidth$2$1	I
/*     */       //   88	13	9	it	Landroidx/compose/ui/text/ParagraphIntrinsicInfo;
/*     */       //   81	40	8	e$iv	Ljava/lang/Object;
/*     */       //   103	18	9	v$iv	F
/*     */       //   58	76	6	i$iv	I
/*     */       //   10	126	3	$i$f$fastMaxBy	I
/*     */       //   33	103	4	maxElem$iv	Ljava/lang/Object;
/*     */       //   55	81	5	maxValue$iv	F
/*     */       //   8	128	2	$this$fastMaxBy$iv	Ljava/util/List;
/*     */       //   0	167	0	this	Landroidx/compose/ui/text/MultiParagraphIntrinsics$maxIntrinsicWidth$2;
/*     */     }
/*     */     
/*     */     MultiParagraphIntrinsics$maxIntrinsicWidth$2() {
/*     */       super(0);
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<ParagraphIntrinsicInfo> getInfoList$ui_text() {
/*     */     return this.infoList;
/*     */   }
/*     */   
/*     */   private final ParagraphStyle resolveTextDirection(ParagraphStyle style, ParagraphStyle defaultStyle) {
/*     */     return !TextDirection.equals-impl0(style.getTextDirection-s_7X-co(), TextDirection.Companion.getUnspecified-s_7X-co()) ? style : ParagraphStyle.copy-ykzQM6k$default(style, 0, defaultStyle.getTextDirection-s_7X-co(), 0L, null, null, null, 0, 0, null, 509, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\MultiParagraphIntrinsics.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */