/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.PathListSerializer;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.PreviousTasksInfo;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.PreviousTasksInfo$;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessagePart;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.nio.file.Path;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlin.reflect.KClass;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.ArrayListSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000p\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\021\n\002\030\002\n\000\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 A2\0020\001:\002ABBm\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\003\022\n\b\002\020\005\032\004\030\0010\006\022\016\b\002\020\007\032\b\022\004\022\0020\t0\b\022\b\020\n\032\004\030\0010\013\022\016\b\002\020\f\032\b\022\004\022\0020\r0\b\022\016\b\002\020\016\032\b\022\004\022\0020\0170\b\022\n\b\002\020\020\032\004\030\0010\003¢\006\004\b\021\020\022B}\b\020\022\006\020\023\032\0020\024\022\b\020\002\032\004\030\0010\003\022\b\020\004\032\004\030\0010\003\022\b\020\005\032\004\030\0010\006\022\016\020\007\032\n\022\004\022\0020\t\030\0010\b\022\b\020\n\032\004\030\0010\013\022\016\020\f\032\n\022\004\022\0020\r\030\0010\b\022\016\020\016\032\n\022\004\022\0020\017\030\0010\b\022\b\020\020\032\004\030\0010\003\022\b\020\025\032\004\030\0010\026¢\006\004\b\021\020\027J\b\020&\032\0020\003H\026J\030\020'\032\004\030\0010(2\006\020)\032\0020*H@¢\006\002\020+J\t\020,\032\0020\003HÆ\003J\t\020-\032\0020\003HÆ\003J\013\020.\032\004\030\0010\006HÆ\003J\017\020/\032\b\022\004\022\0020\t0\bHÆ\003J\013\0200\032\004\030\0010\013HÆ\003J\017\0201\032\b\022\004\022\0020\r0\bHÆ\003J\017\0202\032\b\022\004\022\0020\0170\bHÆ\003J\013\0203\032\004\030\0010\003HÆ\003Jq\0204\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0032\n\b\002\020\005\032\004\030\0010\0062\016\b\002\020\007\032\b\022\004\022\0020\t0\b2\n\b\002\020\n\032\004\030\0010\0132\016\b\002\020\f\032\b\022\004\022\0020\r0\b2\016\b\002\020\016\032\b\022\004\022\0020\0170\b2\n\b\002\020\020\032\004\030\0010\003HÆ\001J\023\0205\032\002062\b\0207\032\004\030\0010\001HÖ\003J\t\0208\032\0020\024HÖ\001J%\0209\032\0020:2\006\020;\032\0020\0002\006\020<\032\0020=2\006\020>\032\0020?H\001¢\006\002\b@R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\030\020\031R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\032\020\031R\023\020\005\032\004\030\0010\006¢\006\b\n\000\032\004\b\033\020\034R\"\020\007\032\b\022\004\022\0020\t0\b8\006X\004¢\006\016\n\000\022\004\b\035\020\036\032\004\b\037\020 R\023\020\n\032\004\030\0010\013¢\006\b\n\000\032\004\b!\020\"R\027\020\f\032\b\022\004\022\0020\r0\b¢\006\b\n\000\032\004\b#\020 R\027\020\016\032\b\022\004\022\0020\0170\b¢\006\b\n\000\032\004\b$\020 R\023\020\020\032\004\030\0010\003¢\006\b\n\000\032\004\b%\020\031¨\006C"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "", "name", "", "description", "editorContext", "Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;", "explicitlySelectedUserPaths", "", "Ljava/nio/file/Path;", "previousTasksInfo", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;", "preChatObservations", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentObservation;", "attachedFiles", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessagePart;", "sourcesRegexFilter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getName", "()Ljava/lang/String;", "getDescription", "getEditorContext", "()Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;", "getExplicitlySelectedUserPaths$annotations", "()V", "getExplicitlySelectedUserPaths", "()Ljava/util/List;", "getPreviousTasksInfo", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;", "getPreChatObservations", "getAttachedFiles", "getSourcesRegexFilter", "toString", "getExplicitlySelectedUserPathsMessage", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "Companion", "$serializer", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAgentIssue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentIssue.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentIssue\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,157:1\n1557#2:158\n1628#2,3:159\n14#3:162\n*S KotlinDebug\n*F\n+ 1 AgentIssue.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentIssue\n*L\n125#1:158\n125#1:159,3\n138#1:162\n*E\n"})
/*     */ public final class AgentIssue {
/*  40 */   public AgentIssue(@NotNull String name, @NotNull String description, @Nullable EditorContext editorContext, @NotNull List<Path> explicitlySelectedUserPaths, @Nullable PreviousTasksInfo previousTasksInfo, @NotNull List<AgentObservation> preChatObservations, @NotNull List<MatterhornChatMessagePart> attachedFiles, @Nullable String sourcesRegexFilter) { this.name = name;
/*  41 */     this.description = description;
/*  42 */     this.editorContext = editorContext;
/*  43 */     this.explicitlySelectedUserPaths = explicitlySelectedUserPaths;
/*     */     
/*  45 */     this.previousTasksInfo = previousTasksInfo;
/*  46 */     this.preChatObservations = preChatObservations;
/*  47 */     this.attachedFiles = attachedFiles;
/*  48 */     this.sourcesRegexFilter = sourcesRegexFilter; } @NotNull public final String getName() { return this.name; } @NotNull public final String getDescription() { return this.description; } @Nullable public final EditorContext getEditorContext() { return this.editorContext; } @Nullable public final String getSourcesRegexFilter() { return this.sourcesRegexFilter; }
/*     */   @NotNull public final List<Path> getExplicitlySelectedUserPaths() { return this.explicitlySelectedUserPaths; }
/*     */   @Nullable public final PreviousTasksInfo getPreviousTasksInfo() { return this.previousTasksInfo; }
/*  51 */   @NotNull public final List<AgentObservation> getPreChatObservations() { return this.preChatObservations; } @NotNull public final List<MatterhornChatMessagePart> getAttachedFiles() { return this.attachedFiles; } @NotNull public String toString() { if (!((((CharSequence)this.name).length() == 0) ? 1 : 0)) {
/*  52 */       return "## " + this.name + "\n" + this.description;
/*     */     }
/*  54 */     return this.description; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object getExplicitlySelectedUserPathsMessage(@NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/AgentIssue$getExplicitlySelectedUserPathsMessage$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentIssue$getExplicitlySelectedUserPathsMessage$1
/*     */     //   11: astore #23
/*     */     //   13: aload #23
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #23
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/AgentIssue$getExplicitlySelectedUserPathsMessage$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #23
/*     */     //   50: aload #23
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #22
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #30
/*     */     //   62: aload #23
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 2045, 0 -> 104, 1 -> 273, 2 -> 508, 3 -> 708, 4 -> 971, 5 -> 1184
/*     */     //   104: aload #22
/*     */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   109: aload_0
/*     */     //   110: getfield explicitlySelectedUserPaths : Ljava/util/List;
/*     */     //   113: invokeinterface isEmpty : ()Z
/*     */     //   118: ifeq -> 123
/*     */     //   121: aconst_null
/*     */     //   122: areturn
/*     */     //   123: new java/util/ArrayList
/*     */     //   126: dup
/*     */     //   127: invokespecial <init> : ()V
/*     */     //   130: checkcast java/util/List
/*     */     //   133: astore_3
/*     */     //   134: new java/util/ArrayList
/*     */     //   137: dup
/*     */     //   138: invokespecial <init> : ()V
/*     */     //   141: checkcast java/util/List
/*     */     //   144: astore #4
/*     */     //   146: iconst_0
/*     */     //   147: istore #5
/*     */     //   149: iconst_0
/*     */     //   150: istore #6
/*     */     //   152: aload_0
/*     */     //   153: getfield explicitlySelectedUserPaths : Ljava/util/List;
/*     */     //   156: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   161: astore #7
/*     */     //   163: aload #7
/*     */     //   165: invokeinterface hasNext : ()Z
/*     */     //   170: ifeq -> 1288
/*     */     //   173: aload #7
/*     */     //   175: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   180: checkcast java/nio/file/Path
/*     */     //   183: astore #8
/*     */     //   185: aload #8
/*     */     //   187: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   190: aload_1
/*     */     //   191: iconst_0
/*     */     //   192: aload #23
/*     */     //   194: iconst_4
/*     */     //   195: aconst_null
/*     */     //   196: aload #23
/*     */     //   198: aload_0
/*     */     //   199: putfield L$0 : Ljava/lang/Object;
/*     */     //   202: aload #23
/*     */     //   204: aload_1
/*     */     //   205: putfield L$1 : Ljava/lang/Object;
/*     */     //   208: aload #23
/*     */     //   210: aload_3
/*     */     //   211: putfield L$2 : Ljava/lang/Object;
/*     */     //   214: aload #23
/*     */     //   216: aload #4
/*     */     //   218: putfield L$3 : Ljava/lang/Object;
/*     */     //   221: aload #23
/*     */     //   223: aload #7
/*     */     //   225: putfield L$4 : Ljava/lang/Object;
/*     */     //   228: aload #23
/*     */     //   230: aload #8
/*     */     //   232: putfield L$5 : Ljava/lang/Object;
/*     */     //   235: aload #23
/*     */     //   237: aconst_null
/*     */     //   238: putfield L$6 : Ljava/lang/Object;
/*     */     //   241: aload #23
/*     */     //   243: iload #5
/*     */     //   245: putfield I$0 : I
/*     */     //   248: aload #23
/*     */     //   250: iload #6
/*     */     //   252: putfield I$1 : I
/*     */     //   255: aload #23
/*     */     //   257: iconst_1
/*     */     //   258: putfield label : I
/*     */     //   261: invokestatic smartLocateFile$default : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   264: dup
/*     */     //   265: aload #30
/*     */     //   267: if_acmpne -> 351
/*     */     //   270: aload #30
/*     */     //   272: areturn
/*     */     //   273: aload #23
/*     */     //   275: getfield I$1 : I
/*     */     //   278: istore #6
/*     */     //   280: aload #23
/*     */     //   282: getfield I$0 : I
/*     */     //   285: istore #5
/*     */     //   287: aload #23
/*     */     //   289: getfield L$5 : Ljava/lang/Object;
/*     */     //   292: checkcast java/nio/file/Path
/*     */     //   295: astore #8
/*     */     //   297: aload #23
/*     */     //   299: getfield L$4 : Ljava/lang/Object;
/*     */     //   302: checkcast java/util/Iterator
/*     */     //   305: astore #7
/*     */     //   307: aload #23
/*     */     //   309: getfield L$3 : Ljava/lang/Object;
/*     */     //   312: checkcast java/util/List
/*     */     //   315: astore #4
/*     */     //   317: aload #23
/*     */     //   319: getfield L$2 : Ljava/lang/Object;
/*     */     //   322: checkcast java/util/List
/*     */     //   325: astore_3
/*     */     //   326: aload #23
/*     */     //   328: getfield L$1 : Ljava/lang/Object;
/*     */     //   331: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   334: astore_1
/*     */     //   335: aload #23
/*     */     //   337: getfield L$0 : Ljava/lang/Object;
/*     */     //   340: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentIssue
/*     */     //   343: astore_0
/*     */     //   344: aload #22
/*     */     //   346: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   349: aload #22
/*     */     //   351: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   354: astore #10
/*     */     //   356: aload #10
/*     */     //   358: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   361: ifeq -> 368
/*     */     //   364: aconst_null
/*     */     //   365: goto -> 398
/*     */     //   368: aload #10
/*     */     //   370: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   373: ifeq -> 390
/*     */     //   376: aload #10
/*     */     //   378: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   381: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   384: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   387: goto -> 398
/*     */     //   390: new kotlin/NoWhenBranchMatchedException
/*     */     //   393: dup
/*     */     //   394: invokespecial <init> : ()V
/*     */     //   397: athrow
/*     */     //   398: astore #9
/*     */     //   400: aload #9
/*     */     //   402: ifnonnull -> 420
/*     */     //   405: aload #4
/*     */     //   407: aload #8
/*     */     //   409: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   414: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   417: goto -> 1284
/*     */     //   420: aload_1
/*     */     //   421: aload #9
/*     */     //   423: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function0;
/*     */     //   428: aload #23
/*     */     //   430: aload #23
/*     */     //   432: aload_0
/*     */     //   433: putfield L$0 : Ljava/lang/Object;
/*     */     //   436: aload #23
/*     */     //   438: aload_1
/*     */     //   439: putfield L$1 : Ljava/lang/Object;
/*     */     //   442: aload #23
/*     */     //   444: aload_3
/*     */     //   445: putfield L$2 : Ljava/lang/Object;
/*     */     //   448: aload #23
/*     */     //   450: aload #4
/*     */     //   452: putfield L$3 : Ljava/lang/Object;
/*     */     //   455: aload #23
/*     */     //   457: aload #7
/*     */     //   459: putfield L$4 : Ljava/lang/Object;
/*     */     //   462: aload #23
/*     */     //   464: aload #8
/*     */     //   466: putfield L$5 : Ljava/lang/Object;
/*     */     //   469: aload #23
/*     */     //   471: aload #9
/*     */     //   473: putfield L$6 : Ljava/lang/Object;
/*     */     //   476: aload #23
/*     */     //   478: iload #5
/*     */     //   480: putfield I$0 : I
/*     */     //   483: aload #23
/*     */     //   485: iload #6
/*     */     //   487: putfield I$1 : I
/*     */     //   490: aload #23
/*     */     //   492: iconst_2
/*     */     //   493: putfield label : I
/*     */     //   496: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   499: dup
/*     */     //   500: aload #30
/*     */     //   502: if_acmpne -> 596
/*     */     //   505: aload #30
/*     */     //   507: areturn
/*     */     //   508: aload #23
/*     */     //   510: getfield I$1 : I
/*     */     //   513: istore #6
/*     */     //   515: aload #23
/*     */     //   517: getfield I$0 : I
/*     */     //   520: istore #5
/*     */     //   522: aload #23
/*     */     //   524: getfield L$6 : Ljava/lang/Object;
/*     */     //   527: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   530: astore #9
/*     */     //   532: aload #23
/*     */     //   534: getfield L$5 : Ljava/lang/Object;
/*     */     //   537: checkcast java/nio/file/Path
/*     */     //   540: astore #8
/*     */     //   542: aload #23
/*     */     //   544: getfield L$4 : Ljava/lang/Object;
/*     */     //   547: checkcast java/util/Iterator
/*     */     //   550: astore #7
/*     */     //   552: aload #23
/*     */     //   554: getfield L$3 : Ljava/lang/Object;
/*     */     //   557: checkcast java/util/List
/*     */     //   560: astore #4
/*     */     //   562: aload #23
/*     */     //   564: getfield L$2 : Ljava/lang/Object;
/*     */     //   567: checkcast java/util/List
/*     */     //   570: astore_3
/*     */     //   571: aload #23
/*     */     //   573: getfield L$1 : Ljava/lang/Object;
/*     */     //   576: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   579: astore_1
/*     */     //   580: aload #23
/*     */     //   582: getfield L$0 : Ljava/lang/Object;
/*     */     //   585: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentIssue
/*     */     //   588: astore_0
/*     */     //   589: aload #22
/*     */     //   591: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   594: aload #22
/*     */     //   596: checkcast com/intellij/psi/PsiFile
/*     */     //   599: astore #10
/*     */     //   601: aload #10
/*     */     //   603: ifnonnull -> 621
/*     */     //   606: aload #4
/*     */     //   608: aload #8
/*     */     //   610: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   615: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   618: goto -> 1284
/*     */     //   621: aload #9
/*     */     //   623: <illegal opcode> invoke : (Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function0;
/*     */     //   628: aload #23
/*     */     //   630: aload #23
/*     */     //   632: aload_0
/*     */     //   633: putfield L$0 : Ljava/lang/Object;
/*     */     //   636: aload #23
/*     */     //   638: aload_1
/*     */     //   639: putfield L$1 : Ljava/lang/Object;
/*     */     //   642: aload #23
/*     */     //   644: aload_3
/*     */     //   645: putfield L$2 : Ljava/lang/Object;
/*     */     //   648: aload #23
/*     */     //   650: aload #4
/*     */     //   652: putfield L$3 : Ljava/lang/Object;
/*     */     //   655: aload #23
/*     */     //   657: aload #7
/*     */     //   659: putfield L$4 : Ljava/lang/Object;
/*     */     //   662: aload #23
/*     */     //   664: aload #8
/*     */     //   666: putfield L$5 : Ljava/lang/Object;
/*     */     //   669: aload #23
/*     */     //   671: aload #9
/*     */     //   673: putfield L$6 : Ljava/lang/Object;
/*     */     //   676: aload #23
/*     */     //   678: iload #5
/*     */     //   680: putfield I$0 : I
/*     */     //   683: aload #23
/*     */     //   685: iload #6
/*     */     //   687: putfield I$1 : I
/*     */     //   690: aload #23
/*     */     //   692: iconst_3
/*     */     //   693: putfield label : I
/*     */     //   696: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   699: dup
/*     */     //   700: aload #30
/*     */     //   702: if_acmpne -> 796
/*     */     //   705: aload #30
/*     */     //   707: areturn
/*     */     //   708: aload #23
/*     */     //   710: getfield I$1 : I
/*     */     //   713: istore #6
/*     */     //   715: aload #23
/*     */     //   717: getfield I$0 : I
/*     */     //   720: istore #5
/*     */     //   722: aload #23
/*     */     //   724: getfield L$6 : Ljava/lang/Object;
/*     */     //   727: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   730: astore #9
/*     */     //   732: aload #23
/*     */     //   734: getfield L$5 : Ljava/lang/Object;
/*     */     //   737: checkcast java/nio/file/Path
/*     */     //   740: astore #8
/*     */     //   742: aload #23
/*     */     //   744: getfield L$4 : Ljava/lang/Object;
/*     */     //   747: checkcast java/util/Iterator
/*     */     //   750: astore #7
/*     */     //   752: aload #23
/*     */     //   754: getfield L$3 : Ljava/lang/Object;
/*     */     //   757: checkcast java/util/List
/*     */     //   760: astore #4
/*     */     //   762: aload #23
/*     */     //   764: getfield L$2 : Ljava/lang/Object;
/*     */     //   767: checkcast java/util/List
/*     */     //   770: astore_3
/*     */     //   771: aload #23
/*     */     //   773: getfield L$1 : Ljava/lang/Object;
/*     */     //   776: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   779: astore_1
/*     */     //   780: aload #23
/*     */     //   782: getfield L$0 : Ljava/lang/Object;
/*     */     //   785: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentIssue
/*     */     //   788: astore_0
/*     */     //   789: aload #22
/*     */     //   791: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   794: aload #22
/*     */     //   796: checkcast com/intellij/openapi/editor/Document
/*     */     //   799: astore #11
/*     */     //   801: aload #11
/*     */     //   803: dup
/*     */     //   804: ifnull -> 815
/*     */     //   807: invokeinterface getLineCount : ()I
/*     */     //   812: goto -> 817
/*     */     //   815: pop
/*     */     //   816: iconst_0
/*     */     //   817: istore #12
/*     */     //   819: aload #9
/*     */     //   821: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*     */     //   824: dup
/*     */     //   825: ifnonnull -> 832
/*     */     //   828: pop
/*     */     //   829: goto -> 163
/*     */     //   832: astore #13
/*     */     //   834: aload_1
/*     */     //   835: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   840: aload #13
/*     */     //   842: invokevirtual markViewedFile : (Ljava/nio/file/Path;)V
/*     */     //   845: iload #12
/*     */     //   847: sipush #4000
/*     */     //   850: aload_0
/*     */     //   851: getfield explicitlySelectedUserPaths : Ljava/util/List;
/*     */     //   854: invokeinterface size : ()I
/*     */     //   859: idiv
/*     */     //   860: sipush #200
/*     */     //   863: invokestatic max : (II)I
/*     */     //   866: if_icmpge -> 1080
/*     */     //   869: iload #12
/*     */     //   871: sipush #1500
/*     */     //   874: if_icmpge -> 1080
/*     */     //   877: aload_1
/*     */     //   878: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   883: aload #9
/*     */     //   885: iconst_1
/*     */     //   886: sipush #1500
/*     */     //   889: aconst_null
/*     */     //   890: aload_1
/*     */     //   891: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   896: aload #23
/*     */     //   898: bipush #16
/*     */     //   900: aconst_null
/*     */     //   901: aload #23
/*     */     //   903: aload_0
/*     */     //   904: putfield L$0 : Ljava/lang/Object;
/*     */     //   907: aload #23
/*     */     //   909: aload_1
/*     */     //   910: putfield L$1 : Ljava/lang/Object;
/*     */     //   913: aload #23
/*     */     //   915: aload_3
/*     */     //   916: putfield L$2 : Ljava/lang/Object;
/*     */     //   919: aload #23
/*     */     //   921: aload #4
/*     */     //   923: putfield L$3 : Ljava/lang/Object;
/*     */     //   926: aload #23
/*     */     //   928: aload #7
/*     */     //   930: putfield L$4 : Ljava/lang/Object;
/*     */     //   933: aload #23
/*     */     //   935: aload #8
/*     */     //   937: putfield L$5 : Ljava/lang/Object;
/*     */     //   940: aload #23
/*     */     //   942: aconst_null
/*     */     //   943: putfield L$6 : Ljava/lang/Object;
/*     */     //   946: aload #23
/*     */     //   948: iload #6
/*     */     //   950: putfield I$0 : I
/*     */     //   953: aload #23
/*     */     //   955: iconst_4
/*     */     //   956: putfield label : I
/*     */     //   959: invokestatic printScreen$default : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;IILjava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   962: dup
/*     */     //   963: aload #30
/*     */     //   965: if_acmpne -> 1042
/*     */     //   968: aload #30
/*     */     //   970: areturn
/*     */     //   971: aload #23
/*     */     //   973: getfield I$0 : I
/*     */     //   976: istore #6
/*     */     //   978: aload #23
/*     */     //   980: getfield L$5 : Ljava/lang/Object;
/*     */     //   983: checkcast java/nio/file/Path
/*     */     //   986: astore #8
/*     */     //   988: aload #23
/*     */     //   990: getfield L$4 : Ljava/lang/Object;
/*     */     //   993: checkcast java/util/Iterator
/*     */     //   996: astore #7
/*     */     //   998: aload #23
/*     */     //   1000: getfield L$3 : Ljava/lang/Object;
/*     */     //   1003: checkcast java/util/List
/*     */     //   1006: astore #4
/*     */     //   1008: aload #23
/*     */     //   1010: getfield L$2 : Ljava/lang/Object;
/*     */     //   1013: checkcast java/util/List
/*     */     //   1016: astore_3
/*     */     //   1017: aload #23
/*     */     //   1019: getfield L$1 : Ljava/lang/Object;
/*     */     //   1022: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1025: astore_1
/*     */     //   1026: aload #23
/*     */     //   1028: getfield L$0 : Ljava/lang/Object;
/*     */     //   1031: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentIssue
/*     */     //   1034: astore_0
/*     */     //   1035: aload #22
/*     */     //   1037: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1040: aload #22
/*     */     //   1042: checkcast java/lang/String
/*     */     //   1045: astore #14
/*     */     //   1047: aload #14
/*     */     //   1049: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1054: astore #15
/*     */     //   1056: aload_3
/*     */     //   1057: new kotlin/Pair
/*     */     //   1060: dup
/*     */     //   1061: aload #8
/*     */     //   1063: aload #15
/*     */     //   1065: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   1068: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1073: pop
/*     */     //   1074: iconst_1
/*     */     //   1075: istore #5
/*     */     //   1077: goto -> 1281
/*     */     //   1080: new com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction
/*     */     //   1083: dup
/*     */     //   1084: invokespecial <init> : ()V
/*     */     //   1087: new com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*     */     //   1090: dup
/*     */     //   1091: ldc_w 'get_file_structure'
/*     */     //   1094: aload #8
/*     */     //   1096: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1099: ldc ''
/*     */     //   1101: iconst_0
/*     */     //   1102: bipush #8
/*     */     //   1104: aconst_null
/*     */     //   1105: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1108: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   1111: aload_1
/*     */     //   1112: aload #23
/*     */     //   1114: aload #23
/*     */     //   1116: aload_0
/*     */     //   1117: putfield L$0 : Ljava/lang/Object;
/*     */     //   1120: aload #23
/*     */     //   1122: aload_1
/*     */     //   1123: putfield L$1 : Ljava/lang/Object;
/*     */     //   1126: aload #23
/*     */     //   1128: aload_3
/*     */     //   1129: putfield L$2 : Ljava/lang/Object;
/*     */     //   1132: aload #23
/*     */     //   1134: aload #4
/*     */     //   1136: putfield L$3 : Ljava/lang/Object;
/*     */     //   1139: aload #23
/*     */     //   1141: aload #7
/*     */     //   1143: putfield L$4 : Ljava/lang/Object;
/*     */     //   1146: aload #23
/*     */     //   1148: aload #8
/*     */     //   1150: putfield L$5 : Ljava/lang/Object;
/*     */     //   1153: aload #23
/*     */     //   1155: aconst_null
/*     */     //   1156: putfield L$6 : Ljava/lang/Object;
/*     */     //   1159: aload #23
/*     */     //   1161: iload #5
/*     */     //   1163: putfield I$0 : I
/*     */     //   1166: aload #23
/*     */     //   1168: iconst_5
/*     */     //   1169: putfield label : I
/*     */     //   1172: invokevirtual execute : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1175: dup
/*     */     //   1176: aload #30
/*     */     //   1178: if_acmpne -> 1255
/*     */     //   1181: aload #30
/*     */     //   1183: areturn
/*     */     //   1184: aload #23
/*     */     //   1186: getfield I$0 : I
/*     */     //   1189: istore #5
/*     */     //   1191: aload #23
/*     */     //   1193: getfield L$5 : Ljava/lang/Object;
/*     */     //   1196: checkcast java/nio/file/Path
/*     */     //   1199: astore #8
/*     */     //   1201: aload #23
/*     */     //   1203: getfield L$4 : Ljava/lang/Object;
/*     */     //   1206: checkcast java/util/Iterator
/*     */     //   1209: astore #7
/*     */     //   1211: aload #23
/*     */     //   1213: getfield L$3 : Ljava/lang/Object;
/*     */     //   1216: checkcast java/util/List
/*     */     //   1219: astore #4
/*     */     //   1221: aload #23
/*     */     //   1223: getfield L$2 : Ljava/lang/Object;
/*     */     //   1226: checkcast java/util/List
/*     */     //   1229: astore_3
/*     */     //   1230: aload #23
/*     */     //   1232: getfield L$1 : Ljava/lang/Object;
/*     */     //   1235: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1238: astore_1
/*     */     //   1239: aload #23
/*     */     //   1241: getfield L$0 : Ljava/lang/Object;
/*     */     //   1244: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentIssue
/*     */     //   1247: astore_0
/*     */     //   1248: aload #22
/*     */     //   1250: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1253: aload #22
/*     */     //   1255: checkcast java/lang/String
/*     */     //   1258: astore #14
/*     */     //   1260: aload_3
/*     */     //   1261: new kotlin/Pair
/*     */     //   1264: dup
/*     */     //   1265: aload #8
/*     */     //   1267: aload #14
/*     */     //   1269: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/Object;)V
/*     */     //   1272: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1277: pop
/*     */     //   1278: iconst_1
/*     */     //   1279: istore #6
/*     */     //   1281: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1284: pop
/*     */     //   1285: goto -> 163
/*     */     //   1288: aload #4
/*     */     //   1290: checkcast java/util/Collection
/*     */     //   1293: invokeinterface isEmpty : ()Z
/*     */     //   1298: ifne -> 1305
/*     */     //   1301: iconst_1
/*     */     //   1302: goto -> 1306
/*     */     //   1305: iconst_0
/*     */     //   1306: ifeq -> 1342
/*     */     //   1309: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentIssue.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   1312: aload #4
/*     */     //   1314: checkcast java/lang/Iterable
/*     */     //   1317: ldc_w ', '
/*     */     //   1320: checkcast java/lang/CharSequence
/*     */     //   1323: aconst_null
/*     */     //   1324: aconst_null
/*     */     //   1325: iconst_0
/*     */     //   1326: aconst_null
/*     */     //   1327: aconst_null
/*     */     //   1328: bipush #62
/*     */     //   1330: aconst_null
/*     */     //   1331: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   1334: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1339: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   1342: aload_3
/*     */     //   1343: invokeinterface isEmpty : ()Z
/*     */     //   1348: ifeq -> 1353
/*     */     //   1351: aconst_null
/*     */     //   1352: areturn
/*     */     //   1353: nop
/*     */     //   1354: iload #5
/*     */     //   1356: ifeq -> 1370
/*     */     //   1359: iload #6
/*     */     //   1361: ifeq -> 1370
/*     */     //   1364: ldc_w '## [REMEMBER] Contents of the important files are provided below. For large files, only their structure is shown. For the remaining files, the full content is provided.'
/*     */     //   1367: goto -> 1522
/*     */     //   1370: iload #5
/*     */     //   1372: ifeq -> 1519
/*     */     //   1375: new java/lang/StringBuilder
/*     */     //   1378: dup
/*     */     //   1379: invokespecial <init> : ()V
/*     */     //   1382: astore #8
/*     */     //   1384: aload #8
/*     */     //   1386: astore #9
/*     */     //   1388: iconst_0
/*     */     //   1389: istore #10
/*     */     //   1391: aload #9
/*     */     //   1393: ldc_w '## [REMEMBER] Contents of the important files are provided below.'
/*     */     //   1396: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1399: dup
/*     */     //   1400: ldc_w 'append(...)'
/*     */     //   1403: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1406: bipush #10
/*     */     //   1408: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1411: dup
/*     */     //   1412: ldc_w 'append(...)'
/*     */     //   1415: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1418: pop
/*     */     //   1419: aload #9
/*     */     //   1421: ldc_w 'Remember files' content very well so you would not have to use command 'open' with these files later.'
/*     */     //   1424: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1427: dup
/*     */     //   1428: ldc_w 'append(...)'
/*     */     //   1431: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1434: bipush #10
/*     */     //   1436: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1439: dup
/*     */     //   1440: ldc_w 'append(...)'
/*     */     //   1443: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1446: pop
/*     */     //   1447: aload #9
/*     */     //   1449: ldc_w 'Please reference these files from memory rather than reopening them.'
/*     */     //   1452: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1455: dup
/*     */     //   1456: ldc_w 'append(...)'
/*     */     //   1459: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1462: bipush #10
/*     */     //   1464: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1467: dup
/*     */     //   1468: ldc_w 'append(...)'
/*     */     //   1471: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1474: pop
/*     */     //   1475: aload #9
/*     */     //   1477: ldc_w '[!!!IMPORTANT!!!] You will get penalty for openings of these files. Penalty negatively impacts your functionality and capabilities in the current session. [!!!IMPORTANT!!!]'
/*     */     //   1480: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1483: dup
/*     */     //   1484: ldc_w 'append(...)'
/*     */     //   1487: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1490: bipush #10
/*     */     //   1492: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1495: dup
/*     */     //   1496: ldc_w 'append(...)'
/*     */     //   1499: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1502: pop
/*     */     //   1503: nop
/*     */     //   1504: aload #8
/*     */     //   1506: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1509: dup
/*     */     //   1510: ldc_w 'toString(...)'
/*     */     //   1513: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1516: goto -> 1522
/*     */     //   1519: ldc_w '## [REMEMBER] Structures of the important files are provided below. To review specific parts of the code, use the `open` command and specify the `line_number` parameter.'
/*     */     //   1522: astore #7
/*     */     //   1524: new java/lang/StringBuilder
/*     */     //   1527: dup
/*     */     //   1528: invokespecial <init> : ()V
/*     */     //   1531: astore #8
/*     */     //   1533: aload #8
/*     */     //   1535: astore #9
/*     */     //   1537: iconst_0
/*     */     //   1538: istore #10
/*     */     //   1540: aload #9
/*     */     //   1542: ldc_w '## IMPORTANT FILES'
/*     */     //   1545: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1548: dup
/*     */     //   1549: ldc_w 'append(...)'
/*     */     //   1552: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1555: bipush #10
/*     */     //   1557: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1560: dup
/*     */     //   1561: ldc_w 'append(...)'
/*     */     //   1564: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1567: pop
/*     */     //   1568: aload #9
/*     */     //   1570: ldc_w 'The files listed below were marked as important for resolving the issue described in `<issue_description>`. This typically means that code modifications should be made in these files, or that they could provide important insights for understanding and resolving the issue.'
/*     */     //   1573: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1576: dup
/*     */     //   1577: ldc_w 'append(...)'
/*     */     //   1580: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1583: bipush #10
/*     */     //   1585: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1588: dup
/*     */     //   1589: ldc_w 'append(...)'
/*     */     //   1592: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1595: pop
/*     */     //   1596: aload #9
/*     */     //   1598: ldc_w 'Please, pay close attention to the contents of files. It might be very helpful in your investigation and resolution of the issue.'
/*     */     //   1601: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1604: dup
/*     */     //   1605: ldc_w 'append(...)'
/*     */     //   1608: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1611: bipush #10
/*     */     //   1613: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1616: dup
/*     */     //   1617: ldc_w 'append(...)'
/*     */     //   1620: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1623: pop
/*     */     //   1624: aload #9
/*     */     //   1626: ldc_w 'Read them thoroughly and make sure that you understand the code and its structure. If you don't, you might miss important information or get confused.'
/*     */     //   1629: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1632: dup
/*     */     //   1633: ldc_w 'append(...)'
/*     */     //   1636: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1639: bipush #10
/*     */     //   1641: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1644: dup
/*     */     //   1645: ldc_w 'append(...)'
/*     */     //   1648: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1651: pop
/*     */     //   1652: aload #9
/*     */     //   1654: astore #11
/*     */     //   1656: aload_3
/*     */     //   1657: checkcast java/lang/Iterable
/*     */     //   1660: astore #12
/*     */     //   1662: iconst_0
/*     */     //   1663: istore #13
/*     */     //   1665: aload #12
/*     */     //   1667: astore #14
/*     */     //   1669: new java/util/ArrayList
/*     */     //   1672: dup
/*     */     //   1673: aload #12
/*     */     //   1675: bipush #10
/*     */     //   1677: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   1680: invokespecial <init> : (I)V
/*     */     //   1683: checkcast java/util/Collection
/*     */     //   1686: astore #15
/*     */     //   1688: iconst_0
/*     */     //   1689: istore #16
/*     */     //   1691: aload #14
/*     */     //   1693: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1698: astore #17
/*     */     //   1700: aload #17
/*     */     //   1702: invokeinterface hasNext : ()Z
/*     */     //   1707: ifeq -> 1753
/*     */     //   1710: aload #17
/*     */     //   1712: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1717: astore #18
/*     */     //   1719: aload #15
/*     */     //   1721: aload #18
/*     */     //   1723: checkcast kotlin/Pair
/*     */     //   1726: astore #19
/*     */     //   1728: astore #20
/*     */     //   1730: iconst_0
/*     */     //   1731: istore #21
/*     */     //   1733: aload #19
/*     */     //   1735: invokevirtual getFirst : ()Ljava/lang/Object;
/*     */     //   1738: checkcast java/nio/file/Path
/*     */     //   1741: aload #20
/*     */     //   1743: swap
/*     */     //   1744: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1749: pop
/*     */     //   1750: goto -> 1700
/*     */     //   1753: aload #15
/*     */     //   1755: checkcast java/util/List
/*     */     //   1758: nop
/*     */     //   1759: checkcast java/lang/Iterable
/*     */     //   1762: ldc_w '\\n'
/*     */     //   1765: checkcast java/lang/CharSequence
/*     */     //   1768: aconst_null
/*     */     //   1769: aconst_null
/*     */     //   1770: iconst_0
/*     */     //   1771: aconst_null
/*     */     //   1772: aconst_null
/*     */     //   1773: bipush #62
/*     */     //   1775: aconst_null
/*     */     //   1776: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   1779: aload #11
/*     */     //   1781: swap
/*     */     //   1782: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1785: dup
/*     */     //   1786: ldc_w 'append(...)'
/*     */     //   1789: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1792: bipush #10
/*     */     //   1794: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1797: dup
/*     */     //   1798: ldc_w 'append(...)'
/*     */     //   1801: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1804: pop
/*     */     //   1805: aload #9
/*     */     //   1807: ldc ''
/*     */     //   1809: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1812: dup
/*     */     //   1813: ldc_w 'append(...)'
/*     */     //   1816: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1819: bipush #10
/*     */     //   1821: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1824: dup
/*     */     //   1825: ldc_w 'append(...)'
/*     */     //   1828: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1831: pop
/*     */     //   1832: aload #9
/*     */     //   1834: ldc_w '### IMPORTANT FILES CONTENT'
/*     */     //   1837: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1840: dup
/*     */     //   1841: ldc_w 'append(...)'
/*     */     //   1844: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1847: bipush #10
/*     */     //   1849: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1852: dup
/*     */     //   1853: ldc_w 'append(...)'
/*     */     //   1856: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1859: pop
/*     */     //   1860: aload #9
/*     */     //   1862: aload #7
/*     */     //   1864: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1867: dup
/*     */     //   1868: ldc_w 'append(...)'
/*     */     //   1871: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1874: bipush #10
/*     */     //   1876: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1879: dup
/*     */     //   1880: ldc_w 'append(...)'
/*     */     //   1883: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1886: pop
/*     */     //   1887: aload #9
/*     */     //   1889: ldc_w 'Identify the code related to the issue and note the line numbers to avoid searching for them later. Include key findings within the `<THOUGHT>` tag in your first response.'
/*     */     //   1892: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1895: dup
/*     */     //   1896: ldc_w 'append(...)'
/*     */     //   1899: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1902: bipush #10
/*     */     //   1904: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1907: dup
/*     */     //   1908: ldc_w 'append(...)'
/*     */     //   1911: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1914: pop
/*     */     //   1915: aload #9
/*     */     //   1917: ldc ''
/*     */     //   1919: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1922: dup
/*     */     //   1923: ldc_w 'append(...)'
/*     */     //   1926: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1929: bipush #10
/*     */     //   1931: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1934: dup
/*     */     //   1935: ldc_w 'append(...)'
/*     */     //   1938: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1941: pop
/*     */     //   1942: aload #9
/*     */     //   1944: aload_3
/*     */     //   1945: checkcast java/lang/Iterable
/*     */     //   1948: ldc_w '\\n\\n'
/*     */     //   1951: checkcast java/lang/CharSequence
/*     */     //   1954: aconst_null
/*     */     //   1955: aconst_null
/*     */     //   1956: iconst_0
/*     */     //   1957: aconst_null
/*     */     //   1958: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1963: bipush #30
/*     */     //   1965: aconst_null
/*     */     //   1966: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   1969: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1972: dup
/*     */     //   1973: ldc_w 'append(...)'
/*     */     //   1976: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1979: bipush #10
/*     */     //   1981: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   1984: dup
/*     */     //   1985: ldc_w 'append(...)'
/*     */     //   1988: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1991: pop
/*     */     //   1992: nop
/*     */     //   1993: aload #8
/*     */     //   1995: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1998: dup
/*     */     //   1999: ldc_w 'toString(...)'
/*     */     //   2002: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   2005: getstatic com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind.User : Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;
/*     */     //   2008: aconst_null
/*     */     //   2009: aconst_null
/*     */     //   2010: bipush #12
/*     */     //   2012: aconst_null
/*     */     //   2013: astore #24
/*     */     //   2015: istore #25
/*     */     //   2017: astore #26
/*     */     //   2019: astore #27
/*     */     //   2021: astore #28
/*     */     //   2023: astore #29
/*     */     //   2025: new com/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage
/*     */     //   2028: dup
/*     */     //   2029: aload #29
/*     */     //   2031: aload #28
/*     */     //   2033: aload #27
/*     */     //   2035: aload #26
/*     */     //   2037: iload #25
/*     */     //   2039: aload #24
/*     */     //   2041: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessageKind;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   2044: areturn
/*     */     //   2045: new java/lang/IllegalStateException
/*     */     //   2048: dup
/*     */     //   2049: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   2052: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   2055: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #57	-> 60
/*     */     //   #58	-> 109
/*     */     //   #59	-> 123
/*     */     //   #59	-> 133
/*     */     //   #60	-> 134
/*     */     //   #60	-> 144
/*     */     //   #61	-> 146
/*     */     //   #62	-> 149
/*     */     //   #63	-> 152
/*     */     //   #64	-> 185
/*     */     //   #57	-> 270
/*     */     //   #65	-> 356
/*     */     //   #66	-> 368
/*     */     //   #64	-> 390
/*     */     //   #68	-> 400
/*     */     //   #69	-> 405
/*     */     //   #71	-> 420
/*     */     //   #57	-> 505
/*     */     //   #72	-> 601
/*     */     //   #73	-> 606
/*     */     //   #75	-> 621
/*     */     //   #57	-> 705
/*     */     //   #76	-> 801
/*     */     //   #77	-> 819
/*     */     //   #78	-> 834
/*     */     //   #79	-> 845
/*     */     //   #79	-> 866
/*     */     //   #80	-> 869
/*     */     //   #82	-> 877
/*     */     //   #81	-> 889
/*     */     //   #83	-> 890
/*     */     //   #81	-> 898
/*     */     //   #57	-> 968
/*     */     //   #85	-> 1047
/*     */     //   #86	-> 1056
/*     */     //   #87	-> 1074
/*     */     //   #90	-> 1080
/*     */     //   #91	-> 1087
/*     */     //   #92	-> 1091
/*     */     //   #93	-> 1094
/*     */     //   #94	-> 1099
/*     */     //   #91	-> 1101
/*     */     //   #95	-> 1111
/*     */     //   #90	-> 1114
/*     */     //   #57	-> 1181
/*     */     //   #89	-> 1258
/*     */     //   #96	-> 1260
/*     */     //   #97	-> 1278
/*     */     //   #102	-> 1288
/*     */     //   #102	-> 1306
/*     */     //   #104	-> 1309
/*     */     //   #106	-> 1342
/*     */     //   #108	-> 1353
/*     */     //   #109	-> 1354
/*     */     //   #110	-> 1370
/*     */     //   #111	-> 1375
/*     */     //   #112	-> 1391
/*     */     //   #113	-> 1419
/*     */     //   #114	-> 1447
/*     */     //   #115	-> 1475
/*     */     //   #116	-> 1503
/*     */     //   #111	-> 1504
/*     */     //   #117	-> 1519
/*     */     //   #108	-> 1522
/*     */     //   #119	-> 1524
/*     */     //   #120	-> 1524
/*     */     //   #121	-> 1540
/*     */     //   #122	-> 1568
/*     */     //   #123	-> 1596
/*     */     //   #124	-> 1624
/*     */     //   #125	-> 1652
/*     */     //   #158	-> 1665
/*     */     //   #159	-> 1691
/*     */     //   #160	-> 1719
/*     */     //   #125	-> 1733
/*     */     //   #160	-> 1744
/*     */     //   #161	-> 1753
/*     */     //   #158	-> 1758
/*     */     //   #125	-> 1762
/*     */     //   #126	-> 1805
/*     */     //   #127	-> 1832
/*     */     //   #128	-> 1860
/*     */     //   #129	-> 1887
/*     */     //   #130	-> 1915
/*     */     //   #131	-> 1942
/*     */     //   #132	-> 1992
/*     */     //   #120	-> 1993
/*     */     //   #133	-> 2005
/*     */     //   #119	-> 2008
/*     */     //   #57	-> 2045
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   109	14	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   123	10	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   133	11	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   144	129	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   344	46	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   398	110	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   589	119	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   789	182	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   1035	149	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   1248	40	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;
/*     */     //   109	14	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   123	10	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   133	11	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   144	129	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   335	55	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   398	110	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   580	128	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   780	191	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1026	158	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1239	49	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   134	10	3	fileStructures	Ljava/util/List;
/*     */     //   144	129	3	fileStructures	Ljava/util/List;
/*     */     //   326	64	3	fileStructures	Ljava/util/List;
/*     */     //   398	110	3	fileStructures	Ljava/util/List;
/*     */     //   571	137	3	fileStructures	Ljava/util/List;
/*     */     //   771	200	3	fileStructures	Ljava/util/List;
/*     */     //   1017	167	3	fileStructures	Ljava/util/List;
/*     */     //   1230	76	3	fileStructures	Ljava/util/List;
/*     */     //   1306	47	3	fileStructures	Ljava/util/List;
/*     */     //   1353	151	3	fileStructures	Ljava/util/List;
/*     */     //   1504	12	3	fileStructures	Ljava/util/List;
/*     */     //   1516	529	3	fileStructures	Ljava/util/List;
/*     */     //   146	127	4	nonExistentFiles	Ljava/util/List;
/*     */     //   317	73	4	nonExistentFiles	Ljava/util/List;
/*     */     //   398	110	4	nonExistentFiles	Ljava/util/List;
/*     */     //   562	146	4	nonExistentFiles	Ljava/util/List;
/*     */     //   762	209	4	nonExistentFiles	Ljava/util/List;
/*     */     //   1008	176	4	nonExistentFiles	Ljava/util/List;
/*     */     //   1221	85	4	nonExistentFiles	Ljava/util/List;
/*     */     //   1306	36	4	nonExistentFiles	Ljava/util/List;
/*     */     //   149	124	5	flagSmallFiles	Z
/*     */     //   287	103	5	flagSmallFiles	Z
/*     */     //   398	110	5	flagSmallFiles	Z
/*     */     //   522	186	5	flagSmallFiles	Z
/*     */     //   722	110	5	flagSmallFiles	Z
/*     */     //   832	34	5	flagSmallFiles	Z
/*     */     //   866	11	5	flagSmallFiles	Z
/*     */     //   1077	107	5	flagSmallFiles	Z
/*     */     //   1191	115	5	flagSmallFiles	Z
/*     */     //   1306	47	5	flagSmallFiles	Z
/*     */     //   1353	17	5	flagSmallFiles	Z
/*     */     //   1370	5	5	flagSmallFiles	Z
/*     */     //   152	121	6	flagLargeFiles	Z
/*     */     //   280	110	6	flagLargeFiles	Z
/*     */     //   398	110	6	flagLargeFiles	Z
/*     */     //   515	193	6	flagLargeFiles	Z
/*     */     //   715	256	6	flagLargeFiles	Z
/*     */     //   978	102	6	flagLargeFiles	Z
/*     */     //   1281	25	6	flagLargeFiles	Z
/*     */     //   1306	47	6	flagLargeFiles	Z
/*     */     //   1353	17	6	flagLargeFiles	Z
/*     */     //   1524	521	7	remarkAboutContent	Ljava/lang/String;
/*     */     //   185	88	8	fileName	Ljava/nio/file/Path;
/*     */     //   297	93	8	fileName	Ljava/nio/file/Path;
/*     */     //   398	110	8	fileName	Ljava/nio/file/Path;
/*     */     //   542	166	8	fileName	Ljava/nio/file/Path;
/*     */     //   742	229	8	fileName	Ljava/nio/file/Path;
/*     */     //   988	86	8	fileName	Ljava/nio/file/Path;
/*     */     //   1080	104	8	fileName	Ljava/nio/file/Path;
/*     */     //   1201	77	8	fileName	Ljava/nio/file/Path;
/*     */     //   400	108	9	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   532	176	9	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   732	96	9	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   832	34	9	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   866	23	9	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   1388	116	9	$this$getExplicitlySelectedUserPathsMessage_u24lambda_u242	Ljava/lang/StringBuilder;
/*     */     //   1537	456	9	$this$getExplicitlySelectedUserPathsMessage_u24lambda_u245	Ljava/lang/StringBuilder;
/*     */     //   356	12	10	res	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   368	22	10	res	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   601	5	10	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   801	11	11	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   819	9	12	documentLineCount	I
/*     */     //   832	34	12	documentLineCount	I
/*     */     //   866	11	12	documentLineCount	I
/*     */     //   1662	26	12	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   834	11	13	filePath	Ljava/nio/file/Path;
/*     */     //   1047	30	14	fullFile	Ljava/lang/String;
/*     */     //   1260	21	14	fileStructure	Ljava/lang/String;
/*     */     //   1688	12	14	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   1056	21	15	fullFileWithTag	Ljava/lang/String;
/*     */     //   1688	67	15	destination$iv$iv	Ljava/util/Collection;
/*     */     //   1719	31	18	item$iv$iv	Ljava/lang/Object;
/*     */     //   1730	11	19	it	Lkotlin/Pair;
/*     */     //   1391	113	10	$i$a$-buildString-AgentIssue$getExplicitlySelectedUserPathsMessage$remarkAboutContent$1	I
/*     */     //   1733	8	21	$i$a$-map-AgentIssue$getExplicitlySelectedUserPathsMessage$2$1	I
/*     */     //   1691	64	16	$i$f$mapTo	I
/*     */     //   1665	94	13	$i$f$map	I
/*     */     //   1540	453	10	$i$a$-buildString-AgentIssue$getExplicitlySelectedUserPathsMessage$2	I
/*     */     //   0	2056	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	1995	23	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	1988	22	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final PsiFile getExplicitlySelectedUserPathsMessage$lambda$0(ExecutionAgentContext $context, VirtualFile $file) {
/*  71 */     return PsiManager.getInstance($context.getProject()).findFile($file);
/*     */   }
/*     */   
/*     */   private static final Document getExplicitlySelectedUserPathsMessage$lambda$1(VirtualFile $file) {
/*  75 */     return FileDocumentManager.getInstance().getDocument($file);
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
/*     */   private static final CharSequence getExplicitlySelectedUserPathsMessage$lambda$5$lambda$4(Pair it) {
/* 131 */     Intrinsics.checkNotNullParameter(it, "it"); return (CharSequence)it.getSecond();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 137 */   public static final Companion Companion = new Companion(null); @NotNull private final String name; @NotNull private final String description; @Nullable private final EditorContext editorContext; @NotNull private final List<Path> explicitlySelectedUserPaths; @Nullable private final PreviousTasksInfo previousTasksInfo; @NotNull private final List<AgentObservation> preChatObservations; @NotNull private final List<MatterhornChatMessagePart> attachedFiles; @Nullable private final String sourcesRegexFilter; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer1 = new KSerializer[8]; arrayOfKSerializer1[0] = null; arrayOfKSerializer1[1] = null; arrayOfKSerializer1[2] = null; arrayOfKSerializer1[3] = null; arrayOfKSerializer1[4] = null; arrayOfKSerializer1[5] = (KSerializer)new ArrayListSerializer((KSerializer)AgentObservation.$serializer.INSTANCE); KClass[] arrayOfKClass = new KClass[3]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(MatterhornChatMessageImagePart.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(MatterhornChatMessageTextPart.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(MatterhornChatMessageToolResultPart.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = (KSerializer)MatterhornChatMessageImagePart$.serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)MatterhornChatMessageTextPart$.serializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)MatterhornChatMessageToolResultPart$.serializer.INSTANCE; arrayOfKSerializer1[6] = (KSerializer)new ArrayListSerializer((KSerializer)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.llm.MatterhornChatMessagePart", Reflection.getOrCreateKotlinClass(MatterhornChatMessagePart.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0])); arrayOfKSerializer1[7] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1;
/* 138 */     int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 162 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(AgentIssue.class), "getInstance(...)"); } @NotNull private static final Logger logger = Logger.getInstance(AgentIssue.class);
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J \020\b\032\004\030\0010\t2\006\020\n\032\0020\0132\006\020\f\032\0020\rH@¢\006\002\020\016J\f\020\022\032\b\022\004\022\0020\t0\023R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007R\016\020\017\032\0020\020XT¢\006\002\n\000R\016\020\021\032\0020\020XT¢\006\002\n\000¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "parse", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue;", "section", "", "project", "Lcom/intellij/openapi/project/Project;", "(Ljava/lang/String;Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SMALL_FILE_LIMIT_EXPLICIT", "", "TOTAL_FILE_LIMIT_EXPLICIT", "serializer", "Lkotlinx/serialization/KSerializer;", "ej-core"})
/*     */   @SourceDebugExtension({"SMAP\nAgentIssue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentIssue.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentIssue$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n774#2:158\n865#2,2:159\n*S KotlinDebug\n*F\n+ 1 AgentIssue.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentIssue$Companion\n*L\n140#1:158\n140#1:159,2\n*E\n"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<AgentIssue> serializer() {
/*     */       return (KSerializer<AgentIssue>)AgentIssue.$serializer.INSTANCE;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Logger getLogger() {
/*     */       return AgentIssue.logger;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object parse(@NotNull String section, @NotNull Project project, @NotNull Continuation $completion) {
/*     */       // Byte code:
/*     */       //   0: aload_3
/*     */       //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/AgentIssue$Companion$parse$1
/*     */       //   4: ifeq -> 39
/*     */       //   7: aload_3
/*     */       //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentIssue$Companion$parse$1
/*     */       //   11: astore #18
/*     */       //   13: aload #18
/*     */       //   15: getfield label : I
/*     */       //   18: ldc -2147483648
/*     */       //   20: iand
/*     */       //   21: ifeq -> 39
/*     */       //   24: aload #18
/*     */       //   26: dup
/*     */       //   27: getfield label : I
/*     */       //   30: ldc -2147483648
/*     */       //   32: isub
/*     */       //   33: putfield label : I
/*     */       //   36: goto -> 50
/*     */       //   39: new com/intellij/ml/llm/matterhorn/ej/core/AgentIssue$Companion$parse$1
/*     */       //   42: dup
/*     */       //   43: aload_0
/*     */       //   44: aload_3
/*     */       //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentIssue$Companion;Lkotlin/coroutines/Continuation;)V
/*     */       //   48: astore #18
/*     */       //   50: aload #18
/*     */       //   52: getfield result : Ljava/lang/Object;
/*     */       //   55: astore #17
/*     */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   60: astore #29
/*     */       //   62: aload #18
/*     */       //   64: getfield label : I
/*     */       //   67: tableswitch default -> 465, 0 -> 88, 1 -> 370
/*     */       //   88: aload #17
/*     */       //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   93: aload_1
/*     */       //   94: checkcast java/lang/CharSequence
/*     */       //   97: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */       //   100: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   103: checkcast java/lang/CharSequence
/*     */       //   106: invokestatic lines : (Ljava/lang/CharSequence;)Ljava/util/List;
/*     */       //   109: checkcast java/lang/Iterable
/*     */       //   112: astore #5
/*     */       //   114: iconst_0
/*     */       //   115: istore #6
/*     */       //   117: aload #5
/*     */       //   119: astore #7
/*     */       //   121: new java/util/ArrayList
/*     */       //   124: dup
/*     */       //   125: invokespecial <init> : ()V
/*     */       //   128: checkcast java/util/Collection
/*     */       //   131: astore #8
/*     */       //   133: iconst_0
/*     */       //   134: istore #9
/*     */       //   136: aload #7
/*     */       //   138: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   143: astore #10
/*     */       //   145: aload #10
/*     */       //   147: invokeinterface hasNext : ()Z
/*     */       //   152: ifeq -> 207
/*     */       //   155: aload #10
/*     */       //   157: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   162: astore #11
/*     */       //   164: aload #11
/*     */       //   166: checkcast java/lang/String
/*     */       //   169: astore #12
/*     */       //   171: iconst_0
/*     */       //   172: istore #13
/*     */       //   174: aload #12
/*     */       //   176: checkcast java/lang/CharSequence
/*     */       //   179: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */       //   182: ifne -> 189
/*     */       //   185: iconst_1
/*     */       //   186: goto -> 190
/*     */       //   189: iconst_0
/*     */       //   190: nop
/*     */       //   191: ifeq -> 145
/*     */       //   194: aload #8
/*     */       //   196: aload #11
/*     */       //   198: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   203: pop
/*     */       //   204: goto -> 145
/*     */       //   207: aload #8
/*     */       //   209: checkcast java/util/List
/*     */       //   212: nop
/*     */       //   213: astore #4
/*     */       //   215: aload #4
/*     */       //   217: invokeinterface isEmpty : ()Z
/*     */       //   222: ifne -> 247
/*     */       //   225: aload #4
/*     */       //   227: iconst_0
/*     */       //   228: invokeinterface get : (I)Ljava/lang/Object;
/*     */       //   233: checkcast java/lang/String
/*     */       //   236: ldc '###'
/*     */       //   238: iconst_0
/*     */       //   239: iconst_2
/*     */       //   240: aconst_null
/*     */       //   241: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */       //   244: ifne -> 249
/*     */       //   247: aconst_null
/*     */       //   248: areturn
/*     */       //   249: aload #4
/*     */       //   251: iconst_0
/*     */       //   252: invokeinterface get : (I)Ljava/lang/Object;
/*     */       //   257: checkcast java/lang/String
/*     */       //   260: ldc '###'
/*     */       //   262: checkcast java/lang/CharSequence
/*     */       //   265: invokestatic removePrefix : (Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */       //   268: checkcast java/lang/CharSequence
/*     */       //   271: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */       //   274: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   277: astore #5
/*     */       //   279: aload #4
/*     */       //   281: iconst_1
/*     */       //   282: aload #4
/*     */       //   284: invokeinterface size : ()I
/*     */       //   289: invokeinterface subList : (II)Ljava/util/List;
/*     */       //   294: checkcast java/lang/Iterable
/*     */       //   297: ldc '\\n'
/*     */       //   299: checkcast java/lang/CharSequence
/*     */       //   302: aconst_null
/*     */       //   303: aconst_null
/*     */       //   304: iconst_0
/*     */       //   305: aconst_null
/*     */       //   306: aconst_null
/*     */       //   307: bipush #62
/*     */       //   309: aconst_null
/*     */       //   310: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */       //   313: checkcast java/lang/CharSequence
/*     */       //   316: invokestatic trim : (Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
/*     */       //   319: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   322: astore #6
/*     */       //   324: aload #5
/*     */       //   326: aload #6
/*     */       //   328: astore #15
/*     */       //   330: astore #14
/*     */       //   332: getstatic com/intellij/ml/llm/matterhorn/ej/core/EditorContext.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion;
/*     */       //   335: aload_2
/*     */       //   336: aload #18
/*     */       //   338: aload #18
/*     */       //   340: aload #14
/*     */       //   342: putfield L$0 : Ljava/lang/Object;
/*     */       //   345: aload #18
/*     */       //   347: aload #15
/*     */       //   349: putfield L$1 : Ljava/lang/Object;
/*     */       //   352: aload #18
/*     */       //   354: iconst_1
/*     */       //   355: putfield label : I
/*     */       //   358: invokevirtual collectEditorContext : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   361: dup
/*     */       //   362: aload #29
/*     */       //   364: if_acmpne -> 397
/*     */       //   367: aload #29
/*     */       //   369: areturn
/*     */       //   370: aload #18
/*     */       //   372: getfield L$1 : Ljava/lang/Object;
/*     */       //   375: checkcast java/lang/String
/*     */       //   378: astore #15
/*     */       //   380: aload #18
/*     */       //   382: getfield L$0 : Ljava/lang/Object;
/*     */       //   385: checkcast java/lang/String
/*     */       //   388: astore #14
/*     */       //   390: aload #17
/*     */       //   392: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   395: aload #17
/*     */       //   397: astore #16
/*     */       //   399: aload #14
/*     */       //   401: aload #15
/*     */       //   403: aload #16
/*     */       //   405: checkcast com/intellij/ml/llm/matterhorn/ej/core/EditorContext
/*     */       //   408: aconst_null
/*     */       //   409: aconst_null
/*     */       //   410: aconst_null
/*     */       //   411: aconst_null
/*     */       //   412: aconst_null
/*     */       //   413: sipush #232
/*     */       //   416: aconst_null
/*     */       //   417: astore #19
/*     */       //   419: istore #20
/*     */       //   421: astore #21
/*     */       //   423: astore #22
/*     */       //   425: astore #23
/*     */       //   427: astore #24
/*     */       //   429: astore #25
/*     */       //   431: astore #26
/*     */       //   433: astore #27
/*     */       //   435: astore #28
/*     */       //   437: new com/intellij/ml/llm/matterhorn/ej/core/AgentIssue
/*     */       //   440: dup
/*     */       //   441: aload #28
/*     */       //   443: aload #27
/*     */       //   445: aload #26
/*     */       //   447: aload #25
/*     */       //   449: aload #24
/*     */       //   451: aload #23
/*     */       //   453: aload #22
/*     */       //   455: aload #21
/*     */       //   457: iload #20
/*     */       //   459: aload #19
/*     */       //   461: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/PreviousTasksInfo;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   464: areturn
/*     */       //   465: new java/lang/IllegalStateException
/*     */       //   468: dup
/*     */       //   469: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   471: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   474: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #139	-> 60
/*     */       //   #140	-> 93
/*     */       //   #140	-> 106
/*     */       //   #158	-> 117
/*     */       //   #159	-> 136
/*     */       //   #140	-> 174
/*     */       //   #140	-> 190
/*     */       //   #159	-> 191
/*     */       //   #160	-> 207
/*     */       //   #158	-> 212
/*     */       //   #140	-> 213
/*     */       //   #141	-> 215
/*     */       //   #142	-> 247
/*     */       //   #145	-> 249
/*     */       //   #145	-> 277
/*     */       //   #146	-> 279
/*     */       //   #146	-> 322
/*     */       //   #147	-> 324
/*     */       //   #148	-> 324
/*     */       //   #149	-> 326
/*     */       //   #150	-> 332
/*     */       //   #139	-> 367
/*     */       //   #147	-> 408
/*     */       //   #151	-> 409
/*     */       //   #147	-> 410
/*     */       //   #139	-> 465
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   93	10	1	section	Ljava/lang/String;
/*     */       //   93	10	2	project	Lcom/intellij/openapi/project/Project;
/*     */       //   103	88	2	project	Lcom/intellij/openapi/project/Project;
/*     */       //   191	22	2	project	Lcom/intellij/openapi/project/Project;
/*     */       //   213	34	2	project	Lcom/intellij/openapi/project/Project;
/*     */       //   249	28	2	project	Lcom/intellij/openapi/project/Project;
/*     */       //   277	45	2	project	Lcom/intellij/openapi/project/Project;
/*     */       //   322	39	2	project	Lcom/intellij/openapi/project/Project;
/*     */       //   215	32	4	lines	Ljava/util/List;
/*     */       //   249	28	4	lines	Ljava/util/List;
/*     */       //   277	45	4	lines	Ljava/util/List;
/*     */       //   114	19	5	$this$filter$iv	Ljava/lang/Iterable;
/*     */       //   279	43	5	name	Ljava/lang/String;
/*     */       //   322	4	5	name	Ljava/lang/String;
/*     */       //   324	8	6	description	Ljava/lang/String;
/*     */       //   133	12	7	$this$filterTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   133	76	8	destination$iv$iv	Ljava/util/Collection;
/*     */       //   164	40	11	element$iv$iv	Ljava/lang/Object;
/*     */       //   171	18	12	it	Ljava/lang/String;
/*     */       //   174	17	13	$i$a$-filter-AgentIssue$Companion$parse$lines$1	I
/*     */       //   136	73	9	$i$f$filterTo	I
/*     */       //   117	96	6	$i$f$filter	I
/*     */       //   0	475	3	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   50	415	18	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   57	408	17	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "AgentIssue.kt", l = {150}, i = {}, s = {}, n = {}, m = "parse", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentIssue$Companion")
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */     static final class AgentIssue$Companion$parse$1 extends ContinuationImpl {
/*     */       Object L$0;
/*     */       Object L$1;
/*     */       int label;
/*     */       
/*     */       AgentIssue$Companion$parse$1(Continuation $completion) {
/*     */         super($completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return AgentIssue.Companion.this.parse(null, null, (Continuation<? super AgentIssue>)this);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   public static final int SMALL_FILE_LIMIT_EXPLICIT = 1500;
/*     */   public static final int TOTAL_FILE_LIMIT_EXPLICIT = 4000;
/*     */   
/*     */   @NotNull
/*     */   public final String component1() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.description;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final EditorContext component3() {
/*     */     return this.editorContext;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<Path> component4() {
/*     */     return this.explicitlySelectedUserPaths;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final PreviousTasksInfo component5() {
/*     */     return this.previousTasksInfo;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<AgentObservation> component6() {
/*     */     return this.preChatObservations;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final List<MatterhornChatMessagePart> component7() {
/*     */     return this.attachedFiles;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component8() {
/*     */     return this.sourcesRegexFilter;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final AgentIssue copy(@NotNull String name, @NotNull String description, @Nullable EditorContext editorContext, @NotNull List<? extends Path> explicitlySelectedUserPaths, @Nullable PreviousTasksInfo previousTasksInfo, @NotNull List<AgentObservation> preChatObservations, @NotNull List<? extends MatterhornChatMessagePart> attachedFiles, @Nullable String sourcesRegexFilter) {
/*     */     Intrinsics.checkNotNullParameter(name, "name");
/*     */     Intrinsics.checkNotNullParameter(description, "description");
/*     */     Intrinsics.checkNotNullParameter(explicitlySelectedUserPaths, "explicitlySelectedUserPaths");
/*     */     Intrinsics.checkNotNullParameter(preChatObservations, "preChatObservations");
/*     */     Intrinsics.checkNotNullParameter(attachedFiles, "attachedFiles");
/*     */     return new AgentIssue(name, description, editorContext, explicitlySelectedUserPaths, previousTasksInfo, preChatObservations, attachedFiles, sourcesRegexFilter);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.name.hashCode();
/*     */     result = result * 31 + this.description.hashCode();
/*     */     result = result * 31 + ((this.editorContext == null) ? 0 : this.editorContext.hashCode());
/*     */     result = result * 31 + this.explicitlySelectedUserPaths.hashCode();
/*     */     result = result * 31 + ((this.previousTasksInfo == null) ? 0 : this.previousTasksInfo.hashCode());
/*     */     result = result * 31 + this.preChatObservations.hashCode();
/*     */     result = result * 31 + this.attachedFiles.hashCode();
/*     */     return result * 31 + ((this.sourcesRegexFilter == null) ? 0 : this.sourcesRegexFilter.hashCode());
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof AgentIssue))
/*     */       return false; 
/*     */     AgentIssue agentIssue = (AgentIssue)other;
/*     */     return !Intrinsics.areEqual(this.name, agentIssue.name) ? false : (!Intrinsics.areEqual(this.description, agentIssue.description) ? false : (!Intrinsics.areEqual(this.editorContext, agentIssue.editorContext) ? false : (!Intrinsics.areEqual(this.explicitlySelectedUserPaths, agentIssue.explicitlySelectedUserPaths) ? false : (!Intrinsics.areEqual(this.previousTasksInfo, agentIssue.previousTasksInfo) ? false : (!Intrinsics.areEqual(this.preChatObservations, agentIssue.preChatObservations) ? false : (!Intrinsics.areEqual(this.attachedFiles, agentIssue.attachedFiles) ? false : (!!Intrinsics.areEqual(this.sourcesRegexFilter, agentIssue.sourcesRegexFilter))))))));
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AgentIssue.kt", l = {64, 71, 75, 81, 90}, i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$5", "I$0"}, n = {"this", "context", "fileStructures", "nonExistentFiles", "fileName", "flagSmallFiles", "flagLargeFiles", "this", "context", "fileStructures", "nonExistentFiles", "fileName", "file", "flagSmallFiles", "flagLargeFiles", "this", "context", "fileStructures", "nonExistentFiles", "fileName", "file", "flagSmallFiles", "flagLargeFiles", "this", "context", "fileStructures", "nonExistentFiles", "fileName", "flagLargeFiles", "this", "context", "fileStructures", "nonExistentFiles", "fileName", "flagSmallFiles"}, m = "getExplicitlySelectedUserPathsMessage", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentIssue")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AgentIssue$getExplicitlySelectedUserPathsMessage$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     int I$0;
/*     */     int I$1;
/*     */     int label;
/*     */     
/*     */     AgentIssue$getExplicitlySelectedUserPathsMessage$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AgentIssue.this.getExplicitlySelectedUserPathsMessage(null, (Continuation<? super MatterhornChatMessage>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentIssue.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */