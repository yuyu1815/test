/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ 
/*     */ import com.intellij.find.FindModel;
/*     */ import com.intellij.find.FindResult;
/*     */ import com.intellij.find.impl.livePreview.SearchResults;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\004\030\0002\0020\001B\007¢\006\004\b\002\020\003J\030\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH\024J\n\020\n\032\004\030\0010\013H\024¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession$TerminalSearchResults;", "Lcom/intellij/find/impl/livePreview/SearchResults;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession;)V", "getLocalSearchArea", "Lcom/intellij/find/impl/livePreview/SearchResults$SearchArea;", "editor", "Lcom/intellij/openapi/editor/Editor;", "findModel", "Lcom/intellij/find/FindModel;", "firstOccurrenceAtOrAfterCaret", "Lcom/intellij/find/FindResult;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nBlockTerminalSearchSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalSearchSession.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession$TerminalSearchResults\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,318:1\n1053#2:319\n360#2,7:320\n*S KotlinDebug\n*F\n+ 1 BlockTerminalSearchSession.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession$TerminalSearchResults\n*L\n265#1:319\n286#1:320,7\n*E\n"})
/*     */ final class TerminalSearchResults
/*     */   extends SearchResults
/*     */ {
/*     */   public TerminalSearchResults() {
/* 262 */     super((Editor)BlockTerminalSearchSession.access$getEditor$p(BlockTerminalSearchSession.this), BlockTerminalSearchSession.access$getProject$p(BlockTerminalSearchSession.this)); } @NotNull
/*     */   protected SearchResults.SearchArea getLocalSearchArea(@NotNull Editor editor, @NotNull FindModel findModel) {
/* 264 */     Intrinsics.checkNotNullParameter(editor, "editor"); Intrinsics.checkNotNullParameter(findModel, "findModel");
/* 265 */     Iterable<CommandBlock> $this$sortedBy$iv = BlockTerminalSearchSession.access$getSelectionModel$p(BlockTerminalSearchSession.this).getSelectedBlocks(); int $i$f$sortedBy = 0; List blocks = 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 319 */       CollectionsKt.sortedWith($this$sortedBy$iv, new BlockTerminalSearchSession$TerminalSearchResults$getLocalSearchArea$$inlined$sortedBy$1());
/*     */     int[] starts = new int[blocks.size()];
/*     */     int[] ends = new int[blocks.size()];
/*     */     for (int index = 0, i = blocks.size(); index < i; index++) {
/*     */       starts[index] = ((CommandBlock)blocks.get(index)).getStartOffset();
/*     */       ends[index] = ((CommandBlock)blocks.get(index)).getEndOffset();
/*     */     } 
/*     */     SearchResults.SearchArea searchArea = SearchResults.SearchArea.create(starts, ends);
/*     */     Intrinsics.checkNotNull(searchArea);
/*     */     int[] arrayOfInt1 = new int[1];
/*     */     arrayOfInt1[0] = 0;
/*     */     arrayOfInt1 = new int[1];
/*     */     arrayOfInt1[0] = Integer.MAX_VALUE;
/*     */     Intrinsics.checkNotNullExpressionValue(SearchResults.SearchArea.create(arrayOfInt1, arrayOfInt1), "create(...)");
/*     */     return BlockTerminalSearchSession.Companion.isSearchInBlock(findModel) ? searchArea : SearchResults.SearchArea.create(arrayOfInt1, arrayOfInt1);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected FindResult firstOccurrenceAtOrAfterCaret() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual getEditor : ()Lcom/intellij/openapi/editor/Editor;
/*     */     //   4: invokeinterface getScrollingModel : ()Lcom/intellij/openapi/editor/ScrollingModel;
/*     */     //   9: invokeinterface getVisibleArea : ()Ljava/awt/Rectangle;
/*     */     //   14: getfield y : I
/*     */     //   17: iconst_3
/*     */     //   18: aload_0
/*     */     //   19: invokevirtual getEditor : ()Lcom/intellij/openapi/editor/Editor;
/*     */     //   22: invokeinterface getLineHeight : ()I
/*     */     //   27: imul
/*     */     //   28: iadd
/*     */     //   29: istore_1
/*     */     //   30: aload_0
/*     */     //   31: invokevirtual getEditor : ()Lcom/intellij/openapi/editor/Editor;
/*     */     //   34: new java/awt/Point
/*     */     //   37: dup
/*     */     //   38: iconst_0
/*     */     //   39: iload_1
/*     */     //   40: invokespecial <init> : (II)V
/*     */     //   43: invokeinterface xyToLogicalPosition : (Ljava/awt/Point;)Lcom/intellij/openapi/editor/LogicalPosition;
/*     */     //   48: dup
/*     */     //   49: ldc 'xyToLogicalPosition(...)'
/*     */     //   51: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   54: astore_2
/*     */     //   55: aload_0
/*     */     //   56: invokevirtual getEditor : ()Lcom/intellij/openapi/editor/Editor;
/*     */     //   59: aload_2
/*     */     //   60: invokeinterface logicalPositionToOffset : (Lcom/intellij/openapi/editor/LogicalPosition;)I
/*     */     //   65: istore_3
/*     */     //   66: aload_0
/*     */     //   67: invokevirtual getOccurrences : ()Ljava/util/List;
/*     */     //   70: dup
/*     */     //   71: ldc 'getOccurrences(...)'
/*     */     //   73: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   76: astore #5
/*     */     //   78: iconst_0
/*     */     //   79: istore #6
/*     */     //   81: iconst_0
/*     */     //   82: istore #7
/*     */     //   84: aload #5
/*     */     //   86: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   91: astore #8
/*     */     //   93: aload #8
/*     */     //   95: invokeinterface hasNext : ()Z
/*     */     //   100: ifeq -> 150
/*     */     //   103: aload #8
/*     */     //   105: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   110: astore #9
/*     */     //   112: aload #9
/*     */     //   114: checkcast com/intellij/find/FindResult
/*     */     //   117: astore #10
/*     */     //   119: iconst_0
/*     */     //   120: istore #11
/*     */     //   122: aload #10
/*     */     //   124: invokevirtual getStartOffset : ()I
/*     */     //   127: iload_3
/*     */     //   128: if_icmplt -> 135
/*     */     //   131: iconst_1
/*     */     //   132: goto -> 136
/*     */     //   135: iconst_0
/*     */     //   136: ifeq -> 144
/*     */     //   139: iload #7
/*     */     //   141: goto -> 151
/*     */     //   144: iinc #7, 1
/*     */     //   147: goto -> 93
/*     */     //   150: iconst_m1
/*     */     //   151: istore #4
/*     */     //   153: iload #4
/*     */     //   155: ifle -> 175
/*     */     //   158: aload_0
/*     */     //   159: invokevirtual getOccurrences : ()Ljava/util/List;
/*     */     //   162: iload #4
/*     */     //   164: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   169: checkcast com/intellij/find/FindResult
/*     */     //   172: goto -> 191
/*     */     //   175: aload_0
/*     */     //   176: invokevirtual getOccurrences : ()Ljava/util/List;
/*     */     //   179: dup
/*     */     //   180: ldc 'getOccurrences(...)'
/*     */     //   182: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   185: invokestatic lastOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   188: checkcast com/intellij/find/FindResult
/*     */     //   191: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #283	-> 0
/*     */     //   #284	-> 30
/*     */     //   #285	-> 55
/*     */     //   #286	-> 66
/*     */     //   #320	-> 81
/*     */     //   #321	-> 84
/*     */     //   #322	-> 112
/*     */     //   #286	-> 122
/*     */     //   #322	-> 136
/*     */     //   #323	-> 139
/*     */     //   #324	-> 144
/*     */     //   #326	-> 150
/*     */     //   #286	-> 151
/*     */     //   #287	-> 153
/*     */     //   #288	-> 158
/*     */     //   #290	-> 175
/*     */     //   #287	-> 191
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   122	14	11	$i$a$-indexOfFirst-BlockTerminalSearchSession$TerminalSearchResults$firstOccurrenceAtOrAfterCaret$index$1	I
/*     */     //   119	17	10	it	Lcom/intellij/find/FindResult;
/*     */     //   112	35	9	item$iv	Ljava/lang/Object;
/*     */     //   81	70	6	$i$f$indexOfFirst	I
/*     */     //   84	67	7	index$iv	I
/*     */     //   78	73	5	$this$indexOfFirst$iv	Ljava/util/List;
/*     */     //   30	162	1	topY	I
/*     */     //   55	137	2	topLogicalPosition	Lcom/intellij/openapi/editor/LogicalPosition;
/*     */     //   66	126	3	topOffset	I
/*     */     //   153	39	4	index	I
/*     */     //   0	192	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession$TerminalSearchResults;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\BlockTerminalSearchSession$TerminalSearchResults.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */