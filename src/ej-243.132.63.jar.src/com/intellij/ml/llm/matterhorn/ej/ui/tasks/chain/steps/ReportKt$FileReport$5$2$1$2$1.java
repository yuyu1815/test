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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@DebugMetadata(f = "Report.kt", l = {174, 175}, i = {1, 1}, s = {"L$0", "L$2"}, n = {"destination$iv$iv", "element$iv$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.steps.ReportKt$FileReport$5$2$1$2$1")
@Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\002\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
@SourceDebugExtension({"SMAP\nReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$5$2$1$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n774#2:186\n865#2,2:187\n*S KotlinDebug\n*F\n+ 1 Report.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$5$2$1$2$1\n*L\n175#1:186\n175#1:187,2\n*E\n"})
final class ReportKt$FileReport$5$2$1$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
  Object L$0;
  
  Object L$1;
  
  Object L$2;
  
  Object L$3;
  
  int label;
  
  ReportKt$FileReport$5$2$1$2$1(FileChangeView $file, List<FileChangeView> $newFiles, MutableState<Set<FileChangeView>> $commitedFiles$delegate, Continuation $completion) {
    super(1, $completion);
  }
  
  public final Object invokeSuspend(Object $result) {
    // Byte code:
    //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
    //   3: astore #12
    //   5: aload_0
    //   6: getfield label : I
    //   9: tableswitch default -> 309, 0 -> 36, 1 -> 72, 2 -> 205
    //   36: aload_1
    //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   40: aload_0
    //   41: getfield $file : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
    //   44: invokevirtual getFileManipulationActions : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;
    //   47: dup
    //   48: ifnull -> 81
    //   51: aload_0
    //   52: checkcast kotlin/coroutines/Continuation
    //   55: aload_0
    //   56: iconst_1
    //   57: putfield label : I
    //   60: invokevirtual onSetVCS : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   63: dup
    //   64: aload #12
    //   66: if_acmpne -> 77
    //   69: aload #12
    //   71: areturn
    //   72: aload_1
    //   73: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   76: aload_1
    //   77: pop
    //   78: goto -> 82
    //   81: pop
    //   82: aload_0
    //   83: getfield $commitedFiles$delegate : Landroidx/compose/runtime/MutableState;
    //   86: aload_0
    //   87: getfield $newFiles : Ljava/util/List;
    //   90: checkcast java/lang/Iterable
    //   93: astore_2
    //   94: astore #11
    //   96: iconst_0
    //   97: istore_3
    //   98: aload_2
    //   99: astore #4
    //   101: new java/util/ArrayList
    //   104: dup
    //   105: invokespecial <init> : ()V
    //   108: checkcast java/util/Collection
    //   111: astore #5
    //   113: iconst_0
    //   114: istore #6
    //   116: aload #4
    //   118: invokeinterface iterator : ()Ljava/util/Iterator;
    //   123: astore #7
    //   125: aload #7
    //   127: invokeinterface hasNext : ()Z
    //   132: ifeq -> 287
    //   135: aload #7
    //   137: invokeinterface next : ()Ljava/lang/Object;
    //   142: astore #8
    //   144: aload #8
    //   146: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView
    //   149: astore #9
    //   151: iconst_0
    //   152: istore #10
    //   154: aload #9
    //   156: invokevirtual getFileManipulationActions : ()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;
    //   159: dup
    //   160: ifnull -> 269
    //   163: aload_0
    //   164: aload_0
    //   165: aload #5
    //   167: putfield L$0 : Ljava/lang/Object;
    //   170: aload_0
    //   171: aload #7
    //   173: putfield L$1 : Ljava/lang/Object;
    //   176: aload_0
    //   177: aload #8
    //   179: putfield L$2 : Ljava/lang/Object;
    //   182: aload_0
    //   183: aload #11
    //   185: putfield L$3 : Ljava/lang/Object;
    //   188: aload_0
    //   189: iconst_2
    //   190: putfield label : I
    //   193: invokevirtual isOnVCS : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    //   196: dup
    //   197: aload #12
    //   199: if_acmpne -> 251
    //   202: aload #12
    //   204: areturn
    //   205: iconst_0
    //   206: istore_3
    //   207: iconst_0
    //   208: istore #6
    //   210: iconst_0
    //   211: istore #10
    //   213: aload_0
    //   214: getfield L$3 : Ljava/lang/Object;
    //   217: checkcast androidx/compose/runtime/MutableState
    //   220: astore #11
    //   222: aload_0
    //   223: getfield L$2 : Ljava/lang/Object;
    //   226: astore #8
    //   228: aload_0
    //   229: getfield L$1 : Ljava/lang/Object;
    //   232: checkcast java/util/Iterator
    //   235: astore #7
    //   237: aload_0
    //   238: getfield L$0 : Ljava/lang/Object;
    //   241: checkcast java/util/Collection
    //   244: astore #5
    //   246: aload_1
    //   247: invokestatic throwOnFailure : (Ljava/lang/Object;)V
    //   250: aload_1
    //   251: checkcast java/lang/Boolean
    //   254: invokevirtual booleanValue : ()Z
    //   257: iconst_1
    //   258: if_icmpne -> 265
    //   261: iconst_1
    //   262: goto -> 271
    //   265: iconst_0
    //   266: goto -> 271
    //   269: pop
    //   270: iconst_0
    //   271: ifeq -> 125
    //   274: aload #5
    //   276: aload #8
    //   278: invokeinterface add : (Ljava/lang/Object;)Z
    //   283: pop
    //   284: goto -> 125
    //   287: aload #5
    //   289: checkcast java/util/List
    //   292: nop
    //   293: aload #11
    //   295: swap
    //   296: checkcast java/lang/Iterable
    //   299: invokestatic toSet : (Ljava/lang/Iterable;)Ljava/util/Set;
    //   302: invokestatic access$FileReport$lambda$4 : (Landroidx/compose/runtime/MutableState;Ljava/util/Set;)V
    //   305: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
    //   308: areturn
    //   309: new java/lang/IllegalStateException
    //   312: dup
    //   313: ldc 'call to 'resume' before 'invoke' with coroutine'
    //   315: invokespecial <init> : (Ljava/lang/String;)V
    //   318: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #173	-> 3
    //   #174	-> 40
    //   #173	-> 69
    //   #174	-> 77
    //   #175	-> 82
    //   #186	-> 98
    //   #187	-> 116
    //   #175	-> 154
    //   #173	-> 202
    //   #175	-> 251
    //   #187	-> 271
    //   #188	-> 287
    //   #186	-> 292
    //   #175	-> 299
    //   #176	-> 305
    //   #173	-> 309
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   96	17	2	$this$filter$iv	Ljava/lang/Iterable;
    //   113	12	4	$this$filterTo$iv$iv	Ljava/lang/Iterable;
    //   113	92	5	destination$iv$iv	Ljava/util/Collection;
    //   246	43	5	destination$iv$iv	Ljava/util/Collection;
    //   144	61	8	element$iv$iv	Ljava/lang/Object;
    //   228	56	8	element$iv$iv	Ljava/lang/Object;
    //   151	8	9	it	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;
    //   154	51	10	$i$a$-filter-ReportKt$FileReport$5$2$1$2$1$1	I
    //   116	89	6	$i$f$filterTo	I
    //   98	107	3	$i$f$filter	I
    //   0	319	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/steps/ReportKt$FileReport$5$2$1$2$1;
    //   40	269	1	$result	Ljava/lang/Object;
    //   213	58	10	$i$a$-filter-ReportKt$FileReport$5$2$1$2$1$1	I
    //   210	79	6	$i$f$filterTo	I
    //   207	86	3	$i$f$filter	I
  }
  
  public final Continuation<Unit> create(Continuation<? super ReportKt$FileReport$5$2$1$2$1> $completion) {
    return (Continuation<Unit>)new ReportKt$FileReport$5$2$1$2$1(this.$file, this.$newFiles, this.$commitedFiles$delegate, $completion);
  }
  
  public final Object invoke(Continuation<?> p1) {
    return ((ReportKt$FileReport$5$2$1$2$1)create(p1)).invokeSuspend(Unit.INSTANCE);
  }
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\steps\ReportKt$FileReport$5$2$1$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */