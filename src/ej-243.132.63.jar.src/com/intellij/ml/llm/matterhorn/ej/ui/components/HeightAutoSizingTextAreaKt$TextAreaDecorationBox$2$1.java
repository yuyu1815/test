/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.components;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ @SourceDebugExtension({"SMAP\nHeightAutoSizingTextArea.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightAutoSizingTextArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,306:1\n626#2,12:307\n1#3:319\n*S KotlinDebug\n*F\n+ 1 HeightAutoSizingTextArea.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1\n*L\n281#1:307,12\n*E\n"})
/*     */ final class HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1
/*     */   implements MeasurePolicy
/*     */ {
/*     */   public static final HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1 INSTANCE = new HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1();
/*     */   
/*     */   public final MeasureResult measure-3p2s80s(MeasureScope $this$Layout, List measurables, long incomingConstraints) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '$this$Layout'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'measurables'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: checkcast java/lang/Iterable
/*     */     //   16: astore #6
/*     */     //   18: iconst_0
/*     */     //   19: istore #7
/*     */     //   21: aconst_null
/*     */     //   22: astore #8
/*     */     //   24: iconst_0
/*     */     //   25: istore #9
/*     */     //   27: aload #6
/*     */     //   29: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   34: astore #10
/*     */     //   36: aload #10
/*     */     //   38: invokeinterface hasNext : ()Z
/*     */     //   43: ifeq -> 103
/*     */     //   46: aload #10
/*     */     //   48: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   53: astore #11
/*     */     //   55: aload #11
/*     */     //   57: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   60: astore #12
/*     */     //   62: iconst_0
/*     */     //   63: istore #13
/*     */     //   65: aload #12
/*     */     //   67: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */     //   70: ldc 'TextField'
/*     */     //   72: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   75: ifeq -> 36
/*     */     //   78: iload #9
/*     */     //   80: ifeq -> 93
/*     */     //   83: new java/lang/IllegalArgumentException
/*     */     //   86: dup
/*     */     //   87: ldc 'Collection contains more than one matching element.'
/*     */     //   89: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   92: athrow
/*     */     //   93: aload #11
/*     */     //   95: astore #8
/*     */     //   97: iconst_1
/*     */     //   98: istore #9
/*     */     //   100: goto -> 36
/*     */     //   103: iload #9
/*     */     //   105: ifne -> 118
/*     */     //   108: new java/util/NoSuchElementException
/*     */     //   111: dup
/*     */     //   112: ldc 'Collection contains no element matching the predicate.'
/*     */     //   114: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   117: athrow
/*     */     //   118: aload #8
/*     */     //   120: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   123: lload_3
/*     */     //   124: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   129: astore #5
/*     */     //   131: iconst_0
/*     */     //   132: aload #5
/*     */     //   134: invokevirtual getWidth : ()I
/*     */     //   137: aload #5
/*     */     //   139: invokevirtual getHeight : ()I
/*     */     //   142: aload #5
/*     */     //   144: invokevirtual getHeight : ()I
/*     */     //   147: invokestatic Constraints : (IIII)J
/*     */     //   150: lstore #6
/*     */     //   152: aload_2
/*     */     //   153: checkcast java/lang/Iterable
/*     */     //   156: astore #11
/*     */     //   158: aload #11
/*     */     //   160: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   165: astore #12
/*     */     //   167: aload #12
/*     */     //   169: invokeinterface hasNext : ()Z
/*     */     //   174: ifeq -> 214
/*     */     //   177: aload #12
/*     */     //   179: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   184: astore #13
/*     */     //   186: aload #13
/*     */     //   188: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   191: astore #14
/*     */     //   193: iconst_0
/*     */     //   194: istore #15
/*     */     //   196: aload #14
/*     */     //   198: invokestatic getLayoutId : (Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;
/*     */     //   201: ldc 'Placeholder'
/*     */     //   203: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   206: ifeq -> 167
/*     */     //   209: aload #13
/*     */     //   211: goto -> 215
/*     */     //   214: aconst_null
/*     */     //   215: checkcast androidx/compose/ui/layout/Measurable
/*     */     //   218: dup
/*     */     //   219: ifnull -> 232
/*     */     //   222: lload #6
/*     */     //   224: invokeinterface measure-BRTryo0 : (J)Landroidx/compose/ui/layout/Placeable;
/*     */     //   229: goto -> 234
/*     */     //   232: pop
/*     */     //   233: aconst_null
/*     */     //   234: astore #8
/*     */     //   236: aload_1
/*     */     //   237: aload #5
/*     */     //   239: invokevirtual getWidth : ()I
/*     */     //   242: aload #5
/*     */     //   244: invokevirtual getHeight : ()I
/*     */     //   247: aconst_null
/*     */     //   248: aload #8
/*     */     //   250: aload #5
/*     */     //   252: <illegal opcode> invoke : (Landroidx/compose/ui/layout/Placeable;Landroidx/compose/ui/layout/Placeable;)Lkotlin/jvm/functions/Function1;
/*     */     //   257: iconst_4
/*     */     //   258: aconst_null
/*     */     //   259: invokestatic layout$default : (Landroidx/compose/ui/layout/MeasureScope;IILjava/util/Map;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Landroidx/compose/ui/layout/MeasureResult;
/*     */     //   262: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #281	-> 12
/*     */     //   #307	-> 21
/*     */     //   #308	-> 24
/*     */     //   #309	-> 27
/*     */     //   #310	-> 55
/*     */     //   #281	-> 65
/*     */     //   #310	-> 75
/*     */     //   #311	-> 78
/*     */     //   #312	-> 93
/*     */     //   #313	-> 97
/*     */     //   #316	-> 103
/*     */     //   #318	-> 118
/*     */     //   #281	-> 123
/*     */     //   #280	-> 129
/*     */     //   #287	-> 131
/*     */     //   #288	-> 132
/*     */     //   #289	-> 137
/*     */     //   #290	-> 142
/*     */     //   #286	-> 147
/*     */     //   #285	-> 150
/*     */     //   #293	-> 152
/*     */     //   #319	-> 193
/*     */     //   #293	-> 196
/*     */     //   #293	-> 206
/*     */     //   #293	-> 215
/*     */     //   #292	-> 234
/*     */     //   #295	-> 236
/*     */     //   #301	-> 262
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   65	10	13	$i$a$-single-HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1$textAreaPlaceable$1	I
/*     */     //   62	13	12	it	Landroidx/compose/ui/layout/Measurable;
/*     */     //   55	45	11	element$iv	Ljava/lang/Object;
/*     */     //   21	99	7	$i$f$single	I
/*     */     //   24	96	8	single$iv	Ljava/lang/Object;
/*     */     //   27	93	9	found$iv	Z
/*     */     //   18	102	6	$this$single$iv	Ljava/lang/Iterable;
/*     */     //   196	10	15	$i$a$-find-HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1$placeholderPlaceable$1	I
/*     */     //   193	13	14	it	Landroidx/compose/ui/layout/Measurable;
/*     */     //   131	132	5	textAreaPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   152	111	6	placeholderConstraints	J
/*     */     //   236	27	8	placeholderPlaceable	Landroidx/compose/ui/layout/Placeable;
/*     */     //   0	263	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/components/HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1;
/*     */     //   0	263	1	$this$Layout	Landroidx/compose/ui/layout/MeasureScope;
/*     */     //   0	263	2	measurables	Ljava/util/List;
/*     */     //   0	263	3	incomingConstraints	J
/*     */   }
/*     */   
/*     */   private static final Unit measure_3p2s80s$lambda$2(Placeable $placeholderPlaceable, Placeable $textAreaPlaceable, Placeable.PlacementScope $this$layout) {
/* 297 */     Intrinsics.checkNotNullParameter($this$layout, "$this$layout"); if ($placeholderPlaceable != null) { Placeable.PlacementScope.placeRelative$default($this$layout, $placeholderPlaceable, 0, 0, 0.0F, 4, null); }
/*     */     else
/*     */     {  }
/* 300 */      Placeable.PlacementScope.placeRelative$default($this$layout, $textAreaPlaceable, 0, 0, 0.0F, 4, null);
/* 301 */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\components\HeightAutoSizingTextAreaKt$TextAreaDecorationBox$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */