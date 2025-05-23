/*     */ package com.intellij.ml.llm.matterhorn.ej.core.history_processors;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.TrajectoryElementAgent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentObservation;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.ExtractorUtilsKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.PreviousTasksInfo;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatElement;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatKt;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessageKind;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.fileEditor.FileDocumentManager;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.collections.SetsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.sequences.Sequence;
/*     */ import kotlin.sequences.SequencesKt;
/*     */ import kotlin.text.MatchResult;
/*     */ import kotlin.text.Regex;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.json.JsonBuilder;
/*     */ import kotlinx.serialization.json.JsonKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000j\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\b\n\000\n\002\020\013\n\002\b\003\n\002\020$\n\002\b\020\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\002\b\006\b\026\030\000 62\016\022\004\022\0020\002\022\004\022\0020\0030\001:\0016B\007¢\006\004\b\004\020\005J$\020\006\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\0022\006\020\n\032\0020\013H@¢\006\002\020\fJ$\020\r\032\b\022\004\022\0020\0030\0162\006\020\t\032\0020\0022\006\020\n\032\0020\013H@¢\006\002\020\fJD\020\017\032\004\030\0010\0202\006\020\n\032\0020\0212\006\020\022\032\0020\0202\030\020\023\032\024\022\020\022\016\022\004\022\0020\025\022\004\022\0020\0250\0240\0072\b\b\002\020\026\032\0020\027H@¢\006\002\020\030JZ\020\031\032\004\030\0010\b2\006\020\n\032\0020\0212$\020\032\032 \022\004\022\0020\020\022\026\022\024\022\020\022\016\022\004\022\0020\025\022\004\022\0020\0250\0240\0070\0332\f\020\034\032\b\022\004\022\0020\0200\0072\f\020\035\032\b\022\004\022\0020\0200\007H@¢\006\002\020\036J\036\020\037\032\004\030\0010\b2\b\020 \032\004\030\0010\0202\b\020!\032\004\030\0010\020H\002JB\020\"\032\004\030\0010\b2\f\020#\032\b\022\004\022\0020\b0\0072\f\020$\032\b\022\004\022\0020\b0\0072\f\020%\032\b\022\004\022\0020\b0\0072\006\020\n\032\0020\013H@¢\006\002\020&J\032\020'\032\004\030\0010\b2\006\020(\032\0020\0022\006\020\n\032\0020\013H\026J \020)\032\004\030\0010\b2\006\020\t\032\0020\0022\f\020*\032\b\022\004\022\0020\b0\007H\002J\030\020+\032\0020,2\006\020-\032\0020\0202\006\020.\032\0020/H\002J>\0200\032\002012\006\020\n\032\0020\0132\006\020-\032\0020\0202\006\020.\032\0020/2\006\0202\032\0020\0202\006\0203\032\0020\0202\006\0204\032\0020\020H@¢\006\002\0205¨\0067"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;", "Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessorResponse;", "<init>", "()V", "processObservations", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;", "input", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "printOneFile", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "filePath", "codeRanges", "Lkotlin/Pair;", "", "fileWasEdited", "", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "printAllCode", "shownCode", "", "createdFiles", "editedFiles", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processOtherMessagesOutput", "output1", "output2", "processOtherMessages", "observationsForSummary", "lastObservationsForSummary", "otherMessagesProcessed", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectChanges", "state", "processPrevTasks", "lastObservations", "getTrajectoryElementAgentForCompressHistory", "Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;", "agentType", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "logCompressHistoryTrajectories", "", "systemMessage", "prompt", "response", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nCompressHistoryProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompressHistoryProcessor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 6 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,567:1\n774#2:568\n865#2,2:569\n774#2:571\n865#2,2:572\n774#2:574\n865#2,2:575\n774#2:577\n865#2,2:578\n774#2:580\n865#2,2:581\n774#2:583\n865#2,2:584\n1567#2:586\n1598#2,4:587\n1557#2:591\n1628#2,3:592\n1053#2:595\n1863#2,2:617\n1611#2,9:619\n1863#2:628\n1864#2:630\n1620#2:631\n295#2,2:632\n543#2,6:634\n1#3:596\n1#3:614\n1#3:629\n487#4,7:597\n136#5,9:604\n216#5:613\n217#5:615\n145#5:616\n205#6:640\n*S KotlinDebug\n*F\n+ 1 CompressHistoryProcessor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor\n*L\n184#1:568\n184#1:569,2\n190#1:571\n190#1:572,2\n200#1:574\n200#1:575,2\n206#1:577\n206#1:578,2\n210#1:580\n210#1:581,2\n214#1:583\n214#1:584,2\n222#1:586\n222#1:587,4\n296#1:591\n296#1:592,3\n304#1:595\n410#1:617,2\n483#1:619,9\n483#1:628\n483#1:630\n483#1:631\n497#1:632,2\n502#1:634,6\n370#1:614\n483#1:629\n369#1:597,7\n370#1:604,9\n370#1:613\n370#1:615\n370#1:616\n548#1:640\n*E\n"})
/*     */ public class CompressHistoryProcessor
/*     */   implements ArtifactRequestExecutor<AgentState, CompressHistoryProcessorResponse>
/*     */ {
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\002\b\002\n\002\020\016\n\002\b\013\n\002\030\002\n\000\n\002\020 \n\002\b\003\n\002\020$\n\000\n\002\020\"\n\000\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\022\032\004\030\0010\b2\006\020\023\032\0020\024J\032\020\025\032\b\022\004\022\0020\b0\0262\f\020\027\032\b\022\004\022\0020\0240\026J\032\020\030\032\b\022\004\022\0020\b0\0262\f\020\027\032\b\022\004\022\0020\0240\026J0\020\031\032\016\022\004\022\0020\b\022\004\022\0020\b0\0322\f\020\027\032\b\022\004\022\0020\0240\0262\016\b\002\020\033\032\b\022\004\022\0020\b0\034J\020\020\037\032\0020\0362\006\020\023\032\0020\024H\002R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\bXT¢\006\002\n\000R\016\020\t\032\0020\bXT¢\006\002\n\000R\016\020\n\032\0020\bXT¢\006\002\n\000R\016\020\013\032\0020\bXT¢\006\002\n\000R\016\020\f\032\0020\bXT¢\006\002\n\000R\016\020\r\032\0020\bXT¢\006\002\n\000R\016\020\016\032\0020\bXT¢\006\002\n\000R\016\020\017\032\0020\bXT¢\006\002\n\000R\016\020\020\032\0020\bXT¢\006\002\n\000R\016\020\021\032\0020\bXT¢\006\002\n\000R\032\020\035\032\016\022\004\022\0020\b\022\004\022\0020\0360\032X\004¢\006\002\n\000¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;", "", "<init>", "()V", "MERGE_CODE_THRESHOLD", "", "NUM_MESSAGES_TO_SHOW", "HISTORY_PROCESSOR_PREFIX", "", "PROCESSED_SHOWN_CODE", "PROCESSED_CREATED_CODE", "PROCESSED_START", "PROCESSED_CHANGES", "PROCESSED_ISSUES", "PROCESSED_OTHER", "PROCESSOR_INITIAL_MESSAGE", "PROCESSOR_RESET_PLAN", "PROCESSOR_CREATED_CODE_MESSAGE", "extractCommand", "message", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;", "extractCreatedFilePaths", "", "messages", "extractEditedFilePaths", "extractProcessedOther", "", "newProcessedCommands", "", "actionToGroup", "Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;", "getActionGroup", "ej-core"})
/*     */   @SourceDebugExtension({"SMAP\nCompressHistoryProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompressHistoryProcessor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,567:1\n774#2:568\n865#2,2:569\n1381#2:571\n1469#2,5:572\n774#2:577\n865#2,2:578\n1381#2:580\n1469#2,5:581\n774#2:586\n865#2,2:587\n1863#2:589\n1557#2:590\n1628#2,3:591\n774#2:594\n865#2,2:595\n1863#2,2:597\n1864#2:599\n1#3:600\n*S KotlinDebug\n*F\n+ 1 CompressHistoryProcessor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion\n*L\n88#1:568\n88#1:569,2\n93#1:571\n93#1:572,5\n102#1:577\n102#1:578,2\n103#1:580\n103#1:581,5\n115#1:586\n115#1:587,2\n116#1:589\n118#1:590\n118#1:591,3\n119#1:594\n119#1:595,2\n120#1:597,2\n116#1:599\n*E\n"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */     
/*     */     @Nullable
/*     */     public final String extractCommand(@NotNull AgentObservation message) {
/*  80 */       Intrinsics.checkNotNullParameter(message, "message"); if (message.getElement().getKind() != MatterhornChatMessageKind.Assistant) return null; 
/*  81 */       String command = ExtractorUtilsKt.getTextByXMLTag(message.getElement().getContent(), "COMMAND");
/*  82 */       return StringsKt.isBlank(command) ? null : command;
/*     */     }
/*     */     
/*     */     @NotNull
/*  86 */     public final List<String> extractCreatedFilePaths(@NotNull List messages) { Intrinsics.checkNotNullParameter(messages, "messages"); Regex filePathRegex = new Regex("\\[File: ([^(]+).*");
/*  87 */       List list1 = messages;
/*  88 */       int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 568 */       List list2 = list1; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 569 */       for (Object element$iv$iv : list2) { AgentObservation it = (AgentObservation)element$iv$iv; int $i$a$-filter-CompressHistoryProcessor$Companion$extractCreatedFilePaths$1 = 0; if ((StringsKt.contains$default(it.getElement().getContent(), "File created.", false, 2, null) || StringsKt.contains$default(it.getElement().getContent(), "During the current session, you have created the following code:", false, 2, null))) collection.add(element$iv$iv);  }
/* 570 */        Iterable $this$filter$iv = collection; int $i$f$flatMapSequence = 0;
/* 571 */       Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapSequenceTo = 0;
/* 572 */       for (Object element$iv$iv : $this$filterTo$iv$iv) {
/* 573 */         AgentObservation message = (AgentObservation)element$iv$iv; int $i$a$-flatMapSequence-CompressHistoryProcessor$Companion$extractCreatedFilePaths$2 = 0; Sequence list$iv$iv = SequencesKt.map(Regex.findAll$default(filePathRegex, message.getElement().getContent(), 0, 2, null), Companion::extractCreatedFilePaths$lambda$2$lambda$1);
/* 574 */         CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*     */       } 
/* 576 */       return CollectionsKt.distinct(destination$iv$iv); } private static final String extractCreatedFilePaths$lambda$2$lambda$1(MatchResult it) { Intrinsics.checkNotNullParameter(it, "it"); return StringsKt.trim(it.getGroupValues().get(1)).toString(); }
/* 577 */     @NotNull public final List<String> extractEditedFilePaths(@NotNull List messages) { Intrinsics.checkNotNullParameter(messages, "messages"); Regex filePathRegex = new Regex("\\[File: ([^(]+).*"); List list1 = messages; int $i$f$filter = 0; List list2 = list1; Collection<Object> collection = new ArrayList(); int $i$f$filterTo = 0;
/* 578 */       for (Object element$iv$iv : list2) { AgentObservation it = (AgentObservation)element$iv$iv; int $i$a$-filter-CompressHistoryProcessor$Companion$extractEditedFilePaths$1 = 0; if (StringsKt.contains$default(it.getElement().getContent(), "File updated.", false, 2, null)) collection.add(element$iv$iv);  }
/* 579 */        Iterable $this$filter$iv = collection; int $i$f$flatMapSequence = 0;
/* 580 */       Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapSequenceTo = 0;
/* 581 */       for (Object element$iv$iv : $this$filterTo$iv$iv) {
/* 582 */         AgentObservation message = (AgentObservation)element$iv$iv; int $i$a$-flatMapSequence-CompressHistoryProcessor$Companion$extractEditedFilePaths$2 = 0; Sequence list$iv$iv = SequencesKt.map(Regex.findAll$default(filePathRegex, message.getElement().getContent(), 0, 2, null), Companion::extractEditedFilePaths$lambda$5$lambda$4);
/* 583 */         CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*     */       } 
/* 585 */       return CollectionsKt.distinct(destination$iv$iv); } private static final String extractEditedFilePaths$lambda$5$lambda$4(MatchResult it) { Intrinsics.checkNotNullParameter(it, "it"); return StringsKt.trim(it.getGroupValues().get(1)).toString(); }
/* 586 */     @NotNull public final Map<String, String> extractProcessedOther(@NotNull List messages, @NotNull Set newProcessedCommands) { Intrinsics.checkNotNullParameter(messages, "messages"); Intrinsics.checkNotNullParameter(newProcessedCommands, "newProcessedCommands"); Map<Object, Object> result = new LinkedHashMap<>(); Iterable $this$filter$iv = messages; int $i$f$filter = 0; Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 587 */       for (Object element$iv$iv : iterable1) { AgentObservation it = (AgentObservation)element$iv$iv; int $i$a$-filter-CompressHistoryProcessor$Companion$extractProcessedOther$1 = 0; if (Intrinsics.areEqual(it.getAction(), "processed_other")) destination$iv$iv.add(element$iv$iv);  }
/* 588 */        $this$filter$iv = destination$iv$iv; int $i$f$forEach = 0;
/* 589 */       Iterator iterator = $this$filter$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); AgentObservation message = (AgentObservation)element$iv; int $i$a$-forEach-CompressHistoryProcessor$Companion$extractProcessedOther$2 = 0; List list1 = StringsKt.lines(message.getElement().getContent()); int $i$f$map = 0;
/* 590 */         List list2 = list1; Collection collection = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 591 */         Iterator iterator1 = list2.iterator(); }
/*     */       
/*     */       return (Map)result; }
/*     */ 
/*     */     
/*     */     private final ActionGroup getActionGroup(AgentObservation message) { if (message.getAction() != null) {
/*     */         Intrinsics.checkNotNullExpressionValue(message.getAction().toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*     */         if (message.getAction().toLowerCase(Locale.ROOT) != null) {
/*     */           String it = message.getAction().toLowerCase(Locale.ROOT);
/* 600 */           int $i$a$-let-CompressHistoryProcessor$Companion$getActionGroup$1 = 0;
/*     */           if ((ActionGroup)CompressHistoryProcessor.actionToGroup.get(it) == null) {
/*     */             (ActionGroup)CompressHistoryProcessor.actionToGroup.get(it);
/*     */             return ActionGroup.OTHER;
/*     */           } 
/*     */           return (ActionGroup)CompressHistoryProcessor.actionToGroup.get(it);
/*     */         } 
/*     */       } 
/*     */       (ActionGroup)CompressHistoryProcessor.actionToGroup.get(it);
/*     */       return ActionGroup.OTHER; } } @NotNull public static final Companion Companion = new Companion(null); private static final int MERGE_CODE_THRESHOLD = 20; private static final int NUM_MESSAGES_TO_SHOW = 4; @NotNull protected static final String HISTORY_PROCESSOR_PREFIX = "History processor:"; @NotNull private static final String PROCESSED_SHOWN_CODE = "processed_shown_code"; @NotNull private static final String PROCESSED_CREATED_CODE = "processed_created_code"; @NotNull private static final String PROCESSED_START = "processed_start"; @NotNull protected static final String PROCESSED_CHANGES = "processed_changes"; @NotNull public static final String PROCESSED_ISSUES = "processed_issues"; @NotNull public static final String PROCESSED_OTHER = "processed_other"; @Nullable public AgentObservation collectChanges(@NotNull AgentState state, @NotNull ExecutionContext context) { Intrinsics.checkNotNullParameter(state, "state");
/*     */     Intrinsics.checkNotNullParameter(context, "context");
/*     */     PreviousTasksInfo start = state.getIssue().getPreviousTasksInfo();
/*     */     int $i$a$-let-CompressHistoryProcessor$collectChanges$previousTasks$1 = 0;
/*     */     state.getIssue().getPreviousTasksInfo();
/*     */     if (((state.getIssue().getPreviousTasksInfo() != null) ? SequencesKt.toList(SequencesKt.generateSequence(start, CompressHistoryProcessor::collectChanges$lambda$16$lambda$15)) : null) == null)
/*     */       (state.getIssue().getPreviousTasksInfo() != null) ? SequencesKt.toList(SequencesKt.generateSequence(start, CompressHistoryProcessor::collectChanges$lambda$16$lambda$15)) : null; 
/*     */     List previousTasks = CollectionsKt.emptyList();
/*     */     Iterable $this$mapNotNull$iv = previousTasks;
/*     */     int $i$f$mapNotNull = 0;
/* 619 */     Iterable iterable1 = $this$mapNotNull$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 627 */     Iterable $this$forEach$iv$iv$iv = iterable1; int $i$f$forEach = 0;
/* 628 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; PreviousTasksInfo it = (PreviousTasksInfo)element$iv$iv;
/*     */       int $i$a$-mapNotNull-CompressHistoryProcessor$collectChanges$diff$1 = 0; }
/*     */     
/* 631 */     String diff = CollectionsKt.joinToString$default(CollectionsKt.reversed(destination$iv$iv), "\n\n", null, null, 0, null, null, 62, null); if (StringsKt.isBlank(diff)) return null;  String result = StringsKt.trimMargin$default("\n      |History processor: During the current session, you made the following changes in the project's codebase (displayed in git diff format):\n      |\n      |" + diff + "\n      ", null, 1, null); return new AgentObservation((MatterhornChatElement)MatterhornChatKt.toUserMessage(result), "processed_changes"); }
/*     */   @NotNull private static final String PROCESSOR_INITIAL_MESSAGE = "The current session included prior operations, but the history has been compressed to retain only the essential information and last messages.";
/*     */   @NotNull private static final String PROCESSOR_RESET_PLAN = "Create new plan for `<issue_description>`.";
/*     */   @NotNull public static final String PROCESSOR_CREATED_CODE_MESSAGE = "During the current session, you have created the following code:";
/*     */   @NotNull private static final Map<String, ActionGroup> actionToGroup;
/*     */   static { Pair[] arrayOfPair = new Pair[19]; arrayOfPair[0] = TuplesKt.to("open", ActionGroup.OPEN); arrayOfPair[1] = TuplesKt.to("open_entire_file", ActionGroup.OPEN); arrayOfPair[2] = TuplesKt.to("goto", ActionGroup.OPEN); arrayOfPair[3] = TuplesKt.to("scroll_down", ActionGroup.OPEN); arrayOfPair[4] = TuplesKt.to("scroll_up", ActionGroup.OPEN); arrayOfPair[5] = TuplesKt.to("get_file_structure", ActionGroup.OPEN); arrayOfPair[6] = TuplesKt.to("create", ActionGroup.CREATE); arrayOfPair[7] = TuplesKt.to("search_project", ActionGroup.SEARCH); arrayOfPair[8] = TuplesKt.to("search_replace", ActionGroup.EDIT); arrayOfPair[9] = TuplesKt.to("undo_edit", ActionGroup.EDIT); arrayOfPair[10] = TuplesKt.to("submit", ActionGroup.SUBMIT); arrayOfPair[11] = TuplesKt.to("answer", ActionGroup.ANSWER); arrayOfPair[12] = TuplesKt.to("call_expert", ActionGroup.EXPERT); arrayOfPair[13] = TuplesKt.to("processed_shown_code", ActionGroup.PROCESSED); arrayOfPair[14] = TuplesKt.to("processed_created_code", ActionGroup.PROCESSED); arrayOfPair[15] = TuplesKt.to("processed_start", ActionGroup.PROCESSED); arrayOfPair[16] = TuplesKt.to("processed_changes", ActionGroup.PROCESSED); arrayOfPair[17] = TuplesKt.to("processed_other", ActionGroup.PROCESSED); arrayOfPair[18] = TuplesKt.to("processed_issues", ActionGroup.PROCESSED); actionToGroup = MapsKt.mapOf(arrayOfPair); }
/*     */   private final Object processObservations(AgentState input, ExecutionContext context, Continuation $completion) { // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$processObservations$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$processObservations$1
/*     */     //   11: astore #36
/*     */     //   13: aload #36
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #36
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$processObservations$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #36
/*     */     //   50: aload #36
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #35
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #37
/*     */     //   62: aload #36
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 1943, 0 -> 100, 1 -> 622, 2 -> 1275, 3 -> 1765, 4 -> 1890
/*     */     //   100: aload #35
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: new java/util/ArrayList
/*     */     //   108: dup
/*     */     //   109: invokespecial <init> : ()V
/*     */     //   112: checkcast java/util/List
/*     */     //   115: astore #4
/*     */     //   117: getstatic com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$Companion;
/*     */     //   120: invokevirtual getTERMINAL_ACTIONS : ()Ljava/util/Set;
/*     */     //   123: checkcast java/lang/Iterable
/*     */     //   126: aload_1
/*     */     //   127: invokevirtual getObservations : ()Ljava/util/List;
/*     */     //   130: invokestatic lastOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   133: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   136: dup
/*     */     //   137: ifnull -> 146
/*     */     //   140: invokevirtual getAction : ()Ljava/lang/String;
/*     */     //   143: goto -> 148
/*     */     //   146: pop
/*     */     //   147: aconst_null
/*     */     //   148: invokestatic contains : (Ljava/lang/Iterable;Ljava/lang/Object;)Z
/*     */     //   151: ifeq -> 165
/*     */     //   154: aload_1
/*     */     //   155: invokevirtual getObservations : ()Ljava/util/List;
/*     */     //   158: iconst_2
/*     */     //   159: invokestatic takeLast : (Ljava/util/List;I)Ljava/util/List;
/*     */     //   162: goto -> 173
/*     */     //   165: aload_1
/*     */     //   166: invokevirtual getObservations : ()Ljava/util/List;
/*     */     //   169: iconst_4
/*     */     //   170: invokestatic takeLast : (Ljava/util/List;I)Ljava/util/List;
/*     */     //   173: astore #5
/*     */     //   175: aload_1
/*     */     //   176: invokevirtual getObservations : ()Ljava/util/List;
/*     */     //   179: aload #5
/*     */     //   181: invokeinterface size : ()I
/*     */     //   186: invokestatic dropLast : (Ljava/util/List;I)Ljava/util/List;
/*     */     //   189: astore #6
/*     */     //   191: aload #4
/*     */     //   193: new com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   196: dup
/*     */     //   197: ldc 'History processor: The current session included prior operations, but the history has been compressed to retain only the essential information and last messages.'
/*     */     //   199: invokestatic toUserMessage : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   202: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   205: ldc 'processed_start'
/*     */     //   207: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;Ljava/lang/String;)V
/*     */     //   210: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   215: pop
/*     */     //   216: aload #4
/*     */     //   218: aload_0
/*     */     //   219: aload_1
/*     */     //   220: aload #5
/*     */     //   222: invokespecial processPrevTasks : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Ljava/util/List;)Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   225: invokestatic addIfNotNull : (Ljava/util/List;Ljava/lang/Object;)V
/*     */     //   228: aload_2
/*     */     //   229: invokestatic getExecutionAgentContext : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   232: astore #7
/*     */     //   234: aload #7
/*     */     //   236: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   241: invokevirtual getShownCode : ()Ljava/util/Map;
/*     */     //   244: astore #8
/*     */     //   246: aload_1
/*     */     //   247: invokevirtual getObservations : ()Ljava/util/List;
/*     */     //   250: checkcast java/lang/Iterable
/*     */     //   253: astore #10
/*     */     //   255: iconst_0
/*     */     //   256: istore #11
/*     */     //   258: aload #10
/*     */     //   260: astore #12
/*     */     //   262: new java/util/ArrayList
/*     */     //   265: dup
/*     */     //   266: invokespecial <init> : ()V
/*     */     //   269: checkcast java/util/Collection
/*     */     //   272: astore #13
/*     */     //   274: iconst_0
/*     */     //   275: istore #14
/*     */     //   277: aload #12
/*     */     //   279: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   284: astore #15
/*     */     //   286: aload #15
/*     */     //   288: invokeinterface hasNext : ()Z
/*     */     //   293: ifeq -> 370
/*     */     //   296: aload #15
/*     */     //   298: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   303: astore #16
/*     */     //   305: aload #16
/*     */     //   307: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   310: astore #17
/*     */     //   312: iconst_0
/*     */     //   313: istore #18
/*     */     //   315: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;
/*     */     //   318: aload #17
/*     */     //   320: invokestatic access$getActionGroup : (Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;)Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   323: astore #19
/*     */     //   325: aload #19
/*     */     //   327: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup.EDIT : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   330: if_acmpne -> 353
/*     */     //   333: aload #17
/*     */     //   335: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   338: invokeinterface getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   343: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   346: if_acmpne -> 353
/*     */     //   349: iconst_1
/*     */     //   350: goto -> 354
/*     */     //   353: iconst_0
/*     */     //   354: ifeq -> 286
/*     */     //   357: aload #13
/*     */     //   359: aload #16
/*     */     //   361: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   366: pop
/*     */     //   367: goto -> 286
/*     */     //   370: aload #13
/*     */     //   372: checkcast java/util/List
/*     */     //   375: nop
/*     */     //   376: astore #9
/*     */     //   378: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;
/*     */     //   381: aload #9
/*     */     //   383: invokevirtual extractEditedFilePaths : (Ljava/util/List;)Ljava/util/List;
/*     */     //   386: astore #10
/*     */     //   388: aload_1
/*     */     //   389: invokevirtual getObservations : ()Ljava/util/List;
/*     */     //   392: checkcast java/lang/Iterable
/*     */     //   395: astore #12
/*     */     //   397: iconst_0
/*     */     //   398: istore #13
/*     */     //   400: aload #12
/*     */     //   402: astore #14
/*     */     //   404: new java/util/ArrayList
/*     */     //   407: dup
/*     */     //   408: invokespecial <init> : ()V
/*     */     //   411: checkcast java/util/Collection
/*     */     //   414: astore #15
/*     */     //   416: iconst_0
/*     */     //   417: istore #16
/*     */     //   419: aload #14
/*     */     //   421: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   426: astore #17
/*     */     //   428: aload #17
/*     */     //   430: invokeinterface hasNext : ()Z
/*     */     //   435: ifeq -> 525
/*     */     //   438: aload #17
/*     */     //   440: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   445: astore #18
/*     */     //   447: aload #18
/*     */     //   449: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   452: astore #19
/*     */     //   454: iconst_0
/*     */     //   455: istore #20
/*     */     //   457: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;
/*     */     //   460: aload #19
/*     */     //   462: invokestatic access$getActionGroup : (Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;)Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   465: astore #21
/*     */     //   467: aload #21
/*     */     //   469: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup.CREATE : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   472: if_acmpeq -> 488
/*     */     //   475: aload #19
/*     */     //   477: invokevirtual getAction : ()Ljava/lang/String;
/*     */     //   480: ldc 'processed_created_code'
/*     */     //   482: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   485: ifeq -> 508
/*     */     //   488: aload #19
/*     */     //   490: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   493: invokeinterface getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   498: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   501: if_acmpne -> 508
/*     */     //   504: iconst_1
/*     */     //   505: goto -> 509
/*     */     //   508: iconst_0
/*     */     //   509: ifeq -> 428
/*     */     //   512: aload #15
/*     */     //   514: aload #18
/*     */     //   516: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   521: pop
/*     */     //   522: goto -> 428
/*     */     //   525: aload #15
/*     */     //   527: checkcast java/util/List
/*     */     //   530: nop
/*     */     //   531: astore #11
/*     */     //   533: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;
/*     */     //   536: aload #11
/*     */     //   538: invokevirtual extractCreatedFilePaths : (Ljava/util/List;)Ljava/util/List;
/*     */     //   541: astore #12
/*     */     //   543: aload #4
/*     */     //   545: astore #34
/*     */     //   547: aload_0
/*     */     //   548: aload #7
/*     */     //   550: aload #8
/*     */     //   552: aload #12
/*     */     //   554: aload #10
/*     */     //   556: aload #36
/*     */     //   558: aload #36
/*     */     //   560: aload_0
/*     */     //   561: putfield L$0 : Ljava/lang/Object;
/*     */     //   564: aload #36
/*     */     //   566: aload_1
/*     */     //   567: putfield L$1 : Ljava/lang/Object;
/*     */     //   570: aload #36
/*     */     //   572: aload_2
/*     */     //   573: putfield L$2 : Ljava/lang/Object;
/*     */     //   576: aload #36
/*     */     //   578: aload #4
/*     */     //   580: putfield L$3 : Ljava/lang/Object;
/*     */     //   583: aload #36
/*     */     //   585: aload #5
/*     */     //   587: putfield L$4 : Ljava/lang/Object;
/*     */     //   590: aload #36
/*     */     //   592: aload #6
/*     */     //   594: putfield L$5 : Ljava/lang/Object;
/*     */     //   597: aload #36
/*     */     //   599: aload #34
/*     */     //   601: putfield L$6 : Ljava/lang/Object;
/*     */     //   604: aload #36
/*     */     //   606: iconst_1
/*     */     //   607: putfield label : I
/*     */     //   610: invokespecial printAllCode : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   613: dup
/*     */     //   614: aload #37
/*     */     //   616: if_acmpne -> 696
/*     */     //   619: aload #37
/*     */     //   621: areturn
/*     */     //   622: aload #36
/*     */     //   624: getfield L$6 : Ljava/lang/Object;
/*     */     //   627: checkcast java/util/List
/*     */     //   630: astore #34
/*     */     //   632: aload #36
/*     */     //   634: getfield L$5 : Ljava/lang/Object;
/*     */     //   637: checkcast java/util/List
/*     */     //   640: astore #6
/*     */     //   642: aload #36
/*     */     //   644: getfield L$4 : Ljava/lang/Object;
/*     */     //   647: checkcast java/util/List
/*     */     //   650: astore #5
/*     */     //   652: aload #36
/*     */     //   654: getfield L$3 : Ljava/lang/Object;
/*     */     //   657: checkcast java/util/List
/*     */     //   660: astore #4
/*     */     //   662: aload #36
/*     */     //   664: getfield L$2 : Ljava/lang/Object;
/*     */     //   667: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   670: astore_2
/*     */     //   671: aload #36
/*     */     //   673: getfield L$1 : Ljava/lang/Object;
/*     */     //   676: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentState
/*     */     //   679: astore_1
/*     */     //   680: aload #36
/*     */     //   682: getfield L$0 : Ljava/lang/Object;
/*     */     //   685: checkcast com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor
/*     */     //   688: astore_0
/*     */     //   689: aload #35
/*     */     //   691: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   694: aload #35
/*     */     //   696: aload #34
/*     */     //   698: swap
/*     */     //   699: invokestatic addIfNotNull : (Ljava/util/List;Ljava/lang/Object;)V
/*     */     //   702: aload #4
/*     */     //   704: aload_0
/*     */     //   705: aload_1
/*     */     //   706: aload_2
/*     */     //   707: invokevirtual collectChanges : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   710: invokestatic addIfNotNull : (Ljava/util/List;Ljava/lang/Object;)V
/*     */     //   713: aload #6
/*     */     //   715: checkcast java/lang/Iterable
/*     */     //   718: astore #14
/*     */     //   720: iconst_0
/*     */     //   721: istore #15
/*     */     //   723: aload #14
/*     */     //   725: astore #16
/*     */     //   727: new java/util/ArrayList
/*     */     //   730: dup
/*     */     //   731: invokespecial <init> : ()V
/*     */     //   734: checkcast java/util/Collection
/*     */     //   737: astore #17
/*     */     //   739: iconst_0
/*     */     //   740: istore #18
/*     */     //   742: aload #16
/*     */     //   744: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   749: astore #19
/*     */     //   751: aload #19
/*     */     //   753: invokeinterface hasNext : ()Z
/*     */     //   758: ifeq -> 835
/*     */     //   761: aload #19
/*     */     //   763: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   768: astore #20
/*     */     //   770: aload #20
/*     */     //   772: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   775: astore #21
/*     */     //   777: iconst_0
/*     */     //   778: istore #22
/*     */     //   780: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;
/*     */     //   783: aload #21
/*     */     //   785: invokestatic access$getActionGroup : (Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;)Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   788: astore #23
/*     */     //   790: aload #23
/*     */     //   792: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup.EXPERT : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   795: if_acmpne -> 818
/*     */     //   798: aload #21
/*     */     //   800: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   803: invokeinterface getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   808: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   811: if_acmpne -> 818
/*     */     //   814: iconst_1
/*     */     //   815: goto -> 819
/*     */     //   818: iconst_0
/*     */     //   819: ifeq -> 751
/*     */     //   822: aload #17
/*     */     //   824: aload #20
/*     */     //   826: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   831: pop
/*     */     //   832: goto -> 751
/*     */     //   835: aload #17
/*     */     //   837: checkcast java/util/List
/*     */     //   840: nop
/*     */     //   841: astore #13
/*     */     //   843: aload #4
/*     */     //   845: aload #13
/*     */     //   847: checkcast java/util/Collection
/*     */     //   850: invokeinterface addAll : (Ljava/util/Collection;)Z
/*     */     //   855: pop
/*     */     //   856: aload #5
/*     */     //   858: checkcast java/lang/Iterable
/*     */     //   861: astore #15
/*     */     //   863: iconst_0
/*     */     //   864: istore #16
/*     */     //   866: aload #15
/*     */     //   868: astore #17
/*     */     //   870: new java/util/ArrayList
/*     */     //   873: dup
/*     */     //   874: invokespecial <init> : ()V
/*     */     //   877: checkcast java/util/Collection
/*     */     //   880: astore #18
/*     */     //   882: iconst_0
/*     */     //   883: istore #19
/*     */     //   885: aload #17
/*     */     //   887: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   892: astore #20
/*     */     //   894: aload #20
/*     */     //   896: invokeinterface hasNext : ()Z
/*     */     //   901: ifeq -> 978
/*     */     //   904: aload #20
/*     */     //   906: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   911: astore #21
/*     */     //   913: aload #21
/*     */     //   915: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   918: astore #22
/*     */     //   920: iconst_0
/*     */     //   921: istore #23
/*     */     //   923: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;
/*     */     //   926: aload #22
/*     */     //   928: invokestatic access$getActionGroup : (Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;)Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   931: astore #24
/*     */     //   933: aload #24
/*     */     //   935: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup.OTHER : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   938: if_acmpne -> 961
/*     */     //   941: aload #22
/*     */     //   943: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   946: invokeinterface getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   951: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.Assistant : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   954: if_acmpne -> 961
/*     */     //   957: iconst_1
/*     */     //   958: goto -> 962
/*     */     //   961: iconst_0
/*     */     //   962: ifeq -> 894
/*     */     //   965: aload #18
/*     */     //   967: aload #21
/*     */     //   969: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   974: pop
/*     */     //   975: goto -> 894
/*     */     //   978: aload #18
/*     */     //   980: checkcast java/util/List
/*     */     //   983: nop
/*     */     //   984: astore #14
/*     */     //   986: aload #6
/*     */     //   988: checkcast java/lang/Iterable
/*     */     //   991: astore #16
/*     */     //   993: iconst_0
/*     */     //   994: istore #17
/*     */     //   996: aload #16
/*     */     //   998: astore #18
/*     */     //   1000: new java/util/ArrayList
/*     */     //   1003: dup
/*     */     //   1004: invokespecial <init> : ()V
/*     */     //   1007: checkcast java/util/Collection
/*     */     //   1010: astore #19
/*     */     //   1012: iconst_0
/*     */     //   1013: istore #20
/*     */     //   1015: aload #18
/*     */     //   1017: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1022: astore #21
/*     */     //   1024: aload #21
/*     */     //   1026: invokeinterface hasNext : ()Z
/*     */     //   1031: ifeq -> 1092
/*     */     //   1034: aload #21
/*     */     //   1036: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1041: astore #22
/*     */     //   1043: aload #22
/*     */     //   1045: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   1048: astore #23
/*     */     //   1050: iconst_0
/*     */     //   1051: istore #24
/*     */     //   1053: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;
/*     */     //   1056: aload #23
/*     */     //   1058: invokestatic access$getActionGroup : (Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;)Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   1061: astore #25
/*     */     //   1063: aload #25
/*     */     //   1065: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup.OTHER : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   1068: if_acmpne -> 1075
/*     */     //   1071: iconst_1
/*     */     //   1072: goto -> 1076
/*     */     //   1075: iconst_0
/*     */     //   1076: ifeq -> 1024
/*     */     //   1079: aload #19
/*     */     //   1081: aload #22
/*     */     //   1083: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1088: pop
/*     */     //   1089: goto -> 1024
/*     */     //   1092: aload #19
/*     */     //   1094: checkcast java/util/List
/*     */     //   1097: nop
/*     */     //   1098: astore #15
/*     */     //   1100: aload_1
/*     */     //   1101: invokevirtual getObservations : ()Ljava/util/List;
/*     */     //   1104: checkcast java/lang/Iterable
/*     */     //   1107: astore #17
/*     */     //   1109: iconst_0
/*     */     //   1110: istore #18
/*     */     //   1112: aload #17
/*     */     //   1114: astore #19
/*     */     //   1116: new java/util/ArrayList
/*     */     //   1119: dup
/*     */     //   1120: invokespecial <init> : ()V
/*     */     //   1123: checkcast java/util/Collection
/*     */     //   1126: astore #20
/*     */     //   1128: iconst_0
/*     */     //   1129: istore #21
/*     */     //   1131: aload #19
/*     */     //   1133: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1138: astore #22
/*     */     //   1140: aload #22
/*     */     //   1142: invokeinterface hasNext : ()Z
/*     */     //   1147: ifeq -> 1195
/*     */     //   1150: aload #22
/*     */     //   1152: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1157: astore #23
/*     */     //   1159: aload #23
/*     */     //   1161: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   1164: astore #24
/*     */     //   1166: iconst_0
/*     */     //   1167: istore #25
/*     */     //   1169: aload #24
/*     */     //   1171: invokevirtual getAction : ()Ljava/lang/String;
/*     */     //   1174: ldc 'processed_other'
/*     */     //   1176: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1179: ifeq -> 1140
/*     */     //   1182: aload #20
/*     */     //   1184: aload #23
/*     */     //   1186: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1191: pop
/*     */     //   1192: goto -> 1140
/*     */     //   1195: aload #20
/*     */     //   1197: checkcast java/util/List
/*     */     //   1200: nop
/*     */     //   1201: astore #16
/*     */     //   1203: aload_0
/*     */     //   1204: aload #15
/*     */     //   1206: aload #14
/*     */     //   1208: aload #16
/*     */     //   1210: aload_2
/*     */     //   1211: aload #36
/*     */     //   1213: aload #36
/*     */     //   1215: aload_2
/*     */     //   1216: putfield L$0 : Ljava/lang/Object;
/*     */     //   1219: aload #36
/*     */     //   1221: aload #4
/*     */     //   1223: putfield L$1 : Ljava/lang/Object;
/*     */     //   1226: aload #36
/*     */     //   1228: aload #5
/*     */     //   1230: putfield L$2 : Ljava/lang/Object;
/*     */     //   1233: aload #36
/*     */     //   1235: aconst_null
/*     */     //   1236: putfield L$3 : Ljava/lang/Object;
/*     */     //   1239: aload #36
/*     */     //   1241: aconst_null
/*     */     //   1242: putfield L$4 : Ljava/lang/Object;
/*     */     //   1245: aload #36
/*     */     //   1247: aconst_null
/*     */     //   1248: putfield L$5 : Ljava/lang/Object;
/*     */     //   1251: aload #36
/*     */     //   1253: aconst_null
/*     */     //   1254: putfield L$6 : Ljava/lang/Object;
/*     */     //   1257: aload #36
/*     */     //   1259: iconst_2
/*     */     //   1260: putfield label : I
/*     */     //   1263: invokespecial processOtherMessages : (Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1266: dup
/*     */     //   1267: aload #37
/*     */     //   1269: if_acmpne -> 1311
/*     */     //   1272: aload #37
/*     */     //   1274: areturn
/*     */     //   1275: aload #36
/*     */     //   1277: getfield L$2 : Ljava/lang/Object;
/*     */     //   1280: checkcast java/util/List
/*     */     //   1283: astore #5
/*     */     //   1285: aload #36
/*     */     //   1287: getfield L$1 : Ljava/lang/Object;
/*     */     //   1290: checkcast java/util/List
/*     */     //   1293: astore #4
/*     */     //   1295: aload #36
/*     */     //   1297: getfield L$0 : Ljava/lang/Object;
/*     */     //   1300: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1303: astore_2
/*     */     //   1304: aload #35
/*     */     //   1306: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1309: aload #35
/*     */     //   1311: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   1314: astore #17
/*     */     //   1316: aload #4
/*     */     //   1318: aload #17
/*     */     //   1320: invokestatic addIfNotNull : (Ljava/util/List;Ljava/lang/Object;)V
/*     */     //   1323: aload #5
/*     */     //   1325: checkcast java/lang/Iterable
/*     */     //   1328: astore #19
/*     */     //   1330: iconst_0
/*     */     //   1331: istore #20
/*     */     //   1333: aload #19
/*     */     //   1335: astore #21
/*     */     //   1337: new java/util/ArrayList
/*     */     //   1340: dup
/*     */     //   1341: aload #19
/*     */     //   1343: bipush #10
/*     */     //   1345: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   1348: invokespecial <init> : (I)V
/*     */     //   1351: checkcast java/util/Collection
/*     */     //   1354: astore #22
/*     */     //   1356: iconst_0
/*     */     //   1357: istore #23
/*     */     //   1359: iconst_0
/*     */     //   1360: istore #24
/*     */     //   1362: aload #21
/*     */     //   1364: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1369: astore #25
/*     */     //   1371: aload #25
/*     */     //   1373: invokeinterface hasNext : ()Z
/*     */     //   1378: ifeq -> 1529
/*     */     //   1381: aload #25
/*     */     //   1383: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1388: astore #26
/*     */     //   1390: aload #22
/*     */     //   1392: iload #24
/*     */     //   1394: iinc #24, 1
/*     */     //   1397: istore #27
/*     */     //   1399: iload #27
/*     */     //   1401: ifge -> 1407
/*     */     //   1404: invokestatic throwIndexOverflow : ()V
/*     */     //   1407: iload #27
/*     */     //   1409: aload #26
/*     */     //   1411: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   1414: astore #28
/*     */     //   1416: istore #29
/*     */     //   1418: astore #34
/*     */     //   1420: iconst_0
/*     */     //   1421: istore #30
/*     */     //   1423: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;
/*     */     //   1426: aload #28
/*     */     //   1428: invokestatic access$getActionGroup : (Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;)Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   1431: astore #31
/*     */     //   1433: iload #29
/*     */     //   1435: aload #5
/*     */     //   1437: invokeinterface size : ()I
/*     */     //   1442: iconst_2
/*     */     //   1443: isub
/*     */     //   1444: if_icmplt -> 1451
/*     */     //   1447: iconst_1
/*     */     //   1448: goto -> 1452
/*     */     //   1451: iconst_0
/*     */     //   1452: istore #32
/*     */     //   1454: aload #31
/*     */     //   1456: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup.OPEN : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   1459: if_acmpeq -> 1503
/*     */     //   1462: aload #31
/*     */     //   1464: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup.PROCESSED : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   1467: if_acmpeq -> 1503
/*     */     //   1470: aload #31
/*     */     //   1472: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup.ANSWER : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   1475: if_acmpeq -> 1503
/*     */     //   1478: iload #32
/*     */     //   1480: ifne -> 1499
/*     */     //   1483: aload #31
/*     */     //   1485: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup.CREATE : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   1488: if_acmpeq -> 1503
/*     */     //   1491: aload #31
/*     */     //   1493: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup.EDIT : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   1496: if_acmpeq -> 1503
/*     */     //   1499: iconst_1
/*     */     //   1500: goto -> 1504
/*     */     //   1503: iconst_0
/*     */     //   1504: istore #33
/*     */     //   1506: iload #33
/*     */     //   1508: ifeq -> 1516
/*     */     //   1511: aload #28
/*     */     //   1513: goto -> 1517
/*     */     //   1516: aconst_null
/*     */     //   1517: aload #34
/*     */     //   1519: swap
/*     */     //   1520: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1525: pop
/*     */     //   1526: goto -> 1371
/*     */     //   1529: aload #22
/*     */     //   1531: checkcast java/util/List
/*     */     //   1534: nop
/*     */     //   1535: checkcast java/lang/Iterable
/*     */     //   1538: invokestatic filterNotNull : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   1541: astore #18
/*     */     //   1543: aload #4
/*     */     //   1545: aload #18
/*     */     //   1547: checkcast java/util/Collection
/*     */     //   1550: invokeinterface addAll : (Ljava/util/Collection;)Z
/*     */     //   1555: pop
/*     */     //   1556: aload #4
/*     */     //   1558: invokestatic lastOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   1561: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   1564: dup
/*     */     //   1565: ifnull -> 1574
/*     */     //   1568: invokevirtual getAction : ()Ljava/lang/String;
/*     */     //   1571: goto -> 1576
/*     */     //   1574: pop
/*     */     //   1575: aconst_null
/*     */     //   1576: ldc_w 'submit'
/*     */     //   1579: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   1582: ifeq -> 1611
/*     */     //   1585: aload #4
/*     */     //   1587: new com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   1590: dup
/*     */     //   1591: ldc_w 'History processor: Create new plan for `<issue_description>`.'
/*     */     //   1594: invokestatic toUserMessage : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   1597: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   1600: ldc 'processed_start'
/*     */     //   1602: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;Ljava/lang/String;)V
/*     */     //   1605: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1610: pop
/*     */     //   1611: new com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   1614: dup
/*     */     //   1615: ldc_w 'history_processor_result'
/*     */     //   1618: ldc_w '0.1'
/*     */     //   1621: ldc_w ''
/*     */     //   1624: ldc_w ''
/*     */     //   1627: aconst_null
/*     */     //   1628: bipush #16
/*     */     //   1630: aconst_null
/*     */     //   1631: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1634: astore #19
/*     */     //   1636: aload #4
/*     */     //   1638: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1643: astore #20
/*     */     //   1645: aload #20
/*     */     //   1647: invokeinterface hasNext : ()Z
/*     */     //   1652: ifeq -> 1940
/*     */     //   1655: aload #20
/*     */     //   1657: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1662: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   1665: astore #21
/*     */     //   1667: aload #21
/*     */     //   1669: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   1672: invokeinterface getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   1677: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.Assistant : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   1680: if_acmpne -> 1815
/*     */     //   1683: aload_2
/*     */     //   1684: new com/intellij/ml/llm/matterhorn/AssistantTrajectoryElement
/*     */     //   1687: dup
/*     */     //   1688: aload #19
/*     */     //   1690: aload #21
/*     */     //   1692: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   1695: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   1700: ldc_w ''
/*     */     //   1703: ldc_w ''
/*     */     //   1706: aconst_null
/*     */     //   1707: aconst_null
/*     */     //   1708: aconst_null
/*     */     //   1709: bipush #64
/*     */     //   1711: aconst_null
/*     */     //   1712: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1715: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   1718: aload #36
/*     */     //   1720: aload #36
/*     */     //   1722: aload_2
/*     */     //   1723: putfield L$0 : Ljava/lang/Object;
/*     */     //   1726: aload #36
/*     */     //   1728: aload #4
/*     */     //   1730: putfield L$1 : Ljava/lang/Object;
/*     */     //   1733: aload #36
/*     */     //   1735: aload #19
/*     */     //   1737: putfield L$2 : Ljava/lang/Object;
/*     */     //   1740: aload #36
/*     */     //   1742: aload #20
/*     */     //   1744: putfield L$3 : Ljava/lang/Object;
/*     */     //   1747: aload #36
/*     */     //   1749: iconst_3
/*     */     //   1750: putfield label : I
/*     */     //   1753: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1756: dup
/*     */     //   1757: aload #37
/*     */     //   1759: if_acmpne -> 1811
/*     */     //   1762: aload #37
/*     */     //   1764: areturn
/*     */     //   1765: aload #36
/*     */     //   1767: getfield L$3 : Ljava/lang/Object;
/*     */     //   1770: checkcast java/util/Iterator
/*     */     //   1773: astore #20
/*     */     //   1775: aload #36
/*     */     //   1777: getfield L$2 : Ljava/lang/Object;
/*     */     //   1780: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   1783: astore #19
/*     */     //   1785: aload #36
/*     */     //   1787: getfield L$1 : Ljava/lang/Object;
/*     */     //   1790: checkcast java/util/List
/*     */     //   1793: astore #4
/*     */     //   1795: aload #36
/*     */     //   1797: getfield L$0 : Ljava/lang/Object;
/*     */     //   1800: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1803: astore_2
/*     */     //   1804: aload #35
/*     */     //   1806: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1809: aload #35
/*     */     //   1811: pop
/*     */     //   1812: goto -> 1645
/*     */     //   1815: aload_2
/*     */     //   1816: new com/intellij/ml/llm/matterhorn/UserTrajectoryElement
/*     */     //   1819: dup
/*     */     //   1820: aload #19
/*     */     //   1822: aload #21
/*     */     //   1824: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   1827: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   1832: aconst_null
/*     */     //   1833: iconst_0
/*     */     //   1834: bipush #12
/*     */     //   1836: aconst_null
/*     */     //   1837: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1840: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   1843: aload #36
/*     */     //   1845: aload #36
/*     */     //   1847: aload_2
/*     */     //   1848: putfield L$0 : Ljava/lang/Object;
/*     */     //   1851: aload #36
/*     */     //   1853: aload #4
/*     */     //   1855: putfield L$1 : Ljava/lang/Object;
/*     */     //   1858: aload #36
/*     */     //   1860: aload #19
/*     */     //   1862: putfield L$2 : Ljava/lang/Object;
/*     */     //   1865: aload #36
/*     */     //   1867: aload #20
/*     */     //   1869: putfield L$3 : Ljava/lang/Object;
/*     */     //   1872: aload #36
/*     */     //   1874: iconst_4
/*     */     //   1875: putfield label : I
/*     */     //   1878: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1881: dup
/*     */     //   1882: aload #37
/*     */     //   1884: if_acmpne -> 1936
/*     */     //   1887: aload #37
/*     */     //   1889: areturn
/*     */     //   1890: aload #36
/*     */     //   1892: getfield L$3 : Ljava/lang/Object;
/*     */     //   1895: checkcast java/util/Iterator
/*     */     //   1898: astore #20
/*     */     //   1900: aload #36
/*     */     //   1902: getfield L$2 : Ljava/lang/Object;
/*     */     //   1905: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   1908: astore #19
/*     */     //   1910: aload #36
/*     */     //   1912: getfield L$1 : Ljava/lang/Object;
/*     */     //   1915: checkcast java/util/List
/*     */     //   1918: astore #4
/*     */     //   1920: aload #36
/*     */     //   1922: getfield L$0 : Ljava/lang/Object;
/*     */     //   1925: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1928: astore_2
/*     */     //   1929: aload #35
/*     */     //   1931: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1934: aload #35
/*     */     //   1936: pop
/*     */     //   1937: goto -> 1645
/*     */     //   1940: aload #4
/*     */     //   1942: areturn
/*     */     //   1943: new java/lang/IllegalStateException
/*     */     //   1946: dup
/*     */     //   1947: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1950: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1953: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #162	-> 60
/*     */     //   #163	-> 105
/*     */     //   #163	-> 115
/*     */     //   #164	-> 117
/*     */     //   #165	-> 154
/*     */     //   #167	-> 165
/*     */     //   #164	-> 173
/*     */     //   #169	-> 175
/*     */     //   #171	-> 191
/*     */     //   #172	-> 193
/*     */     //   #173	-> 197
/*     */     //   #174	-> 205
/*     */     //   #172	-> 207
/*     */     //   #171	-> 210
/*     */     //   #178	-> 216
/*     */     //   #180	-> 228
/*     */     //   #182	-> 234
/*     */     //   #184	-> 246
/*     */     //   #568	-> 258
/*     */     //   #569	-> 277
/*     */     //   #185	-> 315
/*     */     //   #186	-> 325
/*     */     //   #569	-> 354
/*     */     //   #570	-> 370
/*     */     //   #568	-> 375
/*     */     //   #184	-> 376
/*     */     //   #188	-> 378
/*     */     //   #190	-> 388
/*     */     //   #571	-> 400
/*     */     //   #572	-> 419
/*     */     //   #191	-> 457
/*     */     //   #192	-> 467
/*     */     //   #572	-> 509
/*     */     //   #573	-> 525
/*     */     //   #571	-> 530
/*     */     //   #190	-> 531
/*     */     //   #194	-> 533
/*     */     //   #195	-> 543
/*     */     //   #162	-> 619
/*     */     //   #195	-> 696
/*     */     //   #197	-> 702
/*     */     //   #199	-> 713
/*     */     //   #200	-> 720
/*     */     //   #574	-> 723
/*     */     //   #575	-> 742
/*     */     //   #201	-> 780
/*     */     //   #202	-> 790
/*     */     //   #575	-> 819
/*     */     //   #576	-> 835
/*     */     //   #574	-> 840
/*     */     //   #200	-> 841
/*     */     //   #199	-> 841
/*     */     //   #204	-> 843
/*     */     //   #206	-> 856
/*     */     //   #577	-> 866
/*     */     //   #578	-> 885
/*     */     //   #207	-> 923
/*     */     //   #208	-> 933
/*     */     //   #578	-> 962
/*     */     //   #579	-> 978
/*     */     //   #577	-> 983
/*     */     //   #206	-> 984
/*     */     //   #210	-> 986
/*     */     //   #580	-> 996
/*     */     //   #581	-> 1015
/*     */     //   #211	-> 1053
/*     */     //   #212	-> 1063
/*     */     //   #581	-> 1076
/*     */     //   #582	-> 1092
/*     */     //   #580	-> 1097
/*     */     //   #210	-> 1098
/*     */     //   #214	-> 1100
/*     */     //   #583	-> 1112
/*     */     //   #584	-> 1131
/*     */     //   #215	-> 1169
/*     */     //   #584	-> 1179
/*     */     //   #585	-> 1195
/*     */     //   #583	-> 1200
/*     */     //   #214	-> 1201
/*     */     //   #219	-> 1203
/*     */     //   #162	-> 1272
/*     */     //   #218	-> 1314
/*     */     //   #220	-> 1316
/*     */     //   #222	-> 1323
/*     */     //   #586	-> 1333
/*     */     //   #587	-> 1359
/*     */     //   #588	-> 1362
/*     */     //   #589	-> 1390
/*     */     //   #589	-> 1409
/*     */     //   #223	-> 1423
/*     */     //   #224	-> 1433
/*     */     //   #225	-> 1454
/*     */     //   #226	-> 1478
/*     */     //   #225	-> 1504
/*     */     //   #227	-> 1506
/*     */     //   #589	-> 1520
/*     */     //   #590	-> 1529
/*     */     //   #586	-> 1534
/*     */     //   #228	-> 1538
/*     */     //   #222	-> 1541
/*     */     //   #229	-> 1543
/*     */     //   #231	-> 1556
/*     */     //   #232	-> 1585
/*     */     //   #233	-> 1587
/*     */     //   #234	-> 1591
/*     */     //   #235	-> 1600
/*     */     //   #233	-> 1602
/*     */     //   #232	-> 1605
/*     */     //   #240	-> 1611
/*     */     //   #241	-> 1636
/*     */     //   #242	-> 1667
/*     */     //   #243	-> 1683
/*     */     //   #244	-> 1684
/*     */     //   #245	-> 1688
/*     */     //   #246	-> 1690
/*     */     //   #247	-> 1700
/*     */     //   #248	-> 1703
/*     */     //   #249	-> 1706
/*     */     //   #250	-> 1707
/*     */     //   #244	-> 1708
/*     */     //   #243	-> 1720
/*     */     //   #162	-> 1762
/*     */     //   #243	-> 1811
/*     */     //   #254	-> 1815
/*     */     //   #162	-> 1887
/*     */     //   #254	-> 1936
/*     */     //   #257	-> 1940
/*     */     //   #162	-> 1943
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	10	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   115	239	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   354	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   376	246	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   689	130	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   819	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   841	121	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   962	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   984	92	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   1076	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   1098	81	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   1179	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   1201	65	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   105	10	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   115	239	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   354	22	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   376	246	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   680	139	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   819	22	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   841	121	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   962	22	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   984	92	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   1076	22	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   1098	11	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   105	10	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   115	239	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   354	22	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   376	246	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   671	148	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   819	22	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   841	121	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   962	22	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   984	92	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1076	22	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1098	177	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1304	103	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1407	110	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1517	18	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1535	230	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1804	86	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1929	14	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   117	237	4	processedObservations	Ljava/util/List;
/*     */     //   354	22	4	processedObservations	Ljava/util/List;
/*     */     //   376	246	4	processedObservations	Ljava/util/List;
/*     */     //   662	157	4	processedObservations	Ljava/util/List;
/*     */     //   819	22	4	processedObservations	Ljava/util/List;
/*     */     //   841	121	4	processedObservations	Ljava/util/List;
/*     */     //   962	22	4	processedObservations	Ljava/util/List;
/*     */     //   984	92	4	processedObservations	Ljava/util/List;
/*     */     //   1076	22	4	processedObservations	Ljava/util/List;
/*     */     //   1098	177	4	processedObservations	Ljava/util/List;
/*     */     //   1295	112	4	processedObservations	Ljava/util/List;
/*     */     //   1407	110	4	processedObservations	Ljava/util/List;
/*     */     //   1517	18	4	processedObservations	Ljava/util/List;
/*     */     //   1535	230	4	processedObservations	Ljava/util/List;
/*     */     //   1795	95	4	processedObservations	Ljava/util/List;
/*     */     //   1920	23	4	processedObservations	Ljava/util/List;
/*     */     //   175	179	5	lastObservations	Ljava/util/List;
/*     */     //   354	22	5	lastObservations	Ljava/util/List;
/*     */     //   376	246	5	lastObservations	Ljava/util/List;
/*     */     //   652	167	5	lastObservations	Ljava/util/List;
/*     */     //   819	22	5	lastObservations	Ljava/util/List;
/*     */     //   841	121	5	lastObservations	Ljava/util/List;
/*     */     //   962	22	5	lastObservations	Ljava/util/List;
/*     */     //   984	92	5	lastObservations	Ljava/util/List;
/*     */     //   1076	22	5	lastObservations	Ljava/util/List;
/*     */     //   1098	177	5	lastObservations	Ljava/util/List;
/*     */     //   1285	122	5	lastObservations	Ljava/util/List;
/*     */     //   1407	110	5	lastObservations	Ljava/util/List;
/*     */     //   1517	12	5	lastObservations	Ljava/util/List;
/*     */     //   191	163	6	historyObservations	Ljava/util/List;
/*     */     //   354	22	6	historyObservations	Ljava/util/List;
/*     */     //   376	246	6	historyObservations	Ljava/util/List;
/*     */     //   642	177	6	historyObservations	Ljava/util/List;
/*     */     //   819	22	6	historyObservations	Ljava/util/List;
/*     */     //   841	121	6	historyObservations	Ljava/util/List;
/*     */     //   962	22	6	historyObservations	Ljava/util/List;
/*     */     //   984	9	6	historyObservations	Ljava/util/List;
/*     */     //   234	120	7	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   354	22	7	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   376	133	7	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   509	22	7	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   531	82	7	executionAgentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   246	108	8	shownCode	Ljava/util/Map;
/*     */     //   354	22	8	shownCode	Ljava/util/Map;
/*     */     //   376	133	8	shownCode	Ljava/util/Map;
/*     */     //   509	22	8	shownCode	Ljava/util/Map;
/*     */     //   531	82	8	shownCode	Ljava/util/Map;
/*     */     //   378	10	9	editedMessages	Ljava/util/List;
/*     */     //   255	19	10	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   388	121	10	editedFiles	Ljava/util/List;
/*     */     //   509	22	10	editedFiles	Ljava/util/List;
/*     */     //   531	82	10	editedFiles	Ljava/util/List;
/*     */     //   533	10	11	createMessages	Ljava/util/List;
/*     */     //   274	12	12	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   397	19	12	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   543	70	12	createdFiles	Ljava/util/List;
/*     */     //   274	98	13	destination$iv$iv	Ljava/util/Collection;
/*     */     //   843	13	13	expertMessages	Ljava/util/List;
/*     */     //   416	12	14	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   720	19	14	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   986	90	14	otherMessagesLast	Ljava/util/List;
/*     */     //   1076	22	14	otherMessagesLast	Ljava/util/List;
/*     */     //   1098	81	14	otherMessagesLast	Ljava/util/List;
/*     */     //   1179	22	14	otherMessagesLast	Ljava/util/List;
/*     */     //   1201	65	14	otherMessagesLast	Ljava/util/List;
/*     */     //   416	111	15	destination$iv$iv	Ljava/util/Collection;
/*     */     //   863	19	15	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   1100	79	15	otherMessagesHistory	Ljava/util/List;
/*     */     //   1179	22	15	otherMessagesHistory	Ljava/util/List;
/*     */     //   1201	65	15	otherMessagesHistory	Ljava/util/List;
/*     */     //   305	62	16	element$iv$iv	Ljava/lang/Object;
/*     */     //   739	12	16	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   993	19	16	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   1203	63	16	otherMessagesProcessed	Ljava/util/List;
/*     */     //   312	41	17	message	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   739	98	17	destination$iv$iv	Ljava/util/Collection;
/*     */     //   882	12	17	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   1109	19	17	$this$filter$iv	Ljava/lang/Iterable;
/*     */     //   1316	7	17	processedOtherMessages	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   447	75	18	element$iv$iv	Ljava/lang/Object;
/*     */     //   882	98	18	destination$iv$iv	Ljava/util/Collection;
/*     */     //   1012	12	18	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   1543	13	18	filteredLastObservations	Ljava/util/List;
/*     */     //   325	28	19	group	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   454	54	19	message	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   1012	82	19	destination$iv$iv	Ljava/util/Collection;
/*     */     //   1128	12	19	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   1330	26	19	$this$mapIndexed$iv	Ljava/lang/Iterable;
/*     */     //   1636	129	19	trajectoryElementAgent	Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;
/*     */     //   1785	105	19	trajectoryElementAgent	Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;
/*     */     //   1910	33	19	trajectoryElementAgent	Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;
/*     */     //   770	62	20	element$iv$iv	Ljava/lang/Object;
/*     */     //   1128	69	20	destination$iv$iv	Ljava/util/Collection;
/*     */     //   467	21	21	group	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   777	41	21	message	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   913	62	21	element$iv$iv	Ljava/lang/Object;
/*     */     //   1356	15	21	$this$mapIndexedTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   1667	33	21	message	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   1815	66	21	message	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   920	41	22	message	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   1043	46	22	element$iv$iv	Ljava/lang/Object;
/*     */     //   1356	51	22	destination$iv$iv	Ljava/util/Collection;
/*     */     //   1407	124	22	destination$iv$iv	Ljava/util/Collection;
/*     */     //   790	28	23	group	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   1050	13	23	message	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   1159	33	23	element$iv$iv	Ljava/lang/Object;
/*     */     //   933	28	24	group	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   1166	13	24	message	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   1362	45	24	index$iv$iv	I
/*     */     //   1407	124	24	index$iv$iv	I
/*     */     //   1063	12	25	group	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   1390	17	26	item$iv$iv	Ljava/lang/Object;
/*     */     //   1407	13	26	item$iv$iv	Ljava/lang/Object;
/*     */     //   1420	96	28	message	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   1420	31	29	index	I
/*     */     //   1433	66	31	group	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/ActionGroup;
/*     */     //   1454	45	32	isInLastTwo	Z
/*     */     //   1506	10	33	shouldKeep	Z
/*     */     //   315	39	18	$i$a$-filter-CompressHistoryProcessor$processObservations$editedMessages$1	I
/*     */     //   277	95	14	$i$f$filterTo	I
/*     */     //   258	118	11	$i$f$filter	I
/*     */     //   457	52	20	$i$a$-filter-CompressHistoryProcessor$processObservations$createMessages$1	I
/*     */     //   419	108	16	$i$f$filterTo	I
/*     */     //   400	131	13	$i$f$filter	I
/*     */     //   780	39	22	$i$a$-filter-CompressHistoryProcessor$processObservations$expertMessages$1	I
/*     */     //   742	95	18	$i$f$filterTo	I
/*     */     //   723	118	15	$i$f$filter	I
/*     */     //   923	39	23	$i$a$-filter-CompressHistoryProcessor$processObservations$otherMessagesLast$1	I
/*     */     //   885	95	19	$i$f$filterTo	I
/*     */     //   866	118	16	$i$f$filter	I
/*     */     //   1053	23	24	$i$a$-filter-CompressHistoryProcessor$processObservations$otherMessagesHistory$1	I
/*     */     //   1015	79	20	$i$f$filterTo	I
/*     */     //   996	102	17	$i$f$filter	I
/*     */     //   1169	10	25	$i$a$-filter-CompressHistoryProcessor$processObservations$otherMessagesProcessed$1	I
/*     */     //   1131	66	21	$i$f$filterTo	I
/*     */     //   1112	89	18	$i$f$filter	I
/*     */     //   1423	94	30	$i$a$-mapIndexed-CompressHistoryProcessor$processObservations$filteredLastObservations$1	I
/*     */     //   1359	172	23	$i$f$mapIndexedTo	I
/*     */     //   1333	202	20	$i$f$mapIndexed	I
/*     */     //   0	1954	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	1893	36	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	1886	35	$result	Ljava/lang/Object; }
/*     */   private final Object printOneFile(ExecutionAgentContext context, String filePath, List codeRanges, boolean fileWasEdited, Continuation $completion) { // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$printOneFile$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$printOneFile$1
/*     */     //   13: astore #29
/*     */     //   15: aload #29
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #29
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$printOneFile$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #29
/*     */     //   53: aload #29
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #28
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #30
/*     */     //   65: aload #29
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 1309, 0 -> 96, 1 -> 150, 2 -> 276
/*     */     //   96: aload #28
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_3
/*     */     //   102: invokeinterface isEmpty : ()Z
/*     */     //   107: ifeq -> 112
/*     */     //   110: aconst_null
/*     */     //   111: areturn
/*     */     //   112: aload_2
/*     */     //   113: aload_1
/*     */     //   114: iconst_0
/*     */     //   115: aload #29
/*     */     //   117: iconst_4
/*     */     //   118: aconst_null
/*     */     //   119: aload #29
/*     */     //   121: aload_3
/*     */     //   122: putfield L$0 : Ljava/lang/Object;
/*     */     //   125: aload #29
/*     */     //   127: iload #4
/*     */     //   129: putfield Z$0 : Z
/*     */     //   132: aload #29
/*     */     //   134: iconst_1
/*     */     //   135: putfield label : I
/*     */     //   138: invokestatic smartLocateFile$default : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   141: dup
/*     */     //   142: aload #30
/*     */     //   144: if_acmpne -> 173
/*     */     //   147: aload #30
/*     */     //   149: areturn
/*     */     //   150: aload #29
/*     */     //   152: getfield Z$0 : Z
/*     */     //   155: istore #4
/*     */     //   157: aload #29
/*     */     //   159: getfield L$0 : Ljava/lang/Object;
/*     */     //   162: checkcast java/util/List
/*     */     //   165: astore_3
/*     */     //   166: aload #28
/*     */     //   168: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   171: aload #28
/*     */     //   173: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   176: astore #6
/*     */     //   178: aload #6
/*     */     //   180: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   183: ifeq -> 188
/*     */     //   186: aconst_null
/*     */     //   187: areturn
/*     */     //   188: aload #6
/*     */     //   190: ldc_w 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.core.Result.Ok<com.intellij.openapi.vfs.VirtualFile>'
/*     */     //   193: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   196: aload #6
/*     */     //   198: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   201: pop
/*     */     //   202: aload #6
/*     */     //   204: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   207: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   210: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   213: astore #7
/*     */     //   215: aload #7
/*     */     //   217: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*     */     //   220: dup
/*     */     //   221: ifnonnull -> 227
/*     */     //   224: pop
/*     */     //   225: aconst_null
/*     */     //   226: areturn
/*     */     //   227: astore #8
/*     */     //   229: aload #7
/*     */     //   231: <illegal opcode> invoke : (Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function0;
/*     */     //   236: aload #29
/*     */     //   238: aload #29
/*     */     //   240: aload_3
/*     */     //   241: putfield L$0 : Ljava/lang/Object;
/*     */     //   244: aload #29
/*     */     //   246: aload #8
/*     */     //   248: putfield L$1 : Ljava/lang/Object;
/*     */     //   251: aload #29
/*     */     //   253: iload #4
/*     */     //   255: putfield Z$0 : Z
/*     */     //   258: aload #29
/*     */     //   260: iconst_2
/*     */     //   261: putfield label : I
/*     */     //   264: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   267: dup
/*     */     //   268: aload #30
/*     */     //   270: if_acmpne -> 309
/*     */     //   273: aload #30
/*     */     //   275: areturn
/*     */     //   276: aload #29
/*     */     //   278: getfield Z$0 : Z
/*     */     //   281: istore #4
/*     */     //   283: aload #29
/*     */     //   285: getfield L$1 : Ljava/lang/Object;
/*     */     //   288: checkcast java/nio/file/Path
/*     */     //   291: astore #8
/*     */     //   293: aload #29
/*     */     //   295: getfield L$0 : Ljava/lang/Object;
/*     */     //   298: checkcast java/util/List
/*     */     //   301: astore_3
/*     */     //   302: aload #28
/*     */     //   304: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   307: aload #28
/*     */     //   309: checkcast com/intellij/openapi/editor/Document
/*     */     //   312: dup
/*     */     //   313: ifnonnull -> 319
/*     */     //   316: pop
/*     */     //   317: aconst_null
/*     */     //   318: areturn
/*     */     //   319: astore #9
/*     */     //   321: aload #9
/*     */     //   323: invokeinterface getLineCount : ()I
/*     */     //   328: istore #10
/*     */     //   330: iload #10
/*     */     //   332: ifne -> 337
/*     */     //   335: aconst_null
/*     */     //   336: areturn
/*     */     //   337: iload #10
/*     */     //   339: sipush #200
/*     */     //   342: if_icmpge -> 378
/*     */     //   345: aload #8
/*     */     //   347: aload #9
/*     */     //   349: new com/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock
/*     */     //   352: dup
/*     */     //   353: iconst_1
/*     */     //   354: iload #10
/*     */     //   356: iconst_0
/*     */     //   357: iconst_0
/*     */     //   358: iconst_0
/*     */     //   359: bipush #28
/*     */     //   361: aconst_null
/*     */     //   362: invokespecial <init> : (IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   365: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   368: aconst_null
/*     */     //   369: iconst_0
/*     */     //   370: aconst_null
/*     */     //   371: bipush #56
/*     */     //   373: aconst_null
/*     */     //   374: invokestatic printScreen$default : (Ljava/nio/file/Path;Lcom/intellij/openapi/editor/Document;Ljava/util/List;Ljava/lang/String;ILcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   377: areturn
/*     */     //   378: iload #4
/*     */     //   380: ifeq -> 538
/*     */     //   383: aload_3
/*     */     //   384: checkcast java/lang/Iterable
/*     */     //   387: astore #12
/*     */     //   389: iconst_0
/*     */     //   390: istore #13
/*     */     //   392: aload #12
/*     */     //   394: astore #14
/*     */     //   396: new java/util/ArrayList
/*     */     //   399: dup
/*     */     //   400: aload #12
/*     */     //   402: bipush #10
/*     */     //   404: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   407: invokespecial <init> : (I)V
/*     */     //   410: checkcast java/util/Collection
/*     */     //   413: astore #15
/*     */     //   415: iconst_0
/*     */     //   416: istore #16
/*     */     //   418: aload #14
/*     */     //   420: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   425: astore #17
/*     */     //   427: aload #17
/*     */     //   429: invokeinterface hasNext : ()Z
/*     */     //   434: ifeq -> 529
/*     */     //   437: aload #17
/*     */     //   439: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   444: astore #18
/*     */     //   446: aload #15
/*     */     //   448: aload #18
/*     */     //   450: checkcast kotlin/Pair
/*     */     //   453: astore #19
/*     */     //   455: astore #26
/*     */     //   457: iconst_0
/*     */     //   458: istore #20
/*     */     //   460: aload #19
/*     */     //   462: invokevirtual component1 : ()Ljava/lang/Object;
/*     */     //   465: checkcast java/lang/Number
/*     */     //   468: invokevirtual intValue : ()I
/*     */     //   471: istore #21
/*     */     //   473: aload #19
/*     */     //   475: invokevirtual component2 : ()Ljava/lang/Object;
/*     */     //   478: checkcast java/lang/Number
/*     */     //   481: invokevirtual intValue : ()I
/*     */     //   484: istore #22
/*     */     //   486: bipush #10
/*     */     //   488: istore #23
/*     */     //   490: new kotlin/Pair
/*     */     //   493: dup
/*     */     //   494: iconst_1
/*     */     //   495: iload #21
/*     */     //   497: iload #23
/*     */     //   499: isub
/*     */     //   500: invokestatic max : (II)I
/*     */     //   503: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */     //   506: iload #22
/*     */     //   508: iload #23
/*     */     //   510: iadd
/*     */     //   511: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */     //   514: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   517: aload #26
/*     */     //   519: swap
/*     */     //   520: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   525: pop
/*     */     //   526: goto -> 427
/*     */     //   529: aload #15
/*     */     //   531: checkcast java/util/List
/*     */     //   534: nop
/*     */     //   535: goto -> 539
/*     */     //   538: aload_3
/*     */     //   539: astore #11
/*     */     //   541: aload #11
/*     */     //   543: checkcast java/lang/Iterable
/*     */     //   546: astore #13
/*     */     //   548: iconst_0
/*     */     //   549: istore #14
/*     */     //   551: aload #13
/*     */     //   553: new com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$printOneFile$$inlined$sortedBy$1
/*     */     //   556: dup
/*     */     //   557: invokespecial <init> : ()V
/*     */     //   560: checkcast java/util/Comparator
/*     */     //   563: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*     */     //   566: astore #12
/*     */     //   568: new java/util/ArrayList
/*     */     //   571: dup
/*     */     //   572: invokespecial <init> : ()V
/*     */     //   575: checkcast java/util/List
/*     */     //   578: astore #13
/*     */     //   580: aload #12
/*     */     //   582: iconst_0
/*     */     //   583: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   588: checkcast kotlin/Pair
/*     */     //   591: astore #14
/*     */     //   593: aload #14
/*     */     //   595: invokevirtual getFirst : ()Ljava/lang/Object;
/*     */     //   598: checkcast java/lang/Number
/*     */     //   601: invokevirtual intValue : ()I
/*     */     //   604: iload #10
/*     */     //   606: if_icmple -> 611
/*     */     //   609: aconst_null
/*     */     //   610: areturn
/*     */     //   611: iconst_1
/*     */     //   612: istore #15
/*     */     //   614: aload #12
/*     */     //   616: invokeinterface size : ()I
/*     */     //   621: istore #16
/*     */     //   623: iload #15
/*     */     //   625: iload #16
/*     */     //   627: if_icmpge -> 753
/*     */     //   630: aload #12
/*     */     //   632: iload #15
/*     */     //   634: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   639: checkcast kotlin/Pair
/*     */     //   642: astore #17
/*     */     //   644: aload #17
/*     */     //   646: invokevirtual getFirst : ()Ljava/lang/Object;
/*     */     //   649: checkcast java/lang/Number
/*     */     //   652: invokevirtual intValue : ()I
/*     */     //   655: aload #14
/*     */     //   657: invokevirtual getSecond : ()Ljava/lang/Object;
/*     */     //   660: checkcast java/lang/Number
/*     */     //   663: invokevirtual intValue : ()I
/*     */     //   666: isub
/*     */     //   667: bipush #20
/*     */     //   669: if_icmpgt -> 717
/*     */     //   672: new kotlin/Pair
/*     */     //   675: dup
/*     */     //   676: aload #14
/*     */     //   678: invokevirtual getFirst : ()Ljava/lang/Object;
/*     */     //   681: aload #14
/*     */     //   683: invokevirtual getSecond : ()Ljava/lang/Object;
/*     */     //   686: checkcast java/lang/Number
/*     */     //   689: invokevirtual intValue : ()I
/*     */     //   692: aload #17
/*     */     //   694: invokevirtual getSecond : ()Ljava/lang/Object;
/*     */     //   697: checkcast java/lang/Number
/*     */     //   700: invokevirtual intValue : ()I
/*     */     //   703: invokestatic max : (II)I
/*     */     //   706: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */     //   709: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   712: astore #14
/*     */     //   714: goto -> 747
/*     */     //   717: aload #17
/*     */     //   719: invokevirtual getFirst : ()Ljava/lang/Object;
/*     */     //   722: checkcast java/lang/Number
/*     */     //   725: invokevirtual intValue : ()I
/*     */     //   728: iload #10
/*     */     //   730: if_icmpgt -> 747
/*     */     //   733: aload #13
/*     */     //   735: aload #14
/*     */     //   737: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   742: pop
/*     */     //   743: aload #17
/*     */     //   745: astore #14
/*     */     //   747: iinc #15, 1
/*     */     //   750: goto -> 623
/*     */     //   753: iload #10
/*     */     //   755: aload #14
/*     */     //   757: invokevirtual getSecond : ()Ljava/lang/Object;
/*     */     //   760: checkcast java/lang/Number
/*     */     //   763: invokevirtual intValue : ()I
/*     */     //   766: isub
/*     */     //   767: bipush #20
/*     */     //   769: if_icmpge -> 791
/*     */     //   772: new kotlin/Pair
/*     */     //   775: dup
/*     */     //   776: aload #14
/*     */     //   778: invokevirtual getFirst : ()Ljava/lang/Object;
/*     */     //   781: iload #10
/*     */     //   783: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */     //   786: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   789: astore #14
/*     */     //   791: aload #13
/*     */     //   793: aload #14
/*     */     //   795: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   800: pop
/*     */     //   801: aload #13
/*     */     //   803: checkcast java/lang/Iterable
/*     */     //   806: astore #16
/*     */     //   808: iconst_0
/*     */     //   809: istore #17
/*     */     //   811: aload #16
/*     */     //   813: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   818: astore #18
/*     */     //   820: aload #18
/*     */     //   822: invokeinterface hasNext : ()Z
/*     */     //   827: ifeq -> 888
/*     */     //   830: aload #18
/*     */     //   832: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   837: astore #19
/*     */     //   839: iload #17
/*     */     //   841: aload #19
/*     */     //   843: checkcast kotlin/Pair
/*     */     //   846: astore #20
/*     */     //   848: istore #26
/*     */     //   850: iconst_0
/*     */     //   851: istore #21
/*     */     //   853: aload #20
/*     */     //   855: invokevirtual getSecond : ()Ljava/lang/Object;
/*     */     //   858: checkcast java/lang/Number
/*     */     //   861: invokevirtual intValue : ()I
/*     */     //   864: aload #20
/*     */     //   866: invokevirtual getFirst : ()Ljava/lang/Object;
/*     */     //   869: checkcast java/lang/Number
/*     */     //   872: invokevirtual intValue : ()I
/*     */     //   875: isub
/*     */     //   876: istore #27
/*     */     //   878: iload #26
/*     */     //   880: iload #27
/*     */     //   882: iadd
/*     */     //   883: istore #17
/*     */     //   885: goto -> 820
/*     */     //   888: iload #17
/*     */     //   890: istore #15
/*     */     //   892: ldc2_w 100.0
/*     */     //   895: iload #15
/*     */     //   897: i2d
/*     */     //   898: dmul
/*     */     //   899: iload #10
/*     */     //   901: i2d
/*     */     //   902: ddiv
/*     */     //   903: ldc2_w 80.0
/*     */     //   906: dcmpl
/*     */     //   907: ifle -> 943
/*     */     //   910: aload #8
/*     */     //   912: aload #9
/*     */     //   914: new com/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock
/*     */     //   917: dup
/*     */     //   918: iconst_1
/*     */     //   919: iload #10
/*     */     //   921: iconst_0
/*     */     //   922: iconst_0
/*     */     //   923: iconst_0
/*     */     //   924: bipush #28
/*     */     //   926: aconst_null
/*     */     //   927: invokespecial <init> : (IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   930: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   933: aconst_null
/*     */     //   934: iconst_0
/*     */     //   935: aconst_null
/*     */     //   936: bipush #56
/*     */     //   938: aconst_null
/*     */     //   939: invokestatic printScreen$default : (Ljava/nio/file/Path;Lcom/intellij/openapi/editor/Document;Ljava/util/List;Ljava/lang/String;ILcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   942: areturn
/*     */     //   943: aload #13
/*     */     //   945: iconst_0
/*     */     //   946: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   951: checkcast kotlin/Pair
/*     */     //   954: invokevirtual getFirst : ()Ljava/lang/Object;
/*     */     //   957: checkcast java/lang/Number
/*     */     //   960: invokevirtual intValue : ()I
/*     */     //   963: istore #16
/*     */     //   965: aload #13
/*     */     //   967: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   970: checkcast kotlin/Pair
/*     */     //   973: invokevirtual getSecond : ()Ljava/lang/Object;
/*     */     //   976: checkcast java/lang/Number
/*     */     //   979: invokevirtual intValue : ()I
/*     */     //   982: istore #17
/*     */     //   984: new java/lang/StringBuilder
/*     */     //   987: dup
/*     */     //   988: invokespecial <init> : ()V
/*     */     //   991: astore #19
/*     */     //   993: aload #19
/*     */     //   995: astore #20
/*     */     //   997: iconst_0
/*     */     //   998: istore #21
/*     */     //   1000: aload #20
/*     */     //   1002: aload #8
/*     */     //   1004: iload #10
/*     */     //   1006: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;I)Ljava/lang/String;
/*     */     //   1011: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1014: dup
/*     */     //   1015: ldc_w 'append(...)'
/*     */     //   1018: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1021: bipush #10
/*     */     //   1023: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1026: dup
/*     */     //   1027: ldc_w 'append(...)'
/*     */     //   1030: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1033: pop
/*     */     //   1034: iload #16
/*     */     //   1036: iconst_1
/*     */     //   1037: if_icmpeq -> 1074
/*     */     //   1040: aload #20
/*     */     //   1042: iload #16
/*     */     //   1044: iconst_1
/*     */     //   1045: isub
/*     */     //   1046: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   1051: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1054: dup
/*     */     //   1055: ldc_w 'append(...)'
/*     */     //   1058: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1061: bipush #10
/*     */     //   1063: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1066: dup
/*     */     //   1067: ldc_w 'append(...)'
/*     */     //   1070: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1073: pop
/*     */     //   1074: aload #13
/*     */     //   1076: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1081: astore #22
/*     */     //   1083: aload #22
/*     */     //   1085: invokeinterface hasNext : ()Z
/*     */     //   1090: ifeq -> 1245
/*     */     //   1093: aload #22
/*     */     //   1095: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1100: checkcast kotlin/Pair
/*     */     //   1103: astore #23
/*     */     //   1105: aload #23
/*     */     //   1107: invokevirtual component1 : ()Ljava/lang/Object;
/*     */     //   1110: checkcast java/lang/Number
/*     */     //   1113: invokevirtual intValue : ()I
/*     */     //   1116: istore #24
/*     */     //   1118: aload #23
/*     */     //   1120: invokevirtual component2 : ()Ljava/lang/Object;
/*     */     //   1123: checkcast java/lang/Number
/*     */     //   1126: invokevirtual intValue : ()I
/*     */     //   1129: istore #25
/*     */     //   1131: aload #20
/*     */     //   1133: iload #24
/*     */     //   1135: ldc_w ':'
/*     */     //   1138: iload #25
/*     */     //   1140: iconst_1
/*     */     //   1141: iadd
/*     */     //   1142: aload #9
/*     */     //   1144: invokestatic printScreenPart : (ILjava/lang/String;ILcom/intellij/openapi/editor/Document;)Ljava/lang/String;
/*     */     //   1147: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1150: pop
/*     */     //   1151: iload #25
/*     */     //   1153: iload #17
/*     */     //   1155: if_icmpge -> 1083
/*     */     //   1158: aload #20
/*     */     //   1160: ldc_w ''
/*     */     //   1163: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1166: dup
/*     */     //   1167: ldc_w 'append(...)'
/*     */     //   1170: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1173: bipush #10
/*     */     //   1175: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1178: dup
/*     */     //   1179: ldc_w 'append(...)'
/*     */     //   1182: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1185: pop
/*     */     //   1186: aload #20
/*     */     //   1188: ldc_w '...'
/*     */     //   1191: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1194: dup
/*     */     //   1195: ldc_w 'append(...)'
/*     */     //   1198: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1201: bipush #10
/*     */     //   1203: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1206: dup
/*     */     //   1207: ldc_w 'append(...)'
/*     */     //   1210: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1213: pop
/*     */     //   1214: aload #20
/*     */     //   1216: ldc_w ''
/*     */     //   1219: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1222: dup
/*     */     //   1223: ldc_w 'append(...)'
/*     */     //   1226: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1229: bipush #10
/*     */     //   1231: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1234: dup
/*     */     //   1235: ldc_w 'append(...)'
/*     */     //   1238: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1241: pop
/*     */     //   1242: goto -> 1083
/*     */     //   1245: iload #17
/*     */     //   1247: iload #10
/*     */     //   1249: if_icmpge -> 1291
/*     */     //   1252: iload #10
/*     */     //   1254: iload #17
/*     */     //   1256: isub
/*     */     //   1257: istore #22
/*     */     //   1259: aload #20
/*     */     //   1261: iload #22
/*     */     //   1263: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   1268: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1271: dup
/*     */     //   1272: ldc_w 'append(...)'
/*     */     //   1275: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1278: bipush #10
/*     */     //   1280: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1283: dup
/*     */     //   1284: ldc_w 'append(...)'
/*     */     //   1287: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1290: pop
/*     */     //   1291: nop
/*     */     //   1292: aload #19
/*     */     //   1294: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1297: dup
/*     */     //   1298: ldc_w 'toString(...)'
/*     */     //   1301: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1304: astore #18
/*     */     //   1306: aload #18
/*     */     //   1308: areturn
/*     */     //   1309: new java/lang/IllegalStateException
/*     */     //   1312: dup
/*     */     //   1313: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1316: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1319: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #270	-> 63
/*     */     //   #274	-> 101
/*     */     //   #276	-> 112
/*     */     //   #270	-> 147
/*     */     //   #277	-> 178
/*     */     //   #278	-> 186
/*     */     //   #280	-> 188
/*     */     //   #281	-> 202
/*     */     //   #282	-> 215
/*     */     //   #283	-> 229
/*     */     //   #270	-> 273
/*     */     //   #283	-> 309
/*     */     //   #284	-> 321
/*     */     //   #285	-> 330
/*     */     //   #287	-> 337
/*     */     //   #289	-> 345
/*     */     //   #290	-> 347
/*     */     //   #291	-> 349
/*     */     //   #288	-> 368
/*     */     //   #295	-> 378
/*     */     //   #296	-> 383
/*     */     //   #591	-> 392
/*     */     //   #592	-> 418
/*     */     //   #593	-> 446
/*     */     //   #296	-> 460
/*     */     //   #297	-> 486
/*     */     //   #298	-> 490
/*     */     //   #298	-> 506
/*     */     //   #593	-> 520
/*     */     //   #594	-> 529
/*     */     //   #591	-> 534
/*     */     //   #301	-> 538
/*     */     //   #295	-> 539
/*     */     //   #304	-> 541
/*     */     //   #595	-> 551
/*     */     //   #595	-> 563
/*     */     //   #304	-> 566
/*     */     //   #305	-> 568
/*     */     //   #305	-> 578
/*     */     //   #306	-> 580
/*     */     //   #307	-> 593
/*     */     //   #309	-> 611
/*     */     //   #310	-> 630
/*     */     //   #311	-> 644
/*     */     //   #312	-> 672
/*     */     //   #312	-> 709
/*     */     //   #313	-> 717
/*     */     //   #314	-> 733
/*     */     //   #315	-> 743
/*     */     //   #309	-> 747
/*     */     //   #318	-> 753
/*     */     //   #319	-> 772
/*     */     //   #321	-> 791
/*     */     //   #323	-> 801
/*     */     //   #596	-> 848
/*     */     //   #323	-> 853
/*     */     //   #323	-> 882
/*     */     //   #323	-> 890
/*     */     //   #324	-> 892
/*     */     //   #326	-> 910
/*     */     //   #327	-> 912
/*     */     //   #328	-> 914
/*     */     //   #325	-> 933
/*     */     //   #332	-> 943
/*     */     //   #333	-> 965
/*     */     //   #335	-> 984
/*     */     //   #336	-> 1000
/*     */     //   #337	-> 1034
/*     */     //   #338	-> 1040
/*     */     //   #340	-> 1074
/*     */     //   #341	-> 1131
/*     */     //   #342	-> 1151
/*     */     //   #343	-> 1158
/*     */     //   #344	-> 1186
/*     */     //   #345	-> 1214
/*     */     //   #348	-> 1245
/*     */     //   #349	-> 1252
/*     */     //   #350	-> 1259
/*     */     //   #352	-> 1291
/*     */     //   #335	-> 1292
/*     */     //   #335	-> 1304
/*     */     //   #354	-> 1306
/*     */     //   #270	-> 1309
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	11	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   112	29	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   101	11	2	filePath	Ljava/lang/String;
/*     */     //   112	29	2	filePath	Ljava/lang/String;
/*     */     //   101	49	3	codeRanges	Ljava/util/List;
/*     */     //   166	110	3	codeRanges	Ljava/util/List;
/*     */     //   302	14	3	codeRanges	Ljava/util/List;
/*     */     //   319	18	3	codeRanges	Ljava/util/List;
/*     */     //   337	8	3	codeRanges	Ljava/util/List;
/*     */     //   378	11	3	codeRanges	Ljava/util/List;
/*     */     //   538	1	3	codeRanges	Ljava/util/List;
/*     */     //   101	49	4	fileWasEdited	Z
/*     */     //   157	119	4	fileWasEdited	Z
/*     */     //   283	33	4	fileWasEdited	Z
/*     */     //   319	18	4	fileWasEdited	Z
/*     */     //   337	8	4	fileWasEdited	Z
/*     */     //   378	5	4	fileWasEdited	Z
/*     */     //   178	8	6	openedFile	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   188	27	6	openedFile	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   215	9	7	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   227	40	7	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   229	47	8	path	Ljava/nio/file/Path;
/*     */     //   293	23	8	path	Ljava/nio/file/Path;
/*     */     //   319	18	8	path	Ljava/nio/file/Path;
/*     */     //   337	10	8	path	Ljava/nio/file/Path;
/*     */     //   378	139	8	path	Ljava/nio/file/Path;
/*     */     //   517	18	8	path	Ljava/nio/file/Path;
/*     */     //   535	31	8	path	Ljava/nio/file/Path;
/*     */     //   566	12	8	path	Ljava/nio/file/Path;
/*     */     //   578	33	8	path	Ljava/nio/file/Path;
/*     */     //   611	19	8	path	Ljava/nio/file/Path;
/*     */     //   630	76	8	path	Ljava/nio/file/Path;
/*     */     //   706	170	8	path	Ljava/nio/file/Path;
/*     */     //   876	14	8	path	Ljava/nio/file/Path;
/*     */     //   890	22	8	path	Ljava/nio/file/Path;
/*     */     //   943	90	8	path	Ljava/nio/file/Path;
/*     */     //   321	16	9	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   337	12	9	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   378	139	9	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   517	18	9	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   535	31	9	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   566	12	9	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   578	33	9	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   611	19	9	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   630	76	9	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   706	170	9	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   876	14	9	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   890	24	9	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   943	302	9	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   330	7	10	documentLineCount	I
/*     */     //   337	31	10	documentLineCount	I
/*     */     //   378	139	10	documentLineCount	I
/*     */     //   517	18	10	documentLineCount	I
/*     */     //   535	31	10	documentLineCount	I
/*     */     //   566	12	10	documentLineCount	I
/*     */     //   578	33	10	documentLineCount	I
/*     */     //   611	19	10	documentLineCount	I
/*     */     //   630	76	10	documentLineCount	I
/*     */     //   706	170	10	documentLineCount	I
/*     */     //   876	14	10	documentLineCount	I
/*     */     //   890	43	10	documentLineCount	I
/*     */     //   943	316	10	documentLineCount	I
/*     */     //   541	7	11	adjustedRanges	Ljava/util/List;
/*     */     //   389	26	12	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   568	10	12	sortedRanges	Ljava/util/List;
/*     */     //   578	33	12	sortedRanges	Ljava/util/List;
/*     */     //   611	19	12	sortedRanges	Ljava/util/List;
/*     */     //   630	76	12	sortedRanges	Ljava/util/List;
/*     */     //   706	47	12	sortedRanges	Ljava/util/List;
/*     */     //   548	18	13	$this$sortedBy$iv	Ljava/lang/Iterable;
/*     */     //   580	31	13	combinedRanges	Ljava/util/List;
/*     */     //   611	19	13	combinedRanges	Ljava/util/List;
/*     */     //   630	76	13	combinedRanges	Ljava/util/List;
/*     */     //   706	170	13	combinedRanges	Ljava/util/List;
/*     */     //   876	14	13	combinedRanges	Ljava/util/List;
/*     */     //   890	20	13	combinedRanges	Ljava/util/List;
/*     */     //   943	140	13	combinedRanges	Ljava/util/List;
/*     */     //   415	12	14	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   593	18	14	currentRange	Lkotlin/Pair;
/*     */     //   611	19	14	currentRange	Lkotlin/Pair;
/*     */     //   630	76	14	currentRange	Lkotlin/Pair;
/*     */     //   717	26	14	currentRange	Lkotlin/Pair;
/*     */     //   747	44	14	currentRange	Lkotlin/Pair;
/*     */     //   791	10	14	currentRange	Lkotlin/Pair;
/*     */     //   415	116	15	destination$iv$iv	Ljava/util/Collection;
/*     */     //   614	16	15	i	I
/*     */     //   630	76	15	i	I
/*     */     //   706	47	15	i	I
/*     */     //   892	18	15	totalRangesLength	I
/*     */     //   965	108	16	firstLine	I
/*     */     //   644	62	17	nextRange	Lkotlin/Pair;
/*     */     //   717	30	17	nextRange	Lkotlin/Pair;
/*     */     //   984	275	17	lastLine	I
/*     */     //   446	80	18	item$iv$iv	Ljava/lang/Object;
/*     */     //   1306	3	18	code	Ljava/lang/String;
/*     */     //   848	28	20	it	Lkotlin/Pair;
/*     */     //   997	293	20	$this$printOneFile_u24lambda_u2411	Ljava/lang/StringBuilder;
/*     */     //   473	44	21	start	I
/*     */     //   486	31	22	end	I
/*     */     //   1259	31	22	linesBelow	I
/*     */     //   490	27	23	expandIfModified	I
/*     */     //   1118	124	24	startLine	I
/*     */     //   1131	111	25	endLine	I
/*     */     //   460	57	20	$i$a$-map-CompressHistoryProcessor$printOneFile$adjustedRanges$1	I
/*     */     //   418	113	16	$i$f$mapTo	I
/*     */     //   392	143	13	$i$f$map	I
/*     */     //   551	15	14	$i$f$sortedBy	I
/*     */     //   853	23	21	$i$a$-sumOfInt-CompressHistoryProcessor$printOneFile$totalRangesLength$1	I
/*     */     //   1000	292	21	$i$a$-buildString-CompressHistoryProcessor$printOneFile$code$1	I
/*     */     //   0	1320	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	1256	29	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	1249	28	$result	Ljava/lang/Object; }
/*     */   private static final Document printOneFile$lambda$7(VirtualFile $virtualFile) { return FileDocumentManager.getInstance().getDocument($virtualFile); }
/*     */   private final Object printAllCode(ExecutionAgentContext context, Map shownCode, List createdFiles, List editedFiles, Continuation $completion) { // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$printAllCode$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$printAllCode$1
/*     */     //   13: astore #28
/*     */     //   15: aload #28
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #28
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$printAllCode$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #28
/*     */     //   53: aload #28
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #27
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #29
/*     */     //   65: aload #28
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 619, 0 -> 92, 1 -> 428
/*     */     //   92: aload #27
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_1
/*     */     //   98: invokeinterface getProjectDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   103: invokevirtual getPath : ()Ljava/lang/String;
/*     */     //   106: dup
/*     */     //   107: ldc_w 'getPath(...)'
/*     */     //   110: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   113: astore #6
/*     */     //   115: aload #6
/*     */     //   117: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   122: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   125: astore #7
/*     */     //   127: aload_2
/*     */     //   128: astore #9
/*     */     //   130: iconst_0
/*     */     //   131: istore #10
/*     */     //   133: new java/util/LinkedHashMap
/*     */     //   136: dup
/*     */     //   137: invokespecial <init> : ()V
/*     */     //   140: astore #11
/*     */     //   142: aload #9
/*     */     //   144: invokeinterface entrySet : ()Ljava/util/Set;
/*     */     //   149: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   154: astore #12
/*     */     //   156: aload #12
/*     */     //   158: invokeinterface hasNext : ()Z
/*     */     //   163: ifeq -> 246
/*     */     //   166: aload #12
/*     */     //   168: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   173: checkcast java/util/Map$Entry
/*     */     //   176: astore #13
/*     */     //   178: aload #13
/*     */     //   180: invokeinterface getKey : ()Ljava/lang/Object;
/*     */     //   185: checkcast java/lang/String
/*     */     //   188: astore #14
/*     */     //   190: iconst_0
/*     */     //   191: istore #15
/*     */     //   193: aload_3
/*     */     //   194: checkcast java/util/Collection
/*     */     //   197: aload #7
/*     */     //   199: checkcast java/lang/Iterable
/*     */     //   202: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   205: aload #14
/*     */     //   207: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   212: ifne -> 219
/*     */     //   215: iconst_1
/*     */     //   216: goto -> 220
/*     */     //   219: iconst_0
/*     */     //   220: ifeq -> 156
/*     */     //   223: aload #11
/*     */     //   225: aload #13
/*     */     //   227: invokeinterface getKey : ()Ljava/lang/Object;
/*     */     //   232: aload #13
/*     */     //   234: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   239: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   242: pop
/*     */     //   243: goto -> 156
/*     */     //   246: aload #11
/*     */     //   248: checkcast java/util/Map
/*     */     //   251: astore #8
/*     */     //   253: aload #8
/*     */     //   255: astore #10
/*     */     //   257: iconst_0
/*     */     //   258: istore #11
/*     */     //   260: aload #10
/*     */     //   262: astore #12
/*     */     //   264: new java/util/ArrayList
/*     */     //   267: dup
/*     */     //   268: invokespecial <init> : ()V
/*     */     //   271: checkcast java/util/Collection
/*     */     //   274: astore #13
/*     */     //   276: iconst_0
/*     */     //   277: istore #14
/*     */     //   279: aload #12
/*     */     //   281: astore #15
/*     */     //   283: iconst_0
/*     */     //   284: istore #16
/*     */     //   286: aload #15
/*     */     //   288: invokeinterface entrySet : ()Ljava/util/Set;
/*     */     //   293: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   298: astore #17
/*     */     //   300: aload #17
/*     */     //   302: invokeinterface hasNext : ()Z
/*     */     //   307: ifeq -> 527
/*     */     //   310: aload #17
/*     */     //   312: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   317: checkcast java/util/Map$Entry
/*     */     //   320: astore #18
/*     */     //   322: aload #18
/*     */     //   324: astore #19
/*     */     //   326: iconst_0
/*     */     //   327: istore #20
/*     */     //   329: aload #19
/*     */     //   331: astore #21
/*     */     //   333: iconst_0
/*     */     //   334: istore #22
/*     */     //   336: aload #21
/*     */     //   338: invokeinterface getKey : ()Ljava/lang/Object;
/*     */     //   343: checkcast java/lang/String
/*     */     //   346: astore #23
/*     */     //   348: aload #21
/*     */     //   350: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   355: checkcast java/util/List
/*     */     //   358: astore #24
/*     */     //   360: aload_0
/*     */     //   361: aload_1
/*     */     //   362: aload #23
/*     */     //   364: aload #24
/*     */     //   366: aload #4
/*     */     //   368: aload #23
/*     */     //   370: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   375: aload #28
/*     */     //   377: aload #28
/*     */     //   379: aload_0
/*     */     //   380: putfield L$0 : Ljava/lang/Object;
/*     */     //   383: aload #28
/*     */     //   385: aload_1
/*     */     //   386: putfield L$1 : Ljava/lang/Object;
/*     */     //   389: aload #28
/*     */     //   391: aload #4
/*     */     //   393: putfield L$2 : Ljava/lang/Object;
/*     */     //   396: aload #28
/*     */     //   398: aload #13
/*     */     //   400: putfield L$3 : Ljava/lang/Object;
/*     */     //   403: aload #28
/*     */     //   405: aload #17
/*     */     //   407: putfield L$4 : Ljava/lang/Object;
/*     */     //   410: aload #28
/*     */     //   412: iconst_1
/*     */     //   413: putfield label : I
/*     */     //   416: invokespecial printOneFile : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/lang/String;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   419: dup
/*     */     //   420: aload #29
/*     */     //   422: if_acmpne -> 498
/*     */     //   425: aload #29
/*     */     //   427: areturn
/*     */     //   428: iconst_0
/*     */     //   429: istore #11
/*     */     //   431: iconst_0
/*     */     //   432: istore #14
/*     */     //   434: iconst_0
/*     */     //   435: istore #16
/*     */     //   437: iconst_0
/*     */     //   438: istore #20
/*     */     //   440: iconst_0
/*     */     //   441: istore #22
/*     */     //   443: aload #28
/*     */     //   445: getfield L$4 : Ljava/lang/Object;
/*     */     //   448: checkcast java/util/Iterator
/*     */     //   451: astore #17
/*     */     //   453: aload #28
/*     */     //   455: getfield L$3 : Ljava/lang/Object;
/*     */     //   458: checkcast java/util/Collection
/*     */     //   461: astore #13
/*     */     //   463: aload #28
/*     */     //   465: getfield L$2 : Ljava/lang/Object;
/*     */     //   468: checkcast java/util/List
/*     */     //   471: astore #4
/*     */     //   473: aload #28
/*     */     //   475: getfield L$1 : Ljava/lang/Object;
/*     */     //   478: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   481: astore_1
/*     */     //   482: aload #28
/*     */     //   484: getfield L$0 : Ljava/lang/Object;
/*     */     //   487: checkcast com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor
/*     */     //   490: astore_0
/*     */     //   491: aload #27
/*     */     //   493: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   496: aload #27
/*     */     //   498: checkcast java/lang/String
/*     */     //   501: dup
/*     */     //   502: ifnull -> 523
/*     */     //   505: astore #25
/*     */     //   507: iconst_0
/*     */     //   508: istore #26
/*     */     //   510: aload #13
/*     */     //   512: aload #25
/*     */     //   514: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   519: pop
/*     */     //   520: goto -> 524
/*     */     //   523: pop
/*     */     //   524: goto -> 300
/*     */     //   527: nop
/*     */     //   528: aload #13
/*     */     //   530: checkcast java/util/List
/*     */     //   533: nop
/*     */     //   534: checkcast java/lang/Iterable
/*     */     //   537: ldc_w '\\n\\n'
/*     */     //   540: checkcast java/lang/CharSequence
/*     */     //   543: aconst_null
/*     */     //   544: aconst_null
/*     */     //   545: iconst_0
/*     */     //   546: aconst_null
/*     */     //   547: aconst_null
/*     */     //   548: bipush #62
/*     */     //   550: aconst_null
/*     */     //   551: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   554: astore #9
/*     */     //   556: aload #9
/*     */     //   558: checkcast java/lang/CharSequence
/*     */     //   561: invokeinterface length : ()I
/*     */     //   566: ifle -> 573
/*     */     //   569: iconst_1
/*     */     //   570: goto -> 574
/*     */     //   573: iconst_0
/*     */     //   574: ifeq -> 613
/*     */     //   577: aload #9
/*     */     //   579: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   584: aconst_null
/*     */     //   585: iconst_1
/*     */     //   586: aconst_null
/*     */     //   587: invokestatic trimMargin$default : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   590: astore #11
/*     */     //   592: new com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   595: dup
/*     */     //   596: aload #11
/*     */     //   598: invokestatic toUserMessage : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   601: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   604: ldc_w 'processed_shown_code'
/*     */     //   607: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;Ljava/lang/String;)V
/*     */     //   610: goto -> 614
/*     */     //   613: aconst_null
/*     */     //   614: astore #10
/*     */     //   616: aload #10
/*     */     //   618: areturn
/*     */     //   619: new java/lang/IllegalStateException
/*     */     //   622: dup
/*     */     //   623: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   626: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   629: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #360	-> 63
/*     */     //   #366	-> 97
/*     */     //   #367	-> 115
/*     */     //   #369	-> 127
/*     */     //   #597	-> 133
/*     */     //   #598	-> 142
/*     */     //   #598	-> 154
/*     */     //   #599	-> 178
/*     */     //   #369	-> 193
/*     */     //   #599	-> 220
/*     */     //   #600	-> 223
/*     */     //   #603	-> 246
/*     */     //   #369	-> 251
/*     */     //   #370	-> 253
/*     */     //   #604	-> 260
/*     */     //   #612	-> 279
/*     */     //   #613	-> 286
/*     */     //   #613	-> 298
/*     */     //   #612	-> 329
/*     */     //   #370	-> 336
/*     */     //   #370	-> 343
/*     */     //   #370	-> 355
/*     */     //   #371	-> 360
/*     */     //   #360	-> 425
/*     */     //   #371	-> 498
/*     */     //   #612	-> 501
/*     */     //   #614	-> 507
/*     */     //   #612	-> 510
/*     */     //   #612	-> 520
/*     */     //   #612	-> 523
/*     */     //   #613	-> 524
/*     */     //   #615	-> 527
/*     */     //   #616	-> 528
/*     */     //   #604	-> 533
/*     */     //   #372	-> 537
/*     */     //   #370	-> 554
/*     */     //   #374	-> 556
/*     */     //   #374	-> 574
/*     */     //   #378	-> 577
/*     */     //   #381	-> 584
/*     */     //   #375	-> 590
/*     */     //   #382	-> 592
/*     */     //   #383	-> 613
/*     */     //   #374	-> 614
/*     */     //   #385	-> 616
/*     */     //   #360	-> 619
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	123	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   220	31	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   251	177	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   491	10	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   501	26	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   97	123	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   220	31	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   251	177	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   482	19	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   501	26	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   97	33	2	shownCode	Ljava/util/Map;
/*     */     //   97	123	3	createdFiles	Ljava/util/List;
/*     */     //   220	26	3	createdFiles	Ljava/util/List;
/*     */     //   97	123	4	editedFiles	Ljava/util/List;
/*     */     //   220	31	4	editedFiles	Ljava/util/List;
/*     */     //   251	177	4	editedFiles	Ljava/util/List;
/*     */     //   473	28	4	editedFiles	Ljava/util/List;
/*     */     //   501	26	4	editedFiles	Ljava/util/List;
/*     */     //   115	12	6	projectRoot	Ljava/lang/String;
/*     */     //   127	93	7	tmpOutputFiles	Ljava/util/List;
/*     */     //   220	26	7	tmpOutputFiles	Ljava/util/List;
/*     */     //   253	4	8	viewedFiles	Ljava/util/Map;
/*     */     //   130	24	9	$this$filterKeys$iv	Ljava/util/Map;
/*     */     //   556	18	9	viewedCode	Ljava/lang/String;
/*     */     //   574	10	9	viewedCode	Ljava/lang/String;
/*     */     //   257	19	10	$this$mapNotNull$iv	Ljava/util/Map;
/*     */     //   616	3	10	viewedCodeMessage	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   142	109	11	result$iv	Ljava/util/LinkedHashMap;
/*     */     //   592	18	11	viewedCodeWrapped	Ljava/lang/String;
/*     */     //   276	7	12	$this$mapNotNullTo$iv$iv	Ljava/util/Map;
/*     */     //   178	65	13	entry$iv	Ljava/util/Map$Entry;
/*     */     //   276	152	13	destination$iv$iv	Ljava/util/Collection;
/*     */     //   463	38	13	destination$iv$iv	Ljava/util/Collection;
/*     */     //   501	29	13	destination$iv$iv	Ljava/util/Collection;
/*     */     //   190	29	14	it	Ljava/lang/String;
/*     */     //   283	15	15	$this$forEach$iv$iv$iv	Ljava/util/Map;
/*     */     //   322	4	18	element$iv$iv$iv	Ljava/util/Map$Entry;
/*     */     //   326	7	19	element$iv$iv	Ljava/util/Map$Entry;
/*     */     //   348	71	23	filePath	Ljava/lang/String;
/*     */     //   360	59	24	ranges	Ljava/util/List;
/*     */     //   507	13	25	it$iv$iv	Ljava/lang/Object;
/*     */     //   193	27	15	$i$a$-filterKeys-CompressHistoryProcessor$printAllCode$viewedFiles$1	I
/*     */     //   133	118	10	$i$f$filterKeys	I
/*     */     //   336	92	22	$i$a$-mapNotNull-CompressHistoryProcessor$printAllCode$viewedCode$1	I
/*     */     //   510	10	26	$i$a$-let-MapsKt___MapsKt$mapNotNullTo$1$1$iv$iv	I
/*     */     //   329	99	20	$i$a$-forEach-MapsKt___MapsKt$mapNotNullTo$1$iv$iv	I
/*     */     //   286	142	16	$i$f$forEach	I
/*     */     //   279	149	14	$i$f$mapNotNullTo	I
/*     */     //   260	168	11	$i$f$mapNotNull	I
/*     */     //   0	630	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	566	28	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	559	27	$result	Ljava/lang/Object;
/*     */     //   443	58	22	$i$a$-mapNotNull-CompressHistoryProcessor$printAllCode$viewedCode$1	I
/*     */     //   440	84	20	$i$a$-forEach-MapsKt___MapsKt$mapNotNullTo$1$iv$iv	I
/*     */     //   437	91	16	$i$f$forEach	I
/*     */     //   434	96	14	$i$f$mapNotNullTo	I
/*     */     //   431	103	11	$i$f$mapNotNull	I } private final AgentObservation processOtherMessagesOutput(String output1, String output2) { String[] arrayOfString = new String[2]; arrayOfString[0] = output1; arrayOfString[1] = output2; String output = CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[])arrayOfString), "\n", null, null, 0, null, null, 62, null); if (StringsKt.isBlank(output)) return null;  String wrappedOutput = StringsKt.trimMargin$default("History processor: During the current session, you executed the following commands:\n        |\n        |" + output + "\n      ", null, 1, null); return new AgentObservation((MatterhornChatElement)MatterhornChatKt.toUserMessage(wrappedOutput), "processed_other"); } private final Object processOtherMessages(List observationsForSummary, List lastObservationsForSummary, List otherMessagesProcessed, ExecutionContext context, Continuation $completion) { // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$processOtherMessages$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$processOtherMessages$1
/*     */     //   13: astore #17
/*     */     //   15: aload #17
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #17
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$processOtherMessages$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #17
/*     */     //   53: aload #17
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #16
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #18
/*     */     //   65: aload #17
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 913, 0 -> 96, 1 -> 724, 2 -> 867
/*     */     //   96: aload #16
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_1
/*     */     //   102: checkcast java/util/Collection
/*     */     //   105: aload_3
/*     */     //   106: checkcast java/lang/Iterable
/*     */     //   109: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   112: invokeinterface isEmpty : ()Z
/*     */     //   117: ifeq -> 122
/*     */     //   120: aconst_null
/*     */     //   121: areturn
/*     */     //   122: new java/util/ArrayList
/*     */     //   125: dup
/*     */     //   126: invokespecial <init> : ()V
/*     */     //   129: checkcast java/util/List
/*     */     //   132: astore #6
/*     */     //   134: new java/util/LinkedHashSet
/*     */     //   137: dup
/*     */     //   138: invokespecial <init> : ()V
/*     */     //   141: checkcast java/util/Set
/*     */     //   144: astore #7
/*     */     //   146: aload_2
/*     */     //   147: checkcast java/lang/Iterable
/*     */     //   150: astore #8
/*     */     //   152: iconst_0
/*     */     //   153: istore #9
/*     */     //   155: aload #8
/*     */     //   157: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   162: astore #10
/*     */     //   164: aload #10
/*     */     //   166: invokeinterface hasNext : ()Z
/*     */     //   171: ifeq -> 225
/*     */     //   174: aload #10
/*     */     //   176: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   181: astore #11
/*     */     //   183: aload #11
/*     */     //   185: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   188: astore #12
/*     */     //   190: iconst_0
/*     */     //   191: istore #13
/*     */     //   193: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;
/*     */     //   196: aload #12
/*     */     //   198: invokevirtual extractCommand : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;)Ljava/lang/String;
/*     */     //   201: dup
/*     */     //   202: ifnonnull -> 209
/*     */     //   205: pop
/*     */     //   206: goto -> 222
/*     */     //   209: astore #14
/*     */     //   211: aload #7
/*     */     //   213: aload #14
/*     */     //   215: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   220: pop
/*     */     //   221: nop
/*     */     //   222: goto -> 164
/*     */     //   225: nop
/*     */     //   226: aload_1
/*     */     //   227: checkcast java/util/Collection
/*     */     //   230: invokeinterface isEmpty : ()Z
/*     */     //   235: ifne -> 242
/*     */     //   238: iconst_1
/*     */     //   239: goto -> 243
/*     */     //   242: iconst_0
/*     */     //   243: ifeq -> 502
/*     */     //   246: aload_1
/*     */     //   247: invokeinterface size : ()I
/*     */     //   252: iconst_1
/*     */     //   253: isub
/*     */     //   254: istore #8
/*     */     //   256: iload #8
/*     */     //   258: istore #9
/*     */     //   260: iload #8
/*     */     //   262: iconst_1
/*     */     //   263: bipush #-2
/*     */     //   265: invokestatic getProgressionLastElement : (III)I
/*     */     //   268: istore #10
/*     */     //   270: iload #10
/*     */     //   272: iload #9
/*     */     //   274: if_icmpgt -> 502
/*     */     //   277: aload_1
/*     */     //   278: iload #9
/*     */     //   280: iconst_1
/*     */     //   281: isub
/*     */     //   282: invokestatic getOrNull : (Ljava/util/List;I)Ljava/lang/Object;
/*     */     //   285: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   288: astore #11
/*     */     //   290: aload_1
/*     */     //   291: iload #9
/*     */     //   293: invokestatic getOrNull : (Ljava/util/List;I)Ljava/lang/Object;
/*     */     //   296: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   299: astore #12
/*     */     //   301: aload #11
/*     */     //   303: dup
/*     */     //   304: ifnull -> 322
/*     */     //   307: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   310: dup
/*     */     //   311: ifnull -> 322
/*     */     //   314: invokeinterface getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   319: goto -> 324
/*     */     //   322: pop
/*     */     //   323: aconst_null
/*     */     //   324: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.Assistant : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   327: if_acmpne -> 375
/*     */     //   330: aload #12
/*     */     //   332: dup
/*     */     //   333: ifnull -> 351
/*     */     //   336: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   339: dup
/*     */     //   340: ifnull -> 351
/*     */     //   343: invokeinterface getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   348: goto -> 353
/*     */     //   351: pop
/*     */     //   352: aconst_null
/*     */     //   353: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   356: if_acmpne -> 375
/*     */     //   359: aload #11
/*     */     //   361: invokevirtual getAction : ()Ljava/lang/String;
/*     */     //   364: aload #12
/*     */     //   366: invokevirtual getAction : ()Ljava/lang/String;
/*     */     //   369: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   372: ifne -> 378
/*     */     //   375: goto -> 489
/*     */     //   378: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;
/*     */     //   381: aload #11
/*     */     //   383: invokevirtual extractCommand : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;)Ljava/lang/String;
/*     */     //   386: dup
/*     */     //   387: ifnonnull -> 394
/*     */     //   390: pop
/*     */     //   391: goto -> 489
/*     */     //   394: astore #13
/*     */     //   396: aload #7
/*     */     //   398: aload #13
/*     */     //   400: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   405: ifne -> 489
/*     */     //   408: aload #11
/*     */     //   410: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   413: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   418: ldc_w '<COMMAND>'
/*     */     //   421: invokestatic access$substringFrom : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   424: checkcast java/lang/CharSequence
/*     */     //   427: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   430: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   433: astore #14
/*     */     //   435: aload #12
/*     */     //   437: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   440: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   445: ldc_w '(Open file:'
/*     */     //   448: invokestatic access$substringTo : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   451: checkcast java/lang/CharSequence
/*     */     //   454: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   457: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   460: astore #15
/*     */     //   462: aload #6
/*     */     //   464: aload #14
/*     */     //   466: aload #15
/*     */     //   468: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   473: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   478: pop
/*     */     //   479: aload #7
/*     */     //   481: aload #13
/*     */     //   483: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   488: pop
/*     */     //   489: iload #9
/*     */     //   491: iload #10
/*     */     //   493: if_icmpeq -> 502
/*     */     //   496: iinc #9, -2
/*     */     //   499: goto -> 277
/*     */     //   502: getstatic com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$Companion;
/*     */     //   505: aload_3
/*     */     //   506: aload #7
/*     */     //   508: invokevirtual extractProcessedOther : (Ljava/util/List;Ljava/util/Set;)Ljava/util/Map;
/*     */     //   511: astore #8
/*     */     //   513: aload #8
/*     */     //   515: invokestatic access$toFormatedOutput : (Ljava/util/Map;)Ljava/lang/String;
/*     */     //   518: astore #9
/*     */     //   520: aload #6
/*     */     //   522: invokeinterface isEmpty : ()Z
/*     */     //   527: ifeq -> 538
/*     */     //   530: aload_0
/*     */     //   531: aload #9
/*     */     //   533: aconst_null
/*     */     //   534: invokespecial processOtherMessagesOutput : (Ljava/lang/String;Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   537: areturn
/*     */     //   538: aload #6
/*     */     //   540: checkcast java/lang/Iterable
/*     */     //   543: invokestatic reversed : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   546: checkcast java/lang/Iterable
/*     */     //   549: ldc_w '\\n\\n'
/*     */     //   552: checkcast java/lang/CharSequence
/*     */     //   555: aconst_null
/*     */     //   556: aconst_null
/*     */     //   557: iconst_0
/*     */     //   558: aconst_null
/*     */     //   559: aconst_null
/*     */     //   560: bipush #62
/*     */     //   562: aconst_null
/*     */     //   563: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   566: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   571: aconst_null
/*     */     //   572: iconst_1
/*     */     //   573: aconst_null
/*     */     //   574: invokestatic trimMargin$default : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   577: astore #10
/*     */     //   579: new com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */     //   582: dup
/*     */     //   583: getstatic com/intellij/ml/llm/matterhorn/llm/LLM.Companion : Lcom/intellij/ml/llm/matterhorn/llm/LLM$Companion;
/*     */     //   586: invokevirtual getGPT_4_O_MINI_2024_07_18 : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   589: iconst_0
/*     */     //   590: dconst_0
/*     */     //   591: invokestatic boxDouble : (D)Ljava/lang/Double;
/*     */     //   594: aconst_null
/*     */     //   595: aconst_null
/*     */     //   596: aconst_null
/*     */     //   597: aconst_null
/*     */     //   598: aconst_null
/*     */     //   599: aconst_null
/*     */     //   600: aconst_null
/*     */     //   601: aconst_null
/*     */     //   602: aconst_null
/*     */     //   603: aconst_null
/*     */     //   604: iconst_0
/*     */     //   605: aconst_null
/*     */     //   606: sipush #32762
/*     */     //   609: aconst_null
/*     */     //   610: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/LLM;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   613: astore #11
/*     */     //   615: ldc_w 'Your task is to summarize the commands and their results.'
/*     */     //   618: astore #12
/*     */     //   620: aload #4
/*     */     //   622: new com/intellij/ml/llm/matterhorn/requests/SimpleRequest
/*     */     //   625: dup
/*     */     //   626: aload #12
/*     */     //   628: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   631: dup
/*     */     //   632: aload #10
/*     */     //   634: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   637: aconst_null
/*     */     //   638: aconst_null
/*     */     //   639: bipush #12
/*     */     //   641: aconst_null
/*     */     //   642: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   645: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   648: aload #11
/*     */     //   650: aconst_null
/*     */     //   651: bipush #8
/*     */     //   653: aconst_null
/*     */     //   654: invokespecial <init> : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   657: checkcast com/intellij/ml/llm/matterhorn/requests/GrazieRequest
/*     */     //   660: iconst_0
/*     */     //   661: aload #17
/*     */     //   663: iconst_2
/*     */     //   664: aconst_null
/*     */     //   665: aload #17
/*     */     //   667: aload_0
/*     */     //   668: putfield L$0 : Ljava/lang/Object;
/*     */     //   671: aload #17
/*     */     //   673: aload #4
/*     */     //   675: putfield L$1 : Ljava/lang/Object;
/*     */     //   678: aload #17
/*     */     //   680: aload #9
/*     */     //   682: putfield L$2 : Ljava/lang/Object;
/*     */     //   685: aload #17
/*     */     //   687: aload #10
/*     */     //   689: putfield L$3 : Ljava/lang/Object;
/*     */     //   692: aload #17
/*     */     //   694: aload #11
/*     */     //   696: putfield L$4 : Ljava/lang/Object;
/*     */     //   699: aload #17
/*     */     //   701: aload #12
/*     */     //   703: putfield L$5 : Ljava/lang/Object;
/*     */     //   706: aload #17
/*     */     //   708: iconst_1
/*     */     //   709: putfield label : I
/*     */     //   712: invokestatic sendToGrazie$default : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/requests/GrazieRequest;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   715: dup
/*     */     //   716: aload #18
/*     */     //   718: if_acmpne -> 790
/*     */     //   721: aload #18
/*     */     //   723: areturn
/*     */     //   724: aload #17
/*     */     //   726: getfield L$5 : Ljava/lang/Object;
/*     */     //   729: checkcast java/lang/String
/*     */     //   732: astore #12
/*     */     //   734: aload #17
/*     */     //   736: getfield L$4 : Ljava/lang/Object;
/*     */     //   739: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */     //   742: astore #11
/*     */     //   744: aload #17
/*     */     //   746: getfield L$3 : Ljava/lang/Object;
/*     */     //   749: checkcast java/lang/String
/*     */     //   752: astore #10
/*     */     //   754: aload #17
/*     */     //   756: getfield L$2 : Ljava/lang/Object;
/*     */     //   759: checkcast java/lang/String
/*     */     //   762: astore #9
/*     */     //   764: aload #17
/*     */     //   766: getfield L$1 : Ljava/lang/Object;
/*     */     //   769: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   772: astore #4
/*     */     //   774: aload #17
/*     */     //   776: getfield L$0 : Ljava/lang/Object;
/*     */     //   779: checkcast com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor
/*     */     //   782: astore_0
/*     */     //   783: aload #16
/*     */     //   785: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   788: aload #16
/*     */     //   790: checkcast java/lang/String
/*     */     //   793: astore #13
/*     */     //   795: aload_0
/*     */     //   796: aload #4
/*     */     //   798: ldc_w 'history_processor_summary'
/*     */     //   801: aload #11
/*     */     //   803: aload #12
/*     */     //   805: aload #10
/*     */     //   807: aload #13
/*     */     //   809: aload #17
/*     */     //   811: aload #17
/*     */     //   813: aload_0
/*     */     //   814: putfield L$0 : Ljava/lang/Object;
/*     */     //   817: aload #17
/*     */     //   819: aload #9
/*     */     //   821: putfield L$1 : Ljava/lang/Object;
/*     */     //   824: aload #17
/*     */     //   826: aload #13
/*     */     //   828: putfield L$2 : Ljava/lang/Object;
/*     */     //   831: aload #17
/*     */     //   833: aconst_null
/*     */     //   834: putfield L$3 : Ljava/lang/Object;
/*     */     //   837: aload #17
/*     */     //   839: aconst_null
/*     */     //   840: putfield L$4 : Ljava/lang/Object;
/*     */     //   843: aload #17
/*     */     //   845: aconst_null
/*     */     //   846: putfield L$5 : Ljava/lang/Object;
/*     */     //   849: aload #17
/*     */     //   851: iconst_2
/*     */     //   852: putfield label : I
/*     */     //   855: invokespecial logCompressHistoryTrajectories : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   858: dup
/*     */     //   859: aload #18
/*     */     //   861: if_acmpne -> 903
/*     */     //   864: aload #18
/*     */     //   866: areturn
/*     */     //   867: aload #17
/*     */     //   869: getfield L$2 : Ljava/lang/Object;
/*     */     //   872: checkcast java/lang/String
/*     */     //   875: astore #13
/*     */     //   877: aload #17
/*     */     //   879: getfield L$1 : Ljava/lang/Object;
/*     */     //   882: checkcast java/lang/String
/*     */     //   885: astore #9
/*     */     //   887: aload #17
/*     */     //   889: getfield L$0 : Ljava/lang/Object;
/*     */     //   892: checkcast com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor
/*     */     //   895: astore_0
/*     */     //   896: aload #16
/*     */     //   898: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   901: aload #16
/*     */     //   903: pop
/*     */     //   904: aload_0
/*     */     //   905: aload #9
/*     */     //   907: aload #13
/*     */     //   909: invokespecial processOtherMessagesOutput : (Ljava/lang/String;Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   912: areturn
/*     */     //   913: new java/lang/IllegalStateException
/*     */     //   916: dup
/*     */     //   917: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   920: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   923: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #400	-> 63
/*     */     //   #406	-> 101
/*     */     //   #407	-> 122
/*     */     //   #407	-> 132
/*     */     //   #408	-> 134
/*     */     //   #408	-> 144
/*     */     //   #410	-> 146
/*     */     //   #617	-> 155
/*     */     //   #411	-> 193
/*     */     //   #412	-> 211
/*     */     //   #413	-> 221
/*     */     //   #617	-> 222
/*     */     //   #618	-> 225
/*     */     //   #415	-> 226
/*     */     //   #415	-> 243
/*     */     //   #416	-> 246
/*     */     //   #417	-> 277
/*     */     //   #418	-> 290
/*     */     //   #420	-> 301
/*     */     //   #421	-> 330
/*     */     //   #422	-> 359
/*     */     //   #424	-> 375
/*     */     //   #427	-> 378
/*     */     //   #428	-> 396
/*     */     //   #430	-> 408
/*     */     //   #430	-> 433
/*     */     //   #431	-> 435
/*     */     //   #431	-> 460
/*     */     //   #432	-> 462
/*     */     //   #433	-> 479
/*     */     //   #416	-> 489
/*     */     //   #437	-> 502
/*     */     //   #438	-> 513
/*     */     //   #440	-> 520
/*     */     //   #453	-> 538
/*     */     //   #454	-> 571
/*     */     //   #442	-> 577
/*     */     //   #456	-> 579
/*     */     //   #457	-> 615
/*     */     //   #458	-> 620
/*     */     //   #459	-> 622
/*     */     //   #460	-> 626
/*     */     //   #461	-> 628
/*     */     //   #462	-> 648
/*     */     //   #459	-> 650
/*     */     //   #458	-> 660
/*     */     //   #400	-> 721
/*     */     //   #465	-> 795
/*     */     //   #466	-> 796
/*     */     //   #467	-> 798
/*     */     //   #468	-> 801
/*     */     //   #469	-> 803
/*     */     //   #470	-> 805
/*     */     //   #471	-> 807
/*     */     //   #465	-> 811
/*     */     //   #400	-> 864
/*     */     //   #474	-> 903
/*     */     //   #400	-> 913
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	21	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   122	10	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   132	12	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   144	65	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   209	13	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   222	4	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   226	17	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   243	135	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   378	16	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   394	14	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   408	25	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   433	27	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   460	36	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   496	228	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   783	84	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   896	17	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   101	21	1	observationsForSummary	Ljava/util/List;
/*     */     //   122	10	1	observationsForSummary	Ljava/util/List;
/*     */     //   132	12	1	observationsForSummary	Ljava/util/List;
/*     */     //   144	65	1	observationsForSummary	Ljava/util/List;
/*     */     //   209	13	1	observationsForSummary	Ljava/util/List;
/*     */     //   222	4	1	observationsForSummary	Ljava/util/List;
/*     */     //   226	17	1	observationsForSummary	Ljava/util/List;
/*     */     //   243	135	1	observationsForSummary	Ljava/util/List;
/*     */     //   378	16	1	observationsForSummary	Ljava/util/List;
/*     */     //   394	14	1	observationsForSummary	Ljava/util/List;
/*     */     //   408	25	1	observationsForSummary	Ljava/util/List;
/*     */     //   433	27	1	observationsForSummary	Ljava/util/List;
/*     */     //   460	36	1	observationsForSummary	Ljava/util/List;
/*     */     //   496	6	1	observationsForSummary	Ljava/util/List;
/*     */     //   101	21	2	lastObservationsForSummary	Ljava/util/List;
/*     */     //   122	10	2	lastObservationsForSummary	Ljava/util/List;
/*     */     //   132	12	2	lastObservationsForSummary	Ljava/util/List;
/*     */     //   144	8	2	lastObservationsForSummary	Ljava/util/List;
/*     */     //   101	21	3	otherMessagesProcessed	Ljava/util/List;
/*     */     //   122	10	3	otherMessagesProcessed	Ljava/util/List;
/*     */     //   132	12	3	otherMessagesProcessed	Ljava/util/List;
/*     */     //   144	65	3	otherMessagesProcessed	Ljava/util/List;
/*     */     //   209	13	3	otherMessagesProcessed	Ljava/util/List;
/*     */     //   222	4	3	otherMessagesProcessed	Ljava/util/List;
/*     */     //   226	17	3	otherMessagesProcessed	Ljava/util/List;
/*     */     //   243	135	3	otherMessagesProcessed	Ljava/util/List;
/*     */     //   378	16	3	otherMessagesProcessed	Ljava/util/List;
/*     */     //   394	14	3	otherMessagesProcessed	Ljava/util/List;
/*     */     //   408	25	3	otherMessagesProcessed	Ljava/util/List;
/*     */     //   433	27	3	otherMessagesProcessed	Ljava/util/List;
/*     */     //   460	36	3	otherMessagesProcessed	Ljava/util/List;
/*     */     //   496	17	3	otherMessagesProcessed	Ljava/util/List;
/*     */     //   101	21	4	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   122	10	4	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   132	12	4	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   144	65	4	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   209	13	4	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   222	4	4	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   226	17	4	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   243	135	4	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   378	16	4	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   394	14	4	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   408	25	4	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   433	27	4	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   460	36	4	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   496	228	4	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   774	24	4	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   134	10	6	extractedContent	Ljava/util/List;
/*     */     //   144	65	6	extractedContent	Ljava/util/List;
/*     */     //   209	13	6	extractedContent	Ljava/util/List;
/*     */     //   222	4	6	extractedContent	Ljava/util/List;
/*     */     //   226	17	6	extractedContent	Ljava/util/List;
/*     */     //   243	135	6	extractedContent	Ljava/util/List;
/*     */     //   378	16	6	extractedContent	Ljava/util/List;
/*     */     //   394	14	6	extractedContent	Ljava/util/List;
/*     */     //   408	25	6	extractedContent	Ljava/util/List;
/*     */     //   433	27	6	extractedContent	Ljava/util/List;
/*     */     //   460	36	6	extractedContent	Ljava/util/List;
/*     */     //   496	42	6	extractedContent	Ljava/util/List;
/*     */     //   538	33	6	extractedContent	Ljava/util/List;
/*     */     //   146	63	7	processedCommands	Ljava/util/Set;
/*     */     //   209	13	7	processedCommands	Ljava/util/Set;
/*     */     //   222	4	7	processedCommands	Ljava/util/Set;
/*     */     //   226	17	7	processedCommands	Ljava/util/Set;
/*     */     //   243	135	7	processedCommands	Ljava/util/Set;
/*     */     //   378	16	7	processedCommands	Ljava/util/Set;
/*     */     //   394	14	7	processedCommands	Ljava/util/Set;
/*     */     //   408	25	7	processedCommands	Ljava/util/Set;
/*     */     //   433	27	7	processedCommands	Ljava/util/Set;
/*     */     //   460	36	7	processedCommands	Ljava/util/Set;
/*     */     //   496	17	7	processedCommands	Ljava/util/Set;
/*     */     //   152	12	8	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   513	7	8	extractedProcessedOther	Ljava/util/Map;
/*     */     //   260	118	9	i	I
/*     */     //   378	16	9	i	I
/*     */     //   394	14	9	i	I
/*     */     //   408	25	9	i	I
/*     */     //   433	27	9	i	I
/*     */     //   460	36	9	i	I
/*     */     //   496	6	9	i	I
/*     */     //   520	204	9	formattedProcessedOther	Ljava/lang/String;
/*     */     //   764	103	9	formattedProcessedOther	Ljava/lang/String;
/*     */     //   887	26	9	formattedProcessedOther	Ljava/lang/String;
/*     */     //   579	145	10	inputForSummary	Ljava/lang/String;
/*     */     //   754	53	10	inputForSummary	Ljava/lang/String;
/*     */     //   183	7	11	element$iv	Ljava/lang/Object;
/*     */     //   290	85	11	assistantMessage	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   378	110	11	assistantMessage	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   615	109	11	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   744	59	11	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   190	32	12	message	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   301	74	12	userMessage	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   378	110	12	userMessage	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   620	104	12	systemMessage	Ljava/lang/String;
/*     */     //   734	71	12	systemMessage	Ljava/lang/String;
/*     */     //   396	92	13	command	Ljava/lang/String;
/*     */     //   795	72	13	answerLLM	Ljava/lang/String;
/*     */     //   877	36	13	answerLLM	Ljava/lang/String;
/*     */     //   211	11	14	command	Ljava/lang/String;
/*     */     //   435	53	14	assistantContent	Ljava/lang/String;
/*     */     //   462	26	15	userContent	Ljava/lang/String;
/*     */     //   193	29	13	$i$a$-forEach-CompressHistoryProcessor$processOtherMessages$2	I
/*     */     //   155	71	9	$i$f$forEach	I
/*     */     //   0	924	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	860	17	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	853	16	$result	Ljava/lang/Object; } private static final PreviousTasksInfo collectChanges$lambda$16$lambda$15(PreviousTasksInfo it) { Intrinsics.checkNotNullParameter(it, "it"); it.getAgentState().getIssue(); return (it.getAgentState() != null && it.getAgentState().getIssue() != null) ? it.getAgentState().getIssue().getPreviousTasksInfo() : null; } private final AgentObservation processPrevTasks(AgentState input, List lastObservations) { // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokevirtual getIssue : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   4: invokevirtual getPreviousTasksInfo : ()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;
/*     */     //   7: dup
/*     */     //   8: ifnull -> 44
/*     */     //   11: invokevirtual getAgentState : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/*     */     //   14: dup
/*     */     //   15: ifnull -> 44
/*     */     //   18: invokevirtual getIssue : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   21: dup
/*     */     //   22: ifnull -> 44
/*     */     //   25: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   28: dup
/*     */     //   29: ifnull -> 44
/*     */     //   32: checkcast java/lang/CharSequence
/*     */     //   35: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   38: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   41: goto -> 46
/*     */     //   44: pop
/*     */     //   45: aconst_null
/*     */     //   46: astore_3
/*     */     //   47: aload_1
/*     */     //   48: invokevirtual getObservations : ()Ljava/util/List;
/*     */     //   51: checkcast java/lang/Iterable
/*     */     //   54: astore #5
/*     */     //   56: iconst_0
/*     */     //   57: istore #6
/*     */     //   59: aload #5
/*     */     //   61: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   66: astore #7
/*     */     //   68: aload #7
/*     */     //   70: invokeinterface hasNext : ()Z
/*     */     //   75: ifeq -> 116
/*     */     //   78: aload #7
/*     */     //   80: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   85: astore #8
/*     */     //   87: aload #8
/*     */     //   89: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   92: astore #9
/*     */     //   94: iconst_0
/*     */     //   95: istore #10
/*     */     //   97: aload #9
/*     */     //   99: invokevirtual getAction : ()Ljava/lang/String;
/*     */     //   102: ldc_w 'processed_issues'
/*     */     //   105: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   108: ifeq -> 68
/*     */     //   111: aload #8
/*     */     //   113: goto -> 117
/*     */     //   116: aconst_null
/*     */     //   117: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   120: astore #4
/*     */     //   122: aload_3
/*     */     //   123: ifnonnull -> 129
/*     */     //   126: aload #4
/*     */     //   128: areturn
/*     */     //   129: aload_2
/*     */     //   130: astore #6
/*     */     //   132: iconst_0
/*     */     //   133: istore #7
/*     */     //   135: aload #6
/*     */     //   137: aload #6
/*     */     //   139: invokeinterface size : ()I
/*     */     //   144: invokeinterface listIterator : (I)Ljava/util/ListIterator;
/*     */     //   149: astore #8
/*     */     //   151: aload #8
/*     */     //   153: invokeinterface hasPrevious : ()Z
/*     */     //   158: ifeq -> 229
/*     */     //   161: aload #8
/*     */     //   163: invokeinterface previous : ()Ljava/lang/Object;
/*     */     //   168: astore #9
/*     */     //   170: aload #9
/*     */     //   172: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   175: astore #10
/*     */     //   177: iconst_0
/*     */     //   178: istore #11
/*     */     //   180: getstatic com/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueAgentWorker$Companion;
/*     */     //   183: invokevirtual getTERMINAL_ACTIONS : ()Ljava/util/Set;
/*     */     //   186: checkcast java/lang/Iterable
/*     */     //   189: aload #10
/*     */     //   191: invokevirtual getAction : ()Ljava/lang/String;
/*     */     //   194: invokestatic contains : (Ljava/lang/Iterable;Ljava/lang/Object;)Z
/*     */     //   197: ifeq -> 220
/*     */     //   200: aload #10
/*     */     //   202: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   205: invokeinterface getKind : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   210: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.Assistant : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   213: if_acmpne -> 220
/*     */     //   216: iconst_1
/*     */     //   217: goto -> 221
/*     */     //   220: iconst_0
/*     */     //   221: ifeq -> 151
/*     */     //   224: aload #9
/*     */     //   226: goto -> 230
/*     */     //   229: aconst_null
/*     */     //   230: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   233: astore #5
/*     */     //   235: aload #5
/*     */     //   237: dup
/*     */     //   238: ifnull -> 247
/*     */     //   241: invokevirtual getAction : ()Ljava/lang/String;
/*     */     //   244: goto -> 249
/*     */     //   247: pop
/*     */     //   248: aconst_null
/*     */     //   249: astore #7
/*     */     //   251: aload #7
/*     */     //   253: ldc_w 'submit'
/*     */     //   256: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   259: ifeq -> 315
/*     */     //   262: aload #5
/*     */     //   264: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   267: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   272: astore #8
/*     */     //   274: aload #8
/*     */     //   276: ldc_w 'PREVIOUS_STEP'
/*     */     //   279: invokestatic getTextByXMLTag : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   282: astore #9
/*     */     //   284: aload #8
/*     */     //   286: ldc_w 'NEXT_STEP'
/*     */     //   289: invokestatic getTextByXMLTag : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   292: astore #10
/*     */     //   294: aload #9
/*     */     //   296: aload #10
/*     */     //   298: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   303: checkcast java/lang/CharSequence
/*     */     //   306: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   309: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   312: goto -> 377
/*     */     //   315: aload #7
/*     */     //   317: ldc_w 'answer'
/*     */     //   320: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   323: ifeq -> 374
/*     */     //   326: aload #5
/*     */     //   328: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   331: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   336: astore #8
/*     */     //   338: aload #8
/*     */     //   340: ldc_w 'COMMAND'
/*     */     //   343: invokestatic getTextByXMLTag : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   346: astore #9
/*     */     //   348: aload #9
/*     */     //   350: ldc_w 'answer'
/*     */     //   353: ldc_w ''
/*     */     //   356: iconst_0
/*     */     //   357: iconst_4
/*     */     //   358: aconst_null
/*     */     //   359: invokestatic replace$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;
/*     */     //   362: checkcast java/lang/CharSequence
/*     */     //   365: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */     //   368: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   371: goto -> 377
/*     */     //   374: ldc_w ''
/*     */     //   377: astore #6
/*     */     //   379: nop
/*     */     //   380: aload #6
/*     */     //   382: checkcast java/lang/CharSequence
/*     */     //   385: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   388: ifne -> 395
/*     */     //   391: iconst_1
/*     */     //   392: goto -> 396
/*     */     //   395: iconst_0
/*     */     //   396: ifeq -> 409
/*     */     //   399: aload #6
/*     */     //   401: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   406: goto -> 412
/*     */     //   409: ldc_w ''
/*     */     //   412: astore #7
/*     */     //   414: aload_3
/*     */     //   415: aload #7
/*     */     //   417: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   422: astore #8
/*     */     //   424: aload #4
/*     */     //   426: ifnull -> 488
/*     */     //   429: aload #4
/*     */     //   431: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   434: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   439: checkcast java/lang/CharSequence
/*     */     //   442: aload_3
/*     */     //   443: checkcast java/lang/CharSequence
/*     */     //   446: iconst_0
/*     */     //   447: iconst_2
/*     */     //   448: aconst_null
/*     */     //   449: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   452: ifne -> 475
/*     */     //   455: aload #4
/*     */     //   457: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   460: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   465: aload #8
/*     */     //   467: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   472: goto -> 501
/*     */     //   475: aload #4
/*     */     //   477: invokevirtual getElement : ()Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;
/*     */     //   480: invokeinterface getContent : ()Ljava/lang/String;
/*     */     //   485: goto -> 501
/*     */     //   488: aload #8
/*     */     //   490: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   495: aconst_null
/*     */     //   496: iconst_1
/*     */     //   497: aconst_null
/*     */     //   498: invokestatic trimMargin$default : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   501: astore #9
/*     */     //   503: new com/intellij/ml/llm/matterhorn/ej/core/AgentObservation
/*     */     //   506: dup
/*     */     //   507: aload #9
/*     */     //   509: invokestatic toUserMessage : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;
/*     */     //   512: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChatElement
/*     */     //   515: ldc_w 'processed_issues'
/*     */     //   518: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;Ljava/lang/String;)V
/*     */     //   521: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #496	-> 0
/*     */     //   #496	-> 44
/*     */     //   #497	-> 47
/*     */     //   #632	-> 59
/*     */     //   #498	-> 97
/*     */     //   #632	-> 108
/*     */     //   #633	-> 116
/*     */     //   #497	-> 117
/*     */     //   #500	-> 122
/*     */     //   #502	-> 129
/*     */     //   #634	-> 135
/*     */     //   #635	-> 151
/*     */     //   #636	-> 161
/*     */     //   #637	-> 170
/*     */     //   #503	-> 180
/*     */     //   #637	-> 221
/*     */     //   #639	-> 229
/*     */     //   #502	-> 230
/*     */     //   #505	-> 235
/*     */     //   #506	-> 251
/*     */     //   #507	-> 262
/*     */     //   #508	-> 274
/*     */     //   #509	-> 284
/*     */     //   #510	-> 294
/*     */     //   #513	-> 315
/*     */     //   #514	-> 326
/*     */     //   #515	-> 338
/*     */     //   #516	-> 348
/*     */     //   #519	-> 374
/*     */     //   #505	-> 377
/*     */     //   #522	-> 379
/*     */     //   #523	-> 380
/*     */     //   #523	-> 396
/*     */     //   #524	-> 409
/*     */     //   #522	-> 412
/*     */     //   #526	-> 414
/*     */     //   #527	-> 424
/*     */     //   #528	-> 429
/*     */     //   #529	-> 455
/*     */     //   #530	-> 475
/*     */     //   #535	-> 488
/*     */     //   #536	-> 495
/*     */     //   #527	-> 501
/*     */     //   #539	-> 503
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	11	10	$i$a$-firstOrNull-CompressHistoryProcessor$processPrevTasks$prevTaskMessagesProcessed$1	I
/*     */     //   94	14	9	message	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   87	29	8	element$iv	Ljava/lang/Object;
/*     */     //   59	58	6	$i$f$firstOrNull	I
/*     */     //   56	61	5	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*     */     //   180	41	11	$i$a$-lastOrNull-CompressHistoryProcessor$processPrevTasks$lastTerminalObservation$1	I
/*     */     //   177	44	10	message	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   170	59	9	element$iv	Ljava/lang/Object;
/*     */     //   135	95	7	$i$f$lastOrNull	I
/*     */     //   151	79	8	iterator$iv	Ljava/util/ListIterator;
/*     */     //   132	98	6	$this$lastOrNull$iv	Ljava/util/List;
/*     */     //   274	38	8	content	Ljava/lang/String;
/*     */     //   284	28	9	thoughPrevStep	Ljava/lang/String;
/*     */     //   294	18	10	thoughNextStep	Ljava/lang/String;
/*     */     //   338	33	8	content	Ljava/lang/String;
/*     */     //   348	23	9	command	Ljava/lang/String;
/*     */     //   47	475	3	prevTask	Ljava/lang/String;
/*     */     //   122	400	4	prevTaskMessagesProcessed	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   235	287	5	lastTerminalObservation	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;
/*     */     //   379	143	6	prevSummary	Ljava/lang/String;
/*     */     //   414	108	7	prevSummaryWrapped	Ljava/lang/String;
/*     */     //   424	98	8	prevTaskWrapped	Ljava/lang/String;
/*     */     //   503	19	9	result	Ljava/lang/String;
/*     */     //   0	522	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   0	522	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentState;
/* 640 */     //   0	522	2	lastObservations	Ljava/util/List; } private final TrajectoryElementAgent getTrajectoryElementAgentForCompressHistory(String agentType, ModelParameters modelParameters) { Json json = JsonKt.Json$default(null, CompressHistoryProcessor::getTrajectoryElementAgentForCompressHistory$lambda$20, 1, null); String modelName = modelParameters.getModel().toString(); Json this_$iv = json; int $i$f$encodeToString = 0; this_$iv.getSerializersModule(); String agentParametersStr = this_$iv.encodeToString((SerializationStrategy)ModelParameters.Companion.serializer(), modelParameters);
/*     */     return new TrajectoryElementAgent(agentType, "0.1", modelName, agentParametersStr, null, 16, null); }
/*     */ 
/*     */   
/*     */   private static final Unit getTrajectoryElementAgentForCompressHistory$lambda$20(JsonBuilder $this$Json) {
/*     */     Intrinsics.checkNotNullParameter($this$Json, "$this$Json");
/*     */     $this$Json.setEncodeDefaults(true);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final Object logCompressHistoryTrajectories(ExecutionContext context, String agentType, ModelParameters modelParameters, String systemMessage, String prompt, String response, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #7
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$logCompressHistoryTrajectories$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #7
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$logCompressHistoryTrajectories$1
/*     */     //   13: astore #10
/*     */     //   15: aload #10
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #10
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor$logCompressHistoryTrajectories$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #7
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #10
/*     */     //   53: aload #10
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #9
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #11
/*     */     //   65: aload #10
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 457, 0 -> 100, 1 -> 203, 2 -> 337, 3 -> 445
/*     */     //   100: aload #9
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: aload_0
/*     */     //   106: aload_2
/*     */     //   107: aload_3
/*     */     //   108: invokespecial getTrajectoryElementAgentForCompressHistory : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;)Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;
/*     */     //   111: astore #8
/*     */     //   113: aload #4
/*     */     //   115: checkcast java/lang/CharSequence
/*     */     //   118: invokeinterface length : ()I
/*     */     //   123: ifle -> 130
/*     */     //   126: iconst_1
/*     */     //   127: goto -> 131
/*     */     //   130: iconst_0
/*     */     //   131: ifeq -> 250
/*     */     //   134: aload_1
/*     */     //   135: new com/intellij/ml/llm/matterhorn/UserTrajectoryElement
/*     */     //   138: dup
/*     */     //   139: aload #8
/*     */     //   141: aload #4
/*     */     //   143: ldc_w 'system'
/*     */     //   146: iconst_0
/*     */     //   147: bipush #8
/*     */     //   149: aconst_null
/*     */     //   150: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   153: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   156: aload #10
/*     */     //   158: aload #10
/*     */     //   160: aload_1
/*     */     //   161: putfield L$0 : Ljava/lang/Object;
/*     */     //   164: aload #10
/*     */     //   166: aload #5
/*     */     //   168: putfield L$1 : Ljava/lang/Object;
/*     */     //   171: aload #10
/*     */     //   173: aload #6
/*     */     //   175: putfield L$2 : Ljava/lang/Object;
/*     */     //   178: aload #10
/*     */     //   180: aload #8
/*     */     //   182: putfield L$3 : Ljava/lang/Object;
/*     */     //   185: aload #10
/*     */     //   187: iconst_1
/*     */     //   188: putfield label : I
/*     */     //   191: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   194: dup
/*     */     //   195: aload #11
/*     */     //   197: if_acmpne -> 249
/*     */     //   200: aload #11
/*     */     //   202: areturn
/*     */     //   203: aload #10
/*     */     //   205: getfield L$3 : Ljava/lang/Object;
/*     */     //   208: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   211: astore #8
/*     */     //   213: aload #10
/*     */     //   215: getfield L$2 : Ljava/lang/Object;
/*     */     //   218: checkcast java/lang/String
/*     */     //   221: astore #6
/*     */     //   223: aload #10
/*     */     //   225: getfield L$1 : Ljava/lang/Object;
/*     */     //   228: checkcast java/lang/String
/*     */     //   231: astore #5
/*     */     //   233: aload #10
/*     */     //   235: getfield L$0 : Ljava/lang/Object;
/*     */     //   238: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   241: astore_1
/*     */     //   242: aload #9
/*     */     //   244: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   247: aload #9
/*     */     //   249: pop
/*     */     //   250: aload #5
/*     */     //   252: checkcast java/lang/CharSequence
/*     */     //   255: invokeinterface length : ()I
/*     */     //   260: ifle -> 267
/*     */     //   263: iconst_1
/*     */     //   264: goto -> 268
/*     */     //   267: iconst_0
/*     */     //   268: ifeq -> 374
/*     */     //   271: aload_1
/*     */     //   272: new com/intellij/ml/llm/matterhorn/UserTrajectoryElement
/*     */     //   275: dup
/*     */     //   276: aload #8
/*     */     //   278: aload #5
/*     */     //   280: aconst_null
/*     */     //   281: iconst_0
/*     */     //   282: bipush #12
/*     */     //   284: aconst_null
/*     */     //   285: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   288: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   291: aload #10
/*     */     //   293: aload #10
/*     */     //   295: aload_1
/*     */     //   296: putfield L$0 : Ljava/lang/Object;
/*     */     //   299: aload #10
/*     */     //   301: aload #6
/*     */     //   303: putfield L$1 : Ljava/lang/Object;
/*     */     //   306: aload #10
/*     */     //   308: aload #8
/*     */     //   310: putfield L$2 : Ljava/lang/Object;
/*     */     //   313: aload #10
/*     */     //   315: aconst_null
/*     */     //   316: putfield L$3 : Ljava/lang/Object;
/*     */     //   319: aload #10
/*     */     //   321: iconst_2
/*     */     //   322: putfield label : I
/*     */     //   325: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   328: dup
/*     */     //   329: aload #11
/*     */     //   331: if_acmpne -> 373
/*     */     //   334: aload #11
/*     */     //   336: areturn
/*     */     //   337: aload #10
/*     */     //   339: getfield L$2 : Ljava/lang/Object;
/*     */     //   342: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElementAgent
/*     */     //   345: astore #8
/*     */     //   347: aload #10
/*     */     //   349: getfield L$1 : Ljava/lang/Object;
/*     */     //   352: checkcast java/lang/String
/*     */     //   355: astore #6
/*     */     //   357: aload #10
/*     */     //   359: getfield L$0 : Ljava/lang/Object;
/*     */     //   362: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   365: astore_1
/*     */     //   366: aload #9
/*     */     //   368: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   371: aload #9
/*     */     //   373: pop
/*     */     //   374: aload_1
/*     */     //   375: new com/intellij/ml/llm/matterhorn/AssistantTrajectoryElement
/*     */     //   378: dup
/*     */     //   379: aload #8
/*     */     //   381: aload #6
/*     */     //   383: ldc_w ''
/*     */     //   386: ldc_w ''
/*     */     //   389: aconst_null
/*     */     //   390: aconst_null
/*     */     //   391: aconst_null
/*     */     //   392: bipush #64
/*     */     //   394: aconst_null
/*     */     //   395: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   398: checkcast com/intellij/ml/llm/matterhorn/TrajectoryElement
/*     */     //   401: aload #10
/*     */     //   403: aload #10
/*     */     //   405: aconst_null
/*     */     //   406: putfield L$0 : Ljava/lang/Object;
/*     */     //   409: aload #10
/*     */     //   411: aconst_null
/*     */     //   412: putfield L$1 : Ljava/lang/Object;
/*     */     //   415: aload #10
/*     */     //   417: aconst_null
/*     */     //   418: putfield L$2 : Ljava/lang/Object;
/*     */     //   421: aload #10
/*     */     //   423: aconst_null
/*     */     //   424: putfield L$3 : Ljava/lang/Object;
/*     */     //   427: aload #10
/*     */     //   429: iconst_3
/*     */     //   430: putfield label : I
/*     */     //   433: invokevirtual logTrajectoryElement : (Lcom/intellij/ml/llm/matterhorn/TrajectoryElement;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   436: dup
/*     */     //   437: aload #11
/*     */     //   439: if_acmpne -> 452
/*     */     //   442: aload #11
/*     */     //   444: areturn
/*     */     //   445: aload #9
/*     */     //   447: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   450: aload #9
/*     */     //   452: pop
/*     */     //   453: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   456: areturn
/*     */     //   457: new java/lang/IllegalStateException
/*     */     //   460: dup
/*     */     //   461: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   464: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   467: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #552	-> 63
/*     */     //   #556	-> 105
/*     */     //   #557	-> 113
/*     */     //   #557	-> 131
/*     */     //   #558	-> 134
/*     */     //   #552	-> 200
/*     */     //   #560	-> 249
/*     */     //   #560	-> 268
/*     */     //   #561	-> 271
/*     */     //   #552	-> 334
/*     */     //   #563	-> 373
/*     */     //   #552	-> 442
/*     */     //   #564	-> 452
/*     */     //   #552	-> 457
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	8	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/history_processors/CompressHistoryProcessor;
/*     */     //   105	98	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   242	95	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   366	70	1	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   105	8	2	agentType	Ljava/lang/String;
/*     */     //   105	8	3	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   105	26	4	systemMessage	Ljava/lang/String;
/*     */     //   131	63	4	systemMessage	Ljava/lang/String;
/*     */     //   105	98	5	prompt	Ljava/lang/String;
/*     */     //   233	35	5	prompt	Ljava/lang/String;
/*     */     //   268	60	5	prompt	Ljava/lang/String;
/*     */     //   105	98	6	response	Ljava/lang/String;
/*     */     //   223	114	6	response	Ljava/lang/String;
/*     */     //   357	79	6	response	Ljava/lang/String;
/*     */     //   113	90	8	curTrajectoryElementAgent	Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;
/*     */     //   213	124	8	curTrajectoryElementAgent	Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;
/*     */     //   347	89	8	curTrajectoryElementAgent	Lcom/intellij/ml/llm/matterhorn/TrajectoryElementAgent;
/*     */     //   0	468	7	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	404	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	397	9	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object produceArtifact(@NotNull AgentState input, @NotNull ExecutionContext context, @NotNull Continuation<? super ArtifactResponse<CompressHistoryProcessorResponse>> $completion) {
/*     */     return produceArtifact$suspendImpl(this, input, context, $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CompressHistoryProcessor.kt", l = {558, 561, 563}, i = {0, 0, 0, 0, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"}, n = {"context", "prompt", "response", "curTrajectoryElementAgent", "context", "response", "curTrajectoryElementAgent"}, m = "logCompressHistoryTrajectories", c = "com.intellij.ml.llm.matterhorn.ej.core.history_processors.CompressHistoryProcessor")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CompressHistoryProcessor$logCompressHistoryTrajectories$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     CompressHistoryProcessor$logCompressHistoryTrajectories$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CompressHistoryProcessor.this.logCompressHistoryTrajectories(null, null, null, null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CompressHistoryProcessor.kt", l = {371}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3"}, n = {"this", "context", "editedFiles", "destination$iv$iv"}, m = "printAllCode", c = "com.intellij.ml.llm.matterhorn.ej.core.history_processors.CompressHistoryProcessor")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CompressHistoryProcessor$printAllCode$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     int label;
/*     */     
/*     */     CompressHistoryProcessor$printAllCode$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CompressHistoryProcessor.this.printAllCode(null, null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CompressHistoryProcessor.kt", l = {276, 283}, i = {0, 0, 1, 1, 1}, s = {"L$0", "Z$0", "L$0", "L$1", "Z$0"}, n = {"codeRanges", "fileWasEdited", "codeRanges", "path", "fileWasEdited"}, m = "printOneFile", c = "com.intellij.ml.llm.matterhorn.ej.core.history_processors.CompressHistoryProcessor")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CompressHistoryProcessor$printOneFile$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     boolean Z$0;
/*     */     int label;
/*     */     
/*     */     CompressHistoryProcessor$printOneFile$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CompressHistoryProcessor.this.printOneFile(null, null, null, false, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CompressHistoryProcessor.kt", l = {195, 219, 243, 254}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"this", "input", "context", "processedObservations", "lastObservations", "historyObservations", "context", "processedObservations", "lastObservations", "context", "processedObservations", "trajectoryElementAgent", "context", "processedObservations", "trajectoryElementAgent"}, m = "processObservations", c = "com.intellij.ml.llm.matterhorn.ej.core.history_processors.CompressHistoryProcessor")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CompressHistoryProcessor$processObservations$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     int label;
/*     */     
/*     */     CompressHistoryProcessor$processObservations$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CompressHistoryProcessor.this.processObservations(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CompressHistoryProcessor.kt", l = {458, 465}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"}, n = {"this", "context", "formattedProcessedOther", "inputForSummary", "modelParameters", "systemMessage", "this", "formattedProcessedOther", "answerLLM"}, m = "processOtherMessages", c = "com.intellij.ml.llm.matterhorn.ej.core.history_processors.CompressHistoryProcessor")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CompressHistoryProcessor$processOtherMessages$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     int label;
/*     */     
/*     */     CompressHistoryProcessor$processOtherMessages$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CompressHistoryProcessor.this.processOtherMessages(null, null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CompressHistoryProcessor.kt", l = {266}, i = {}, s = {}, n = {}, m = "produceArtifact$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.history_processors.CompressHistoryProcessor")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CompressHistoryProcessor$produceArtifact$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     CompressHistoryProcessor$produceArtifact$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CompressHistoryProcessor.produceArtifact$suspendImpl(CompressHistoryProcessor.this, null, null, (Continuation<? super ArtifactResponse<CompressHistoryProcessorResponse>>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\history_processors\CompressHistoryProcessor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */