/*     */ package org.jetbrains.jewel.ui.component;
/*     */ 
/*     */ import androidx.compose.ui.layout.MeasurePolicy;
/*     */ import androidx.compose.ui.layout.MeasureResult;
/*     */ import androidx.compose.ui.layout.MeasureScope;
/*     */ import androidx.compose.ui.layout.Placeable;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nTextArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextArea.kt\norg/jetbrains/jewel/ui/component/TextAreaKt$TextAreaDecorationBox$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n618#2,12:374\n1#3:386\n*S KotlinDebug\n*F\n+ 1 TextArea.kt\norg/jetbrains/jewel/ui/component/TextAreaKt$TextAreaDecorationBox$2$1\n*L\n337#1:374,12\n*E\n"})
/*     */ final class TextAreaKt$TextAreaDecorationBox$2$1
/*     */   implements MeasurePolicy
/*     */ {
/*     */   public static final TextAreaKt$TextAreaDecorationBox$2$1 INSTANCE = new TextAreaKt$TextAreaDecorationBox$2$1();
/*     */   
/*     */   public final MeasureResult measure-3p2s80s(MeasureScope $this$Layout, List measurables, long incomingConstraints) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '$this$Layout'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'measurables'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: lload_3
/*     */     //   13: iconst_0
/*     */     //   14: iconst_0
/*     */     //   15: iconst_0
/*     */     //   16: iconst_0
/*     */     //   17: bipush #11
/*     */     //   19: aconst_null
/*     */     //   20: invokestatic copy-Zbe2FdA$default : (JIIIIILjava/lang/Object;)J
/*     */     //   23: lstore #5
/*     */     //   25: aload_2
/*     */     //   26: checkcast java/lang/Iterable
/*     */     //   29: astore #8
/*     */     //   31: iconst_0
/*     */     //   32: istore #9
/*     */     //   34: aconst_null
/*     */     //   35: astore #10
/*     */     //   37: iconst_0
/*     */     //   38: istore #11
/*     */     //   40: aload #8
/*     */     //   42: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   47: astore #12
/*     */     //   49: aload #12
/*     */     //   51: invokeinterface hasNext : ()Z
/*     */     //   56: ifeq -> 116
/*     */     //   59: aload #12
/*     */     //   61: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   66: astore #13
/*     */     //   68: aload #13
/*     */     //   70: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   73: astore #14
/*     */     //   75: iconst_0
/*     */     //   76: istore #15
/*     */     //   78: aload #14
/*     */     //   80: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */     //   83: ldc 'TextField'
/*     */     //   85: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   88: ifeq -> 49
/*     */     //   91: iload #11
/*     */     //   93: ifeq -> 106
/*     */     //   96: new java/lang/IllegalArgumentException
/*     */     //   99: dup
/*     */     //   100: ldc 'Collection contains more than one matching element.'
/*     */     //   102: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   105: athrow
/*     */     //   106: aload #13
/*     */     //   108: astore #10
/*     */     //   110: iconst_1
/*     */     //   111: istore #11
/*     */     //   113: goto -> 49
/*     */     //   116: iload #11
/*     */     //   118: ifne -> 131
/*     */     //   121: new java/util/NoSuchElementException
/*     */     //   124: dup
/*     */     //   125: ldc 'Collection contains no element matching the predicate.'
/*     */     //   127: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   130: athrow
/*     */     //   131: aload #10
/*     */     //   133: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   136: lload #5
/*     */     //   138: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   143: astore #7
/*     */     //   145: lload #5
/*     */     //   147: iconst_0
/*     */     //   148: iconst_0
/*     */     //   149: iconst_0
/*     */     //   150: iconst_0
/*     */     //   151: bipush #10
/*     */     //   153: aconst_null
/*     */     //   154: invokestatic copy-Zbe2FdA$default : (JIIIIILjava/lang/Object;)J
/*     */     //   157: lstore #8
/*     */     //   159: aload_2
/*     */     //   160: checkcast java/lang/Iterable
/*     */     //   163: astore #13
/*     */     //   165: aload #13
/*     */     //   167: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   172: astore #14
/*     */     //   174: aload #14
/*     */     //   176: invokeinterface hasNext : ()Z
/*     */     //   181: ifeq -> 221
/*     */     //   184: aload #14
/*     */     //   186: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   191: astore #15
/*     */     //   193: aload #15
/*     */     //   195: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   198: astore #16
/*     */     //   200: iconst_0
/*     */     //   201: istore #17
/*     */     //   203: aload #16
/*     */     //   205: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */     //   208: ldc 'Placeholder'
/*     */     //   210: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   213: ifeq -> 174
/*     */     //   216: aload #15
/*     */     //   218: goto -> 222
/*     */     //   221: aconst_null
/*     */     //   222: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   225: dup
/*     */     //   226: ifnull -> 239
/*     */     //   229: lload #8
/*     */     //   231: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   236: goto -> 241
/*     */     //   239: pop
/*     */     //   240: aconst_null
/*     */     //   241: astore #10
/*     */     //   243: aload #7
/*     */     //   245: aload #10
/*     */     //   247: lload_3
/*     */     //   248: invokestatic access$calculateWidth-3p2s80s : (Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)I
/*     */     //   251: istore #11
/*     */     //   253: aload #7
/*     */     //   255: aload #10
/*     */     //   257: lload_3
/*     */     //   258: invokestatic access$calculateHeight-3p2s80s : (Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;J)I
/*     */     //   261: istore #12
/*     */     //   263: aload_1
/*     */     //   264: iload #11
/*     */     //   266: iload #12
/*     */     //   268: aconst_null
/*     */     //   269: aload #10
/*     */     //   271: aload #7
/*     */     //   273: <illegal opcode> invoke : (Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;)Lkotlin/jvm/functions/Function1;
/*     */     //   278: iconst_4
/*     */     //   279: aconst_null
/*     */     //   280: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*     */     //   283: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #335	-> 12
/*     */     //   #337	-> 25
/*     */     //   #374	-> 34
/*     */     //   #375	-> 37
/*     */     //   #376	-> 40
/*     */     //   #377	-> 68
/*     */     //   #337	-> 78
/*     */     //   #377	-> 88
/*     */     //   #378	-> 91
/*     */     //   #379	-> 106
/*     */     //   #380	-> 110
/*     */     //   #383	-> 116
/*     */     //   #385	-> 131
/*     */     //   #337	-> 136
/*     */     //   #340	-> 145
/*     */     //   #341	-> 159
/*     */     //   #386	-> 200
/*     */     //   #341	-> 203
/*     */     //   #341	-> 213
/*     */     //   #341	-> 222
/*     */     //   #343	-> 243
/*     */     //   #344	-> 253
/*     */     //   #346	-> 263
/*     */     //   #352	-> 283
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   78	10	15	$i$a$-single-TextAreaKt$TextAreaDecorationBox$2$1$textAreaPlaceable$1	I
/*     */     //   75	13	14	it	Landroidx/compose/ui/layout/Measurable;
/*     */     //   68	45	13	element$iv	Ljava/lang/Object;
/*     */     //   34	99	9	$i$f$single	I
/*     */     //   37	96	10	single$iv	Ljava/lang/Object;
/*     */     //   40	93	11	found$iv	Z
/*     */     //   31	102	8	$this$single$iv	Ljava/lang/Iterable;
/*     */     //   203	10	17	$i$a$-find-TextAreaKt$TextAreaDecorationBox$2$1$placeholderPlaceable$1	I
/*     */     //   200	13	16	it	Landroidx/compose/ui/layout/Measurable;
/*     */     //   25	259	5	textAreaConstraints	J
/*     */     //   145	139	7	textAreaPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   159	125	8	placeholderConstraints	J
/*     */     //   243	41	10	placeholderPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   253	31	11	width	I
/*     */     //   263	21	12	height	I
/*     */     //   0	284	0	this	Lorg/jetbrains/jewel/ui/component/TextAreaKt$TextAreaDecorationBox$2$1;
/*     */     //   0	284	1	$this$Layout	Landroidx/compose/ui/layout/MeasureScope;
/*     */     //   0	284	2	measurables	Ljava/util/List;
/*     */     //   0	284	3	incomingConstraints	J
/*     */   }
/*     */   
/*     */   private static final Unit measure_3p2s80s$lambda$2(Placeable $placeholderPlaceable, Placeable $textAreaPlaceable, Placeable.PlacementScope $this$layout) {
/* 348 */     Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); if ($placeholderPlaceable != null) { Placeable.PlacementScope.placeRelative$default($this$layout, $placeholderPlaceable, 0, 0, 0.0F, 4, null); }
/*     */     else
/*     */     {  }
/* 351 */      Placeable.PlacementScope.placeRelative$default($this$layout, $textAreaPlaceable, 0, 0, 0.0F, 4, null);
/* 352 */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\component\TextAreaKt$TextAreaDecorationBox$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */