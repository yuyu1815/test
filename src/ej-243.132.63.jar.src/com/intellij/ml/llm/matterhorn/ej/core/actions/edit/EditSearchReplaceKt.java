/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*     */ 
/*     */ import com.intellij.diff.comparison.ComparisonManager;
/*     */ import com.intellij.diff.comparison.ComparisonPolicy;
/*     */ import com.intellij.diff.fragments.LineFragment;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.LevenshteinDistance;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.ExtractorUtilsKt;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.progress.EmptyProgressIndicator;
/*     */ import com.intellij.openapi.progress.ProgressIndicator;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.SetsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.sequences.SequencesKt;
/*     */ import kotlin.text.MatchResult;
/*     */ import kotlin.text.Regex;
/*     */ import kotlin.text.RegexOption;
/*     */ import kotlin.text.StringsKt;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000Z\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\020!\n\002\b\003\n\002\020 \n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\007\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\032&\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0052\006\020\007\032\0020\005\032\036\020\b\032\0020\0012\006\020\004\032\0020\0052\006\020\006\032\0020\0052\006\020\007\032\0020\005\032\026\020\t\032\b\022\004\022\0020\0050\n2\006\020\013\032\0020\005H\002\0322\020\f\032\0020\0012\f\020\r\032\b\022\004\022\0020\0050\0162\f\020\017\032\b\022\004\022\0020\0050\0162\f\020\020\032\b\022\004\022\0020\0050\016H\002\032\036\020\021\032\0020\0222\f\020\r\032\b\022\004\022\0020\0050\0162\006\020\023\032\0020\024H\002\032\020\020\025\032\0020\0262\006\020\013\032\0020\005H\002\0325\020\027\032\004\030\0010\0262\f\020\r\032\b\022\004\022\0020\0050\0162\f\020\030\032\b\022\004\022\0020\0050\0162\b\b\002\020\031\032\0020\026H\002¢\006\002\020\032\032\022\020\033\032\004\030\0010\0052\b\020\034\032\004\030\0010\005\032 \020\035\032\b\022\004\022\0020\0360\n2\006\020\034\032\0020\0052\n\b\002\020\037\032\004\030\0010\005\032\026\020 \032\0020!2\006\020\"\032\0020\0052\006\020#\032\0020\005\032 \020$\032\0020\0262\006\020%\032\0020&2\006\020'\032\0020\0262\006\020(\032\0020\026H\000\032\016\020)\032\0020*2\006\020+\032\0020\005¨\006,"}, d2 = {"tryMatch", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult;", "editType", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;", "fullText", "", "originalText", "replacementText", "doSearchReplace", "prepLines", "", "text", "multyCheckMatchReplace", "wholeLines", "", "searchLines", "replaceLines", "applySearchReplace", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult$Success;", "match", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchedResult;", "findMinimumIndent", "", "findMostSimilarStartIdx", "partLines", "similarityThreshold", "(Ljava/util/List;Ljava/util/List;I)Ljava/lang/Integer;", "removeStartingEmptyLine", "content", "findOriginalUpdateBlocksXML", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/Edit;", "overwriteFilenameBy", "computeDifferences", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/ComputeDifferencesOutput;", "originalContent", "updatedContent", "constraintLine", "document", "Lcom/intellij/openapi/editor/Document;", "startLine", "minWindow", "checkWrongQuotes", "", "arguments", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nEditSearchReplace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditSearchReplace.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplaceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,799:1\n1#2:800\n739#3,9:801\n1557#3:810\n1628#3,3:811\n1557#3:814\n1628#3,3:815\n1557#3:818\n1628#3,3:819\n1872#3,3:866\n1557#3:869\n1628#3,3:870\n1557#3:873\n1628#3,3:874\n774#3:877\n865#3,2:878\n37#4,2:822\n37#4,2:824\n37#4,2:826\n37#4,2:828\n158#5,6:830\n158#5,6:836\n158#5,6:842\n158#5,6:848\n158#5,6:854\n158#5,6:860\n648#5,5:880\n*S KotlinDebug\n*F\n+ 1 EditSearchReplace.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplaceKt\n*L\n567#1:801,9\n567#1:810\n567#1:811,3\n580#1:814\n580#1:815,3\n581#1:818\n581#1:819,3\n641#1:866,3\n666#1:869\n666#1:870,3\n670#1:873\n670#1:874,3\n689#1:877\n689#1:878,2\n583#1:822,2\n584#1:824,2\n592#1:826,2\n594#1:828,2\n597#1:830,6\n598#1:836,6\n602#1:842,6\n603#1:848,6\n606#1:854,6\n607#1:860,6\n689#1:880,5\n*E\n"})
/*     */ public final class EditSearchReplaceKt
/*     */ {
/*     */   @NotNull
/*     */   public static final MatchingResult tryMatch(@NotNull EditType editType, @NotNull String fullText, @NotNull String originalText, @NotNull String replacementText) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc 'editType'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'fullText'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_2
/*     */     //   13: ldc 'originalText'
/*     */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   18: aload_3
/*     */     //   19: ldc 'replacementText'
/*     */     //   21: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   24: aload_0
/*     */     //   25: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplaceKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   28: swap
/*     */     //   29: invokevirtual ordinal : ()I
/*     */     //   32: iaload
/*     */     //   33: tableswitch default -> 129, 1 -> 56, 2 -> 65
/*     */     //   56: aload_1
/*     */     //   57: aload_2
/*     */     //   58: aload_3
/*     */     //   59: invokestatic doSearchReplace : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult;
/*     */     //   62: goto -> 137
/*     */     //   65: aload_2
/*     */     //   66: checkcast java/lang/CharSequence
/*     */     //   69: invokeinterface length : ()I
/*     */     //   74: ifne -> 81
/*     */     //   77: iconst_1
/*     */     //   78: goto -> 82
/*     */     //   81: iconst_0
/*     */     //   82: istore #5
/*     */     //   84: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   87: ifeq -> 118
/*     */     //   90: iload #5
/*     */     //   92: ifne -> 118
/*     */     //   95: iconst_0
/*     */     //   96: istore #6
/*     */     //   98: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType.CREATE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;
/*     */     //   101: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;)Ljava/lang/String;
/*     */     //   106: astore #6
/*     */     //   108: new java/lang/AssertionError
/*     */     //   111: dup
/*     */     //   112: aload #6
/*     */     //   114: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   117: athrow
/*     */     //   118: ldc ''
/*     */     //   120: ldc ''
/*     */     //   122: aload_3
/*     */     //   123: invokestatic doSearchReplace : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult;
/*     */     //   126: goto -> 137
/*     */     //   129: new kotlin/NoWhenBranchMatchedException
/*     */     //   132: dup
/*     */     //   133: invokespecial <init> : ()V
/*     */     //   136: athrow
/*     */     //   137: astore #4
/*     */     //   139: aload #4
/*     */     //   141: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult$Success
/*     */     //   144: ifne -> 150
/*     */     //   147: aload #4
/*     */     //   149: areturn
/*     */     //   150: aload #4
/*     */     //   152: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #522	-> 24
/*     */     //   #524	-> 56
/*     */     //   #525	-> 57
/*     */     //   #526	-> 58
/*     */     //   #523	-> 59
/*     */     //   #530	-> 65
/*     */     //   #530	-> 84
/*     */     //   #800	-> 95
/*     */     //   #530	-> 98
/*     */     //   #530	-> 106
/*     */     //   #531	-> 118
/*     */     //   #522	-> 129
/*     */     //   #534	-> 139
/*     */     //   #535	-> 141
/*     */     //   #536	-> 147
/*     */     //   #538	-> 150
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   98	8	6	$i$a$-assert-EditSearchReplaceKt$tryMatch$searchReplaceResult$1	I
/*     */     //   139	14	4	searchReplaceResult	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult;
/*     */     //   0	153	0	editType	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;
/*     */     //   0	153	1	fullText	Ljava/lang/String;
/*     */     //   0	153	2	originalText	Ljava/lang/String;
/*     */     //   0	153	3	replacementText	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final MatchingResult doSearchReplace(@NotNull String fullText, @NotNull String originalText, @NotNull String replacementText) {
/* 552 */     Intrinsics.checkNotNullParameter(fullText, "fullText"); Intrinsics.checkNotNullParameter(originalText, "originalText"); Intrinsics.checkNotNullParameter(replacementText, "replacementText"); if (((((CharSequence)fullText).length() == 0)) && ((((CharSequence)originalText).length() == 0))) {
/* 553 */       return new MatchingResult.Success(replacementText, 0);
/*     */     }
/* 555 */     if ((((CharSequence)StringsKt.trim(originalText).toString()).length() == 0)) {
/* 556 */       return new MatchingResult.Success(fullText + "\n" + fullText, StringsKt.lines(fullText).size());
/*     */     }
/* 558 */     return multyCheckMatchReplace(
/* 559 */         prepLines(fullText), 
/* 560 */         prepLines(originalText), 
/* 561 */         prepLines(replacementText));
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
/*     */   private static final List<String> prepLines(String text) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: checkcast java/lang/CharSequence
/*     */     //   4: iconst_1
/*     */     //   5: anewarray java/lang/String
/*     */     //   8: astore_2
/*     */     //   9: aload_2
/*     */     //   10: iconst_0
/*     */     //   11: ldc '\\n'
/*     */     //   13: aastore
/*     */     //   14: aload_2
/*     */     //   15: iconst_0
/*     */     //   16: iconst_0
/*     */     //   17: bipush #6
/*     */     //   19: aconst_null
/*     */     //   20: invokestatic split$default : (Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;
/*     */     //   23: astore_2
/*     */     //   24: iconst_0
/*     */     //   25: istore_3
/*     */     //   26: aload_2
/*     */     //   27: invokeinterface isEmpty : ()Z
/*     */     //   32: ifne -> 125
/*     */     //   35: aload_2
/*     */     //   36: aload_2
/*     */     //   37: invokeinterface size : ()I
/*     */     //   42: invokeinterface listIterator : (I)Ljava/util/ListIterator;
/*     */     //   47: astore #4
/*     */     //   49: aload #4
/*     */     //   51: invokeinterface hasPrevious : ()Z
/*     */     //   56: ifeq -> 125
/*     */     //   59: aload #4
/*     */     //   61: invokeinterface previous : ()Ljava/lang/Object;
/*     */     //   66: checkcast java/lang/String
/*     */     //   69: astore #5
/*     */     //   71: iconst_0
/*     */     //   72: istore #6
/*     */     //   74: nop
/*     */     //   75: aload #5
/*     */     //   77: checkcast java/lang/CharSequence
/*     */     //   80: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   83: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   86: checkcast java/lang/CharSequence
/*     */     //   89: invokeinterface length : ()I
/*     */     //   94: ifne -> 101
/*     */     //   97: iconst_1
/*     */     //   98: goto -> 102
/*     */     //   101: iconst_0
/*     */     //   102: nop
/*     */     //   103: ifne -> 49
/*     */     //   106: aload_2
/*     */     //   107: checkcast java/lang/Iterable
/*     */     //   110: aload #4
/*     */     //   112: invokeinterface nextIndex : ()I
/*     */     //   117: iconst_1
/*     */     //   118: iadd
/*     */     //   119: invokestatic take : (Ljava/lang/Iterable;I)Ljava/util/List;
/*     */     //   122: goto -> 128
/*     */     //   125: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   128: checkcast java/lang/Iterable
/*     */     //   131: astore_2
/*     */     //   132: nop
/*     */     //   133: iconst_0
/*     */     //   134: istore_3
/*     */     //   135: aload_2
/*     */     //   136: astore #4
/*     */     //   138: new java/util/ArrayList
/*     */     //   141: dup
/*     */     //   142: aload_2
/*     */     //   143: bipush #10
/*     */     //   145: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   148: invokespecial <init> : (I)V
/*     */     //   151: checkcast java/util/Collection
/*     */     //   154: astore #5
/*     */     //   156: iconst_0
/*     */     //   157: istore #6
/*     */     //   159: aload #4
/*     */     //   161: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   166: astore #7
/*     */     //   168: aload #7
/*     */     //   170: invokeinterface hasNext : ()Z
/*     */     //   175: ifeq -> 255
/*     */     //   178: aload #7
/*     */     //   180: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   185: astore #8
/*     */     //   187: aload #5
/*     */     //   189: aload #8
/*     */     //   191: checkcast java/lang/String
/*     */     //   194: astore #9
/*     */     //   196: astore #11
/*     */     //   198: iconst_0
/*     */     //   199: istore #10
/*     */     //   201: aload #9
/*     */     //   203: checkcast java/lang/CharSequence
/*     */     //   206: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   209: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   212: checkcast java/lang/CharSequence
/*     */     //   215: invokeinterface length : ()I
/*     */     //   220: ifle -> 227
/*     */     //   223: iconst_1
/*     */     //   224: goto -> 228
/*     */     //   227: iconst_0
/*     */     //   228: ifeq -> 241
/*     */     //   231: aload #9
/*     */     //   233: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   238: goto -> 243
/*     */     //   241: ldc '\\n'
/*     */     //   243: aload #11
/*     */     //   245: swap
/*     */     //   246: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   251: pop
/*     */     //   252: goto -> 168
/*     */     //   255: aload #5
/*     */     //   257: checkcast java/util/List
/*     */     //   260: nop
/*     */     //   261: astore_1
/*     */     //   262: aload_1
/*     */     //   263: checkcast java/util/Collection
/*     */     //   266: invokestatic toMutableList : (Ljava/util/Collection;)Ljava/util/List;
/*     */     //   269: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #567	-> 0
/*     */     //   #801	-> 26
/*     */     //   #802	-> 35
/*     */     //   #803	-> 49
/*     */     //   #804	-> 59
/*     */     //   #567	-> 74
/*     */     //   #567	-> 75
/*     */     //   #567	-> 102
/*     */     //   #804	-> 103
/*     */     //   #805	-> 106
/*     */     //   #809	-> 125
/*     */     //   #567	-> 132
/*     */     //   #810	-> 135
/*     */     //   #811	-> 159
/*     */     //   #812	-> 187
/*     */     //   #567	-> 201
/*     */     //   #567	-> 212
/*     */     //   #567	-> 228
/*     */     //   #812	-> 246
/*     */     //   #813	-> 255
/*     */     //   #810	-> 260
/*     */     //   #567	-> 261
/*     */     //   #566	-> 261
/*     */     //   #568	-> 262
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   74	29	6	$i$a$-dropLastWhile-EditSearchReplaceKt$prepLines$lines$1	I
/*     */     //   71	32	5	it	Ljava/lang/String;
/*     */     //   49	76	4	iterator$iv	Ljava/util/ListIterator;
/*     */     //   26	102	3	$i$f$dropLastWhile	I
/*     */     //   24	104	2	$this$dropLastWhile$iv	Ljava/util/List;
/*     */     //   201	42	10	$i$a$-map-EditSearchReplaceKt$prepLines$lines$2	I
/*     */     //   198	45	9	it	Ljava/lang/String;
/*     */     //   187	65	8	item$iv$iv	Ljava/lang/Object;
/*     */     //   159	98	6	$i$f$mapTo	I
/*     */     //   156	101	4	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   156	101	5	destination$iv$iv	Ljava/util/Collection;
/*     */     //   135	126	3	$i$f$map	I
/*     */     //   133	128	2	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   262	8	1	lines	Ljava/util/List;
/*     */     //   0	270	0	text	Ljava/lang/String;
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
/*     */   private static final MatchingResult multyCheckMatchReplace(List wholeLines, List searchLines, List replaceLines) {
/*     */     // Byte code:
/*     */     //   0: ldc 'ERROR: your *SEARCH* pattern matched to the source code several times.\\nInclude enough lines to make the *SEARCH* pattern uniquely match the lines to change.'
/*     */     //   2: astore_3
/*     */     //   3: aload_1
/*     */     //   4: invokeinterface size : ()I
/*     */     //   9: istore #4
/*     */     //   11: aload_0
/*     */     //   12: checkcast java/lang/Iterable
/*     */     //   15: astore #6
/*     */     //   17: iconst_0
/*     */     //   18: istore #7
/*     */     //   20: aload #6
/*     */     //   22: astore #8
/*     */     //   24: new java/util/ArrayList
/*     */     //   27: dup
/*     */     //   28: aload #6
/*     */     //   30: bipush #10
/*     */     //   32: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   35: invokespecial <init> : (I)V
/*     */     //   38: checkcast java/util/Collection
/*     */     //   41: astore #9
/*     */     //   43: iconst_0
/*     */     //   44: istore #10
/*     */     //   46: aload #8
/*     */     //   48: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   53: astore #11
/*     */     //   55: aload #11
/*     */     //   57: invokeinterface hasNext : ()Z
/*     */     //   62: ifeq -> 112
/*     */     //   65: aload #11
/*     */     //   67: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   72: astore #12
/*     */     //   74: aload #9
/*     */     //   76: aload #12
/*     */     //   78: checkcast java/lang/String
/*     */     //   81: astore #13
/*     */     //   83: astore #31
/*     */     //   85: iconst_0
/*     */     //   86: istore #14
/*     */     //   88: aload #13
/*     */     //   90: checkcast java/lang/CharSequence
/*     */     //   93: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   96: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   99: nop
/*     */     //   100: aload #31
/*     */     //   102: swap
/*     */     //   103: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   108: pop
/*     */     //   109: goto -> 55
/*     */     //   112: aload #9
/*     */     //   114: checkcast java/util/List
/*     */     //   117: nop
/*     */     //   118: astore #5
/*     */     //   120: aload_1
/*     */     //   121: checkcast java/lang/Iterable
/*     */     //   124: astore #7
/*     */     //   126: iconst_0
/*     */     //   127: istore #8
/*     */     //   129: aload #7
/*     */     //   131: astore #9
/*     */     //   133: new java/util/ArrayList
/*     */     //   136: dup
/*     */     //   137: aload #7
/*     */     //   139: bipush #10
/*     */     //   141: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   144: invokespecial <init> : (I)V
/*     */     //   147: checkcast java/util/Collection
/*     */     //   150: astore #10
/*     */     //   152: iconst_0
/*     */     //   153: istore #11
/*     */     //   155: aload #9
/*     */     //   157: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   162: astore #12
/*     */     //   164: aload #12
/*     */     //   166: invokeinterface hasNext : ()Z
/*     */     //   171: ifeq -> 221
/*     */     //   174: aload #12
/*     */     //   176: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   181: astore #13
/*     */     //   183: aload #10
/*     */     //   185: aload #13
/*     */     //   187: checkcast java/lang/String
/*     */     //   190: astore #14
/*     */     //   192: astore #31
/*     */     //   194: iconst_0
/*     */     //   195: istore #15
/*     */     //   197: aload #14
/*     */     //   199: checkcast java/lang/CharSequence
/*     */     //   202: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   205: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   208: nop
/*     */     //   209: aload #31
/*     */     //   211: swap
/*     */     //   212: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   217: pop
/*     */     //   218: goto -> 164
/*     */     //   221: aload #10
/*     */     //   223: checkcast java/util/List
/*     */     //   226: nop
/*     */     //   227: astore #6
/*     */     //   229: aload_1
/*     */     //   230: checkcast java/util/Collection
/*     */     //   233: astore #8
/*     */     //   235: iconst_0
/*     */     //   236: istore #9
/*     */     //   238: aload #8
/*     */     //   240: astore #10
/*     */     //   242: aload #10
/*     */     //   244: iconst_0
/*     */     //   245: anewarray java/lang/String
/*     */     //   248: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*     */     //   253: checkcast [Ljava/lang/String;
/*     */     //   256: astore #7
/*     */     //   258: aload #6
/*     */     //   260: checkcast java/util/Collection
/*     */     //   263: astore #9
/*     */     //   265: iconst_0
/*     */     //   266: istore #10
/*     */     //   268: aload #9
/*     */     //   270: astore #11
/*     */     //   272: aload #11
/*     */     //   274: iconst_0
/*     */     //   275: anewarray java/lang/String
/*     */     //   278: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*     */     //   283: checkcast [Ljava/lang/String;
/*     */     //   286: astore #8
/*     */     //   288: new java/util/ArrayList
/*     */     //   291: dup
/*     */     //   292: invokespecial <init> : ()V
/*     */     //   295: checkcast java/util/List
/*     */     //   298: astore #9
/*     */     //   300: new java/util/ArrayList
/*     */     //   303: dup
/*     */     //   304: invokespecial <init> : ()V
/*     */     //   307: checkcast java/util/List
/*     */     //   310: astore #10
/*     */     //   312: new java/util/ArrayList
/*     */     //   315: dup
/*     */     //   316: invokespecial <init> : ()V
/*     */     //   319: checkcast java/util/List
/*     */     //   322: astore #11
/*     */     //   324: iconst_0
/*     */     //   325: istore #12
/*     */     //   327: aload_0
/*     */     //   328: invokeinterface size : ()I
/*     */     //   333: iload #4
/*     */     //   335: isub
/*     */     //   336: istore #13
/*     */     //   338: iload #12
/*     */     //   340: iload #13
/*     */     //   342: if_icmpgt -> 1815
/*     */     //   345: aload_0
/*     */     //   346: iload #12
/*     */     //   348: iload #12
/*     */     //   350: iload #4
/*     */     //   352: iadd
/*     */     //   353: invokeinterface subList : (II)Ljava/util/List;
/*     */     //   358: astore #14
/*     */     //   360: aload #7
/*     */     //   362: astore #15
/*     */     //   364: aload #14
/*     */     //   366: checkcast java/util/Collection
/*     */     //   369: astore #16
/*     */     //   371: iconst_0
/*     */     //   372: istore #17
/*     */     //   374: aload #16
/*     */     //   376: astore #18
/*     */     //   378: aload #18
/*     */     //   380: iconst_0
/*     */     //   381: anewarray java/lang/String
/*     */     //   384: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*     */     //   389: aload #15
/*     */     //   391: swap
/*     */     //   392: invokestatic equals : ([Ljava/lang/Object;[Ljava/lang/Object;)Z
/*     */     //   395: ifeq -> 420
/*     */     //   398: aload #9
/*     */     //   400: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchedResult
/*     */     //   403: dup
/*     */     //   404: aload_1
/*     */     //   405: aload_2
/*     */     //   406: iload #12
/*     */     //   408: invokespecial <init> : (Ljava/util/List;Ljava/util/List;I)V
/*     */     //   411: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   416: pop
/*     */     //   417: goto -> 1802
/*     */     //   420: aload #8
/*     */     //   422: astore #15
/*     */     //   424: aload #5
/*     */     //   426: iload #12
/*     */     //   428: iload #12
/*     */     //   430: iload #4
/*     */     //   432: iadd
/*     */     //   433: invokeinterface subList : (II)Ljava/util/List;
/*     */     //   438: checkcast java/util/Collection
/*     */     //   441: astore #16
/*     */     //   443: iconst_0
/*     */     //   444: istore #17
/*     */     //   446: aload #16
/*     */     //   448: astore #18
/*     */     //   450: aload #18
/*     */     //   452: iconst_0
/*     */     //   453: anewarray java/lang/String
/*     */     //   456: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*     */     //   461: aload #15
/*     */     //   463: swap
/*     */     //   464: invokestatic equals : ([Ljava/lang/Object;[Ljava/lang/Object;)Z
/*     */     //   467: ifeq -> 1242
/*     */     //   470: aload_2
/*     */     //   471: checkcast java/util/Collection
/*     */     //   474: invokestatic toMutableList : (Ljava/util/Collection;)Ljava/util/List;
/*     */     //   477: astore #15
/*     */     //   479: aload #15
/*     */     //   481: checkcast java/lang/Iterable
/*     */     //   484: ldc ''
/*     */     //   486: checkcast java/lang/CharSequence
/*     */     //   489: aconst_null
/*     */     //   490: aconst_null
/*     */     //   491: iconst_0
/*     */     //   492: aconst_null
/*     */     //   493: aconst_null
/*     */     //   494: bipush #62
/*     */     //   496: aconst_null
/*     */     //   497: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   500: invokestatic findMinimumIndent : (Ljava/lang/String;)I
/*     */     //   503: istore #16
/*     */     //   505: aload_0
/*     */     //   506: iload #12
/*     */     //   508: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   513: checkcast java/lang/CharSequence
/*     */     //   516: astore #18
/*     */     //   518: iconst_0
/*     */     //   519: istore #19
/*     */     //   521: iconst_0
/*     */     //   522: istore #20
/*     */     //   524: aload #18
/*     */     //   526: invokeinterface length : ()I
/*     */     //   531: istore #21
/*     */     //   533: iload #20
/*     */     //   535: iload #21
/*     */     //   537: if_icmpge -> 581
/*     */     //   540: aload #18
/*     */     //   542: iload #20
/*     */     //   544: invokeinterface charAt : (I)C
/*     */     //   549: istore #22
/*     */     //   551: iconst_0
/*     */     //   552: istore #23
/*     */     //   554: iload #22
/*     */     //   556: invokestatic isWhitespace : (C)Z
/*     */     //   559: ifne -> 566
/*     */     //   562: iconst_1
/*     */     //   563: goto -> 567
/*     */     //   566: iconst_0
/*     */     //   567: ifeq -> 575
/*     */     //   570: iload #20
/*     */     //   572: goto -> 582
/*     */     //   575: iinc #20, 1
/*     */     //   578: goto -> 533
/*     */     //   581: iconst_m1
/*     */     //   582: aload_1
/*     */     //   583: iconst_0
/*     */     //   584: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   589: checkcast java/lang/CharSequence
/*     */     //   592: astore #18
/*     */     //   594: istore #31
/*     */     //   596: iconst_0
/*     */     //   597: istore #19
/*     */     //   599: iconst_0
/*     */     //   600: istore #20
/*     */     //   602: aload #18
/*     */     //   604: invokeinterface length : ()I
/*     */     //   609: istore #21
/*     */     //   611: iload #20
/*     */     //   613: iload #21
/*     */     //   615: if_icmpge -> 659
/*     */     //   618: aload #18
/*     */     //   620: iload #20
/*     */     //   622: invokeinterface charAt : (I)C
/*     */     //   627: istore #22
/*     */     //   629: iconst_0
/*     */     //   630: istore #23
/*     */     //   632: iload #22
/*     */     //   634: invokestatic isWhitespace : (C)Z
/*     */     //   637: ifne -> 644
/*     */     //   640: iconst_1
/*     */     //   641: goto -> 645
/*     */     //   644: iconst_0
/*     */     //   645: ifeq -> 653
/*     */     //   648: iload #20
/*     */     //   650: goto -> 660
/*     */     //   653: iinc #20, 1
/*     */     //   656: goto -> 611
/*     */     //   659: iconst_m1
/*     */     //   660: istore #32
/*     */     //   662: iload #31
/*     */     //   664: iload #32
/*     */     //   666: isub
/*     */     //   667: istore #17
/*     */     //   669: iconst_0
/*     */     //   670: istore #18
/*     */     //   672: iload #4
/*     */     //   674: iconst_1
/*     */     //   675: if_icmple -> 885
/*     */     //   678: aload_1
/*     */     //   679: iconst_1
/*     */     //   680: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   685: checkcast java/lang/CharSequence
/*     */     //   688: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   691: ifne -> 698
/*     */     //   694: iconst_1
/*     */     //   695: goto -> 699
/*     */     //   698: iconst_0
/*     */     //   699: ifeq -> 885
/*     */     //   702: aload_0
/*     */     //   703: iload #12
/*     */     //   705: iconst_1
/*     */     //   706: iadd
/*     */     //   707: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   712: checkcast java/lang/CharSequence
/*     */     //   715: astore #20
/*     */     //   717: iconst_0
/*     */     //   718: istore #21
/*     */     //   720: iconst_0
/*     */     //   721: istore #22
/*     */     //   723: aload #20
/*     */     //   725: invokeinterface length : ()I
/*     */     //   730: istore #23
/*     */     //   732: iload #22
/*     */     //   734: iload #23
/*     */     //   736: if_icmpge -> 780
/*     */     //   739: aload #20
/*     */     //   741: iload #22
/*     */     //   743: invokeinterface charAt : (I)C
/*     */     //   748: istore #24
/*     */     //   750: iconst_0
/*     */     //   751: istore #25
/*     */     //   753: iload #24
/*     */     //   755: invokestatic isWhitespace : (C)Z
/*     */     //   758: ifne -> 765
/*     */     //   761: iconst_1
/*     */     //   762: goto -> 766
/*     */     //   765: iconst_0
/*     */     //   766: ifeq -> 774
/*     */     //   769: iload #22
/*     */     //   771: goto -> 781
/*     */     //   774: iinc #22, 1
/*     */     //   777: goto -> 732
/*     */     //   780: iconst_m1
/*     */     //   781: aload_1
/*     */     //   782: iconst_1
/*     */     //   783: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   788: checkcast java/lang/CharSequence
/*     */     //   791: astore #20
/*     */     //   793: istore #31
/*     */     //   795: iconst_0
/*     */     //   796: istore #21
/*     */     //   798: iconst_0
/*     */     //   799: istore #22
/*     */     //   801: aload #20
/*     */     //   803: invokeinterface length : ()I
/*     */     //   808: istore #23
/*     */     //   810: iload #22
/*     */     //   812: iload #23
/*     */     //   814: if_icmpge -> 858
/*     */     //   817: aload #20
/*     */     //   819: iload #22
/*     */     //   821: invokeinterface charAt : (I)C
/*     */     //   826: istore #24
/*     */     //   828: iconst_0
/*     */     //   829: istore #25
/*     */     //   831: iload #24
/*     */     //   833: invokestatic isWhitespace : (C)Z
/*     */     //   836: ifne -> 843
/*     */     //   839: iconst_1
/*     */     //   840: goto -> 844
/*     */     //   843: iconst_0
/*     */     //   844: ifeq -> 852
/*     */     //   847: iload #22
/*     */     //   849: goto -> 859
/*     */     //   852: iinc #22, 1
/*     */     //   855: goto -> 810
/*     */     //   858: iconst_m1
/*     */     //   859: istore #32
/*     */     //   861: iload #31
/*     */     //   863: iload #32
/*     */     //   865: isub
/*     */     //   866: istore #19
/*     */     //   868: iload #19
/*     */     //   870: iload #17
/*     */     //   872: if_icmpeq -> 879
/*     */     //   875: iconst_1
/*     */     //   876: goto -> 880
/*     */     //   879: iconst_0
/*     */     //   880: istore #18
/*     */     //   882: goto -> 1095
/*     */     //   885: iload #4
/*     */     //   887: iconst_2
/*     */     //   888: if_icmple -> 1095
/*     */     //   891: aload_1
/*     */     //   892: iconst_2
/*     */     //   893: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   898: checkcast java/lang/CharSequence
/*     */     //   901: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   904: ifne -> 911
/*     */     //   907: iconst_1
/*     */     //   908: goto -> 912
/*     */     //   911: iconst_0
/*     */     //   912: ifeq -> 1095
/*     */     //   915: aload_0
/*     */     //   916: iload #12
/*     */     //   918: iconst_2
/*     */     //   919: iadd
/*     */     //   920: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   925: checkcast java/lang/CharSequence
/*     */     //   928: astore #20
/*     */     //   930: iconst_0
/*     */     //   931: istore #21
/*     */     //   933: iconst_0
/*     */     //   934: istore #22
/*     */     //   936: aload #20
/*     */     //   938: invokeinterface length : ()I
/*     */     //   943: istore #23
/*     */     //   945: iload #22
/*     */     //   947: iload #23
/*     */     //   949: if_icmpge -> 993
/*     */     //   952: aload #20
/*     */     //   954: iload #22
/*     */     //   956: invokeinterface charAt : (I)C
/*     */     //   961: istore #24
/*     */     //   963: iconst_0
/*     */     //   964: istore #25
/*     */     //   966: iload #24
/*     */     //   968: invokestatic isWhitespace : (C)Z
/*     */     //   971: ifne -> 978
/*     */     //   974: iconst_1
/*     */     //   975: goto -> 979
/*     */     //   978: iconst_0
/*     */     //   979: ifeq -> 987
/*     */     //   982: iload #22
/*     */     //   984: goto -> 994
/*     */     //   987: iinc #22, 1
/*     */     //   990: goto -> 945
/*     */     //   993: iconst_m1
/*     */     //   994: aload_1
/*     */     //   995: iconst_2
/*     */     //   996: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1001: checkcast java/lang/CharSequence
/*     */     //   1004: astore #20
/*     */     //   1006: istore #31
/*     */     //   1008: iconst_0
/*     */     //   1009: istore #21
/*     */     //   1011: iconst_0
/*     */     //   1012: istore #22
/*     */     //   1014: aload #20
/*     */     //   1016: invokeinterface length : ()I
/*     */     //   1021: istore #23
/*     */     //   1023: iload #22
/*     */     //   1025: iload #23
/*     */     //   1027: if_icmpge -> 1071
/*     */     //   1030: aload #20
/*     */     //   1032: iload #22
/*     */     //   1034: invokeinterface charAt : (I)C
/*     */     //   1039: istore #24
/*     */     //   1041: iconst_0
/*     */     //   1042: istore #25
/*     */     //   1044: iload #24
/*     */     //   1046: invokestatic isWhitespace : (C)Z
/*     */     //   1049: ifne -> 1056
/*     */     //   1052: iconst_1
/*     */     //   1053: goto -> 1057
/*     */     //   1056: iconst_0
/*     */     //   1057: ifeq -> 1065
/*     */     //   1060: iload #22
/*     */     //   1062: goto -> 1072
/*     */     //   1065: iinc #22, 1
/*     */     //   1068: goto -> 1023
/*     */     //   1071: iconst_m1
/*     */     //   1072: istore #32
/*     */     //   1074: iload #31
/*     */     //   1076: iload #32
/*     */     //   1078: isub
/*     */     //   1079: istore #19
/*     */     //   1081: iload #19
/*     */     //   1083: iload #17
/*     */     //   1085: if_icmpeq -> 1092
/*     */     //   1088: iconst_1
/*     */     //   1089: goto -> 1093
/*     */     //   1092: iconst_0
/*     */     //   1093: istore #18
/*     */     //   1095: iload #17
/*     */     //   1097: ifge -> 1159
/*     */     //   1100: iload #16
/*     */     //   1102: iload #17
/*     */     //   1104: iadd
/*     */     //   1105: iflt -> 1219
/*     */     //   1108: iload #18
/*     */     //   1110: ifeq -> 1142
/*     */     //   1113: aload #15
/*     */     //   1115: iconst_0
/*     */     //   1116: aload #15
/*     */     //   1118: iconst_0
/*     */     //   1119: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1124: checkcast java/lang/String
/*     */     //   1127: iload #17
/*     */     //   1129: ineg
/*     */     //   1130: invokestatic drop : (Ljava/lang/String;I)Ljava/lang/String;
/*     */     //   1133: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   1138: pop
/*     */     //   1139: goto -> 1219
/*     */     //   1142: aload #15
/*     */     //   1144: iload #17
/*     */     //   1146: <illegal opcode> apply : (I)Ljava/util/function/UnaryOperator;
/*     */     //   1151: invokeinterface replaceAll : (Ljava/util/function/UnaryOperator;)V
/*     */     //   1156: goto -> 1219
/*     */     //   1159: iload #17
/*     */     //   1161: ifle -> 1219
/*     */     //   1164: iload #18
/*     */     //   1166: ifeq -> 1205
/*     */     //   1169: aload #15
/*     */     //   1171: iconst_0
/*     */     //   1172: ldc_w ' '
/*     */     //   1175: checkcast java/lang/CharSequence
/*     */     //   1178: iload #17
/*     */     //   1180: invokestatic repeat : (Ljava/lang/CharSequence;I)Ljava/lang/String;
/*     */     //   1183: aload #15
/*     */     //   1185: iconst_0
/*     */     //   1186: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1191: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   1196: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   1201: pop
/*     */     //   1202: goto -> 1219
/*     */     //   1205: aload #15
/*     */     //   1207: iload #17
/*     */     //   1209: <illegal opcode> apply : (I)Ljava/util/function/UnaryOperator;
/*     */     //   1214: invokeinterface replaceAll : (Ljava/util/function/UnaryOperator;)V
/*     */     //   1219: aload #10
/*     */     //   1221: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchedResult
/*     */     //   1224: dup
/*     */     //   1225: aload_1
/*     */     //   1226: aload #15
/*     */     //   1228: iload #12
/*     */     //   1230: invokespecial <init> : (Ljava/util/List;Ljava/util/List;I)V
/*     */     //   1233: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1238: pop
/*     */     //   1239: goto -> 1802
/*     */     //   1242: iload #4
/*     */     //   1244: iconst_2
/*     */     //   1245: if_icmple -> 1802
/*     */     //   1248: aload_0
/*     */     //   1249: iload #12
/*     */     //   1251: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1256: aload_1
/*     */     //   1257: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   1260: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1263: ifeq -> 1802
/*     */     //   1266: iconst_0
/*     */     //   1267: istore #15
/*     */     //   1269: iconst_0
/*     */     //   1270: istore #16
/*     */     //   1272: aload_2
/*     */     //   1273: checkcast java/util/Collection
/*     */     //   1276: invokestatic toMutableList : (Ljava/util/Collection;)Ljava/util/List;
/*     */     //   1279: astore #17
/*     */     //   1281: iconst_0
/*     */     //   1282: istore #18
/*     */     //   1284: new java/util/ArrayList
/*     */     //   1287: dup
/*     */     //   1288: invokespecial <init> : ()V
/*     */     //   1291: checkcast java/util/List
/*     */     //   1294: astore #19
/*     */     //   1296: iconst_0
/*     */     //   1297: istore #20
/*     */     //   1299: iload #4
/*     */     //   1301: iconst_1
/*     */     //   1302: isub
/*     */     //   1303: istore #21
/*     */     //   1305: iload #20
/*     */     //   1307: iload #21
/*     */     //   1309: if_icmpgt -> 1765
/*     */     //   1312: aload_0
/*     */     //   1313: iload #12
/*     */     //   1315: iload #20
/*     */     //   1317: iadd
/*     */     //   1318: iload #18
/*     */     //   1320: iadd
/*     */     //   1321: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1326: aload_1
/*     */     //   1327: iload #20
/*     */     //   1329: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1334: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1337: ifeq -> 1371
/*     */     //   1340: aload #19
/*     */     //   1342: aload_0
/*     */     //   1343: iload #12
/*     */     //   1345: iload #20
/*     */     //   1347: iadd
/*     */     //   1348: iload #18
/*     */     //   1350: iadd
/*     */     //   1351: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1356: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1361: pop
/*     */     //   1362: iload #16
/*     */     //   1364: iinc #16, 1
/*     */     //   1367: pop
/*     */     //   1368: goto -> 1752
/*     */     //   1371: iload #15
/*     */     //   1373: ifne -> 1587
/*     */     //   1376: iload #12
/*     */     //   1378: iload #20
/*     */     //   1380: iadd
/*     */     //   1381: iconst_1
/*     */     //   1382: iadd
/*     */     //   1383: iload #18
/*     */     //   1385: iadd
/*     */     //   1386: aload_0
/*     */     //   1387: invokeinterface size : ()I
/*     */     //   1392: if_icmpge -> 1587
/*     */     //   1395: iload #20
/*     */     //   1397: iconst_1
/*     */     //   1398: iadd
/*     */     //   1399: aload_1
/*     */     //   1400: invokeinterface size : ()I
/*     */     //   1405: if_icmpge -> 1587
/*     */     //   1408: aload_0
/*     */     //   1409: iload #12
/*     */     //   1411: iload #20
/*     */     //   1413: iadd
/*     */     //   1414: iconst_1
/*     */     //   1415: iadd
/*     */     //   1416: iload #18
/*     */     //   1418: iadd
/*     */     //   1419: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1424: aload_1
/*     */     //   1425: iload #20
/*     */     //   1427: iconst_1
/*     */     //   1428: iadd
/*     */     //   1429: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1434: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1437: ifeq -> 1587
/*     */     //   1440: aload #19
/*     */     //   1442: aload_0
/*     */     //   1443: iload #12
/*     */     //   1445: iload #20
/*     */     //   1447: iadd
/*     */     //   1448: iload #18
/*     */     //   1450: iadd
/*     */     //   1451: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1456: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1461: pop
/*     */     //   1462: iinc #16, 1
/*     */     //   1465: iconst_1
/*     */     //   1466: istore #15
/*     */     //   1468: aload #17
/*     */     //   1470: checkcast java/lang/Iterable
/*     */     //   1473: astore #22
/*     */     //   1475: iconst_0
/*     */     //   1476: istore #23
/*     */     //   1478: iconst_0
/*     */     //   1479: istore #24
/*     */     //   1481: aload #22
/*     */     //   1483: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1488: astore #25
/*     */     //   1490: aload #25
/*     */     //   1492: invokeinterface hasNext : ()Z
/*     */     //   1497: ifeq -> 1583
/*     */     //   1500: aload #25
/*     */     //   1502: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1507: astore #26
/*     */     //   1509: iload #24
/*     */     //   1511: iinc #24, 1
/*     */     //   1514: istore #27
/*     */     //   1516: iload #27
/*     */     //   1518: ifge -> 1524
/*     */     //   1521: invokestatic throwIndexOverflow : ()V
/*     */     //   1524: iload #27
/*     */     //   1526: aload #26
/*     */     //   1528: checkcast java/lang/String
/*     */     //   1531: astore #28
/*     */     //   1533: istore #29
/*     */     //   1535: iconst_0
/*     */     //   1536: istore #30
/*     */     //   1538: aload #28
/*     */     //   1540: aload_1
/*     */     //   1541: iload #20
/*     */     //   1543: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1548: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1551: ifeq -> 1578
/*     */     //   1554: aload #17
/*     */     //   1556: iload #29
/*     */     //   1558: aload_0
/*     */     //   1559: iload #12
/*     */     //   1561: iload #20
/*     */     //   1563: iadd
/*     */     //   1564: iload #18
/*     */     //   1566: iadd
/*     */     //   1567: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1572: invokeinterface set : (ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   1577: pop
/*     */     //   1578: nop
/*     */     //   1579: nop
/*     */     //   1580: goto -> 1490
/*     */     //   1583: nop
/*     */     //   1584: goto -> 1752
/*     */     //   1587: iload #15
/*     */     //   1589: ifne -> 1749
/*     */     //   1592: iload #12
/*     */     //   1594: iload #20
/*     */     //   1596: iadd
/*     */     //   1597: iconst_1
/*     */     //   1598: iadd
/*     */     //   1599: iload #18
/*     */     //   1601: iadd
/*     */     //   1602: aload_0
/*     */     //   1603: invokeinterface size : ()I
/*     */     //   1608: if_icmpge -> 1749
/*     */     //   1611: aload_0
/*     */     //   1612: iload #12
/*     */     //   1614: iload #20
/*     */     //   1616: iadd
/*     */     //   1617: iconst_1
/*     */     //   1618: iadd
/*     */     //   1619: iload #18
/*     */     //   1621: iadd
/*     */     //   1622: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1627: aload_1
/*     */     //   1628: iload #20
/*     */     //   1630: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1635: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1638: ifeq -> 1749
/*     */     //   1641: aload_0
/*     */     //   1642: iload #12
/*     */     //   1644: iload #20
/*     */     //   1646: iadd
/*     */     //   1647: iload #18
/*     */     //   1649: iadd
/*     */     //   1650: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1655: checkcast java/lang/CharSequence
/*     */     //   1658: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   1661: ifne -> 1688
/*     */     //   1664: aload #17
/*     */     //   1666: aload_0
/*     */     //   1667: iload #12
/*     */     //   1669: iload #20
/*     */     //   1671: iadd
/*     */     //   1672: iload #18
/*     */     //   1674: iadd
/*     */     //   1675: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1680: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   1685: ifne -> 1749
/*     */     //   1688: aload #19
/*     */     //   1690: aload_0
/*     */     //   1691: iload #12
/*     */     //   1693: iload #20
/*     */     //   1695: iadd
/*     */     //   1696: iload #18
/*     */     //   1698: iadd
/*     */     //   1699: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1704: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1709: pop
/*     */     //   1710: aload #19
/*     */     //   1712: aload_0
/*     */     //   1713: iload #12
/*     */     //   1715: iload #20
/*     */     //   1717: iadd
/*     */     //   1718: iconst_1
/*     */     //   1719: iadd
/*     */     //   1720: iload #18
/*     */     //   1722: iadd
/*     */     //   1723: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   1728: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1733: pop
/*     */     //   1734: iinc #16, 1
/*     */     //   1737: iload #18
/*     */     //   1739: iconst_1
/*     */     //   1740: iadd
/*     */     //   1741: istore #18
/*     */     //   1743: iconst_1
/*     */     //   1744: istore #15
/*     */     //   1746: goto -> 1752
/*     */     //   1749: goto -> 1765
/*     */     //   1752: iload #20
/*     */     //   1754: iload #21
/*     */     //   1756: if_icmpeq -> 1765
/*     */     //   1759: iinc #20, 1
/*     */     //   1762: goto -> 1312
/*     */     //   1765: iload #16
/*     */     //   1767: aload_1
/*     */     //   1768: invokeinterface size : ()I
/*     */     //   1773: if_icmpne -> 1802
/*     */     //   1776: iload #15
/*     */     //   1778: ifeq -> 1802
/*     */     //   1781: aload #11
/*     */     //   1783: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchedResult
/*     */     //   1786: dup
/*     */     //   1787: aload #19
/*     */     //   1789: aload #17
/*     */     //   1791: iload #12
/*     */     //   1793: invokespecial <init> : (Ljava/util/List;Ljava/util/List;I)V
/*     */     //   1796: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1801: pop
/*     */     //   1802: iload #12
/*     */     //   1804: iload #13
/*     */     //   1806: if_icmpeq -> 1815
/*     */     //   1809: iinc #12, 1
/*     */     //   1812: goto -> 345
/*     */     //   1815: nop
/*     */     //   1816: aload #9
/*     */     //   1818: invokeinterface size : ()I
/*     */     //   1823: iconst_1
/*     */     //   1824: if_icmpne -> 1845
/*     */     //   1827: aload_0
/*     */     //   1828: aload #9
/*     */     //   1830: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   1833: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchedResult
/*     */     //   1836: invokestatic applySearchReplace : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchedResult;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult$Success;
/*     */     //   1839: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult
/*     */     //   1842: goto -> 2206
/*     */     //   1845: aload #9
/*     */     //   1847: invokeinterface size : ()I
/*     */     //   1852: iconst_1
/*     */     //   1853: if_icmple -> 1987
/*     */     //   1856: aload_3
/*     */     //   1857: aload #9
/*     */     //   1859: checkcast java/lang/Iterable
/*     */     //   1862: astore #12
/*     */     //   1864: astore #33
/*     */     //   1866: iconst_0
/*     */     //   1867: istore #13
/*     */     //   1869: aload #12
/*     */     //   1871: astore #14
/*     */     //   1873: new java/util/ArrayList
/*     */     //   1876: dup
/*     */     //   1877: aload #12
/*     */     //   1879: bipush #10
/*     */     //   1881: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   1884: invokespecial <init> : (I)V
/*     */     //   1887: checkcast java/util/Collection
/*     */     //   1890: astore #15
/*     */     //   1892: iconst_0
/*     */     //   1893: istore #16
/*     */     //   1895: aload #14
/*     */     //   1897: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1902: astore #17
/*     */     //   1904: aload #17
/*     */     //   1906: invokeinterface hasNext : ()Z
/*     */     //   1911: ifeq -> 1957
/*     */     //   1914: aload #17
/*     */     //   1916: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1921: astore #18
/*     */     //   1923: aload #15
/*     */     //   1925: aload #18
/*     */     //   1927: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchedResult
/*     */     //   1930: astore #19
/*     */     //   1932: astore #34
/*     */     //   1934: iconst_0
/*     */     //   1935: istore #20
/*     */     //   1937: aload #19
/*     */     //   1939: invokevirtual getMatchIdx : ()I
/*     */     //   1942: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   1945: aload #34
/*     */     //   1947: swap
/*     */     //   1948: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1953: pop
/*     */     //   1954: goto -> 1904
/*     */     //   1957: aload #15
/*     */     //   1959: checkcast java/util/List
/*     */     //   1962: nop
/*     */     //   1963: aload #33
/*     */     //   1965: swap
/*     */     //   1966: astore #35
/*     */     //   1968: astore #36
/*     */     //   1970: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult$MultipleMatchesError
/*     */     //   1973: dup
/*     */     //   1974: aload #36
/*     */     //   1976: aload #35
/*     */     //   1978: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;)V
/*     */     //   1981: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult
/*     */     //   1984: goto -> 2206
/*     */     //   1987: aload #10
/*     */     //   1989: invokeinterface size : ()I
/*     */     //   1994: iconst_1
/*     */     //   1995: if_icmpne -> 2016
/*     */     //   1998: aload_0
/*     */     //   1999: aload #10
/*     */     //   2001: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   2004: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchedResult
/*     */     //   2007: invokestatic applySearchReplace : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchedResult;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult$Success;
/*     */     //   2010: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult
/*     */     //   2013: goto -> 2206
/*     */     //   2016: aload #10
/*     */     //   2018: invokeinterface size : ()I
/*     */     //   2023: iconst_1
/*     */     //   2024: if_icmple -> 2158
/*     */     //   2027: aload_3
/*     */     //   2028: aload #10
/*     */     //   2030: checkcast java/lang/Iterable
/*     */     //   2033: astore #12
/*     */     //   2035: astore #33
/*     */     //   2037: iconst_0
/*     */     //   2038: istore #13
/*     */     //   2040: aload #12
/*     */     //   2042: astore #14
/*     */     //   2044: new java/util/ArrayList
/*     */     //   2047: dup
/*     */     //   2048: aload #12
/*     */     //   2050: bipush #10
/*     */     //   2052: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   2055: invokespecial <init> : (I)V
/*     */     //   2058: checkcast java/util/Collection
/*     */     //   2061: astore #15
/*     */     //   2063: iconst_0
/*     */     //   2064: istore #16
/*     */     //   2066: aload #14
/*     */     //   2068: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   2073: astore #17
/*     */     //   2075: aload #17
/*     */     //   2077: invokeinterface hasNext : ()Z
/*     */     //   2082: ifeq -> 2128
/*     */     //   2085: aload #17
/*     */     //   2087: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   2092: astore #18
/*     */     //   2094: aload #15
/*     */     //   2096: aload #18
/*     */     //   2098: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchedResult
/*     */     //   2101: astore #19
/*     */     //   2103: astore #34
/*     */     //   2105: iconst_0
/*     */     //   2106: istore #20
/*     */     //   2108: aload #19
/*     */     //   2110: invokevirtual getMatchIdx : ()I
/*     */     //   2113: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   2116: aload #34
/*     */     //   2118: swap
/*     */     //   2119: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   2124: pop
/*     */     //   2125: goto -> 2075
/*     */     //   2128: aload #15
/*     */     //   2130: checkcast java/util/List
/*     */     //   2133: nop
/*     */     //   2134: aload #33
/*     */     //   2136: swap
/*     */     //   2137: astore #37
/*     */     //   2139: astore #38
/*     */     //   2141: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult$MultipleMatchesError
/*     */     //   2144: dup
/*     */     //   2145: aload #38
/*     */     //   2147: aload #37
/*     */     //   2149: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;)V
/*     */     //   2152: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult
/*     */     //   2155: goto -> 2206
/*     */     //   2158: aload #11
/*     */     //   2160: invokeinterface size : ()I
/*     */     //   2165: iconst_1
/*     */     //   2166: if_icmpne -> 2187
/*     */     //   2169: aload_0
/*     */     //   2170: aload #11
/*     */     //   2172: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   2175: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchedResult
/*     */     //   2178: invokestatic applySearchReplace : (Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchedResult;)Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult$Success;
/*     */     //   2181: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult
/*     */     //   2184: goto -> 2206
/*     */     //   2187: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult$NoMatchError
/*     */     //   2190: dup
/*     */     //   2191: ldc_w 'ERROR: failed to find *SEARCH* pattern in code'
/*     */     //   2194: aload_0
/*     */     //   2195: aload_1
/*     */     //   2196: iconst_0
/*     */     //   2197: invokestatic findMostSimilarStartIdx : (Ljava/util/List;Ljava/util/List;I)Ljava/lang/Integer;
/*     */     //   2200: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Integer;)V
/*     */     //   2203: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchingResult
/*     */     //   2206: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #577	-> 0
/*     */     //   #576	-> 2
/*     */     //   #579	-> 3
/*     */     //   #580	-> 11
/*     */     //   #814	-> 20
/*     */     //   #815	-> 46
/*     */     //   #816	-> 74
/*     */     //   #580	-> 88
/*     */     //   #580	-> 99
/*     */     //   #816	-> 103
/*     */     //   #817	-> 112
/*     */     //   #814	-> 117
/*     */     //   #580	-> 118
/*     */     //   #581	-> 120
/*     */     //   #818	-> 129
/*     */     //   #819	-> 155
/*     */     //   #820	-> 183
/*     */     //   #581	-> 197
/*     */     //   #581	-> 208
/*     */     //   #820	-> 212
/*     */     //   #821	-> 221
/*     */     //   #818	-> 226
/*     */     //   #581	-> 227
/*     */     //   #583	-> 229
/*     */     //   #822	-> 238
/*     */     //   #823	-> 242
/*     */     //   #583	-> 253
/*     */     //   #584	-> 258
/*     */     //   #824	-> 268
/*     */     //   #825	-> 272
/*     */     //   #584	-> 283
/*     */     //   #586	-> 288
/*     */     //   #586	-> 298
/*     */     //   #587	-> 300
/*     */     //   #587	-> 310
/*     */     //   #588	-> 312
/*     */     //   #588	-> 322
/*     */     //   #590	-> 324
/*     */     //   #591	-> 345
/*     */     //   #592	-> 360
/*     */     //   #826	-> 374
/*     */     //   #827	-> 378
/*     */     //   #592	-> 389
/*     */     //   #592	-> 395
/*     */     //   #593	-> 398
/*     */     //   #594	-> 420
/*     */     //   #828	-> 446
/*     */     //   #829	-> 450
/*     */     //   #594	-> 461
/*     */     //   #594	-> 467
/*     */     //   #595	-> 470
/*     */     //   #596	-> 479
/*     */     //   #597	-> 505
/*     */     //   #830	-> 521
/*     */     //   #831	-> 540
/*     */     //   #597	-> 554
/*     */     //   #831	-> 567
/*     */     //   #832	-> 570
/*     */     //   #830	-> 575
/*     */     //   #835	-> 581
/*     */     //   #598	-> 582
/*     */     //   #836	-> 599
/*     */     //   #837	-> 618
/*     */     //   #598	-> 632
/*     */     //   #837	-> 645
/*     */     //   #838	-> 648
/*     */     //   #836	-> 653
/*     */     //   #841	-> 659
/*     */     //   #597	-> 666
/*     */     //   #600	-> 669
/*     */     //   #601	-> 672
/*     */     //   #601	-> 699
/*     */     //   #602	-> 702
/*     */     //   #842	-> 720
/*     */     //   #843	-> 739
/*     */     //   #602	-> 753
/*     */     //   #843	-> 766
/*     */     //   #844	-> 769
/*     */     //   #842	-> 774
/*     */     //   #847	-> 780
/*     */     //   #603	-> 781
/*     */     //   #848	-> 798
/*     */     //   #849	-> 817
/*     */     //   #603	-> 831
/*     */     //   #849	-> 844
/*     */     //   #850	-> 847
/*     */     //   #848	-> 852
/*     */     //   #853	-> 858
/*     */     //   #602	-> 865
/*     */     //   #604	-> 868
/*     */     //   #605	-> 885
/*     */     //   #605	-> 912
/*     */     //   #606	-> 915
/*     */     //   #854	-> 933
/*     */     //   #855	-> 952
/*     */     //   #606	-> 966
/*     */     //   #855	-> 979
/*     */     //   #856	-> 982
/*     */     //   #854	-> 987
/*     */     //   #859	-> 993
/*     */     //   #607	-> 994
/*     */     //   #860	-> 1011
/*     */     //   #861	-> 1030
/*     */     //   #607	-> 1044
/*     */     //   #861	-> 1057
/*     */     //   #862	-> 1060
/*     */     //   #860	-> 1065
/*     */     //   #865	-> 1071
/*     */     //   #606	-> 1078
/*     */     //   #608	-> 1081
/*     */     //   #611	-> 1095
/*     */     //   #612	-> 1100
/*     */     //   #613	-> 1108
/*     */     //   #614	-> 1142
/*     */     //   #615	-> 1159
/*     */     //   #616	-> 1164
/*     */     //   #617	-> 1205
/*     */     //   #620	-> 1219
/*     */     //   #621	-> 1242
/*     */     //   #622	-> 1266
/*     */     //   #623	-> 1269
/*     */     //   #624	-> 1272
/*     */     //   #625	-> 1281
/*     */     //   #627	-> 1284
/*     */     //   #627	-> 1294
/*     */     //   #628	-> 1296
/*     */     //   #629	-> 1312
/*     */     //   #630	-> 1340
/*     */     //   #631	-> 1362
/*     */     //   #633	-> 1371
/*     */     //   #634	-> 1376
/*     */     //   #635	-> 1408
/*     */     //   #638	-> 1440
/*     */     //   #639	-> 1462
/*     */     //   #640	-> 1465
/*     */     //   #641	-> 1468
/*     */     //   #866	-> 1478
/*     */     //   #867	-> 1481
/*     */     //   #867	-> 1526
/*     */     //   #642	-> 1538
/*     */     //   #643	-> 1578
/*     */     //   #867	-> 1579
/*     */     //   #868	-> 1583
/*     */     //   #644	-> 1587
/*     */     //   #645	-> 1592
/*     */     //   #646	-> 1611
/*     */     //   #647	-> 1641
/*     */     //   #650	-> 1688
/*     */     //   #651	-> 1710
/*     */     //   #652	-> 1734
/*     */     //   #653	-> 1737
/*     */     //   #654	-> 1743
/*     */     //   #655	-> 1749
/*     */     //   #628	-> 1752
/*     */     //   #659	-> 1765
/*     */     //   #660	-> 1781
/*     */     //   #590	-> 1802
/*     */     //   #664	-> 1815
/*     */     //   #665	-> 1816
/*     */     //   #666	-> 1845
/*     */     //   #869	-> 1869
/*     */     //   #870	-> 1895
/*     */     //   #871	-> 1923
/*     */     //   #666	-> 1937
/*     */     //   #871	-> 1948
/*     */     //   #872	-> 1957
/*     */     //   #869	-> 1962
/*     */     //   #666	-> 1966
/*     */     //   #667	-> 1987
/*     */     //   #668	-> 2016
/*     */     //   #669	-> 2027
/*     */     //   #670	-> 2028
/*     */     //   #873	-> 2040
/*     */     //   #874	-> 2066
/*     */     //   #875	-> 2094
/*     */     //   #670	-> 2108
/*     */     //   #875	-> 2119
/*     */     //   #876	-> 2128
/*     */     //   #873	-> 2133
/*     */     //   #668	-> 2137
/*     */     //   #672	-> 2158
/*     */     //   #673	-> 2187
/*     */     //   #674	-> 2191
/*     */     //   #675	-> 2194
/*     */     //   #673	-> 2200
/*     */     //   #664	-> 2206
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   88	12	14	$i$a$-map-EditSearchReplaceKt$multyCheckMatchReplace$wholeLinesTrimmed$1	I
/*     */     //   85	15	13	it	Ljava/lang/String;
/*     */     //   74	35	12	item$iv$iv	Ljava/lang/Object;
/*     */     //   46	68	10	$i$f$mapTo	I
/*     */     //   43	71	8	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   43	71	9	destination$iv$iv	Ljava/util/Collection;
/*     */     //   20	98	7	$i$f$map	I
/*     */     //   17	101	6	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   197	12	15	$i$a$-map-EditSearchReplaceKt$multyCheckMatchReplace$searchLinesTrimmed$1	I
/*     */     //   194	15	14	it	Ljava/lang/String;
/*     */     //   183	35	13	item$iv$iv	Ljava/lang/Object;
/*     */     //   155	68	11	$i$f$mapTo	I
/*     */     //   152	71	9	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   152	71	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   129	98	8	$i$f$map	I
/*     */     //   126	101	7	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   238	15	9	$i$f$toTypedArray	I
/*     */     //   242	11	10	thisCollection$iv	Ljava/util/Collection;
/*     */     //   235	18	8	$this$toTypedArray$iv	Ljava/util/Collection;
/*     */     //   268	15	10	$i$f$toTypedArray	I
/*     */     //   272	11	11	thisCollection$iv	Ljava/util/Collection;
/*     */     //   265	18	9	$this$toTypedArray$iv	Ljava/util/Collection;
/*     */     //   374	15	17	$i$f$toTypedArray	I
/*     */     //   378	11	18	thisCollection$iv	Ljava/util/Collection;
/*     */     //   371	18	16	$this$toTypedArray$iv	Ljava/util/Collection;
/*     */     //   446	15	17	$i$f$toTypedArray	I
/*     */     //   450	11	18	thisCollection$iv	Ljava/util/Collection;
/*     */     //   443	18	16	$this$toTypedArray$iv	Ljava/util/Collection;
/*     */     //   554	13	23	$i$a$-indexOfFirst-EditSearchReplaceKt$multyCheckMatchReplace$indentationDiff$1	I
/*     */     //   551	16	22	it	C
/*     */     //   524	57	20	index$iv	I
/*     */     //   521	61	19	$i$f$indexOfFirst	I
/*     */     //   518	64	18	$this$indexOfFirst$iv	Ljava/lang/CharSequence;
/*     */     //   632	13	23	$i$a$-indexOfFirst-EditSearchReplaceKt$multyCheckMatchReplace$indentationDiff$2	I
/*     */     //   629	16	22	it	C
/*     */     //   602	57	20	index$iv	I
/*     */     //   599	61	19	$i$f$indexOfFirst	I
/*     */     //   596	64	18	$this$indexOfFirst$iv	Ljava/lang/CharSequence;
/*     */     //   753	13	25	$i$a$-indexOfFirst-EditSearchReplaceKt$multyCheckMatchReplace$indentationDiff2$1	I
/*     */     //   750	16	24	it	C
/*     */     //   723	57	22	index$iv	I
/*     */     //   720	61	21	$i$f$indexOfFirst	I
/*     */     //   717	64	20	$this$indexOfFirst$iv	Ljava/lang/CharSequence;
/*     */     //   831	13	25	$i$a$-indexOfFirst-EditSearchReplaceKt$multyCheckMatchReplace$indentationDiff2$2	I
/*     */     //   828	16	24	it	C
/*     */     //   801	57	22	index$iv	I
/*     */     //   798	61	21	$i$f$indexOfFirst	I
/*     */     //   795	64	20	$this$indexOfFirst$iv	Ljava/lang/CharSequence;
/*     */     //   868	14	19	indentationDiff2	I
/*     */     //   966	13	25	$i$a$-indexOfFirst-EditSearchReplaceKt$multyCheckMatchReplace$indentationDiff2$3	I
/*     */     //   963	16	24	it	C
/*     */     //   936	57	22	index$iv	I
/*     */     //   933	61	21	$i$f$indexOfFirst	I
/*     */     //   930	64	20	$this$indexOfFirst$iv	Ljava/lang/CharSequence;
/*     */     //   1044	13	25	$i$a$-indexOfFirst-EditSearchReplaceKt$multyCheckMatchReplace$indentationDiff2$4	I
/*     */     //   1041	16	24	it	C
/*     */     //   1014	57	22	index$iv	I
/*     */     //   1011	61	21	$i$f$indexOfFirst	I
/*     */     //   1008	64	20	$this$indexOfFirst$iv	Ljava/lang/CharSequence;
/*     */     //   1081	14	19	indentationDiff2	I
/*     */     //   479	759	15	newReplaceLines	Ljava/util/List;
/*     */     //   505	733	16	replaceMinIndent	I
/*     */     //   669	569	17	indentationDiff	I
/*     */     //   672	566	18	onlyFirstLineDiff	Z
/*     */     //   1538	41	30	$i$a$-forEachIndexed-EditSearchReplaceKt$multyCheckMatchReplace$3	I
/*     */     //   1535	44	29	n	I
/*     */     //   1535	44	28	line	Ljava/lang/String;
/*     */     //   1509	71	26	item$iv	Ljava/lang/Object;
/*     */     //   1478	106	23	$i$f$forEachIndexed	I
/*     */     //   1481	103	24	index$iv	I
/*     */     //   1475	109	22	$this$forEachIndexed$iv	Ljava/lang/Iterable;
/*     */     //   1299	466	20	j	I
/*     */     //   1269	533	15	mismatchFound	Z
/*     */     //   1272	530	16	matchingLines	I
/*     */     //   1281	521	17	newReplaceLines	Ljava/util/List;
/*     */     //   1284	518	18	offset	I
/*     */     //   1296	506	19	correctedSearch	Ljava/util/List;
/*     */     //   360	1442	14	wholeLinesFragment	Ljava/util/List;
/*     */     //   327	1488	12	i	I
/*     */     //   1937	5	20	$i$a$-map-EditSearchReplaceKt$multyCheckMatchReplace$4	I
/*     */     //   1934	8	19	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchedResult;
/*     */     //   1923	31	18	item$iv$iv	Ljava/lang/Object;
/*     */     //   1895	64	16	$i$f$mapTo	I
/*     */     //   1892	67	14	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   1892	67	15	destination$iv$iv	Ljava/util/Collection;
/*     */     //   1869	94	13	$i$f$map	I
/*     */     //   1866	97	12	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   2108	5	20	$i$a$-map-EditSearchReplaceKt$multyCheckMatchReplace$5	I
/*     */     //   2105	8	19	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/MatchedResult;
/*     */     //   2094	31	18	item$iv$iv	Ljava/lang/Object;
/*     */     //   2066	64	16	$i$f$mapTo	I
/*     */     //   2063	67	14	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   2063	67	15	destination$iv$iv	Ljava/util/Collection;
/*     */     //   2040	94	13	$i$f$map	I
/*     */     //   2037	97	12	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   3	2204	3	multipleMatchError	Ljava/lang/String;
/*     */     //   11	2196	4	searchLen	I
/*     */     //   120	2087	5	wholeLinesTrimmed	Ljava/util/List;
/*     */     //   229	1978	6	searchLinesTrimmed	Ljava/util/List;
/*     */     //   258	1949	7	searchTup	[Ljava/lang/String;
/*     */     //   288	1919	8	searchTrimmedTup	[Ljava/lang/String;
/*     */     //   300	1907	9	exactMatches	Ljava/util/List;
/*     */     //   312	1895	10	indentMatches	Ljava/util/List;
/*     */     //   324	1883	11	correctedMatches	Ljava/util/List;
/*     */     //   0	2207	0	wholeLines	Ljava/util/List;
/*     */     //   0	2207	1	searchLines	Ljava/util/List;
/*     */     //   0	2207	2	replaceLines	Ljava/util/List;
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
/*     */   private static final String multyCheckMatchReplace$lambda$11(int $indentationDiff, String it) {
/* 614 */     Intrinsics.checkNotNullParameter(it, "it"); return ((((CharSequence)StringsKt.trim(it).toString()).length() > 0)) ? StringsKt.drop(it, -$indentationDiff) : it;
/*     */   }
/*     */   private static final String multyCheckMatchReplace$lambda$12(int $indentationDiff, String it) {
/* 617 */     Intrinsics.checkNotNullParameter(it, "it"); return ((((CharSequence)StringsKt.trim(it).toString()).length() > 0)) ? (StringsKt.repeat(" ", $indentationDiff) + StringsKt.repeat(" ", $indentationDiff)) : it;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final MatchingResult.Success applySearchReplace(List wholeLines, MatchedResult match) {
/* 681 */     return new MatchingResult.Success(
/*     */         
/* 683 */         CollectionsKt.joinToString$default(CollectionsKt.plus(CollectionsKt.plus(wholeLines.subList(0, match.getMatchIdx()), match.getReplaceText()), wholeLines.subList(match.getMatchIdx() + match.getSearchText().size(), wholeLines.size())), "", null, null, 0, null, null, 62, null), 
/* 684 */         match.getMatchIdx());
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final int findMinimumIndent(String text) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: checkcast java/lang/CharSequence
/*     */     //   4: invokestatic lines : (Ljava/lang/CharSequence;)Ljava/util/List;
/*     */     //   7: checkcast java/lang/Iterable
/*     */     //   10: astore_1
/*     */     //   11: nop
/*     */     //   12: iconst_0
/*     */     //   13: istore_2
/*     */     //   14: aload_1
/*     */     //   15: astore_3
/*     */     //   16: new java/util/ArrayList
/*     */     //   19: dup
/*     */     //   20: invokespecial <init> : ()V
/*     */     //   23: checkcast java/util/Collection
/*     */     //   26: astore #4
/*     */     //   28: iconst_0
/*     */     //   29: istore #5
/*     */     //   31: aload_3
/*     */     //   32: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   37: astore #6
/*     */     //   39: aload #6
/*     */     //   41: invokeinterface hasNext : ()Z
/*     */     //   46: ifeq -> 101
/*     */     //   49: aload #6
/*     */     //   51: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   56: astore #7
/*     */     //   58: aload #7
/*     */     //   60: checkcast java/lang/String
/*     */     //   63: astore #8
/*     */     //   65: iconst_0
/*     */     //   66: istore #9
/*     */     //   68: aload #8
/*     */     //   70: checkcast java/lang/CharSequence
/*     */     //   73: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   76: ifne -> 83
/*     */     //   79: iconst_1
/*     */     //   80: goto -> 84
/*     */     //   83: iconst_0
/*     */     //   84: nop
/*     */     //   85: ifeq -> 39
/*     */     //   88: aload #4
/*     */     //   90: aload #7
/*     */     //   92: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   97: pop
/*     */     //   98: goto -> 39
/*     */     //   101: aload #4
/*     */     //   103: checkcast java/util/List
/*     */     //   106: nop
/*     */     //   107: checkcast java/lang/Iterable
/*     */     //   110: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   115: astore_2
/*     */     //   116: aload_2
/*     */     //   117: invokeinterface hasNext : ()Z
/*     */     //   122: ifne -> 129
/*     */     //   125: aconst_null
/*     */     //   126: goto -> 385
/*     */     //   129: aload_2
/*     */     //   130: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   135: checkcast java/lang/String
/*     */     //   138: astore_3
/*     */     //   139: iconst_0
/*     */     //   140: istore #4
/*     */     //   142: aload_3
/*     */     //   143: astore #5
/*     */     //   145: iconst_0
/*     */     //   146: istore #6
/*     */     //   148: iconst_0
/*     */     //   149: istore #7
/*     */     //   151: aload #5
/*     */     //   153: invokevirtual length : ()I
/*     */     //   156: istore #8
/*     */     //   158: iload #7
/*     */     //   160: iload #8
/*     */     //   162: if_icmpge -> 224
/*     */     //   165: aload #5
/*     */     //   167: iload #7
/*     */     //   169: invokevirtual charAt : (I)C
/*     */     //   172: istore #9
/*     */     //   174: iconst_0
/*     */     //   175: istore #10
/*     */     //   177: iload #9
/*     */     //   179: bipush #32
/*     */     //   181: if_icmpne -> 188
/*     */     //   184: iconst_1
/*     */     //   185: goto -> 189
/*     */     //   188: iconst_0
/*     */     //   189: ifne -> 218
/*     */     //   192: aload #5
/*     */     //   194: astore #9
/*     */     //   196: iconst_0
/*     */     //   197: istore #10
/*     */     //   199: aload #9
/*     */     //   201: iload #10
/*     */     //   203: iload #7
/*     */     //   205: invokevirtual substring : (II)Ljava/lang/String;
/*     */     //   208: dup
/*     */     //   209: ldc_w 'substring(...)'
/*     */     //   212: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   215: goto -> 226
/*     */     //   218: iinc #7, 1
/*     */     //   221: goto -> 158
/*     */     //   224: aload #5
/*     */     //   226: checkcast java/lang/CharSequence
/*     */     //   229: invokeinterface length : ()I
/*     */     //   234: nop
/*     */     //   235: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   238: checkcast java/lang/Comparable
/*     */     //   241: astore_3
/*     */     //   242: aload_2
/*     */     //   243: invokeinterface hasNext : ()Z
/*     */     //   248: ifeq -> 384
/*     */     //   251: aload_2
/*     */     //   252: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   257: checkcast java/lang/String
/*     */     //   260: astore #4
/*     */     //   262: iconst_0
/*     */     //   263: istore #5
/*     */     //   265: aload #4
/*     */     //   267: astore #6
/*     */     //   269: iconst_0
/*     */     //   270: istore #7
/*     */     //   272: iconst_0
/*     */     //   273: istore #8
/*     */     //   275: aload #6
/*     */     //   277: invokevirtual length : ()I
/*     */     //   280: istore #9
/*     */     //   282: iload #8
/*     */     //   284: iload #9
/*     */     //   286: if_icmpge -> 348
/*     */     //   289: aload #6
/*     */     //   291: iload #8
/*     */     //   293: invokevirtual charAt : (I)C
/*     */     //   296: istore #10
/*     */     //   298: iconst_0
/*     */     //   299: istore #11
/*     */     //   301: iload #10
/*     */     //   303: bipush #32
/*     */     //   305: if_icmpne -> 312
/*     */     //   308: iconst_1
/*     */     //   309: goto -> 313
/*     */     //   312: iconst_0
/*     */     //   313: ifne -> 342
/*     */     //   316: aload #6
/*     */     //   318: astore #10
/*     */     //   320: iconst_0
/*     */     //   321: istore #11
/*     */     //   323: aload #10
/*     */     //   325: iload #11
/*     */     //   327: iload #8
/*     */     //   329: invokevirtual substring : (II)Ljava/lang/String;
/*     */     //   332: dup
/*     */     //   333: ldc_w 'substring(...)'
/*     */     //   336: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   339: goto -> 350
/*     */     //   342: iinc #8, 1
/*     */     //   345: goto -> 282
/*     */     //   348: aload #6
/*     */     //   350: checkcast java/lang/CharSequence
/*     */     //   353: invokeinterface length : ()I
/*     */     //   358: nop
/*     */     //   359: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   362: checkcast java/lang/Comparable
/*     */     //   365: astore #4
/*     */     //   367: aload_3
/*     */     //   368: aload #4
/*     */     //   370: invokeinterface compareTo : (Ljava/lang/Object;)I
/*     */     //   375: ifle -> 242
/*     */     //   378: aload #4
/*     */     //   380: astore_3
/*     */     //   381: goto -> 242
/*     */     //   384: aload_3
/*     */     //   385: checkcast java/lang/Integer
/*     */     //   388: dup
/*     */     //   389: ifnull -> 398
/*     */     //   392: invokevirtual intValue : ()I
/*     */     //   395: goto -> 400
/*     */     //   398: pop
/*     */     //   399: iconst_0
/*     */     //   400: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #688	-> 0
/*     */     //   #689	-> 11
/*     */     //   #877	-> 14
/*     */     //   #878	-> 31
/*     */     //   #689	-> 68
/*     */     //   #689	-> 84
/*     */     //   #878	-> 85
/*     */     //   #879	-> 101
/*     */     //   #877	-> 106
/*     */     //   #689	-> 107
/*     */     //   #800	-> 139
/*     */     //   #689	-> 142
/*     */     //   #880	-> 148
/*     */     //   #881	-> 165
/*     */     //   #689	-> 177
/*     */     //   #881	-> 189
/*     */     //   #882	-> 192
/*     */     //   #882	-> 215
/*     */     //   #880	-> 218
/*     */     //   #884	-> 224
/*     */     //   #689	-> 229
/*     */     //   #689	-> 234
/*     */     //   #689	-> 238
/*     */     //   #800	-> 262
/*     */     //   #689	-> 265
/*     */     //   #880	-> 272
/*     */     //   #881	-> 289
/*     */     //   #689	-> 301
/*     */     //   #881	-> 313
/*     */     //   #882	-> 316
/*     */     //   #882	-> 339
/*     */     //   #880	-> 342
/*     */     //   #884	-> 348
/*     */     //   #689	-> 353
/*     */     //   #689	-> 358
/*     */     //   #689	-> 362
/*     */     //   #689	-> 385
/*     */     //   #688	-> 388
/*     */     //   #689	-> 399
/*     */     //   #688	-> 400
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   68	17	9	$i$a$-filter-EditSearchReplaceKt$findMinimumIndent$1	I
/*     */     //   65	20	8	it	Ljava/lang/String;
/*     */     //   58	40	7	element$iv$iv	Ljava/lang/Object;
/*     */     //   31	72	5	$i$f$filterTo	I
/*     */     //   28	75	3	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   28	75	4	destination$iv$iv	Ljava/util/Collection;
/*     */     //   14	93	2	$i$f$filter	I
/*     */     //   12	95	1	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   177	12	10	$i$a$-takeWhile-EditSearchReplaceKt$findMinimumIndent$2$1	I
/*     */     //   174	15	9	char	C
/*     */     //   151	73	7	index$iv	I
/*     */     //   148	78	6	$i$f$takeWhile	I
/*     */     //   145	81	5	$this$takeWhile$iv	Ljava/lang/String;
/*     */     //   142	93	4	$i$a$-minOfOrNull-EditSearchReplaceKt$findMinimumIndent$2	I
/*     */     //   139	96	3	it	Ljava/lang/String;
/*     */     //   301	12	11	$i$a$-takeWhile-EditSearchReplaceKt$findMinimumIndent$2$1	I
/*     */     //   298	15	10	char	C
/*     */     //   275	73	8	index$iv	I
/*     */     //   272	78	7	$i$f$takeWhile	I
/*     */     //   269	81	6	$this$takeWhile$iv	Ljava/lang/String;
/*     */     //   265	94	5	$i$a$-minOfOrNull-EditSearchReplaceKt$findMinimumIndent$2	I
/*     */     //   262	97	4	it	Ljava/lang/String;
/*     */     //   0	401	0	text	Ljava/lang/String;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Integer findMostSimilarStartIdx(List wholeLines, List partLines, int similarityThreshold) {
/* 697 */     int numPartLines = partLines.size();
/* 698 */     String partLinesString = CollectionsKt.joinToString$default(partLines, "\n", null, null, 0, null, null, 62, null);
/* 699 */     Integer maxSimilarity = null;
/* 700 */     Integer maxSimilarityIdx = null;
/* 701 */     for (int i = 0, j = wholeLines.size() - numPartLines + 1; i < j; i++) {
/* 702 */       int sim = LevenshteinDistance.INSTANCE.ratio(CollectionsKt.joinToString$default(wholeLines.subList(i, i + numPartLines), "\n", null, null, 0, null, null, 62, null), partLinesString);
/* 703 */       if (maxSimilarity == null || maxSimilarity.intValue() < sim) {
/* 704 */         maxSimilarity = Integer.valueOf(sim);
/* 705 */         maxSimilarityIdx = Integer.valueOf(i);
/*     */       } 
/*     */     } 
/* 708 */     if (maxSimilarity != null && maxSimilarity.intValue() > similarityThreshold) {
/* 709 */       Intrinsics.checkNotNull(maxSimilarityIdx); return maxSimilarityIdx;
/*     */     } 
/* 711 */     return null;
/*     */   }
/*     */   @Nullable
/*     */   public static final String removeStartingEmptyLine(@Nullable String content) {
/* 715 */     CharSequence charSequence = content; Regex regex = new Regex("^\\n"); String str = ""; return (content != null) ? regex.replaceFirst(charSequence, str) : null;
/*     */   }
/*     */   @NotNull
/*     */   public static final List<Edit> findOriginalUpdateBlocksXML(@NotNull String content, @Nullable String overwriteFilenameBy) {
/* 719 */     Intrinsics.checkNotNullParameter(content, "content"); List<Edit> results = new ArrayList();
/* 720 */     String contentCopy = StringsKt.endsWith$default(content, "\n", false, 2, null) ? content : (content + "\n");
/* 721 */     StringBuilder allErrors = new StringBuilder();
/*     */ 
/*     */ 
/*     */     
/* 725 */     RegexOption[] arrayOfRegexOption = new RegexOption[2]; arrayOfRegexOption[0] = RegexOption.MULTILINE; arrayOfRegexOption[1] = RegexOption.DOT_MATCHES_ALL; Regex editsRegex = new Regex("<EDIT(\\d{0,2})>(.*?)</EDIT\\1>", SetsKt.setOf((Object[])arrayOfRegexOption));
/*     */     
/* 727 */     List editsMatches = SequencesKt.toList(Regex.findAll$default(editsRegex, contentCopy, 0, 2, null));
/*     */     
/* 729 */     if (editsMatches.isEmpty()) {
/* 730 */       Intrinsics.checkNotNullExpressionValue(allErrors.append("ERROR: Did not find any *SEARCH/REPLACE* block within the `<EDIT>` tag."), "append(...)"); Intrinsics.checkNotNullExpressionValue(allErrors.append("ERROR: Did not find any *SEARCH/REPLACE* block within the `<EDIT>` tag.").append('\n'), "append(...)"); allErrors.append("ERROR: Did not find any *SEARCH/REPLACE* block within the `<EDIT>` tag.").append('\n');
/*     */     } 
/* 732 */     for (MatchResult edit : editsMatches) {
/* 733 */       if (edit.getGroups().get(2) == null || edit.getGroups().get(2).getValue() == null) edit.getGroups().get(2).getValue();  String editContent = "";
/* 734 */       if ((((CharSequence)StringsKt.trim(editContent).toString()).length() > 0)) {
/* 735 */         String currentFileName = overwriteFilenameBy;
/* 736 */         if (overwriteFilenameBy == null) {
/* 737 */           String fileName = ExtractorUtilsKt.getTextByXMLTag(editContent, "FILE_PATH");
/* 738 */           currentFileName = fileName;
/*     */         } else {
/* 740 */           currentFileName = overwriteFilenameBy;
/*     */         } 
/*     */         
/* 743 */         String searchPart = removeStartingEmptyLine(ExtractorUtilsKt.getTextByXMLTagNoTrim(editContent, "SEARCH"));
/* 744 */         String replacePart = removeStartingEmptyLine(ExtractorUtilsKt.getTextByXMLTagNoTrim(editContent, "REPLACE"));
/*     */         
/* 746 */         Intrinsics.checkNotNullExpressionValue(allErrors.append("ERROR: Missing or empty filename."), "append(...)"); Intrinsics.checkNotNullExpressionValue(allErrors.append("ERROR: Missing or empty filename.").append('\n'), "append(...)");
/*     */         
/* 748 */         Intrinsics.checkNotNullExpressionValue(allErrors.append("ERROR: Missing `<SEARCH>` section."), "append(...)"); Intrinsics.checkNotNullExpressionValue(allErrors.append("ERROR: Missing `<SEARCH>` section.").append('\n'), "append(...)");
/*     */         
/* 750 */         Intrinsics.checkNotNullExpressionValue(allErrors.append("ERROR: Missing `<REPLACE>` section."), "append(...)"); Intrinsics.checkNotNullExpressionValue(allErrors.append("ERROR: Missing `<REPLACE>` section.").append('\n'), "append(...)"); ((((CharSequence)currentFileName).length() == 0)) ? allErrors.append("ERROR: Missing or empty filename.").append('\n') : ((searchPart == null) ? allErrors.append("ERROR: Missing `<SEARCH>` section.").append('\n') : ((replacePart == null) ? allErrors.append("ERROR: Missing `<REPLACE>` section.").append('\n') : 
/*     */           
/* 752 */           Boolean.valueOf(results.add(new Edit(currentFileName, searchPart, replacePart)))));
/*     */       } 
/*     */     } 
/*     */     
/* 756 */     if (results.isEmpty()) {
/* 757 */       throw new IllegalStateException(allErrors.toString());
/*     */     }
/* 759 */     Set<Pair> sourcesSet = new LinkedHashSet();
/* 760 */     List<Edit> resultWithUniqueSources = new ArrayList();
/* 761 */     for (Edit edit : results) {
/* 762 */       if (sourcesSet.add(new Pair(edit.getFileName(), edit.getOriginalText()))) {
/* 763 */         resultWithUniqueSources.add(edit);
/*     */       }
/*     */     } 
/* 766 */     return resultWithUniqueSources;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final ComputeDifferencesOutput computeDifferences(@NotNull String originalContent, @NotNull String updatedContent) {
/* 777 */     Intrinsics.checkNotNullParameter(originalContent, "originalContent"); Intrinsics.checkNotNullParameter(updatedContent, "updatedContent"); Intrinsics.checkNotNullExpressionValue(ComparisonManager.getInstance(), "getInstance(...)"); ComparisonManager comparisonManager = ComparisonManager.getInstance();
/*     */     
/* 779 */     Intrinsics.checkNotNullExpressionValue(comparisonManager.compareLines(originalContent, updatedContent, ComparisonPolicy.DEFAULT, (ProgressIndicator)new EmptyProgressIndicator()), "compareLines(...)"); List<LineFragment> changes = comparisonManager.compareLines(originalContent, updatedContent, ComparisonPolicy.DEFAULT, (ProgressIndicator)new EmptyProgressIndicator());
/*     */     
/* 781 */     Iterator<LineFragment> iterator = changes.iterator(); LineFragment lineFragment3 = iterator.next();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 800 */     int $i$a$-minOfOrNull-EditSearchReplaceKt$computeDifferences$1 = 0; Integer integer4; for (integer4 = Integer.valueOf(lineFragment3.getStartLine1()); iterator.hasNext(); ) { LineFragment lineFragment = iterator.next(); int i = 0; Integer integer = Integer.valueOf(lineFragment.getStartLine1()); if (integer4.compareTo(integer) > 0) integer4 = integer;  }  List<LineFragment> list1 = changes; Integer integer5 = !iterator.hasNext() ? null : integer4; iterator = list1.iterator(); LineFragment lineFragment2 = iterator.next(); int $i$a$-maxOfOrNull-EditSearchReplaceKt$computeDifferences$2 = 0; Integer integer3; for (integer3 = Integer.valueOf(lineFragment2.getEndLine1()); iterator.hasNext(); ) { LineFragment lineFragment = iterator.next(); int i = 0; Integer integer = Integer.valueOf(lineFragment.getEndLine1()); if (integer3.compareTo(integer) < 0) integer3 = integer;  }  list1 = changes; Integer integer6 = !iterator.hasNext() ? null : integer3; integer5 = integer5; iterator = list1.iterator(); LineFragment lineFragment1 = iterator.next(); int $i$a$-minOfOrNull-EditSearchReplaceKt$computeDifferences$3 = 0; Integer integer2; for (integer2 = Integer.valueOf(lineFragment1.getStartLine2()); iterator.hasNext(); ) { LineFragment lineFragment = iterator.next(); int i = 0; Integer integer = Integer.valueOf(lineFragment.getStartLine2()); if (integer2.compareTo(integer) > 0) integer2 = integer;  }  Integer integer7 = !iterator.hasNext() ? null : integer2; list1 = changes; integer7 = integer7; integer6 = integer6; integer5 = integer5; iterator = list1.iterator(); LineFragment it = iterator.next(); int $i$a$-maxOfOrNull-EditSearchReplaceKt$computeDifferences$4 = 0; Integer integer1; for (integer1 = Integer.valueOf(it.getEndLine2()); iterator.hasNext(); ) { LineFragment lineFragment = iterator.next(); int i = 0;
/*     */       Integer integer = Integer.valueOf(lineFragment.getEndLine2());
/*     */       if (integer1.compareTo(integer) < 0)
/*     */         integer1 = integer;  }
/*     */     
/*     */     Integer integer8 = !iterator.hasNext() ? null : integer1;
/*     */     Integer integer9 = integer8, integer10 = integer7, integer11 = integer6, integer12 = integer5;
/*     */     return new ComputeDifferencesOutput(integer12, integer11, integer10, integer9);
/*     */   }
/*     */   
/*     */   public static final int constraintLine(@NotNull Document document, int startLine, int minWindow) {
/*     */     Intrinsics.checkNotNullParameter(document, "document");
/*     */     int startLowConstrained = Math.max(startLine, 1);
/*     */     int startHighConstrained = Math.min(startLowConstrained, Math.max(1, document.getLineCount() - minWindow));
/*     */     return startHighConstrained;
/*     */   }
/*     */   
/*     */   public static final boolean checkWrongQuotes(@NotNull String arguments) {
/*     */     Intrinsics.checkNotNullParameter(arguments, "arguments");
/*     */     if (StringsKt.isBlank(arguments))
/*     */       return false; 
/*     */     Regex pattern = new Regex("\"<EDIT|EDIT\\d*>\"|<SEARCH>\\s*```");
/*     */     return pattern.containsMatchIn(arguments);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\EditSearchReplaceKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */