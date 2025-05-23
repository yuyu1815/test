package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps;

import androidx.compose.runtime.MutableState;
import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.FileChangeView;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@DebugMetadata(f = "Report.kt", l = {116, 118}, i = {0, 1, 1, 1}, s = {"L$0", "L$0", "L$2", "L$4"}, n = {"$this$LaunchedEffect", "$this$LaunchedEffect", "destination$iv$iv", "element$iv$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ReportKt$FileReport$3$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
@SourceDebugExtension({"SMAP\nReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n774#2:186\n865#2,2:187\n*S KotlinDebug\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$3$1\n*L\n118#1:186\n118#1:187,2\n*E\n"})
final class ReportKt$FileReport$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  Object L$4;
  
  int label;
  
  ReportKt$FileReport$3$1(List<FileChangeView> $newFiles, MutableState<Set<FileChangeView>> $commitedFiles$delegate, Continuation $completion) {
    super(2, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #18
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 423, 0 -> 36, 1 -> 112, 2 -> 275
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield L$0 : Ljava/lang/Object;
    //   44: checkcast kotlinx/coroutines/CoroutineScope
    //   47: astore_2
    //   48: aload_2
    //   49: invokestatic isActive : (Lkotlinx/coroutines/CoroutineScope;)Z
    //   52: ifeq -> 419
    //   55: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
    //   58: pop
    //   59: iconst_5
    //   60: getstatic kotlin/time/DurationUnit.SECONDS : Lkotlin/time/DurationUnit;
    //   63: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
    //   66: aload_0
    //   67: checkcast kotlin/coroutines/Continuation
    //   70: aload_0
    //   71: aload_2
    //   72: putfield L$0 : Ljava/lang/Object;
    //   75: aload_0
    //   76: aconst_null
    //   77: putfield L$1 : Ljava/lang/Object;
    //   80: aload_0
    //   81: aconst_null
    //   82: putfield L$2 : Ljava/lang/Object;
    //   85: aload_0
    //   86: aconst_null
    //   87: putfield L$3 : Ljava/lang/Object;
    //   90: aload_0
    //   91: aconst_null
    //   92: putfield L$4 : Ljava/lang/Object;
    //   95: aload_0
    //   96: iconst_1
    //   97: putfield label : I
    //   100: invokestatic delay-VtjQ1oo : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   103: dup
    //   104: aload #18
    //   106: if_acmpne -> 125
    //   109: aload #18
    //   111: areturn
    //   112: aload_0
    //   113: getfield L$0 : Ljava/lang/Object;
    //   116: checkcast kotlinx/coroutines/CoroutineScope
    //   119: astore_2
    //   120: aload_1
    //   121: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   124: aload_1
    //   125: pop
    //   126: aload_2
    //   127: astore_3
    //   128: aload_0
    //   129: getfield $newFiles : Ljava/util/List;
    //   132: astore #4
    //   134: aload_0
    //   135: getfield $commitedFiles$delegate : Landroidx/compose/runtime/MutableState;
    //   138: astore #5
    //   140: nop
    //   141: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
    //   144: pop
    //   145: iconst_0
    //   146: istore #7
    //   148: aload #5
    //   150: aload #4
    //   152: checkcast java/lang/Iterable
    //   155: astore #8
    //   157: astore #9
    //   159: iconst_0
    //   160: istore #10
    //   162: aload #8
    //   164: astore #11
    //   166: new java/util/ArrayList
    //   169: dup
    //   170: invokespecial <init> : ()V
    //   173: checkcast java/util/Collection
    //   176: astore #12
    //   178: iconst_0
    //   179: istore #13
    //   181: aload #11
    //   183: invokeinterface iterator : ()Ljava/util/Iterator;
    //   188: astore #14
    //   190: aload #14
    //   192: invokeinterface hasNext : ()Z
    //   197: ifeq -> 370
    //   200: aload #14
    //   202: invokeinterface next : ()Ljava/lang/Object;
    //   207: astore #15
    //   209: aload #15
    //   211: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView
    //   214: astore #16
    //   216: iconst_0
    //   217: istore #17
    //   219: aload #16
    //   221: invokevirtual getFileManipulationActions : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;
    //   224: dup
    //   225: ifnull -> 352
    //   228: aload_0
    //   229: aload_0
    //   230: aload_2
    //   231: putfield L$0 : Ljava/lang/Object;
    //   234: aload_0
    //   235: aload #9
    //   237: putfield L$1 : Ljava/lang/Object;
    //   240: aload_0
    //   241: aload #12
    //   243: putfield L$2 : Ljava/lang/Object;
    //   246: aload_0
    //   247: aload #14
    //   249: putfield L$3 : Ljava/lang/Object;
    //   252: aload_0
    //   253: aload #15
    //   255: putfield L$4 : Ljava/lang/Object;
    //   258: aload_0
    //   259: iconst_2
    //   260: putfield label : I
    //   263: invokevirtual isOnVCS : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   266: dup
    //   267: aload #18
    //   269: if_acmpne -> 334
    //   272: aload #18
    //   274: areturn
    //   275: iconst_0
    //   276: istore #7
    //   278: iconst_0
    //   279: istore #10
    //   281: iconst_0
    //   282: istore #13
    //   284: iconst_0
    //   285: istore #17
    //   287: aload_0
    //   288: getfield L$4 : Ljava/lang/Object;
    //   291: astore #15
    //   293: aload_0
    //   294: getfield L$3 : Ljava/lang/Object;
    //   297: checkcast java/util/Iterator
    //   300: astore #14
    //   302: aload_0
    //   303: getfield L$2 : Ljava/lang/Object;
    //   306: checkcast java/util/Collection
    //   309: astore #12
    //   311: aload_0
    //   312: getfield L$1 : Ljava/lang/Object;
    //   315: checkcast androidx/compose/runtime/MutableState
    //   318: astore #9
    //   320: aload_0
    //   321: getfield L$0 : Ljava/lang/Object;
    //   324: checkcast kotlinx/coroutines/CoroutineScope
    //   327: astore_2
    //   328: nop
    //   329: aload_1
    //   330: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   333: aload_1
    //   334: checkcast java/lang/Boolean
    //   337: invokevirtual booleanValue : ()Z
    //   340: iconst_1
    //   341: if_icmpne -> 348
    //   344: iconst_1
    //   345: goto -> 354
    //   348: iconst_0
    //   349: goto -> 354
    //   352: pop
    //   353: iconst_0
    //   354: ifeq -> 190
    //   357: aload #12
    //   359: aload #15
    //   361: invokeinterface add : (Ljava/lang/Object;)Z
    //   366: pop
    //   367: goto -> 190
    //   370: aload #12
    //   372: checkcast java/util/List
    //   375: nop
    //   376: aload #9
    //   378: swap
    //   379: checkcast java/lang/Iterable
    //   382: invokestatic toSet : (Ljava/lang/Iterable;)Ljava/util/Set;
    //   385: invokestatic access$FileReport$lambda$4 : (Landroidx/compose/runtime/MutableState;Ljava/util/Set;)V
    //   388: nop
    //   389: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   392: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
    //   395: astore #6
    //   397: goto -> 48
    //   400: astore #7
    //   402: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
    //   405: pop
    //   406: aload #7
    //   408: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
    //   411: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
    //   414: astore #6
    //   416: goto -> 48
    //   419: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   422: areturn
    //   423: new java/lang/IllegalStateException
    //   426: dup
    //   427: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   429: invokespecial <init> : (Ljava/lang/String;)V
    //   432: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #114	-> 3
    //   #115	-> 48
    //   #116	-> 55
    //   #116	-> 70
    //   #114	-> 109
    //   #117	-> 125
    //   #118	-> 148
    //   #186	-> 162
    //   #187	-> 181
    //   #118	-> 219
    //   #114	-> 272
    //   #118	-> 334
    //   #187	-> 354
    //   #188	-> 370
    //   #186	-> 375
    //   #118	-> 382
    //   #119	-> 388
    //   #117	-> 392
    //   #121	-> 419
    //   #114	-> 423
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   48	64	2	$this$LaunchedEffect	Lkotlinx/coroutines/CoroutineScope;
    //   120	155	2	$this$LaunchedEffect	Lkotlinx/coroutines/CoroutineScope;
    //   328	61	2	$this$LaunchedEffect	Lkotlinx/coroutines/CoroutineScope;
    //   389	34	2	$this$LaunchedEffect	Lkotlinx/coroutines/CoroutineScope;
    //   159	19	8	$this$filter$iv	Ljava/lang/Iterable;
    //   178	12	11	$this$filterTo$iv$iv	Ljava/lang/Iterable;
    //   178	97	12	destination$iv$iv	Ljava/util/Collection;
    //   311	61	12	destination$iv$iv	Ljava/util/Collection;
    //   209	66	15	element$iv$iv	Ljava/lang/Object;
    //   293	74	15	element$iv$iv	Ljava/lang/Object;
    //   216	8	16	it	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
    //   219	56	17	$i$a$-filter-ReportKt$FileReport$3$1$1$1	I
    //   181	94	13	$i$f$filterTo	I
    //   162	113	10	$i$f$filter	I
    //   148	127	7	$i$a$-runCatching-ReportKt$FileReport$3$1$1	I
    //   0	433	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$3$1;
    //   40	383	1	$result	Ljava/lang/Object;
    //   287	67	17	$i$a$-filter-ReportKt$FileReport$3$1$1$1	I
    //   284	88	13	$i$f$filterTo	I
    //   281	95	10	$i$f$filter	I
    //   278	111	7	$i$a$-runCatching-ReportKt$FileReport$3$1$1	I
    // Exception table:
    //   from	to	target	type
    //   140	266	400	java/lang/Throwable
    //   328	397	400	java/lang/Throwable
  }
  
  public final Continuation<Unit> create(Object value, Continuation<? super ReportKt$FileReport$3$1> $completion) {
    ReportKt$FileReport$3$1 reportKt$FileReport$3$1 = new ReportKt$FileReport$3$1(this.$newFiles, this.$commitedFiles$delegate, $completion);
    reportKt$FileReport$3$1.L$0 = value;
    return (Continuation<Unit>)reportKt$FileReport$3$1;
  }
  
  public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
    return ((ReportKt$FileReport$3$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\ReportKt$FileReport$3$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */