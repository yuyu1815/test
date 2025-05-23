/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.editor.Editor;
/*     */ import com.intellij.openapi.fileEditor.FileEditorManager;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.openapi.vfs.VirtualFileUtil;
/*     */ import java.util.Collection;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000f\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\020\016\n\002\030\002\n\002\b\004\n\002\020\b\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\020\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\013\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 .2\0020\001:\002./B7\022\026\020\002\032\022\022\004\022\0020\0040\003j\b\022\004\022\0020\004`\005\022\026\020\006\032\022\022\004\022\0020\0040\003j\b\022\004\022\0020\004`\005¢\006\004\b\007\020\bB;\b\020\022\006\020\t\032\0020\n\022\016\020\002\032\n\022\004\022\0020\004\030\0010\003\022\016\020\006\032\n\022\004\022\0020\004\030\0010\003\022\b\020\013\032\004\030\0010\f¢\006\004\b\007\020\rJ&\020\021\032\004\030\0010\0042\006\020\022\032\0020\0232\f\020\024\032\b\022\004\022\0020\0260\025H@¢\006\002\020\027J&\020\030\032\0020\031*\0060\032j\002`\0332\006\020\022\032\0020\0232\006\020\034\032\0020\035H@¢\006\002\020\036J\031\020\037\032\022\022\004\022\0020\0040\003j\b\022\004\022\0020\004`\005HÆ\003J\031\020 \032\022\022\004\022\0020\0040\003j\b\022\004\022\0020\004`\005HÆ\003J=\020!\032\0020\0002\030\b\002\020\002\032\022\022\004\022\0020\0040\003j\b\022\004\022\0020\004`\0052\030\b\002\020\006\032\022\022\004\022\0020\0040\003j\b\022\004\022\0020\004`\005HÆ\001J\023\020\"\032\0020#2\b\020$\032\004\030\0010\001HÖ\003J\t\020%\032\0020\nHÖ\001J\t\020&\032\0020\004HÖ\001J%\020'\032\0020\0312\006\020(\032\0020\0002\006\020)\032\0020*2\006\020+\032\0020,H\001¢\006\002\b-R!\020\002\032\022\022\004\022\0020\0040\003j\b\022\004\022\0020\004`\005¢\006\b\n\000\032\004\b\016\020\017R!\020\006\032\022\022\004\022\0020\0040\003j\b\022\004\022\0020\004`\005¢\006\b\n\000\032\004\b\020\020\017¨\0060"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;", "", "recentFiles", "Ljava/util/LinkedHashSet;", "", "Lkotlin/collections/LinkedHashSet;", "openFiles", "<init>", "(Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/LinkedHashSet;Ljava/util/LinkedHashSet;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRecentFiles", "()Ljava/util/LinkedHashSet;", "getOpenFiles", "getContext", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "explicitlySelectedUserPaths", "", "Ljava/nio/file/Path;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectCurrentFileContext", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "editor", "Lcom/intellij/openapi/editor/Editor;", "(Ljava/lang/StringBuilder;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/openapi/editor/Editor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ej_core", "Companion", "$serializer", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nEditorContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/EditorContext\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,195:1\n827#2:196\n855#2,2:197\n14#3:199\n*S KotlinDebug\n*F\n+ 1 EditorContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/EditorContext\n*L\n102#1:196\n102#1:197,2\n32#1:199\n*E\n"})
/*     */ public final class EditorContext {
/*  30 */   public EditorContext(@NotNull LinkedHashSet<String> recentFiles, @NotNull LinkedHashSet<String> openFiles) { this.recentFiles = recentFiles; this.openFiles = openFiles; } @NotNull public final LinkedHashSet<String> getRecentFiles() { return this.recentFiles; } @NotNull public final LinkedHashSet<String> getOpenFiles() { return this.openFiles; } @NotNull
/*  31 */   public static final Companion Companion = new Companion(null); @NotNull private final LinkedHashSet<String> recentFiles; @NotNull private final LinkedHashSet<String> openFiles; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)new LinkedHashSetSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[1] = (KSerializer)new LinkedHashSetSerializer((KSerializer)StringSerializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*  32 */     int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 199 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(EditorContext.class), "getInstance(...)"); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\030\020\013\032\004\030\0010\f2\006\020\r\032\0020\016H@¢\006\002\020\017J\020\020\020\032\0020\0212\006\020\022\032\0020\023H\002J\034\020\024\032\0020\0252\006\020\026\032\0020\0232\n\020\027\032\0060\030j\002`\031H\002J\020\020\032\032\004\030\0010\0332\006\020\034\032\0020\035J\f\020\036\032\b\022\004\022\0020\f0\037R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007R\016\020\b\032\0020\tXT¢\006\002\n\000R\016\020\n\032\0020\tXT¢\006\002\n\000¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "MAX_RECENT_FILES", "", "CURRENT_FILE_WINDOW", "collectEditorContext", "Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasNioPath", "", "it", "Lcom/intellij/openapi/vfs/VirtualFile;", "addJunieGuidelinesFromDirectory", "", "dir", "result", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "collectGuidanceContext", "", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "serializer", "Lkotlinx/serialization/KSerializer;", "ej-core"}) @SourceDebugExtension({"SMAP\nEditorContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n3829#2:196\n4344#2,2:197\n1863#3,2:199\n1#4:201\n*S KotlinDebug\n*F\n+ 1 EditorContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion\n*L\n88#1:196\n88#1:197,2\n89#1:199,2\n*E\n"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<EditorContext> serializer() { return (KSerializer<EditorContext>)EditorContext.$serializer.INSTANCE; } @NotNull public final Logger getLogger() { return EditorContext.logger; } @Nullable public final Object collectEditorContext(@NotNull Project project, @NotNull Continuation $completion) { // Byte code:
/*     */       //   0: aload_2
/*     */       //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion$collectEditorContext$1
/*     */       //   4: ifeq -> 39
/*     */       //   7: aload_2
/*     */       //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion$collectEditorContext$1
/*     */       //   11: astore #7
/*     */       //   13: aload #7
/*     */       //   15: getfield label : I
/*     */       //   18: ldc -2147483648
/*     */       //   20: iand
/*     */       //   21: ifeq -> 39
/*     */       //   24: aload #7
/*     */       //   26: dup
/*     */       //   27: getfield label : I
/*     */       //   30: ldc -2147483648
/*     */       //   32: isub
/*     */       //   33: putfield label : I
/*     */       //   36: goto -> 50
/*     */       //   39: new com/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion$collectEditorContext$1
/*     */       //   42: dup
/*     */       //   43: aload_0
/*     */       //   44: aload_2
/*     */       //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion;Lkotlin/coroutines/Continuation;)V
/*     */       //   48: astore #7
/*     */       //   50: aload #7
/*     */       //   52: getfield result : Ljava/lang/Object;
/*     */       //   55: astore #6
/*     */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   60: astore #8
/*     */       //   62: aload #7
/*     */       //   64: getfield label : I
/*     */       //   67: tableswitch default -> 184, 0 -> 88, 1 -> 131
/*     */       //   88: aload #6
/*     */       //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   93: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */       //   96: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */       //   99: new com/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion$collectEditorContext$2
/*     */       //   102: dup
/*     */       //   103: aload_1
/*     */       //   104: aconst_null
/*     */       //   105: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)V
/*     */       //   108: checkcast kotlin/jvm/functions/Function2
/*     */       //   111: aload #7
/*     */       //   113: aload #7
/*     */       //   115: iconst_1
/*     */       //   116: putfield label : I
/*     */       //   119: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   122: dup
/*     */       //   123: aload #8
/*     */       //   125: if_acmpne -> 138
/*     */       //   128: aload #8
/*     */       //   130: areturn
/*     */       //   131: aload #6
/*     */       //   133: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   136: aload #6
/*     */       //   138: checkcast kotlin/Pair
/*     */       //   141: astore_3
/*     */       //   142: aload_3
/*     */       //   143: invokevirtual component1 : ()Ljava/lang/Object;
/*     */       //   146: checkcast java/util/List
/*     */       //   149: astore #4
/*     */       //   151: aload_3
/*     */       //   152: invokevirtual component2 : ()Ljava/lang/Object;
/*     */       //   155: checkcast java/util/List
/*     */       //   158: astore #5
/*     */       //   160: new com/intellij/ml/llm/matterhorn/ej/core/EditorContext
/*     */       //   163: dup
/*     */       //   164: aload #4
/*     */       //   166: checkcast java/lang/Iterable
/*     */       //   169: invokestatic toLinkedSet : (Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;
/*     */       //   172: aload #5
/*     */       //   174: checkcast java/lang/Iterable
/*     */       //   177: invokestatic toLinkedSet : (Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;
/*     */       //   180: invokespecial <init> : (Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;)V
/*     */       //   183: areturn
/*     */       //   184: new java/lang/IllegalStateException
/*     */       //   187: dup
/*     */       //   188: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   190: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   193: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #37	-> 60
/*     */       //   #38	-> 93
/*     */       //   #37	-> 128
/*     */       //   #38	-> 138
/*     */       //   #57	-> 160
/*     */       //   #37	-> 184
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   93	29	1	project	Lcom/intellij/openapi/project/Project;
/*     */       //   151	33	4	recentFilesPaths	Ljava/util/List;
/*     */       //   160	24	5	openFilesPaths	Ljava/util/List;
/*     */       //   0	194	2	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   50	134	7	$continuation	Lkotlin/coroutines/Continuation;
/* 199 */       //   57	127	6	$result	Ljava/lang/Object; } @DebugMetadata(f = "EditorContext.kt", l = {38}, i = {}, s = {}, n = {}, m = "collectEditorContext", c = "com.intellij.ml.llm.matterhorn.ej.core.EditorContext$Companion") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class EditorContext$Companion$collectEditorContext$1 extends ContinuationImpl { int label; EditorContext$Companion$collectEditorContext$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return EditorContext.Companion.this.collectEditorContext(null, (Continuation<? super EditorContext>)this); } } @DebugMetadata(f = "EditorContext.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.EditorContext$Companion$collectEditorContext$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\002\020 \n\002\020\016\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\020\000\0328\022\031\022\027\022\023\022\0210\003¢\006\002\b\004¢\006\002\b\005¢\006\002\b\0060\002\022\031\022\027\022\023\022\0210\003¢\006\002\b\004¢\006\002\b\005¢\006\002\b\0060\0020\001*\0020\007H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "Lorg/jetbrains/annotations/NonNls;", "Lorg/jetbrains/annotations/NotNull;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}) @SourceDebugExtension({"SMAP\nEditorContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion$collectEditorContext$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,195:1\n774#2:196\n865#2,2:197\n1557#2:199\n1628#2,3:200\n774#2:203\n865#2,2:204\n1557#2:206\n1628#2,3:207\n*S KotlinDebug\n*F\n+ 1 EditorContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion$collectEditorContext$2\n*L\n52#1:196\n52#1:197,2\n52#1:199\n52#1:200,3\n53#1:203\n53#1:204,2\n53#1:206\n53#1:207,3\n*E\n"}) static final class EditorContext$Companion$collectEditorContext$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends List<? extends String>, ? extends List<? extends String>>>, Object> { public final Object invokeSuspend(Object $result) { FileEditorManager editorManager; EditorHistoryManager historyManager; LinkedHashSet<VirtualFile> recentFiles, openFiles, linkedHashSet1; Iterable iterable1; Iterable<VirtualFile> $this$filter$iv; Iterable $this$map$iv; EditorContext.Companion companion2; int i; EditorContext.Companion companion1; int $i$f$map, j; Iterable iterable2; int $i$f$filter; Iterable $this$mapTo$iv$iv; VirtualFile it; LinkedHashSet<VirtualFile> linkedHashSet2; Collection<String> collection1; Iterable<VirtualFile> $this$filterTo$iv$iv; Collection<String> destination$iv$iv; int $i$a$-let-EditorContext$Companion$collectEditorContext$2$1; Collection<Object> collection3; int k; Collection<Object> collection2; int $i$f$mapTo, $i$f$filterTo; List list1, list2, list3; IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); editorManager = FileEditorManager.getInstance(this.$project); historyManager = EditorHistoryManager.Companion.getInstance(this.$project); recentFiles = new LinkedHashSet(); openFiles = new LinkedHashSet(); it = editorManager.getSelectedTextEditor().getVirtualFile(); $i$a$-let-EditorContext$Companion$collectEditorContext$2$1 = 0; recentFiles.add(it); Boxing.boxBoolean(openFiles.add(it)); editorManager.getSelectedTextEditor().getVirtualFile(); recentFiles.addAll(CollectionsKt.reversed(historyManager.getFileList())); Intrinsics.checkNotNullExpressionValue(FileEditorManager.getInstance(this.$project).getOpenFiles(), "getOpenFiles(...)"); CollectionsKt.addAll(openFiles, (Object[])FileEditorManager.getInstance(this.$project).getOpenFiles()); linkedHashSet1 = recentFiles; companion2 = EditorContext.Companion; j = 0; linkedHashSet2 = linkedHashSet1; collection3 = new ArrayList(); $i$f$filterTo = 0; for (VirtualFile element$iv$iv : linkedHashSet2) { VirtualFile p0 = element$iv$iv; int $i$a$-filter-EditorContext$Companion$collectEditorContext$2$2 = 0; if (companion2.hasNioPath(p0)) collection3.add(element$iv$iv);  }  iterable1 = collection3; i = 0; iterable2 = iterable1; collection1 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10)); k = 0;
/* 200 */             for (Object item$iv$iv : iterable2) {
/* 201 */               VirtualFile virtualFile = (VirtualFile)item$iv$iv; Collection<String> collection = collection1; int $i$a$-map-EditorContext$Companion$collectEditorContext$2$3 = 0; collection.add(virtualFile.getPath());
/* 202 */             }  $this$filter$iv = openFiles; companion1 = EditorContext.Companion; list1 = (List)collection1; $i$f$filter = 0;
/* 203 */             $this$filterTo$iv$iv = $this$filter$iv; collection2 = new ArrayList(); $i$f$filterTo = 0;
/* 204 */             for (VirtualFile element$iv$iv : $this$filterTo$iv$iv) { VirtualFile p0 = element$iv$iv; int $i$a$-filter-EditorContext$Companion$collectEditorContext$2$4 = 0; if (companion1.hasNioPath(p0)) collection2.add(element$iv$iv);  }
/* 205 */              $this$map$iv = collection2; list1 = list1; $i$f$map = 0;
/* 206 */             $this$mapTo$iv$iv = $this$map$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); $i$f$mapTo = 0;
/* 207 */             for (Object item$iv$iv : $this$mapTo$iv$iv) {
/* 208 */               VirtualFile virtualFile = (VirtualFile)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-EditorContext$Companion$collectEditorContext$2$5 = 0; collection.add(virtualFile.getPath());
/* 209 */             }  list2 = (List)destination$iv$iv;
/*     */             list3 = list1;
/*     */             return new Pair(list3, list2); }
/*     */         
/*     */         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */       
/*     */       int label;
/*     */       
/*     */       EditorContext$Companion$collectEditorContext$2(Project $project, Continuation $completion) {
/*     */         super(2, $completion);
/*     */       }
/*     */       
/*     */       public final Continuation<Unit> create(Object value, Continuation<? super EditorContext$Companion$collectEditorContext$2> $completion) {
/*     */         return (Continuation<Unit>)new EditorContext$Companion$collectEditorContext$2(this.$project, $completion);
/*     */       }
/*     */       
/*     */       public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */         return ((EditorContext$Companion$collectEditorContext$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */       } }
/*     */ 
/*     */     
/*     */     private final boolean hasNioPath(VirtualFile it) {
/*     */       boolean bool;
/*     */       try {
/*     */         it.toNioPath();
/*     */         bool = true;
/*     */       } catch (UnsupportedOperationException e) {
/*     */         bool = false;
/*     */       } 
/*     */       return bool;
/*     */     }
/*     */     
/*     */     private final void addJunieGuidelinesFromDirectory(VirtualFile dir, StringBuilder result) {
/*     */       VirtualFile junie, file;
/*     */       if (VirtualFileUtil.findDirectory(dir, ".junie") == null) {
/*     */         VirtualFileUtil.findDirectory(dir, ".junie");
/*     */         return;
/*     */       } 
/*     */       if (VirtualFileUtil.findFile(junie, "guidelines.md") == null) {
/*     */         VirtualFileUtil.findFile(junie, "guidelines.md");
/*     */         return;
/*     */       } 
/*     */       Intrinsics.checkNotNullExpressionValue(result.append(VirtualFileUtil.readText(file)), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue(result.append(VirtualFileUtil.readText(file)).append('\n'), "append(...)");
/*     */       result.append(VirtualFileUtil.readText(file)).append('\n');
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final String collectGuidanceContext(@NotNull ExecutionAgentContext context) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'context'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: new java/lang/StringBuilder
/*     */       //   9: dup
/*     */       //   10: invokespecial <init> : ()V
/*     */       //   13: astore_2
/*     */       //   14: aload_1
/*     */       //   15: invokeinterface getCurrentScreenPosition : ()Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*     */       //   20: dup
/*     */       //   21: ifnull -> 38
/*     */       //   24: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   27: dup
/*     */       //   28: ifnull -> 38
/*     */       //   31: invokevirtual getParent : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   34: dup
/*     */       //   35: ifnonnull -> 45
/*     */       //   38: pop
/*     */       //   39: aload_1
/*     */       //   40: invokeinterface getCurrentDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   45: astore_3
/*     */       //   46: aload_3
/*     */       //   47: ifnull -> 80
/*     */       //   50: aload_3
/*     */       //   51: aload_1
/*     */       //   52: invokeinterface getProjectDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   57: invokevirtual getParent : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   60: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   63: ifne -> 80
/*     */       //   66: aload_0
/*     */       //   67: aload_3
/*     */       //   68: aload_2
/*     */       //   69: invokespecial addJunieGuidelinesFromDirectory : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/StringBuilder;)V
/*     */       //   72: aload_3
/*     */       //   73: invokevirtual getParent : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   76: astore_3
/*     */       //   77: goto -> 46
/*     */       //   80: aload_1
/*     */       //   81: invokeinterface getProjectDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   86: aload_1
/*     */       //   87: invokeinterface getCurrentDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   92: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   95: ifeq -> 310
/*     */       //   98: aload_1
/*     */       //   99: invokeinterface getCurrentScreenPosition : ()Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*     */       //   104: ifnonnull -> 310
/*     */       //   107: aload_1
/*     */       //   108: invokeinterface getProjectDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   113: invokevirtual getChildren : ()[Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   116: dup
/*     */       //   117: ldc 'getChildren(...)'
/*     */       //   119: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   122: checkcast [Ljava/lang/Object;
/*     */       //   125: astore #5
/*     */       //   127: iconst_0
/*     */       //   128: istore #6
/*     */       //   130: aload #5
/*     */       //   132: astore #7
/*     */       //   134: new java/util/ArrayList
/*     */       //   137: dup
/*     */       //   138: invokespecial <init> : ()V
/*     */       //   141: checkcast java/util/Collection
/*     */       //   144: astore #8
/*     */       //   146: iconst_0
/*     */       //   147: istore #9
/*     */       //   149: iconst_0
/*     */       //   150: istore #10
/*     */       //   152: aload #7
/*     */       //   154: arraylength
/*     */       //   155: istore #11
/*     */       //   157: iload #10
/*     */       //   159: iload #11
/*     */       //   161: if_icmpge -> 235
/*     */       //   164: aload #7
/*     */       //   166: iload #10
/*     */       //   168: aaload
/*     */       //   169: astore #12
/*     */       //   171: aload #12
/*     */       //   173: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */       //   176: astore #13
/*     */       //   178: iconst_0
/*     */       //   179: istore #14
/*     */       //   181: aload #13
/*     */       //   183: invokevirtual isDirectory : ()Z
/*     */       //   186: ifeq -> 215
/*     */       //   189: aload #13
/*     */       //   191: invokevirtual getName : ()Ljava/lang/String;
/*     */       //   194: dup
/*     */       //   195: ldc 'getName(...)'
/*     */       //   197: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   200: ldc '.'
/*     */       //   202: iconst_0
/*     */       //   203: iconst_2
/*     */       //   204: aconst_null
/*     */       //   205: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */       //   208: ifne -> 215
/*     */       //   211: iconst_1
/*     */       //   212: goto -> 216
/*     */       //   215: iconst_0
/*     */       //   216: ifeq -> 229
/*     */       //   219: aload #8
/*     */       //   221: aload #12
/*     */       //   223: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   228: pop
/*     */       //   229: iinc #10, 1
/*     */       //   232: goto -> 157
/*     */       //   235: aload #8
/*     */       //   237: checkcast java/util/List
/*     */       //   240: nop
/*     */       //   241: astore #4
/*     */       //   243: aload #4
/*     */       //   245: checkcast java/lang/Iterable
/*     */       //   248: astore #5
/*     */       //   250: iconst_0
/*     */       //   251: istore #6
/*     */       //   253: aload #5
/*     */       //   255: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   260: astore #7
/*     */       //   262: aload #7
/*     */       //   264: invokeinterface hasNext : ()Z
/*     */       //   269: ifeq -> 309
/*     */       //   272: aload #7
/*     */       //   274: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   279: astore #8
/*     */       //   281: aload #8
/*     */       //   283: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */       //   286: astore #9
/*     */       //   288: iconst_0
/*     */       //   289: istore #10
/*     */       //   291: getstatic com/intellij/ml/llm/matterhorn/ej/core/EditorContext.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion;
/*     */       //   294: aload #9
/*     */       //   296: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */       //   299: aload #9
/*     */       //   301: aload_2
/*     */       //   302: invokespecial addJunieGuidelinesFromDirectory : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/StringBuilder;)V
/*     */       //   305: nop
/*     */       //   306: goto -> 262
/*     */       //   309: nop
/*     */       //   310: aload_2
/*     */       //   311: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   314: checkcast java/lang/CharSequence
/*     */       //   317: astore #4
/*     */       //   319: aload #4
/*     */       //   321: invokeinterface length : ()I
/*     */       //   326: ifne -> 333
/*     */       //   329: iconst_1
/*     */       //   330: goto -> 334
/*     */       //   333: iconst_0
/*     */       //   334: ifeq -> 344
/*     */       //   337: iconst_0
/*     */       //   338: istore #5
/*     */       //   340: aconst_null
/*     */       //   341: goto -> 346
/*     */       //   344: aload #4
/*     */       //   346: checkcast java/lang/String
/*     */       //   349: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #77	-> 6
/*     */       //   #79	-> 14
/*     */       //   #81	-> 46
/*     */       //   #82	-> 66
/*     */       //   #83	-> 72
/*     */       //   #87	-> 80
/*     */       //   #88	-> 107
/*     */       //   #196	-> 130
/*     */       //   #197	-> 149
/*     */       //   #88	-> 181
/*     */       //   #197	-> 216
/*     */       //   #198	-> 235
/*     */       //   #196	-> 240
/*     */       //   #88	-> 241
/*     */       //   #89	-> 243
/*     */       //   #199	-> 253
/*     */       //   #89	-> 291
/*     */       //   #199	-> 305
/*     */       //   #200	-> 309
/*     */       //   #92	-> 310
/*     */       //   #201	-> 337
/*     */       //   #92	-> 340
/*     */       //   #92	-> 341
/*     */       //   #92	-> 349
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   181	35	14	$i$a$-filter-EditorContext$Companion$collectGuidanceContext$topLevelDirs$1	I
/*     */       //   178	38	13	it	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   171	58	12	element$iv$iv	Ljava/lang/Object;
/*     */       //   149	88	9	$i$f$filterTo	I
/*     */       //   146	91	7	$this$filterTo$iv$iv	[Ljava/lang/Object;
/*     */       //   146	91	8	destination$iv$iv	Ljava/util/Collection;
/*     */       //   130	111	6	$i$f$filter	I
/*     */       //   127	114	5	$this$filter$iv	[Ljava/lang/Object;
/*     */       //   291	14	10	$i$a$-forEach-EditorContext$Companion$collectGuidanceContext$1	I
/*     */       //   288	17	9	it	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   281	25	8	element$iv	Ljava/lang/Object;
/*     */       //   253	57	6	$i$f$forEach	I
/*     */       //   250	60	5	$this$forEach$iv	Ljava/lang/Iterable;
/*     */       //   243	67	4	topLevelDirs	Ljava/util/List;
/*     */       //   340	1	5	$i$a$-ifEmpty-EditorContext$Companion$collectGuidanceContext$2	I
/*     */       //   14	336	2	result	Ljava/lang/StringBuilder;
/*     */       //   46	304	3	anchor	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   0	350	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion;
/*     */       //   0	350	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     } }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object getContext(@NotNull ExecutionAgentContext context, @NotNull List explicitlySelectedUserPaths, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/EditorContext$getContext$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/EditorContext$getContext$1
/*     */     //   11: astore #17
/*     */     //   13: aload #17
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #17
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/EditorContext$getContext$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #17
/*     */     //   50: aload #17
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #16
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #18
/*     */     //   62: aload #17
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 729, 0 -> 92, 1 -> 170, 2 -> 622
/*     */     //   92: aload #16
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: nop
/*     */     //   98: aload_1
/*     */     //   99: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   104: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/fileEditor/FileEditorManager;
/*     */     //   107: invokevirtual getSelectedTextEditor : ()Lcom/intellij/openapi/editor/Editor;
/*     */     //   110: astore #4
/*     */     //   112: aload_1
/*     */     //   113: aload_1
/*     */     //   114: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   119: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   122: invokevirtual getMustIgnore : ()Lkotlin/jvm/functions/Function2;
/*     */     //   125: aload #17
/*     */     //   127: aload #17
/*     */     //   129: aload_0
/*     */     //   130: putfield L$0 : Ljava/lang/Object;
/*     */     //   133: aload #17
/*     */     //   135: aload_1
/*     */     //   136: putfield L$1 : Ljava/lang/Object;
/*     */     //   139: aload #17
/*     */     //   141: aload_2
/*     */     //   142: putfield L$2 : Ljava/lang/Object;
/*     */     //   145: aload #17
/*     */     //   147: aload #4
/*     */     //   149: putfield L$3 : Ljava/lang/Object;
/*     */     //   152: aload #17
/*     */     //   154: iconst_1
/*     */     //   155: putfield label : I
/*     */     //   158: invokestatic access$collectVCSContext : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   161: dup
/*     */     //   162: aload #18
/*     */     //   164: if_acmpne -> 215
/*     */     //   167: aload #18
/*     */     //   169: areturn
/*     */     //   170: aload #17
/*     */     //   172: getfield L$3 : Ljava/lang/Object;
/*     */     //   175: checkcast com/intellij/openapi/editor/Editor
/*     */     //   178: astore #4
/*     */     //   180: aload #17
/*     */     //   182: getfield L$2 : Ljava/lang/Object;
/*     */     //   185: checkcast java/util/List
/*     */     //   188: astore_2
/*     */     //   189: aload #17
/*     */     //   191: getfield L$1 : Ljava/lang/Object;
/*     */     //   194: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   197: astore_1
/*     */     //   198: aload #17
/*     */     //   200: getfield L$0 : Ljava/lang/Object;
/*     */     //   203: checkcast com/intellij/ml/llm/matterhorn/ej/core/EditorContext
/*     */     //   206: astore_0
/*     */     //   207: nop
/*     */     //   208: aload #16
/*     */     //   210: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   213: aload #16
/*     */     //   215: checkcast java/lang/String
/*     */     //   218: astore #5
/*     */     //   220: aload_0
/*     */     //   221: getfield recentFiles : Ljava/util/LinkedHashSet;
/*     */     //   224: checkcast java/util/Set
/*     */     //   227: aload_0
/*     */     //   228: getfield openFiles : Ljava/util/LinkedHashSet;
/*     */     //   231: checkcast java/lang/Iterable
/*     */     //   234: invokestatic plus : (Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
/*     */     //   237: checkcast java/lang/Iterable
/*     */     //   240: invokestatic distinct : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   243: checkcast java/lang/Iterable
/*     */     //   246: astore #7
/*     */     //   248: iconst_0
/*     */     //   249: istore #8
/*     */     //   251: aload #7
/*     */     //   253: astore #9
/*     */     //   255: new java/util/ArrayList
/*     */     //   258: dup
/*     */     //   259: invokespecial <init> : ()V
/*     */     //   262: checkcast java/util/Collection
/*     */     //   265: astore #10
/*     */     //   267: iconst_0
/*     */     //   268: istore #11
/*     */     //   270: aload #9
/*     */     //   272: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   277: astore #12
/*     */     //   279: aload #12
/*     */     //   281: invokeinterface hasNext : ()Z
/*     */     //   286: ifeq -> 339
/*     */     //   289: aload #12
/*     */     //   291: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   296: astore #13
/*     */     //   298: aload #13
/*     */     //   300: checkcast java/lang/String
/*     */     //   303: astore #14
/*     */     //   305: iconst_0
/*     */     //   306: istore #15
/*     */     //   308: aload_2
/*     */     //   309: aload #14
/*     */     //   311: iconst_0
/*     */     //   312: anewarray java/lang/String
/*     */     //   315: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
/*     */     //   318: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   323: ifne -> 279
/*     */     //   326: aload #10
/*     */     //   328: aload #13
/*     */     //   330: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   335: pop
/*     */     //   336: goto -> 279
/*     */     //   339: aload #10
/*     */     //   341: checkcast java/util/List
/*     */     //   344: nop
/*     */     //   345: astore #6
/*     */     //   347: aload #6
/*     */     //   349: invokeinterface isEmpty : ()Z
/*     */     //   354: ifeq -> 369
/*     */     //   357: aload #4
/*     */     //   359: ifnonnull -> 369
/*     */     //   362: aload #5
/*     */     //   364: ifnonnull -> 369
/*     */     //   367: aconst_null
/*     */     //   368: areturn
/*     */     //   369: new java/lang/StringBuilder
/*     */     //   372: dup
/*     */     //   373: ldc '## INITIAL USER CONTEXT\\n'
/*     */     //   375: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   378: astore #7
/*     */     //   380: aload #6
/*     */     //   382: checkcast java/lang/Iterable
/*     */     //   385: bipush #10
/*     */     //   387: invokestatic take : (Ljava/lang/Iterable;I)Ljava/util/List;
/*     */     //   390: checkcast java/lang/Iterable
/*     */     //   393: ldc '\\n'
/*     */     //   395: checkcast java/lang/CharSequence
/*     */     //   398: aconst_null
/*     */     //   399: aconst_null
/*     */     //   400: iconst_0
/*     */     //   401: aconst_null
/*     */     //   402: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   407: bipush #30
/*     */     //   409: aconst_null
/*     */     //   410: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   413: astore #8
/*     */     //   415: aload #7
/*     */     //   417: ldc '### RECENT FILES'
/*     */     //   419: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   422: dup
/*     */     //   423: ldc 'append(...)'
/*     */     //   425: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   428: bipush #10
/*     */     //   430: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   433: dup
/*     */     //   434: ldc 'append(...)'
/*     */     //   436: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   439: pop
/*     */     //   440: aload #7
/*     */     //   442: ldc 'Here are the full paths of the recently used files that might be useful for solving the `<issue_description>`:'
/*     */     //   444: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   447: dup
/*     */     //   448: ldc 'append(...)'
/*     */     //   450: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   453: bipush #10
/*     */     //   455: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   458: dup
/*     */     //   459: ldc 'append(...)'
/*     */     //   461: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   464: pop
/*     */     //   465: aload #7
/*     */     //   467: aload #8
/*     */     //   469: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   472: dup
/*     */     //   473: ldc 'append(...)'
/*     */     //   475: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   478: bipush #10
/*     */     //   480: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   483: dup
/*     */     //   484: ldc 'append(...)'
/*     */     //   486: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   489: pop
/*     */     //   490: aload #7
/*     */     //   492: ldc ''
/*     */     //   494: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   497: dup
/*     */     //   498: ldc 'append(...)'
/*     */     //   500: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   503: bipush #10
/*     */     //   505: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   508: dup
/*     */     //   509: ldc 'append(...)'
/*     */     //   511: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   514: pop
/*     */     //   515: aload #7
/*     */     //   517: ldc 'It is recommended to explore their structure using the `get_file_structure` command for better understanding of their content.'
/*     */     //   519: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   522: dup
/*     */     //   523: ldc 'append(...)'
/*     */     //   525: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   528: bipush #10
/*     */     //   530: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   533: dup
/*     */     //   534: ldc 'append(...)'
/*     */     //   536: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   539: pop
/*     */     //   540: aload #7
/*     */     //   542: ldc ''
/*     */     //   544: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   547: dup
/*     */     //   548: ldc 'append(...)'
/*     */     //   550: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   553: bipush #10
/*     */     //   555: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   558: dup
/*     */     //   559: ldc 'append(...)'
/*     */     //   561: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   564: pop
/*     */     //   565: aload #4
/*     */     //   567: ifnull -> 651
/*     */     //   570: aload_0
/*     */     //   571: aload #7
/*     */     //   573: aload_1
/*     */     //   574: aload #4
/*     */     //   576: aload #17
/*     */     //   578: aload #17
/*     */     //   580: aload #5
/*     */     //   582: putfield L$0 : Ljava/lang/Object;
/*     */     //   585: aload #17
/*     */     //   587: aload #7
/*     */     //   589: putfield L$1 : Ljava/lang/Object;
/*     */     //   592: aload #17
/*     */     //   594: aconst_null
/*     */     //   595: putfield L$2 : Ljava/lang/Object;
/*     */     //   598: aload #17
/*     */     //   600: aconst_null
/*     */     //   601: putfield L$3 : Ljava/lang/Object;
/*     */     //   604: aload #17
/*     */     //   606: iconst_2
/*     */     //   607: putfield label : I
/*     */     //   610: invokespecial collectCurrentFileContext : (Ljava/lang/StringBuilder;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/openapi/editor/Editor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   613: dup
/*     */     //   614: aload #18
/*     */     //   616: if_acmpne -> 650
/*     */     //   619: aload #18
/*     */     //   621: areturn
/*     */     //   622: aload #17
/*     */     //   624: getfield L$1 : Ljava/lang/Object;
/*     */     //   627: checkcast java/lang/StringBuilder
/*     */     //   630: astore #7
/*     */     //   632: aload #17
/*     */     //   634: getfield L$0 : Ljava/lang/Object;
/*     */     //   637: checkcast java/lang/String
/*     */     //   640: astore #5
/*     */     //   642: nop
/*     */     //   643: aload #16
/*     */     //   645: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   648: aload #16
/*     */     //   650: pop
/*     */     //   651: aload #5
/*     */     //   653: ifnull -> 706
/*     */     //   656: aload #7
/*     */     //   658: ldc '### VCS STATUS:'
/*     */     //   660: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   663: dup
/*     */     //   664: ldc 'append(...)'
/*     */     //   666: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   669: bipush #10
/*     */     //   671: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   674: dup
/*     */     //   675: ldc 'append(...)'
/*     */     //   677: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   680: pop
/*     */     //   681: aload #7
/*     */     //   683: aload #5
/*     */     //   685: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   688: dup
/*     */     //   689: ldc 'append(...)'
/*     */     //   691: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   694: bipush #10
/*     */     //   696: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   699: dup
/*     */     //   700: ldc 'append(...)'
/*     */     //   702: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   705: pop
/*     */     //   706: aload #7
/*     */     //   708: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   711: areturn
/*     */     //   712: astore #5
/*     */     //   714: getstatic com/intellij/ml/llm/matterhorn/ej/core/EditorContext.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   717: ldc 'Error while gathering context'
/*     */     //   719: aload #5
/*     */     //   721: checkcast java/lang/Throwable
/*     */     //   724: invokevirtual error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   727: aconst_null
/*     */     //   728: areturn
/*     */     //   729: new java/lang/IllegalStateException
/*     */     //   732: dup
/*     */     //   733: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   736: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   739: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #96	-> 60
/*     */     //   #97	-> 97
/*     */     //   #98	-> 98
/*     */     //   #99	-> 112
/*     */     //   #96	-> 167
/*     */     //   #101	-> 220
/*     */     //   #102	-> 248
/*     */     //   #196	-> 251
/*     */     //   #197	-> 270
/*     */     //   #102	-> 308
/*     */     //   #197	-> 323
/*     */     //   #198	-> 339
/*     */     //   #196	-> 344
/*     */     //   #102	-> 345
/*     */     //   #101	-> 345
/*     */     //   #103	-> 347
/*     */     //   #104	-> 367
/*     */     //   #106	-> 369
/*     */     //   #107	-> 380
/*     */     //   #108	-> 385
/*     */     //   #109	-> 393
/*     */     //   #107	-> 413
/*     */     //   #112	-> 415
/*     */     //   #113	-> 440
/*     */     //   #114	-> 465
/*     */     //   #115	-> 490
/*     */     //   #116	-> 515
/*     */     //   #117	-> 540
/*     */     //   #119	-> 565
/*     */     //   #120	-> 570
/*     */     //   #96	-> 619
/*     */     //   #123	-> 650
/*     */     //   #124	-> 656
/*     */     //   #125	-> 681
/*     */     //   #128	-> 706
/*     */     //   #129	-> 712
/*     */     //   #130	-> 714
/*     */     //   #131	-> 727
/*     */     //   #96	-> 729
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	73	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;
/*     */     //   207	116	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;
/*     */     //   323	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;
/*     */     //   345	22	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;
/*     */     //   369	70	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;
/*     */     //   439	25	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;
/*     */     //   464	25	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;
/*     */     //   489	25	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;
/*     */     //   514	25	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;
/*     */     //   539	25	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;
/*     */     //   564	49	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;
/*     */     //   97	73	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   198	125	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   323	22	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   345	22	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   369	70	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   439	25	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   464	25	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   489	25	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   514	25	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   539	25	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   564	49	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   97	73	2	explicitlySelectedUserPaths	Ljava/util/List;
/*     */     //   189	134	2	explicitlySelectedUserPaths	Ljava/util/List;
/*     */     //   323	16	2	explicitlySelectedUserPaths	Ljava/util/List;
/*     */     //   112	58	4	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   180	143	4	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   323	22	4	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   345	22	4	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   369	70	4	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   439	25	4	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   464	25	4	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   489	25	4	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   514	25	4	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   539	25	4	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   564	49	4	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   220	103	5	vcsStatus	Ljava/lang/String;
/*     */     //   323	22	5	vcsStatus	Ljava/lang/String;
/*     */     //   345	22	5	vcsStatus	Ljava/lang/String;
/*     */     //   369	253	5	vcsStatus	Ljava/lang/String;
/*     */     //   642	38	5	vcsStatus	Ljava/lang/String;
/*     */     //   680	25	5	vcsStatus	Ljava/lang/String;
/*     */     //   714	15	5	e	Ljava/lang/Exception;
/*     */     //   347	20	6	ideContextFiles	Ljava/util/List;
/*     */     //   369	16	6	ideContextFiles	Ljava/util/List;
/*     */     //   248	19	7	$this$filterNot$iv	Ljava/lang/Iterable;
/*     */     //   380	242	7	result	Ljava/lang/StringBuilder;
/*     */     //   632	48	7	result	Ljava/lang/StringBuilder;
/*     */     //   680	25	7	result	Ljava/lang/StringBuilder;
/*     */     //   705	7	7	result	Ljava/lang/StringBuilder;
/*     */     //   415	24	8	recentFileText	Ljava/lang/String;
/*     */     //   439	25	8	recentFileText	Ljava/lang/String;
/*     */     //   464	25	8	recentFileText	Ljava/lang/String;
/*     */     //   267	12	9	$this$filterNotTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   267	74	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   298	38	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   305	18	14	it	Ljava/lang/String;
/*     */     //   308	15	15	$i$a$-filterNot-EditorContext$getContext$ideContextFiles$1	I
/*     */     //   270	71	11	$i$f$filterNotTo	I
/*     */     //   251	94	8	$i$f$filterNot	I
/*     */     //   0	740	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	679	17	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	672	16	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   97	161	712	java/lang/Exception
/*     */     //   207	613	712	java/lang/Exception
/*     */     //   642	712	712	java/lang/Exception
/*     */   }
/*     */   
/*     */   private static final CharSequence getContext$lambda$1(String it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return Paths.get(it, new String[0]).toString();
/*     */   }
/*     */   
/*     */   private final Object collectCurrentFileContext(StringBuilder $this$collectCurrentFileContext, ExecutionAgentContext context, Editor editor, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/EditorContext$collectCurrentFileContext$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/EditorContext$collectCurrentFileContext$1
/*     */     //   13: astore #11
/*     */     //   15: aload #11
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #11
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/EditorContext$collectCurrentFileContext$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #11
/*     */     //   53: aload #11
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #10
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #12
/*     */     //   65: aload #11
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 683, 0 -> 104, 1 -> 212, 2 -> 384, 3 -> 535, 4 -> 635
/*     */     //   104: aload #10
/*     */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   109: invokestatic getInstance : ()Lcom/intellij/openapi/fileEditor/FileDocumentManager;
/*     */     //   112: aload_3
/*     */     //   113: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */     //   118: invokevirtual getFile : (Lcom/intellij/openapi/editor/Document;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   121: dup
/*     */     //   122: ifnonnull -> 130
/*     */     //   125: pop
/*     */     //   126: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   129: areturn
/*     */     //   130: astore #5
/*     */     //   132: aload #5
/*     */     //   134: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*     */     //   137: astore #6
/*     */     //   139: aload #6
/*     */     //   141: ifnull -> 279
/*     */     //   144: aload_2
/*     */     //   145: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   150: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   153: invokevirtual getMustIgnore : ()Lkotlin/jvm/functions/Function2;
/*     */     //   156: aload #6
/*     */     //   158: aload #11
/*     */     //   160: aload #11
/*     */     //   162: aload_1
/*     */     //   163: putfield L$0 : Ljava/lang/Object;
/*     */     //   166: aload #11
/*     */     //   168: aload_2
/*     */     //   169: putfield L$1 : Ljava/lang/Object;
/*     */     //   172: aload #11
/*     */     //   174: aload_3
/*     */     //   175: putfield L$2 : Ljava/lang/Object;
/*     */     //   178: aload #11
/*     */     //   180: aload #5
/*     */     //   182: putfield L$3 : Ljava/lang/Object;
/*     */     //   185: aload #11
/*     */     //   187: aload #6
/*     */     //   189: putfield L$4 : Ljava/lang/Object;
/*     */     //   192: aload #11
/*     */     //   194: iconst_1
/*     */     //   195: putfield label : I
/*     */     //   198: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   203: dup
/*     */     //   204: aload #12
/*     */     //   206: if_acmpne -> 266
/*     */     //   209: aload #12
/*     */     //   211: areturn
/*     */     //   212: aload #11
/*     */     //   214: getfield L$4 : Ljava/lang/Object;
/*     */     //   217: checkcast java/nio/file/Path
/*     */     //   220: astore #6
/*     */     //   222: aload #11
/*     */     //   224: getfield L$3 : Ljava/lang/Object;
/*     */     //   227: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   230: astore #5
/*     */     //   232: aload #11
/*     */     //   234: getfield L$2 : Ljava/lang/Object;
/*     */     //   237: checkcast com/intellij/openapi/editor/Editor
/*     */     //   240: astore_3
/*     */     //   241: aload #11
/*     */     //   243: getfield L$1 : Ljava/lang/Object;
/*     */     //   246: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   249: astore_2
/*     */     //   250: aload #11
/*     */     //   252: getfield L$0 : Ljava/lang/Object;
/*     */     //   255: checkcast java/lang/StringBuilder
/*     */     //   258: astore_1
/*     */     //   259: aload #10
/*     */     //   261: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   264: aload #10
/*     */     //   266: checkcast java/lang/Boolean
/*     */     //   269: invokevirtual booleanValue : ()Z
/*     */     //   272: ifeq -> 279
/*     */     //   275: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   278: areturn
/*     */     //   279: aload_2
/*     */     //   280: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   285: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   288: invokevirtual getHumanInLoop : ()Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*     */     //   291: astore #8
/*     */     //   293: aload #8
/*     */     //   295: instanceof com/intellij/ml/llm/matterhorn/HumanInLoopExtension
/*     */     //   298: ifeq -> 309
/*     */     //   301: aload #8
/*     */     //   303: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopExtension
/*     */     //   306: goto -> 310
/*     */     //   309: aconst_null
/*     */     //   310: astore #7
/*     */     //   312: aload #7
/*     */     //   314: ifnull -> 441
/*     */     //   317: aload #6
/*     */     //   319: ifnull -> 441
/*     */     //   322: aload #7
/*     */     //   324: invokeinterface isInProject : ()Lkotlin/jvm/functions/Function2;
/*     */     //   329: aload #6
/*     */     //   331: aload #11
/*     */     //   333: aload #11
/*     */     //   335: aload_1
/*     */     //   336: putfield L$0 : Ljava/lang/Object;
/*     */     //   339: aload #11
/*     */     //   341: aload_2
/*     */     //   342: putfield L$1 : Ljava/lang/Object;
/*     */     //   345: aload #11
/*     */     //   347: aload_3
/*     */     //   348: putfield L$2 : Ljava/lang/Object;
/*     */     //   351: aload #11
/*     */     //   353: aload #5
/*     */     //   355: putfield L$3 : Ljava/lang/Object;
/*     */     //   358: aload #11
/*     */     //   360: aconst_null
/*     */     //   361: putfield L$4 : Ljava/lang/Object;
/*     */     //   364: aload #11
/*     */     //   366: iconst_2
/*     */     //   367: putfield label : I
/*     */     //   370: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   375: dup
/*     */     //   376: aload #12
/*     */     //   378: if_acmpne -> 428
/*     */     //   381: aload #12
/*     */     //   383: areturn
/*     */     //   384: aload #11
/*     */     //   386: getfield L$3 : Ljava/lang/Object;
/*     */     //   389: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   392: astore #5
/*     */     //   394: aload #11
/*     */     //   396: getfield L$2 : Ljava/lang/Object;
/*     */     //   399: checkcast com/intellij/openapi/editor/Editor
/*     */     //   402: astore_3
/*     */     //   403: aload #11
/*     */     //   405: getfield L$1 : Ljava/lang/Object;
/*     */     //   408: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   411: astore_2
/*     */     //   412: aload #11
/*     */     //   414: getfield L$0 : Ljava/lang/Object;
/*     */     //   417: checkcast java/lang/StringBuilder
/*     */     //   420: astore_1
/*     */     //   421: aload #10
/*     */     //   423: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   426: aload #10
/*     */     //   428: checkcast java/lang/Boolean
/*     */     //   431: invokevirtual booleanValue : ()Z
/*     */     //   434: ifne -> 441
/*     */     //   437: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   440: areturn
/*     */     //   441: aload_1
/*     */     //   442: ldc_w '### CURRENT FILE:'
/*     */     //   445: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   448: dup
/*     */     //   449: ldc 'append(...)'
/*     */     //   451: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   454: bipush #10
/*     */     //   456: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   459: dup
/*     */     //   460: ldc 'append(...)'
/*     */     //   462: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   465: pop
/*     */     //   466: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */     //   469: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   472: new com/intellij/ml/llm/matterhorn/ej/core/EditorContext$collectCurrentFileContext$selectionStartLine$1
/*     */     //   475: dup
/*     */     //   476: aload_3
/*     */     //   477: aconst_null
/*     */     //   478: invokespecial <init> : (Lcom/intellij/openapi/editor/Editor;Lkotlin/coroutines/Continuation;)V
/*     */     //   481: checkcast kotlin/jvm/functions/Function2
/*     */     //   484: aload #11
/*     */     //   486: aload #11
/*     */     //   488: aload_1
/*     */     //   489: putfield L$0 : Ljava/lang/Object;
/*     */     //   492: aload #11
/*     */     //   494: aload_2
/*     */     //   495: putfield L$1 : Ljava/lang/Object;
/*     */     //   498: aload #11
/*     */     //   500: aload #5
/*     */     //   502: putfield L$2 : Ljava/lang/Object;
/*     */     //   505: aload #11
/*     */     //   507: aconst_null
/*     */     //   508: putfield L$3 : Ljava/lang/Object;
/*     */     //   511: aload #11
/*     */     //   513: aconst_null
/*     */     //   514: putfield L$4 : Ljava/lang/Object;
/*     */     //   517: aload #11
/*     */     //   519: iconst_3
/*     */     //   520: putfield label : I
/*     */     //   523: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   526: dup
/*     */     //   527: aload #12
/*     */     //   529: if_acmpne -> 570
/*     */     //   532: aload #12
/*     */     //   534: areturn
/*     */     //   535: aload #11
/*     */     //   537: getfield L$2 : Ljava/lang/Object;
/*     */     //   540: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   543: astore #5
/*     */     //   545: aload #11
/*     */     //   547: getfield L$1 : Ljava/lang/Object;
/*     */     //   550: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   553: astore_2
/*     */     //   554: aload #11
/*     */     //   556: getfield L$0 : Ljava/lang/Object;
/*     */     //   559: checkcast java/lang/StringBuilder
/*     */     //   562: astore_1
/*     */     //   563: aload #10
/*     */     //   565: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   568: aload #10
/*     */     //   570: checkcast java/lang/Number
/*     */     //   573: invokevirtual intValue : ()I
/*     */     //   576: istore #8
/*     */     //   578: aload_1
/*     */     //   579: astore #9
/*     */     //   581: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$Companion;
/*     */     //   584: aload_2
/*     */     //   585: aload #5
/*     */     //   587: iload #8
/*     */     //   589: iconst_1
/*     */     //   590: iadd
/*     */     //   591: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */     //   594: bipush #50
/*     */     //   596: aload #11
/*     */     //   598: aload #11
/*     */     //   600: aload #9
/*     */     //   602: putfield L$0 : Ljava/lang/Object;
/*     */     //   605: aload #11
/*     */     //   607: aconst_null
/*     */     //   608: putfield L$1 : Ljava/lang/Object;
/*     */     //   611: aload #11
/*     */     //   613: aconst_null
/*     */     //   614: putfield L$2 : Ljava/lang/Object;
/*     */     //   617: aload #11
/*     */     //   619: iconst_4
/*     */     //   620: putfield label : I
/*     */     //   623: invokevirtual getOpenFileActionOutput : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/Integer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   626: dup
/*     */     //   627: aload #12
/*     */     //   629: if_acmpne -> 652
/*     */     //   632: aload #12
/*     */     //   634: areturn
/*     */     //   635: aload #11
/*     */     //   637: getfield L$0 : Ljava/lang/Object;
/*     */     //   640: checkcast java/lang/StringBuilder
/*     */     //   643: astore #9
/*     */     //   645: aload #10
/*     */     //   647: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   650: aload #10
/*     */     //   652: aload #9
/*     */     //   654: swap
/*     */     //   655: checkcast java/lang/String
/*     */     //   658: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   661: dup
/*     */     //   662: ldc 'append(...)'
/*     */     //   664: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   667: bipush #10
/*     */     //   669: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   672: dup
/*     */     //   673: ldc 'append(...)'
/*     */     //   675: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   678: pop
/*     */     //   679: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   682: areturn
/*     */     //   683: new java/lang/IllegalStateException
/*     */     //   686: dup
/*     */     //   687: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   690: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   693: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #135	-> 63
/*     */     //   #136	-> 109
/*     */     //   #138	-> 132
/*     */     //   #139	-> 139
/*     */     //   #135	-> 209
/*     */     //   #139	-> 266
/*     */     //   #140	-> 275
/*     */     //   #143	-> 279
/*     */     //   #144	-> 312
/*     */     //   #135	-> 381
/*     */     //   #144	-> 428
/*     */     //   #146	-> 437
/*     */     //   #149	-> 441
/*     */     //   #150	-> 466
/*     */     //   #135	-> 532
/*     */     //   #150	-> 570
/*     */     //   #154	-> 578
/*     */     //   #135	-> 632
/*     */     //   #154	-> 652
/*     */     //   #155	-> 679
/*     */     //   #135	-> 683
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   109	103	1	$this$collectCurrentFileContext	Ljava/lang/StringBuilder;
/*     */     //   259	16	1	$this$collectCurrentFileContext	Ljava/lang/StringBuilder;
/*     */     //   279	105	1	$this$collectCurrentFileContext	Ljava/lang/StringBuilder;
/*     */     //   421	16	1	$this$collectCurrentFileContext	Ljava/lang/StringBuilder;
/*     */     //   441	94	1	$this$collectCurrentFileContext	Ljava/lang/StringBuilder;
/*     */     //   563	63	1	$this$collectCurrentFileContext	Ljava/lang/StringBuilder;
/*     */     //   109	103	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   250	25	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   279	105	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   412	25	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   441	94	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   554	72	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   109	103	3	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   241	34	3	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   279	105	3	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   403	34	3	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   441	24	3	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   465	61	3	editor	Lcom/intellij/openapi/editor/Editor;
/*     */     //   132	80	5	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   232	43	5	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   279	105	5	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   394	43	5	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   441	94	5	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   545	81	5	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   139	73	6	nioPath	Ljava/nio/file/Path;
/*     */     //   222	53	6	nioPath	Ljava/nio/file/Path;
/*     */     //   279	96	6	nioPath	Ljava/nio/file/Path;
/*     */     //   312	63	7	humanInTheLoop	Lcom/intellij/ml/llm/matterhorn/HumanInLoopExtension;
/*     */     //   578	48	8	selectionStartLine	I
/*     */     //   0	694	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	630	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	623	10	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditorContext.kt", l = {139, 144, 150, 154}, i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"}, n = {"$this$collectCurrentFileContext", "context", "editor", "file", "nioPath", "$this$collectCurrentFileContext", "context", "editor", "file", "$this$collectCurrentFileContext", "context", "file"}, m = "collectCurrentFileContext", c = "com.intellij.ml.llm.matterhorn.ej.core.EditorContext")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EditorContext$collectCurrentFileContext$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     int label;
/*     */     
/*     */     EditorContext$collectCurrentFileContext$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EditorContext.this.collectCurrentFileContext(null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditorContext.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.EditorContext$collectCurrentFileContext$selectionStartLine$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\b\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class EditorContext$collectCurrentFileContext$selectionStartLine$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
/*     */     int label;
/*     */     
/*     */     EditorContext$collectCurrentFileContext$selectionStartLine$1(Editor $editor, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Boxing.boxInt(this.$editor.getDocument().getLineNumber(this.$editor.getSelectionModel().getSelectionStart()));
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super EditorContext$collectCurrentFileContext$selectionStartLine$1> $completion) {
/*     */       return (Continuation<Unit>)new EditorContext$collectCurrentFileContext$selectionStartLine$1(this.$editor, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((EditorContext$collectCurrentFileContext$selectionStartLine$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   @NotNull
/*     */   private static final Logger logger = Logger.getInstance(EditorContext.class);
/*     */   public static final int MAX_RECENT_FILES = 10;
/*     */   public static final int CURRENT_FILE_WINDOW = 50;
/*     */   
/*     */   @NotNull
/*     */   public final LinkedHashSet<String> component1() {
/*     */     return this.recentFiles;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final LinkedHashSet<String> component2() {
/*     */     return this.openFiles;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final EditorContext copy(@NotNull LinkedHashSet<String> recentFiles, @NotNull LinkedHashSet<String> openFiles) {
/*     */     Intrinsics.checkNotNullParameter(recentFiles, "recentFiles");
/*     */     Intrinsics.checkNotNullParameter(openFiles, "openFiles");
/*     */     return new EditorContext(recentFiles, openFiles);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "EditorContext(recentFiles=" + this.recentFiles + ", openFiles=" + this.openFiles + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.recentFiles.hashCode();
/*     */     return result * 31 + this.openFiles.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof EditorContext))
/*     */       return false; 
/*     */     EditorContext editorContext = (EditorContext)other;
/*     */     return !Intrinsics.areEqual(this.recentFiles, editorContext.recentFiles) ? false : (!!Intrinsics.areEqual(this.openFiles, editorContext.openFiles));
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditorContext.kt", l = {99, 120}, i = {0, 0, 0, 0, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"}, n = {"this", "context", "explicitlySelectedUserPaths", "editor", "vcsStatus", "result"}, m = "getContext", c = "com.intellij.ml.llm.matterhorn.ej.core.EditorContext")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EditorContext$getContext$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int label;
/*     */     
/*     */     EditorContext$getContext$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EditorContext.this.getContext(null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\EditorContext.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */