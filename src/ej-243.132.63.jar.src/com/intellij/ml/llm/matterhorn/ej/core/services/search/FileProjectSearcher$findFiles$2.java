/*    */ package com.intellij.ml.llm.matterhorn.ej.core.services.search;
/*    */ 
/*    */ import com.intellij.ide.actions.searcheverywhere.FoundItemDescriptor;
/*    */ import com.intellij.ide.util.gotoByName.ChooseByNameItemProvider;
/*    */ import com.intellij.ide.util.gotoByName.ChooseByNameViewModel;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
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
/*    */ @DebugMetadata(f = "FileProjectSearcher.kt", l = {49}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.services.search.FileProjectSearcher$findFiles$2")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020!\n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher$FoundFileWithWeight;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class FileProjectSearcher$findFiles$2
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super List<FileProjectSearcher.FoundFileWithWeight>>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   3: astore_2
/*    */     //   4: aload_0
/*    */     //   5: getfield label : I
/*    */     //   8: tableswitch default -> 93, 0 -> 32, 1 -> 87
/*    */     //   32: aload_1
/*    */     //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   36: aload_0
/*    */     //   37: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;
/*    */     //   40: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   43: aload_0
/*    */     //   44: getfield $result : Ljava/util/List;
/*    */     //   47: aload_0
/*    */     //   48: getfield $itemProvider : Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;
/*    */     //   51: aload_0
/*    */     //   52: getfield $viewModel : Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;
/*    */     //   55: aload_0
/*    */     //   56: getfield $query : Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*    */     //   59: aload_0
/*    */     //   60: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;
/*    */     //   63: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;)Lkotlin/jvm/functions/Function0;
/*    */     //   68: aload_0
/*    */     //   69: checkcast kotlin/coroutines/Continuation
/*    */     //   72: aload_0
/*    */     //   73: iconst_1
/*    */     //   74: putfield label : I
/*    */     //   77: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   80: dup
/*    */     //   81: aload_2
/*    */     //   82: if_acmpne -> 92
/*    */     //   85: aload_2
/*    */     //   86: areturn
/*    */     //   87: aload_1
/*    */     //   88: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   91: aload_1
/*    */     //   92: areturn
/*    */     //   93: new java/lang/IllegalStateException
/*    */     //   96: dup
/*    */     //   97: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   99: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   102: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #48	-> 3
/*    */     //   #49	-> 36
/*    */     //   #48	-> 85
/*    */     //   #65	-> 92
/*    */     //   #48	-> 93
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	103	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher$findFiles$2;
/*    */     //   36	57	1	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   private static final List invokeSuspend$lambda$4(List $result, ChooseByNameItemProvider $itemProvider, ChooseByNameViewModel $viewModel, SearchQuery $query, FileProjectSearcher this$0) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: aload_2
/*    */     //   3: aload_3
/*    */     //   4: aload #4
/*    */     //   6: <illegal opcode> invoke : (Ljava/util/List;Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;)Lkotlin/jvm/functions/Function0;
/*    */     //   11: invokestatic blockingContextToIndicator : (Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;
/*    */     //   14: checkcast java/util/List
/*    */     //   17: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #50	-> 0
/*    */     //   #64	-> 17
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   0	18	0	$result	Ljava/util/List;
/*    */     //   0	18	1	$itemProvider	Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;
/*    */     //   0	18	2	$viewModel	Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;
/*    */     //   0	18	3	$query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*    */     //   0	18	4	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;
/*    */   }
/*    */   
/*    */   private static final List invokeSuspend$lambda$4$lambda$3(List $result, ChooseByNameItemProvider $itemProvider, ChooseByNameViewModel $viewModel, SearchQuery $query, FileProjectSearcher this$0) {
/*    */     // Byte code:
/*    */     //   0: invokestatic getGlobalProgressIndicator : ()Lcom/intellij/openapi/progress/ProgressIndicator;
/*    */     //   3: astore #5
/*    */     //   5: aload_0
/*    */     //   6: invokeinterface clear : ()V
/*    */     //   11: aload_1
/*    */     //   12: instanceof com/intellij/ide/util/gotoByName/ChooseByNameWeightedItemProvider
/*    */     //   15: ifeq -> 52
/*    */     //   18: aload_1
/*    */     //   19: checkcast com/intellij/ide/util/gotoByName/ChooseByNameWeightedItemProvider
/*    */     //   22: aload_2
/*    */     //   23: aload_3
/*    */     //   24: invokevirtual getQuery : ()Ljava/lang/String;
/*    */     //   27: iconst_0
/*    */     //   28: aload #5
/*    */     //   30: aload #4
/*    */     //   32: aload_0
/*    */     //   33: aload_3
/*    */     //   34: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;)Lkotlin/jvm/functions/Function1;
/*    */     //   39: <illegal opcode> process : (Lkotlin/jvm/functions/Function1;)Lcom/intellij/util/Processor;
/*    */     //   44: invokeinterface filterElementsWithWeights : (Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;Ljava/lang/String;ZLcom/intellij/openapi/progress/ProgressIndicator;Lcom/intellij/util/Processor;)Z
/*    */     //   49: goto -> 75
/*    */     //   52: aload_1
/*    */     //   53: aload_2
/*    */     //   54: aload_3
/*    */     //   55: invokevirtual getQuery : ()Ljava/lang/String;
/*    */     //   58: iconst_0
/*    */     //   59: aload #5
/*    */     //   61: aload #4
/*    */     //   63: aload_0
/*    */     //   64: aload_3
/*    */     //   65: <illegal opcode> process : (Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;)Lcom/intellij/util/Processor;
/*    */     //   70: invokeinterface filterElements : (Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;Ljava/lang/String;ZLcom/intellij/openapi/progress/ProgressIndicator;Lcom/intellij/util/Processor;)Z
/*    */     //   75: pop
/*    */     //   76: aload_0
/*    */     //   77: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #51	-> 0
/*    */     //   #52	-> 5
/*    */     //   #53	-> 11
/*    */     //   #54	-> 12
/*    */     //   #55	-> 18
/*    */     //   #59	-> 52
/*    */     //   #63	-> 76
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   5	73	5	progressIndicator	Lcom/intellij/openapi/progress/ProgressIndicator;
/*    */     //   0	78	0	$result	Ljava/util/List;
/*    */     //   0	78	1	$itemProvider	Lcom/intellij/ide/util/gotoByName/ChooseByNameItemProvider;
/*    */     //   0	78	2	$viewModel	Lcom/intellij/ide/util/gotoByName/ChooseByNameViewModel;
/*    */     //   0	78	3	$query	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/SearchQuery;
/*    */     //   0	78	4	this$0	Lcom/intellij/ml/llm/matterhorn/ej/core/services/search/FileProjectSearcher;
/*    */   }
/*    */   
/*    */   private static final boolean invokeSuspend$lambda$4$lambda$3$lambda$1(Function1 $tmp0, Object p0) {
/* 55 */     return ((Boolean)$tmp0.invoke(p0)).booleanValue(); } private static final boolean invokeSuspend$lambda$4$lambda$3$lambda$0(FileProjectSearcher this$0, List $result, SearchQuery $query, FoundItemDescriptor it) {
/* 56 */     return FileProjectSearcher.access$addFileItem(FileProjectSearcher.this, it.getItem(), $result, $query.getFilter(), $query.getQueryLimit(), it.getWeight());
/*    */   }
/*    */   
/*    */   private static final boolean invokeSuspend$lambda$4$lambda$3$lambda$2(FileProjectSearcher this$0, List $result, SearchQuery $query, Object it) {
/* 60 */     return FileProjectSearcher.access$addFileItem(FileProjectSearcher.this, it, $result, $query.getFilter(), $query.getQueryLimit(), 1);
/*    */   }
/*    */   
/*    */   FileProjectSearcher$findFiles$2(List<FileProjectSearcher.FoundFileWithWeight> $result, ChooseByNameItemProvider $itemProvider, ChooseByNameViewModel $viewModel, SearchQuery $query, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super FileProjectSearcher$findFiles$2> $completion) {
/*    */     return (Continuation<Unit>)new FileProjectSearcher$findFiles$2(this.$result, this.$itemProvider, this.$viewModel, this.$query, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((FileProjectSearcher$findFiles$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\services\search\FileProjectSearcher$findFiles$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */