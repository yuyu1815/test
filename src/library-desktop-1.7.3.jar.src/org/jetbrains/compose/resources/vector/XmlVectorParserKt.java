/*     */ package org.jetbrains.compose.resources.vector;
/*     */ 
/*     */ import androidx.compose.ui.geometry.OffsetKt;
/*     */ import androidx.compose.ui.graphics.Brush;
/*     */ import androidx.compose.ui.graphics.Color;
/*     */ import androidx.compose.ui.graphics.ColorKt;
/*     */ import androidx.compose.ui.graphics.SolidColor;
/*     */ import androidx.compose.ui.graphics.TileMode;
/*     */ import androidx.compose.ui.graphics.vector.ImageVector;
/*     */ import androidx.compose.ui.graphics.vector.VectorKt;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.sequences.Sequence;
/*     */ import kotlin.sequences.SequenceScope;
/*     */ import kotlin.sequences.SequencesKt;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.compose.resources.vector.xmldom.Element;
/*     */ import org.jetbrains.compose.resources.vector.xmldom.Node;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000`\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\006\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\007\n\002\030\002\n\002\b\002\n\002\020\021\n\002\b\002\n\002\030\002\n\002\b\t\n\002\030\002\n\000\n\002\030\002\n\000\032\020\020\t\032\0020\n2\006\020\013\032\0020\001H\002\032\036\020\f\032\004\030\0010\006*\0020\0062\006\020\r\032\0020\0012\006\020\016\032\0020\001H\002\032\036\020\017\032\004\030\0010\001*\0020\0062\006\020\r\032\0020\0012\006\020\016\032\0020\001H\002\032\034\020\020\032\0020\021*\0020\0062\006\020\022\032\0020\0232\006\020\024\032\0020\025H\002\032\"\020\026\032\020\022\004\022\0020\030\022\004\022\0020\031\030\0010\027*\0020\0062\006\020\032\032\0020\030H\002\032#\020\033\032\024\022\020\022\016\022\004\022\0020\030\022\004\022\0020\0310\0270\034*\0020\006H\002¢\006\002\020\035\032\016\020\036\032\004\030\0010\037*\0020\006H\002\032\016\020 \032\004\030\0010\037*\0020\006H\002\032\034\020!\032\0020\021*\0020\0062\006\020\022\032\0020\0232\006\020\024\032\0020\025H\002\032\f\020\"\032\0020\037*\0020\006H\002\032\024\020#\032\0020\021*\0020\0062\006\020\022\032\0020\023H\002\032\f\020$\032\0020\037*\0020\006H\002\032\f\020%\032\0020\037*\0020\006H\002\032\034\020&\032\0020\021*\0020\0062\006\020\022\032\0020\0232\006\020\024\032\0020\025H\002\032\034\020'\032\0020\021*\0020\0062\006\020\022\032\0020\0232\006\020\024\032\0020\025H\002\032\024\020(\032\0020)*\0020\0062\006\020*\032\0020+H\000\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\036\020\003\032\b\022\004\022\0020\0050\004*\0020\0068BX\004¢\006\006\032\004\b\007\020\b¨\006,"}, d2 = {"AAPT_NS", "", "ANDROID_NS", "childrenSequence", "Lkotlin/sequences/Sequence;", "Lorg/jetbrains/compose/resources/vector/xmldom/Node;", "Lorg/jetbrains/compose/resources/vector/xmldom/Element;", "getChildrenSequence", "(Lorg/jetbrains/compose/resources/vector/xmldom/Element;)Lkotlin/sequences/Sequence;", "parseStringBrush", "Landroidx/compose/ui/graphics/SolidColor;", "str", "apptAttr", "namespace", "name", "attributeOrNull", "parseClipPath", "", "builder", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "context", "Lorg/jetbrains/compose/resources/vector/BuildContext;", "parseColorStop", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "defaultOffset", "parseColorStops", "", "(Lorg/jetbrains/compose/resources/vector/xmldom/Element;)[Lkotlin/Pair;", "parseElementBrush", "Landroidx/compose/ui/graphics/Brush;", "parseGradient", "parseGroup", "parseLinearGradient", "parsePath", "parseRadialGradient", "parseSweepGradient", "parseVectorNode", "parseVectorNodes", "toImageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "density", "Landroidx/compose/ui/unit/Density;", "library"})
/*     */ @SourceDebugExtension({"SMAP\nXmlVectorParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XmlVectorParser.kt\norg/jetbrains/compose/resources/vector/XmlVectorParserKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,275:1\n473#2:276\n1313#2,2:277\n473#2:280\n473#2:281\n473#2:290\n1#3:279\n1#3:285\n1579#4:282\n1864#4,2:283\n1866#4:286\n1580#4:287\n37#5,2:288\n*S KotlinDebug\n*F\n+ 1 XmlVectorParser.kt\norg/jetbrains/compose/resources/vector/XmlVectorParserKt\n*L\n86#1:276\n87#1:277,2\n158#1:280\n204#1:281\n263#1:290\n208#1:285\n208#1:282\n208#1:283,2\n208#1:286\n208#1:287\n228#1:288,2\n*E\n"})
/*     */ public final class XmlVectorParserKt
/*     */ {
/*     */   @NotNull
/*     */   private static final String ANDROID_NS = "http://schemas.android.com/apk/res/android";
/*     */   @NotNull
/*     */   private static final String AAPT_NS = "http://schemas.android.com/aapt";
/*     */   
/*     */   @NotNull
/*     */   public static final ImageVector toImageVector(@NotNull Element $this$toImageVector, @NotNull Density density) {
/*  73 */     Intrinsics.checkNotNullParameter($this$toImageVector, "<this>"); Intrinsics.checkNotNullParameter(density, "density"); BuildContext context = new BuildContext();
/*     */ 
/*     */ 
/*     */     
/*  77 */     attributeOrNull($this$toImageVector, "http://schemas.android.com/apk/res/android", "viewportWidth");
/*  78 */     attributeOrNull($this$toImageVector, "http://schemas.android.com/apk/res/android", "viewportHeight"); ImageVector.Builder builder = new ImageVector.Builder(null, ValueParsersKt.parseDp(attributeOrNull($this$toImageVector, "http://schemas.android.com/apk/res/android", "width"), density), ValueParsersKt.parseDp(attributeOrNull($this$toImageVector, "http://schemas.android.com/apk/res/android", "height"), density), (attributeOrNull($this$toImageVector, "http://schemas.android.com/apk/res/android", "viewportWidth") != null) ? Float.parseFloat(attributeOrNull($this$toImageVector, "http://schemas.android.com/apk/res/android", "viewportWidth")) : 0.0F, (attributeOrNull($this$toImageVector, "http://schemas.android.com/apk/res/android", "viewportHeight") != null) ? Float.parseFloat(attributeOrNull($this$toImageVector, "http://schemas.android.com/apk/res/android", "viewportHeight")) : 0.0F, 0L, 0, false, 225, null);
/*     */     
/*  80 */     parseVectorNodes($this$toImageVector, builder, context);
/*  81 */     return builder.build();
/*     */   }
/*     */   private static final void parseVectorNode(Element $this$parseVectorNode, ImageVector.Builder builder, BuildContext context) { String str = $this$parseVectorNode.getNodeName(); switch (str.hashCode()) { case 3433509: if (!str.equals("path")) break;  parsePath($this$parseVectorNode, builder); break;case -1649314686: if (!str.equals("clip-path")) break;  parseClipPath($this$parseVectorNode, builder, context); break;case 98629247: if (!str.equals("group")) break;  parseGroup($this$parseVectorNode, builder, context); break; }  }
/*     */   private static final void parsePath(Element $this$parsePath, ImageVector.Builder builder) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: aload_0
/*     */     //   2: ldc 'http://schemas.android.com/apk/res/android'
/*     */     //   4: ldc 'pathData'
/*     */     //   6: invokestatic attributeOrNull : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   9: invokestatic addPathNodes : (Ljava/lang/String;)Ljava/util/List;
/*     */     //   12: aload_0
/*     */     //   13: ldc 'http://schemas.android.com/apk/res/android'
/*     */     //   15: ldc 'fillType'
/*     */     //   17: invokestatic attributeOrNull : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   20: astore_2
/*     */     //   21: aload_2
/*     */     //   22: ifnull -> 50
/*     */     //   25: aload_2
/*     */     //   26: astore_3
/*     */     //   27: astore #7
/*     */     //   29: astore #6
/*     */     //   31: iconst_0
/*     */     //   32: istore #4
/*     */     //   34: aload_3
/*     */     //   35: invokestatic parseFillType : (Ljava/lang/String;)I
/*     */     //   38: istore #8
/*     */     //   40: aload #6
/*     */     //   42: aload #7
/*     */     //   44: iload #8
/*     */     //   46: nop
/*     */     //   47: goto -> 56
/*     */     //   50: getstatic androidx/compose/ui/graphics/PathFillType.Companion : Landroidx/compose/ui/graphics/PathFillType$Companion;
/*     */     //   53: invokevirtual getNonZero-Rg-k1Os : ()I
/*     */     //   56: aload_0
/*     */     //   57: ldc 'http://schemas.android.com/apk/res/android'
/*     */     //   59: ldc 'name'
/*     */     //   61: invokestatic attributeOrNull : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   64: dup
/*     */     //   65: ifnonnull -> 71
/*     */     //   68: pop
/*     */     //   69: ldc ''
/*     */     //   71: aload_0
/*     */     //   72: ldc 'http://schemas.android.com/apk/res/android'
/*     */     //   74: ldc 'fillColor'
/*     */     //   76: invokestatic attributeOrNull : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   79: dup
/*     */     //   80: ifnull -> 122
/*     */     //   83: astore_3
/*     */     //   84: astore #9
/*     */     //   86: istore #8
/*     */     //   88: astore #7
/*     */     //   90: astore #6
/*     */     //   92: iconst_0
/*     */     //   93: istore #4
/*     */     //   95: aload_3
/*     */     //   96: invokestatic parseStringBrush : (Ljava/lang/String;)Landroidx/compose/ui/graphics/SolidColor;
/*     */     //   99: astore #10
/*     */     //   101: aload #6
/*     */     //   103: aload #7
/*     */     //   105: iload #8
/*     */     //   107: aload #9
/*     */     //   109: aload #10
/*     */     //   111: nop
/*     */     //   112: dup
/*     */     //   113: ifnull -> 122
/*     */     //   116: checkcast androidx/compose/ui/graphics/Brush
/*     */     //   119: goto -> 170
/*     */     //   122: pop
/*     */     //   123: aload_0
/*     */     //   124: ldc 'http://schemas.android.com/apk/res/android'
/*     */     //   126: ldc 'fillColor'
/*     */     //   128: invokestatic apptAttr : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;Ljava/lang/String;Ljava/lang/String;)Lorg/jetbrains/compose/resources/vector/xmldom/Element;
/*     */     //   131: dup
/*     */     //   132: ifnull -> 168
/*     */     //   135: astore #4
/*     */     //   137: astore #9
/*     */     //   139: istore #8
/*     */     //   141: astore #7
/*     */     //   143: astore #6
/*     */     //   145: iconst_0
/*     */     //   146: istore #5
/*     */     //   148: aload #4
/*     */     //   150: invokestatic parseElementBrush : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;)Landroidx/compose/ui/graphics/Brush;
/*     */     //   153: astore #10
/*     */     //   155: aload #6
/*     */     //   157: aload #7
/*     */     //   159: iload #8
/*     */     //   161: aload #9
/*     */     //   163: aload #10
/*     */     //   165: goto -> 170
/*     */     //   168: pop
/*     */     //   169: aconst_null
/*     */     //   170: aload_0
/*     */     //   171: ldc 'http://schemas.android.com/apk/res/android'
/*     */     //   173: ldc 'fillAlpha'
/*     */     //   175: invokestatic attributeOrNull : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   178: dup
/*     */     //   179: ifnull -> 188
/*     */     //   182: invokestatic parseFloat : (Ljava/lang/String;)F
/*     */     //   185: goto -> 190
/*     */     //   188: pop
/*     */     //   189: fconst_1
/*     */     //   190: aload_0
/*     */     //   191: ldc 'http://schemas.android.com/apk/res/android'
/*     */     //   193: ldc 'strokeColor'
/*     */     //   195: invokestatic attributeOrNull : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   198: dup
/*     */     //   199: ifnull -> 249
/*     */     //   202: astore_3
/*     */     //   203: fstore #11
/*     */     //   205: astore #10
/*     */     //   207: astore #9
/*     */     //   209: istore #8
/*     */     //   211: astore #7
/*     */     //   213: astore #6
/*     */     //   215: iconst_0
/*     */     //   216: istore #4
/*     */     //   218: aload_3
/*     */     //   219: invokestatic parseStringBrush : (Ljava/lang/String;)Landroidx/compose/ui/graphics/SolidColor;
/*     */     //   222: astore #12
/*     */     //   224: aload #6
/*     */     //   226: aload #7
/*     */     //   228: iload #8
/*     */     //   230: aload #9
/*     */     //   232: aload #10
/*     */     //   234: fload #11
/*     */     //   236: aload #12
/*     */     //   238: nop
/*     */     //   239: dup
/*     */     //   240: ifnull -> 249
/*     */     //   243: checkcast androidx/compose/ui/graphics/Brush
/*     */     //   246: goto -> 305
/*     */     //   249: pop
/*     */     //   250: aload_0
/*     */     //   251: ldc 'http://schemas.android.com/apk/res/android'
/*     */     //   253: ldc 'strokeColor'
/*     */     //   255: invokestatic apptAttr : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;Ljava/lang/String;Ljava/lang/String;)Lorg/jetbrains/compose/resources/vector/xmldom/Element;
/*     */     //   258: dup
/*     */     //   259: ifnull -> 303
/*     */     //   262: astore #4
/*     */     //   264: fstore #11
/*     */     //   266: astore #10
/*     */     //   268: astore #9
/*     */     //   270: istore #8
/*     */     //   272: astore #7
/*     */     //   274: astore #6
/*     */     //   276: iconst_0
/*     */     //   277: istore #5
/*     */     //   279: aload #4
/*     */     //   281: invokestatic parseElementBrush : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;)Landroidx/compose/ui/graphics/Brush;
/*     */     //   284: astore #12
/*     */     //   286: aload #6
/*     */     //   288: aload #7
/*     */     //   290: iload #8
/*     */     //   292: aload #9
/*     */     //   294: aload #10
/*     */     //   296: fload #11
/*     */     //   298: aload #12
/*     */     //   300: goto -> 305
/*     */     //   303: pop
/*     */     //   304: aconst_null
/*     */     //   305: aload_0
/*     */     //   306: ldc 'http://schemas.android.com/apk/res/android'
/*     */     //   308: ldc 'strokeAlpha'
/*     */     //   310: invokestatic attributeOrNull : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   313: dup
/*     */     //   314: ifnull -> 323
/*     */     //   317: invokestatic parseFloat : (Ljava/lang/String;)F
/*     */     //   320: goto -> 325
/*     */     //   323: pop
/*     */     //   324: fconst_1
/*     */     //   325: aload_0
/*     */     //   326: ldc 'http://schemas.android.com/apk/res/android'
/*     */     //   328: ldc 'strokeWidth'
/*     */     //   330: invokestatic attributeOrNull : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   333: dup
/*     */     //   334: ifnull -> 343
/*     */     //   337: invokestatic parseFloat : (Ljava/lang/String;)F
/*     */     //   340: goto -> 345
/*     */     //   343: pop
/*     */     //   344: fconst_1
/*     */     //   345: aload_0
/*     */     //   346: ldc 'http://schemas.android.com/apk/res/android'
/*     */     //   348: ldc 'strokeLineCap'
/*     */     //   350: invokestatic attributeOrNull : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   353: astore_2
/*     */     //   354: aload_2
/*     */     //   355: ifnull -> 411
/*     */     //   358: aload_2
/*     */     //   359: astore_3
/*     */     //   360: fstore #14
/*     */     //   362: fstore #13
/*     */     //   364: astore #12
/*     */     //   366: fstore #11
/*     */     //   368: astore #10
/*     */     //   370: astore #9
/*     */     //   372: istore #8
/*     */     //   374: astore #7
/*     */     //   376: astore #6
/*     */     //   378: iconst_0
/*     */     //   379: istore #4
/*     */     //   381: aload_3
/*     */     //   382: invokestatic parseStrokeCap : (Ljava/lang/String;)I
/*     */     //   385: istore #15
/*     */     //   387: aload #6
/*     */     //   389: aload #7
/*     */     //   391: iload #8
/*     */     //   393: aload #9
/*     */     //   395: aload #10
/*     */     //   397: fload #11
/*     */     //   399: aload #12
/*     */     //   401: fload #13
/*     */     //   403: fload #14
/*     */     //   405: iload #15
/*     */     //   407: nop
/*     */     //   408: goto -> 417
/*     */     //   411: getstatic androidx/compose/ui/graphics/StrokeCap.Companion : Landroidx/compose/ui/graphics/StrokeCap$Companion;
/*     */     //   414: invokevirtual getButt-KaPHkGw : ()I
/*     */     //   417: aload_0
/*     */     //   418: ldc 'http://schemas.android.com/apk/res/android'
/*     */     //   420: ldc 'strokeLineJoin'
/*     */     //   422: invokestatic attributeOrNull : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   425: astore_2
/*     */     //   426: aload_2
/*     */     //   427: ifnull -> 487
/*     */     //   430: aload_2
/*     */     //   431: astore_3
/*     */     //   432: istore #15
/*     */     //   434: fstore #14
/*     */     //   436: fstore #13
/*     */     //   438: astore #12
/*     */     //   440: fstore #11
/*     */     //   442: astore #10
/*     */     //   444: astore #9
/*     */     //   446: istore #8
/*     */     //   448: astore #7
/*     */     //   450: astore #6
/*     */     //   452: iconst_0
/*     */     //   453: istore #4
/*     */     //   455: aload_3
/*     */     //   456: invokestatic parseStrokeJoin : (Ljava/lang/String;)I
/*     */     //   459: istore #16
/*     */     //   461: aload #6
/*     */     //   463: aload #7
/*     */     //   465: iload #8
/*     */     //   467: aload #9
/*     */     //   469: aload #10
/*     */     //   471: fload #11
/*     */     //   473: aload #12
/*     */     //   475: fload #13
/*     */     //   477: fload #14
/*     */     //   479: iload #15
/*     */     //   481: iload #16
/*     */     //   483: nop
/*     */     //   484: goto -> 493
/*     */     //   487: getstatic androidx/compose/ui/graphics/StrokeJoin.Companion : Landroidx/compose/ui/graphics/StrokeJoin$Companion;
/*     */     //   490: invokevirtual getMiter-LxFBmk8 : ()I
/*     */     //   493: aload_0
/*     */     //   494: ldc 'http://schemas.android.com/apk/res/android'
/*     */     //   496: ldc 'strokeMiterLimit'
/*     */     //   498: invokestatic attributeOrNull : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   501: dup
/*     */     //   502: ifnull -> 511
/*     */     //   505: invokestatic parseFloat : (Ljava/lang/String;)F
/*     */     //   508: goto -> 513
/*     */     //   511: pop
/*     */     //   512: fconst_1
/*     */     //   513: aload_0
/*     */     //   514: ldc 'http://schemas.android.com/apk/res/android'
/*     */     //   516: ldc 'trimPathStart'
/*     */     //   518: invokestatic attributeOrNull : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   521: dup
/*     */     //   522: ifnull -> 531
/*     */     //   525: invokestatic parseFloat : (Ljava/lang/String;)F
/*     */     //   528: goto -> 533
/*     */     //   531: pop
/*     */     //   532: fconst_0
/*     */     //   533: aload_0
/*     */     //   534: ldc 'http://schemas.android.com/apk/res/android'
/*     */     //   536: ldc 'trimPathEnd'
/*     */     //   538: invokestatic attributeOrNull : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   541: dup
/*     */     //   542: ifnull -> 551
/*     */     //   545: invokestatic parseFloat : (Ljava/lang/String;)F
/*     */     //   548: goto -> 553
/*     */     //   551: pop
/*     */     //   552: fconst_1
/*     */     //   553: aload_0
/*     */     //   554: ldc 'http://schemas.android.com/apk/res/android'
/*     */     //   556: ldc 'trimPathOffset'
/*     */     //   558: invokestatic attributeOrNull : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   561: dup
/*     */     //   562: ifnull -> 571
/*     */     //   565: invokestatic parseFloat : (Ljava/lang/String;)F
/*     */     //   568: goto -> 573
/*     */     //   571: pop
/*     */     //   572: fconst_0
/*     */     //   573: invokevirtual addPath-oIyEayM : (Ljava/util/List;ILjava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFF)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;
/*     */     //   576: pop
/*     */     //   577: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #101	-> 0
/*     */     //   #102	-> 1
/*     */     //   #103	-> 12
/*     */     //   #104	-> 21
/*     */     //   #103	-> 25
/*     */     //   #104	-> 26
/*     */     //   #279	-> 27
/*     */     //   #104	-> 34
/*     */     //   #104	-> 46
/*     */     //   #104	-> 47
/*     */     //   #103	-> 47
/*     */     //   #104	-> 50
/*     */     //   #105	-> 56
/*     */     //   #106	-> 71
/*     */     //   #279	-> 84
/*     */     //   #106	-> 95
/*     */     //   #106	-> 111
/*     */     //   #106	-> 112
/*     */     //   #107	-> 123
/*     */     //   #279	-> 137
/*     */     //   #107	-> 148
/*     */     //   #107	-> 165
/*     */     //   #107	-> 168
/*     */     //   #108	-> 170
/*     */     //   #108	-> 185
/*     */     //   #109	-> 190
/*     */     //   #279	-> 203
/*     */     //   #109	-> 218
/*     */     //   #109	-> 238
/*     */     //   #109	-> 239
/*     */     //   #110	-> 250
/*     */     //   #279	-> 264
/*     */     //   #110	-> 279
/*     */     //   #110	-> 300
/*     */     //   #110	-> 303
/*     */     //   #111	-> 305
/*     */     //   #111	-> 320
/*     */     //   #112	-> 325
/*     */     //   #112	-> 340
/*     */     //   #113	-> 345
/*     */     //   #114	-> 354
/*     */     //   #113	-> 358
/*     */     //   #114	-> 359
/*     */     //   #279	-> 360
/*     */     //   #114	-> 381
/*     */     //   #114	-> 407
/*     */     //   #114	-> 408
/*     */     //   #113	-> 408
/*     */     //   #114	-> 411
/*     */     //   #115	-> 417
/*     */     //   #116	-> 426
/*     */     //   #115	-> 430
/*     */     //   #116	-> 431
/*     */     //   #279	-> 432
/*     */     //   #116	-> 455
/*     */     //   #116	-> 483
/*     */     //   #116	-> 484
/*     */     //   #115	-> 484
/*     */     //   #116	-> 487
/*     */     //   #117	-> 493
/*     */     //   #117	-> 508
/*     */     //   #118	-> 513
/*     */     //   #118	-> 528
/*     */     //   #119	-> 533
/*     */     //   #119	-> 548
/*     */     //   #120	-> 553
/*     */     //   #120	-> 568
/*     */     //   #101	-> 573
/*     */     //   #122	-> 577
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   34	4	4	$i$a$-let-XmlVectorParserKt$parsePath$1	I
/*     */     //   31	7	3	p0	Ljava/lang/String;
/*     */     //   95	4	4	$i$a$-let-XmlVectorParserKt$parsePath$2	I
/*     */     //   92	7	3	p0	Ljava/lang/String;
/*     */     //   148	5	5	$i$a$-let-XmlVectorParserKt$parsePath$3	I
/*     */     //   145	8	4	p0	Lorg/jetbrains/compose/resources/vector/xmldom/Element;
/*     */     //   218	4	4	$i$a$-let-XmlVectorParserKt$parsePath$4	I
/*     */     //   215	7	3	p0	Ljava/lang/String;
/*     */     //   279	5	5	$i$a$-let-XmlVectorParserKt$parsePath$5	I
/*     */     //   276	8	4	p0	Lorg/jetbrains/compose/resources/vector/xmldom/Element;
/*     */     //   381	4	4	$i$a$-let-XmlVectorParserKt$parsePath$6	I
/*     */     //   378	7	3	p0	Ljava/lang/String;
/*     */     //   455	4	4	$i$a$-let-XmlVectorParserKt$parsePath$7	I
/*     */     //   452	7	3	p0	Ljava/lang/String;
/*     */     //   0	578	0	$this$parsePath	Lorg/jetbrains/compose/resources/vector/xmldom/Element;
/*     */     //   0	578	1	builder	Landroidx/compose/ui/graphics/vector/ImageVector$Builder; }
/*  85 */   private static final void parseClipPath(Element $this$parseClipPath, ImageVector.Builder builder, BuildContext context) { if (attributeOrNull($this$parseClipPath, "http://schemas.android.com/apk/res/android", "name") == null) attributeOrNull($this$parseClipPath, "http://schemas.android.com/apk/res/android", "name");  ImageVector.Builder.addGroup$default((ImageVector.Builder)attributeOrNull($this$parseClipPath, "http://schemas.android.com/apk/res/android", "name"), "", 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, VectorKt.addPathNodes(attributeOrNull($this$parseClipPath, "http://schemas.android.com/apk/res/android", "pathData")), 254, null); context.getCurrentGroups().add(BuildContext.Group.Virtual); } private static final void parseGroup(Element $this$parseGroup, ImageVector.Builder builder, BuildContext context) { BuildContext.Group removedGroup; if (attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "name") == null) attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "name");  attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "rotation"); attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "pivotX"); attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "pivotY"); attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "scaleX"); attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "scaleY"); attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "translateX"); attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "translateY"); attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "name").addGroup("", (attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "rotation") != null) ? Float.parseFloat(attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "rotation")) : 0.0F, (attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "pivotX") != null) ? Float.parseFloat(attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "pivotX")) : 0.0F, (attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "pivotY") != null) ? Float.parseFloat(attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "pivotY")) : 0.0F, (attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "scaleX") != null) ? Float.parseFloat(attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "scaleX")) : 1.0F, (attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "scaleY") != null) ? Float.parseFloat(attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "scaleY")) : 1.0F, (attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "translateX") != null) ? Float.parseFloat(attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "translateX")) : 0.0F, (attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "translateY") != null) ? Float.parseFloat(attributeOrNull($this$parseGroup, "http://schemas.android.com/apk/res/android", "translateY")) : 0.0F, VectorKt.getEmptyPath()); context.getCurrentGroups().add(BuildContext.Group.Real); parseVectorNodes($this$parseGroup, builder, context); do { removedGroup = (BuildContext.Group)CollectionsKt.removeLastOrNull(context.getCurrentGroups()); builder.clearGroup(); } while (removedGroup == BuildContext.Group.Virtual); } private static final void parseVectorNodes(Element $this$parseVectorNodes, ImageVector.Builder builder, BuildContext context) { Sequence<Node> sequence = getChildrenSequence($this$parseVectorNodes);
/*  86 */     int $i$f$filterIsInstance = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 276 */     Intrinsics.checkNotNull(SequencesKt.filter(sequence, XmlVectorParserKt$parseVectorNodes$$inlined$filterIsInstance$1.INSTANCE), "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>"); Sequence $this$filterIsInstance$iv = SequencesKt.filter(sequence, XmlVectorParserKt$parseVectorNodes$$inlined$filterIsInstance$1.INSTANCE); int $i$f$forEach = 0;
/* 277 */     Iterator iterator = $this$filterIsInstance$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Element it = (Element)element$iv; int $i$a$-forEach-XmlVectorParserKt$parseVectorNodes$1 = 0; parseVectorNode(it, builder, context); }  }
/*     */   private static final SolidColor parseStringBrush(String str) { return new SolidColor(ColorKt.Color(ValueParsersKt.parseColorValue(str)), null); }
/*     */   private static final Brush parseElementBrush(Element $this$parseElementBrush) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokestatic getChildrenSequence : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;)Lkotlin/sequences/Sequence;
/*     */     //   4: astore_2
/*     */     //   5: nop
/*     */     //   6: iconst_0
/*     */     //   7: istore_3
/*     */     //   8: aload_2
/*     */     //   9: getstatic org/jetbrains/compose/resources/vector/XmlVectorParserKt$parseElementBrush$$inlined$filterIsInstance$1.INSTANCE : Lorg/jetbrains/compose/resources/vector/XmlVectorParserKt$parseElementBrush$$inlined$filterIsInstance$1;
/*     */     //   12: checkcast kotlin/jvm/functions/Function1
/*     */     //   15: invokestatic filter : (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
/*     */     //   18: dup
/*     */     //   19: ldc 'null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>'
/*     */     //   21: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   24: astore_3
/*     */     //   25: aload_3
/*     */     //   26: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   31: astore #4
/*     */     //   33: aload #4
/*     */     //   35: invokeinterface hasNext : ()Z
/*     */     //   40: ifeq -> 83
/*     */     //   43: aload #4
/*     */     //   45: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   50: astore #5
/*     */     //   52: aload #5
/*     */     //   54: checkcast org/jetbrains/compose/resources/vector/xmldom/Element
/*     */     //   57: astore #6
/*     */     //   59: iconst_0
/*     */     //   60: istore #7
/*     */     //   62: aload #6
/*     */     //   64: invokeinterface getNodeName : ()Ljava/lang/String;
/*     */     //   69: ldc_w 'gradient'
/*     */     //   72: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   75: ifeq -> 33
/*     */     //   78: aload #5
/*     */     //   80: goto -> 84
/*     */     //   83: aconst_null
/*     */     //   84: checkcast org/jetbrains/compose/resources/vector/xmldom/Element
/*     */     //   87: astore_1
/*     */     //   88: aload_1
/*     */     //   89: ifnull -> 99
/*     */     //   92: aload_1
/*     */     //   93: invokestatic parseGradient : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;)Landroidx/compose/ui/graphics/Brush;
/*     */     //   96: goto -> 100
/*     */     //   99: aconst_null
/*     */     //   100: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #160	-> 0
/*     */     //   #157	-> 0
/*     */     //   #158	-> 5
/*     */     //   #280	-> 8
/*     */     //   #158	-> 24
/*     */     //   #159	-> 24
/*     */     //   #279	-> 59
/*     */     //   #159	-> 62
/*     */     //   #159	-> 75
/*     */     //   #159	-> 84
/*     */     //   #160	-> 88
/*     */     //   #159	-> 92
/*     */     //   #160	-> 93
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   8	16	3	$i$f$filterIsInstance	I
/*     */     //   6	18	2	$this$filterIsInstance$iv	Lkotlin/sequences/Sequence;
/*     */     //   62	13	7	$i$a$-find-XmlVectorParserKt$parseElementBrush$1	I
/*     */     //   59	16	6	it	Lorg/jetbrains/compose/resources/vector/xmldom/Element;
/* 279 */     //   0	101	0	$this$parseElementBrush	Lorg/jetbrains/compose/resources/vector/xmldom/Element; } private static final Brush parseGradient(Element $this$parseGradient) { String str = attributeOrNull($this$parseGradient, "http://schemas.android.com/apk/res/android", "type"); if (str != null) switch (str.hashCode()) { case 109850348: if (!str.equals("sweep")) break; case -938579425: if (!str.equals("radial")) break; case -1102672091: if (str.equals("linear")); break; }   return null; } private static final Brush parseLinearGradient(Element $this$parseLinearGradient) { Pair[] arrayOfPair1 = (Pair[])parseColorStops($this$parseLinearGradient); attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "startX"); attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "startY"); attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "endX"); attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "endY"); String str = attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "tileMode"); long l2 = OffsetKt.Offset((attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "endX") != null) ? Float.parseFloat(attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "endX")) : 0.0F, (attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "endY") != null) ? Float.parseFloat(attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "endY")) : 0.0F), l1 = OffsetKt.Offset((attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "startX") != null) ? Float.parseFloat(attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "startX")) : 0.0F, (attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "startY") != null) ? Float.parseFloat(attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "startY")) : 0.0F); Pair[] arrayOfPair2 = Arrays.copyOf(arrayOfPair1, arrayOfPair1.length); Brush.Companion companion = Brush.Companion; int $i$a$-let-XmlVectorParserKt$parseLinearGradient$1 = 0; int i = ValueParsersKt.parseTileMode(str); attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "tileMode"); return Brush.Companion.linearGradient-mHitzGk(Arrays.copyOf(arrayOfPair1, arrayOfPair1.length), OffsetKt.Offset((attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "startX") != null) ? Float.parseFloat(attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "startX")) : 0.0F, (attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "startY") != null) ? Float.parseFloat(attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "startY")) : 0.0F), OffsetKt.Offset((attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "endX") != null) ? Float.parseFloat(attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "endX")) : 0.0F, (attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "endY") != null) ? Float.parseFloat(attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "endY")) : 0.0F), (attributeOrNull($this$parseLinearGradient, "http://schemas.android.com/apk/res/android", "tileMode") != null) ? i : TileMode.Companion.getClamp-3opZhB0()); } private static final Brush parseRadialGradient(Element $this$parseRadialGradient) { Pair[] arrayOfPair1 = (Pair[])parseColorStops($this$parseRadialGradient); attributeOrNull($this$parseRadialGradient, "http://schemas.android.com/apk/res/android", "centerX"); attributeOrNull($this$parseRadialGradient, "http://schemas.android.com/apk/res/android", "centerY"); attributeOrNull($this$parseRadialGradient, "http://schemas.android.com/apk/res/android", "gradientRadius"); String str = attributeOrNull($this$parseRadialGradient, "http://schemas.android.com/apk/res/android", "tileMode"); float f = (attributeOrNull($this$parseRadialGradient, "http://schemas.android.com/apk/res/android", "gradientRadius") != null) ? Float.parseFloat(attributeOrNull($this$parseRadialGradient, "http://schemas.android.com/apk/res/android", "gradientRadius")) : 0.0F; long l = OffsetKt.Offset((attributeOrNull($this$parseRadialGradient, "http://schemas.android.com/apk/res/android", "centerX") != null) ? Float.parseFloat(attributeOrNull($this$parseRadialGradient, "http://schemas.android.com/apk/res/android", "centerX")) : 0.0F, (attributeOrNull($this$parseRadialGradient, "http://schemas.android.com/apk/res/android", "centerY") != null) ? Float.parseFloat(attributeOrNull($this$parseRadialGradient, "http://schemas.android.com/apk/res/android", "centerY")) : 0.0F); Pair[] arrayOfPair2 = Arrays.copyOf(arrayOfPair1, arrayOfPair1.length); Brush.Companion companion = Brush.Companion; int $i$a$-let-XmlVectorParserKt$parseRadialGradient$1 = 0; int i = ValueParsersKt.parseTileMode(str); attributeOrNull($this$parseRadialGradient, "http://schemas.android.com/apk/res/android", "tileMode"); return Brush.Companion.radialGradient-P_Vx-Ks(Arrays.copyOf(arrayOfPair1, arrayOfPair1.length), OffsetKt.Offset((attributeOrNull($this$parseRadialGradient, "http://schemas.android.com/apk/res/android", "centerX") != null) ? Float.parseFloat(attributeOrNull($this$parseRadialGradient, "http://schemas.android.com/apk/res/android", "centerX")) : 0.0F, (attributeOrNull($this$parseRadialGradient, "http://schemas.android.com/apk/res/android", "centerY") != null) ? Float.parseFloat(attributeOrNull($this$parseRadialGradient, "http://schemas.android.com/apk/res/android", "centerY")) : 0.0F), (attributeOrNull($this$parseRadialGradient, "http://schemas.android.com/apk/res/android", "gradientRadius") != null) ? Float.parseFloat(attributeOrNull($this$parseRadialGradient, "http://schemas.android.com/apk/res/android", "gradientRadius")) : 0.0F, (attributeOrNull($this$parseRadialGradient, "http://schemas.android.com/apk/res/android", "tileMode") != null) ? i : TileMode.Companion.getClamp-3opZhB0()); } private static final Brush parseSweepGradient(Element $this$parseSweepGradient) { Pair[] arrayOfPair = (Pair[])parseColorStops($this$parseSweepGradient); attributeOrNull($this$parseSweepGradient, "http://schemas.android.com/apk/res/android", "centerX"); attributeOrNull($this$parseSweepGradient, "http://schemas.android.com/apk/res/android", "centerY"); return Brush.Companion.sweepGradient-Uv8p0NA(Arrays.<Pair>copyOf(arrayOfPair, arrayOfPair.length), OffsetKt.Offset((attributeOrNull($this$parseSweepGradient, "http://schemas.android.com/apk/res/android", "centerX") != null) ? Float.parseFloat(attributeOrNull($this$parseSweepGradient, "http://schemas.android.com/apk/res/android", "centerX")) : 0.0F, (attributeOrNull($this$parseSweepGradient, "http://schemas.android.com/apk/res/android", "centerY") != null) ? Float.parseFloat(attributeOrNull($this$parseSweepGradient, "http://schemas.android.com/apk/res/android", "centerY")) : 0.0F)); }
/*     */   private static final Pair<Float, Color>[] parseColorStops(Element $this$parseColorStops) { Sequence<Node> sequence = getChildrenSequence($this$parseColorStops); int $i$f$filterIsInstance = 0;
/* 281 */     Intrinsics.checkNotNull(SequencesKt.filter(sequence, XmlVectorParserKt$parseColorStops$$inlined$filterIsInstance$1.INSTANCE), "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>"); List items = SequencesKt.toList(SequencesKt.filter(SequencesKt.filter(sequence, XmlVectorParserKt$parseColorStops$$inlined$filterIsInstance$1.INSTANCE), XmlVectorParserKt$parseColorStops$items$1.INSTANCE)); List list1 = items; ArrayList<Pair> arrayList = new ArrayList(); int $i$f$mapIndexedNotNullTo = 0;
/* 282 */     Iterable $this$forEachIndexed$iv$iv = list1; int $i$f$forEachIndexed = 0;
/* 283 */     int index$iv$iv = 0;
/* 284 */     Iterator iterator = $this$forEachIndexed$iv$iv.iterator(); if (iterator.hasNext()) { Object item$iv$iv = iterator.next(); int i = index$iv$iv++; if (i < 0) CollectionsKt.throwIndexOverflow();  Object object1 = item$iv$iv; int index$iv = i, $i$a$-forEachIndexed-CollectionsKt___CollectionsKt$mapIndexedNotNullTo$1$iv = 0; Element element = (Element)object1;
/*     */       int index = index$iv, $i$a$-mapIndexedNotNullTo-XmlVectorParserKt$parseColorStops$colorStops$1 = 0; }
/*     */     
/* 287 */     List<Pair> colorStops = arrayList; if (colorStops.isEmpty()) { String p0 = attributeOrNull($this$parseColorStops, "http://schemas.android.com/apk/res/android", "startColor"); int $i$a$-let-XmlVectorParserKt$parseColorStops$startColor$1 = 0; attributeOrNull($this$parseColorStops, "http://schemas.android.com/apk/res/android", "startColor"); Integer startColor = (attributeOrNull($this$parseColorStops, "http://schemas.android.com/apk/res/android", "startColor") != null) ? Integer.valueOf(ValueParsersKt.parseColorValue(p0)) : null; String str1 = attributeOrNull($this$parseColorStops, "http://schemas.android.com/apk/res/android", "centerColor"); int $i$a$-let-XmlVectorParserKt$parseColorStops$centerColor$1 = 0; attributeOrNull($this$parseColorStops, "http://schemas.android.com/apk/res/android", "centerColor"); Integer centerColor = (attributeOrNull($this$parseColorStops, "http://schemas.android.com/apk/res/android", "centerColor") != null) ? Integer.valueOf(ValueParsersKt.parseColorValue(str1)) : null; String str2 = attributeOrNull($this$parseColorStops, "http://schemas.android.com/apk/res/android", "endColor"); int $i$a$-let-XmlVectorParserKt$parseColorStops$endColor$1 = 0; attributeOrNull($this$parseColorStops, "http://schemas.android.com/apk/res/android", "endColor"); Integer endColor = (attributeOrNull($this$parseColorStops, "http://schemas.android.com/apk/res/android", "endColor") != null) ? Integer.valueOf(ValueParsersKt.parseColorValue(str2)) : null; if (startColor != null) colorStops.add(TuplesKt.to(Float.valueOf(0.0F), Color.box-impl(ColorKt.Color(startColor.intValue()))));  if (centerColor != null) colorStops.add(TuplesKt.to(Float.valueOf(0.5F), Color.box-impl(ColorKt.Color(centerColor.intValue()))));  if (endColor != null)
/* 288 */         colorStops.add(TuplesKt.to(Float.valueOf(1.0F), Color.box-impl(ColorKt.Color(endColor.intValue()))));  }  Collection<Pair> $this$toTypedArray$iv = colorStops; int $i$f$toTypedArray = 0; Collection<Pair> thisCollection$iv = $this$toTypedArray$iv;
/* 289 */     return thisCollection$iv.<Pair<Float, Color>>toArray((Pair<Float, Color>[])new Pair[0]); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\024\n\000\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\b\002\020\000\032\0020\0012\013\020\002\032\0070\003¢\006\002\b\004H\n¢\006\004\b\005\020\006"}, d2 = {"<anonymous>", "", "it", "Lorg/jetbrains/compose/resources/vector/xmldom/Element;", "Lkotlin/internal/NoInfer;", "invoke", "(Lorg/jetbrains/compose/resources/vector/xmldom/Element;)Ljava/lang/Boolean;"})
/*     */   static final class XmlVectorParserKt$parseColorStops$items$1 extends Lambda implements Function1<Element, Boolean> {
/*     */     public static final XmlVectorParserKt$parseColorStops$items$1 INSTANCE = new XmlVectorParserKt$parseColorStops$items$1();
/*     */     
/*     */     XmlVectorParserKt$parseColorStops$items$1() {
/*     */       super(1);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Boolean invoke(@NotNull Element it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       return Boolean.valueOf(Intrinsics.areEqual(it.getNodeName(), "item"));
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Pair<Float, Color> parseColorStop(Element $this$parseColorStop, float defaultOffset) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'http://schemas.android.com/apk/res/android'
/*     */     //   3: ldc_w 'offset'
/*     */     //   6: invokestatic attributeOrNull : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   9: dup
/*     */     //   10: ifnull -> 19
/*     */     //   13: invokestatic parseFloat : (Ljava/lang/String;)F
/*     */     //   16: goto -> 21
/*     */     //   19: pop
/*     */     //   20: fload_1
/*     */     //   21: fstore_2
/*     */     //   22: aload_0
/*     */     //   23: ldc 'http://schemas.android.com/apk/res/android'
/*     */     //   25: ldc_w 'color'
/*     */     //   28: invokestatic attributeOrNull : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   31: dup
/*     */     //   32: ifnull -> 49
/*     */     //   35: astore #4
/*     */     //   37: iconst_0
/*     */     //   38: istore #5
/*     */     //   40: aload #4
/*     */     //   42: invokestatic parseColorValue : (Ljava/lang/String;)I
/*     */     //   45: nop
/*     */     //   46: goto -> 52
/*     */     //   49: pop
/*     */     //   50: aconst_null
/*     */     //   51: areturn
/*     */     //   52: istore_3
/*     */     //   53: fload_2
/*     */     //   54: invokestatic valueOf : (F)Ljava/lang/Float;
/*     */     //   57: iload_3
/*     */     //   58: invokestatic Color : (I)J
/*     */     //   61: invokestatic box-impl : (J)Landroidx/compose/ui/graphics/Color;
/*     */     //   64: invokestatic to : (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
/*     */     //   67: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #232	-> 0
/*     */     //   #232	-> 16
/*     */     //   #233	-> 22
/*     */     //   #279	-> 37
/*     */     //   #233	-> 40
/*     */     //   #233	-> 45
/*     */     //   #233	-> 46
/*     */     //   #234	-> 53
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   40	5	5	$i$a$-let-XmlVectorParserKt$parseColorStop$color$1	I
/*     */     //   37	8	4	p0	Ljava/lang/String;
/*     */     //   22	46	2	offset	F
/*     */     //   53	15	3	color	I
/*     */     //   0	68	0	$this$parseColorStop	Lorg/jetbrains/compose/resources/vector/xmldom/Element;
/*     */     //   0	68	1	defaultOffset	F
/*     */   }
/*     */   
/*     */   private static final String attributeOrNull(Element $this$attributeOrNull, String namespace, String name) {
/*     */     String value = $this$attributeOrNull.getAttributeNS(namespace, name);
/*     */     return (!StringsKt.isBlank(value)) ? value : null;
/*     */   }
/*     */   
/*     */   private static final Element apptAttr(Element $this$apptAttr, String namespace, String name) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: aload_1
/*     */     //   2: invokeinterface lookupPrefix : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   7: astore_3
/*     */     //   8: aload_0
/*     */     //   9: invokestatic getChildrenSequence : (Lorg/jetbrains/compose/resources/vector/xmldom/Element;)Lkotlin/sequences/Sequence;
/*     */     //   12: astore #4
/*     */     //   14: nop
/*     */     //   15: iconst_0
/*     */     //   16: istore #5
/*     */     //   18: aload #4
/*     */     //   20: getstatic org/jetbrains/compose/resources/vector/XmlVectorParserKt$apptAttr$$inlined$filterIsInstance$1.INSTANCE : Lorg/jetbrains/compose/resources/vector/XmlVectorParserKt$apptAttr$$inlined$filterIsInstance$1;
/*     */     //   23: checkcast kotlin/jvm/functions/Function1
/*     */     //   26: invokestatic filter : (Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;
/*     */     //   29: dup
/*     */     //   30: ldc 'null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>'
/*     */     //   32: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   35: astore #5
/*     */     //   37: aload #5
/*     */     //   39: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   44: astore #6
/*     */     //   46: aload #6
/*     */     //   48: invokeinterface hasNext : ()Z
/*     */     //   53: ifeq -> 143
/*     */     //   56: aload #6
/*     */     //   58: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   63: astore #7
/*     */     //   65: aload #7
/*     */     //   67: checkcast org/jetbrains/compose/resources/vector/xmldom/Element
/*     */     //   70: astore #8
/*     */     //   72: iconst_0
/*     */     //   73: istore #9
/*     */     //   75: aload #8
/*     */     //   77: invokeinterface getNamespaceURI : ()Ljava/lang/String;
/*     */     //   82: ldc_w 'http://schemas.android.com/aapt'
/*     */     //   85: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   88: ifeq -> 133
/*     */     //   91: aload #8
/*     */     //   93: invokeinterface getLocalName : ()Ljava/lang/String;
/*     */     //   98: ldc_w 'attr'
/*     */     //   101: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   104: ifeq -> 133
/*     */     //   107: aload #8
/*     */     //   109: ldc 'name'
/*     */     //   111: invokeinterface getAttribute : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   116: aload_3
/*     */     //   117: aload_2
/*     */     //   118: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   123: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   126: ifeq -> 133
/*     */     //   129: iconst_1
/*     */     //   130: goto -> 134
/*     */     //   133: iconst_0
/*     */     //   134: nop
/*     */     //   135: ifeq -> 46
/*     */     //   138: aload #7
/*     */     //   140: goto -> 144
/*     */     //   143: aconst_null
/*     */     //   144: checkcast org/jetbrains/compose/resources/vector/xmldom/Element
/*     */     //   147: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #261	-> 0
/*     */     //   #262	-> 8
/*     */     //   #263	-> 14
/*     */     //   #290	-> 18
/*     */     //   #264	-> 35
/*     */     //   #265	-> 75
/*     */     //   #266	-> 107
/*     */     //   #265	-> 134
/*     */     //   #264	-> 135
/*     */     //   #262	-> 147
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   18	17	5	$i$f$filterIsInstance	I
/*     */     //   15	20	4	$this$filterIsInstance$iv	Lkotlin/sequences/Sequence;
/*     */     //   75	60	9	$i$a$-find-XmlVectorParserKt$apptAttr$1	I
/*     */     //   72	63	8	it	Lorg/jetbrains/compose/resources/vector/xmldom/Element;
/*     */     //   8	140	3	prefix	Ljava/lang/String;
/*     */     //   0	148	0	$this$apptAttr	Lorg/jetbrains/compose/resources/vector/xmldom/Element;
/*     */     //   0	148	1	namespace	Ljava/lang/String;
/*     */     //   0	148	2	name	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   private static final Sequence<Node> getChildrenSequence(Element $this$childrenSequence) {
/*     */     return SequencesKt.sequence(new XmlVectorParserKt$childrenSequence$1($this$childrenSequence, null));
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "XmlVectorParser.kt", l = {272}, i = {0, 0}, s = {"L$0", "I$0"}, n = {"$this$sequence", "i"}, m = "invokeSuspend", c = "org.jetbrains.compose.resources.vector.XmlVectorParserKt$childrenSequence$1")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\002\030\002\n\002\030\002\020\000\032\0020\001*\b\022\004\022\0020\0030\002H@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lorg/jetbrains/compose/resources/vector/xmldom/Node;"})
/*     */   static final class XmlVectorParserKt$childrenSequence$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Node>, Continuation<? super Unit>, Object> {
/*     */     int I$0;
/*     */     int I$1;
/*     */     int label;
/*     */     
/*     */     XmlVectorParserKt$childrenSequence$1(Element $receiver, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #5
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 156, 0 -> 32, 1 -> 121
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield L$0 : Ljava/lang/Object;
/*     */       //   40: checkcast kotlin/sequences/SequenceScope
/*     */       //   43: astore_2
/*     */       //   44: iconst_0
/*     */       //   45: istore_3
/*     */       //   46: aload_0
/*     */       //   47: getfield $this_childrenSequence : Lorg/jetbrains/compose/resources/vector/xmldom/Element;
/*     */       //   50: invokeinterface getChildNodes : ()Lorg/jetbrains/compose/resources/vector/xmldom/NodeList;
/*     */       //   55: invokeinterface getLength : ()I
/*     */       //   60: istore #4
/*     */       //   62: iload_3
/*     */       //   63: iload #4
/*     */       //   65: if_icmpge -> 152
/*     */       //   68: aload_2
/*     */       //   69: aload_0
/*     */       //   70: getfield $this_childrenSequence : Lorg/jetbrains/compose/resources/vector/xmldom/Element;
/*     */       //   73: invokeinterface getChildNodes : ()Lorg/jetbrains/compose/resources/vector/xmldom/NodeList;
/*     */       //   78: iload_3
/*     */       //   79: invokeinterface item : (I)Lorg/jetbrains/compose/resources/vector/xmldom/Node;
/*     */       //   84: aload_0
/*     */       //   85: checkcast kotlin/coroutines/Continuation
/*     */       //   88: aload_0
/*     */       //   89: aload_2
/*     */       //   90: putfield L$0 : Ljava/lang/Object;
/*     */       //   93: aload_0
/*     */       //   94: iload_3
/*     */       //   95: putfield I$0 : I
/*     */       //   98: aload_0
/*     */       //   99: iload #4
/*     */       //   101: putfield I$1 : I
/*     */       //   104: aload_0
/*     */       //   105: iconst_1
/*     */       //   106: putfield label : I
/*     */       //   109: invokevirtual yield : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   112: dup
/*     */       //   113: aload #5
/*     */       //   115: if_acmpne -> 145
/*     */       //   118: aload #5
/*     */       //   120: areturn
/*     */       //   121: aload_0
/*     */       //   122: getfield I$1 : I
/*     */       //   125: istore #4
/*     */       //   127: aload_0
/*     */       //   128: getfield I$0 : I
/*     */       //   131: istore_3
/*     */       //   132: aload_0
/*     */       //   133: getfield L$0 : Ljava/lang/Object;
/*     */       //   136: checkcast kotlin/sequences/SequenceScope
/*     */       //   139: astore_2
/*     */       //   140: aload_1
/*     */       //   141: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   144: aload_1
/*     */       //   145: pop
/*     */       //   146: iinc #3, 1
/*     */       //   149: goto -> 62
/*     */       //   152: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   155: areturn
/*     */       //   156: new java/lang/IllegalStateException
/*     */       //   159: dup
/*     */       //   160: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   162: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   165: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #270	-> 3
/*     */       //   #271	-> 44
/*     */       //   #272	-> 68
/*     */       //   #270	-> 118
/*     */       //   #271	-> 145
/*     */       //   #274	-> 152
/*     */       //   #270	-> 156
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   44	77	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   140	16	2	$this$sequence	Lkotlin/sequences/SequenceScope;
/*     */       //   46	75	3	i	I
/*     */       //   132	20	3	i	I
/*     */       //   36	120	0	this	Lorg/jetbrains/compose/resources/vector/XmlVectorParserKt$childrenSequence$1;
/*     */       //   36	120	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super XmlVectorParserKt$childrenSequence$1> $completion) {
/*     */       XmlVectorParserKt$childrenSequence$1 xmlVectorParserKt$childrenSequence$1 = new XmlVectorParserKt$childrenSequence$1(this.$this_childrenSequence, $completion);
/*     */       xmlVectorParserKt$childrenSequence$1.L$0 = value;
/*     */       return (Continuation<Unit>)xmlVectorParserKt$childrenSequence$1;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull SequenceScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((XmlVectorParserKt$childrenSequence$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\vector\XmlVectorParserKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */