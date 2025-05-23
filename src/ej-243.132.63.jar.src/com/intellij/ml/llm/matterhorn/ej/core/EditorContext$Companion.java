/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.openapi.fileEditor.FileEditorManager;
/*     */ import com.intellij.openapi.fileEditor.impl.EditorHistoryManager;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.openapi.vfs.VirtualFileUtil;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\030\020\013\032\004\030\0010\f2\006\020\r\032\0020\016H@¢\006\002\020\017J\020\020\020\032\0020\0212\006\020\022\032\0020\023H\002J\034\020\024\032\0020\0252\006\020\026\032\0020\0232\n\020\027\032\0060\030j\002`\031H\002J\020\020\032\032\004\030\0010\0332\006\020\034\032\0020\035J\f\020\036\032\b\022\004\022\0020\f0\037R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007R\016\020\b\032\0020\tXT¢\006\002\n\000R\016\020\n\032\0020\tXT¢\006\002\n\000¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "MAX_RECENT_FILES", "", "CURRENT_FILE_WINDOW", "collectEditorContext", "Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasNioPath", "", "it", "Lcom/intellij/openapi/vfs/VirtualFile;", "addJunieGuidelinesFromDirectory", "", "dir", "result", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "collectGuidanceContext", "", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "serializer", "Lkotlinx/serialization/KSerializer;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nEditorContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n3829#2:196\n4344#2,2:197\n1863#3,2:199\n1#4:201\n*S KotlinDebug\n*F\n+ 1 EditorContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion\n*L\n88#1:196\n88#1:197,2\n89#1:199,2\n*E\n"})
/*     */ public final class Companion {
/*     */   private Companion() {}
/*     */   
/*     */   @NotNull
/*  31 */   public final KSerializer<EditorContext> serializer() { return (KSerializer<EditorContext>)EditorContext.$serializer.INSTANCE; }
/*     */   @Nullable public final Object collectEditorContext(@NotNull Project project, @NotNull Continuation $completion) { // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion$collectEditorContext$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion$collectEditorContext$1
/*     */     //   11: astore #7
/*     */     //   13: aload #7
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #7
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion$collectEditorContext$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #7
/*     */     //   50: aload #7
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #6
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #8
/*     */     //   62: aload #7
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 184, 0 -> 88, 1 -> 131
/*     */     //   88: aload #6
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */     //   96: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   99: new com/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion$collectEditorContext$2
/*     */     //   102: dup
/*     */     //   103: aload_1
/*     */     //   104: aconst_null
/*     */     //   105: invokespecial <init> : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)V
/*     */     //   108: checkcast kotlin/jvm/functions/Function2
/*     */     //   111: aload #7
/*     */     //   113: aload #7
/*     */     //   115: iconst_1
/*     */     //   116: putfield label : I
/*     */     //   119: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   122: dup
/*     */     //   123: aload #8
/*     */     //   125: if_acmpne -> 138
/*     */     //   128: aload #8
/*     */     //   130: areturn
/*     */     //   131: aload #6
/*     */     //   133: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   136: aload #6
/*     */     //   138: checkcast kotlin/Pair
/*     */     //   141: astore_3
/*     */     //   142: aload_3
/*     */     //   143: invokevirtual component1 : ()Ljava/lang/Object;
/*     */     //   146: checkcast java/util/List
/*     */     //   149: astore #4
/*     */     //   151: aload_3
/*     */     //   152: invokevirtual component2 : ()Ljava/lang/Object;
/*     */     //   155: checkcast java/util/List
/*     */     //   158: astore #5
/*     */     //   160: new com/intellij/ml/llm/matterhorn/ej/core/EditorContext
/*     */     //   163: dup
/*     */     //   164: aload #4
/*     */     //   166: checkcast java/lang/Iterable
/*     */     //   169: invokestatic toLinkedSet : (Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;
/*     */     //   172: aload #5
/*     */     //   174: checkcast java/lang/Iterable
/*     */     //   177: invokestatic toLinkedSet : (Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;
/*     */     //   180: invokespecial <init> : (Ljava/util/LinkedHashSet;Ljava/util/LinkedHashSet;)V
/*     */     //   183: areturn
/*     */     //   184: new java/lang/IllegalStateException
/*     */     //   187: dup
/*     */     //   188: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   190: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   193: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #37	-> 60
/*     */     //   #38	-> 93
/*     */     //   #37	-> 128
/*     */     //   #38	-> 138
/*     */     //   #57	-> 160
/*     */     //   #37	-> 184
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	29	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   151	33	4	recentFilesPaths	Ljava/util/List;
/*     */     //   160	24	5	openFilesPaths	Ljava/util/List;
/*     */     //   0	194	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	134	7	$continuation	Lkotlin/coroutines/Continuation;
/*  32 */     //   57	127	6	$result	Ljava/lang/Object; } @NotNull public final Logger getLogger() { return EditorContext.access$getLogger$cp(); } @DebugMetadata(f = "EditorContext.kt", l = {38}, i = {}, s = {}, n = {}, m = "collectEditorContext", c = "com.intellij.ml.llm.matterhorn.ej.core.EditorContext$Companion") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class EditorContext$Companion$collectEditorContext$1 extends ContinuationImpl {
/*     */     int label; EditorContext$Companion$collectEditorContext$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return EditorContext.Companion.this.collectEditorContext(null, (Continuation<? super EditorContext>)this); }
/*     */   } @DebugMetadata(f = "EditorContext.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.EditorContext$Companion$collectEditorContext$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\002\020 \n\002\020\016\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\020\000\0328\022\031\022\027\022\023\022\0210\003¢\006\002\b\004¢\006\002\b\005¢\006\002\b\0060\002\022\031\022\027\022\023\022\0210\003¢\006\002\b\004¢\006\002\b\005¢\006\002\b\0060\0020\001*\0020\007H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "Lorg/jetbrains/annotations/NonNls;", "Lorg/jetbrains/annotations/NotNull;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}) @SourceDebugExtension({"SMAP\nEditorContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion$collectEditorContext$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,195:1\n774#2:196\n865#2,2:197\n1557#2:199\n1628#2,3:200\n774#2:203\n865#2,2:204\n1557#2:206\n1628#2,3:207\n*S KotlinDebug\n*F\n+ 1 EditorContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion$collectEditorContext$2\n*L\n52#1:196\n52#1:197,2\n52#1:199\n52#1:200,3\n53#1:203\n53#1:204,2\n53#1:206\n53#1:207,3\n*E\n"}) static final class EditorContext$Companion$collectEditorContext$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends List<? extends String>, ? extends List<? extends String>>>, Object> {
/*     */     public final Object invokeSuspend(Object $result) { FileEditorManager editorManager; EditorHistoryManager historyManager; LinkedHashSet<VirtualFile> recentFiles, openFiles, linkedHashSet1; Iterable iterable1; Iterable<VirtualFile> $this$filter$iv; Iterable $this$map$iv; EditorContext.Companion companion2; int i; EditorContext.Companion companion1; int $i$f$map, j; Iterable iterable2; int $i$f$filter; Iterable $this$mapTo$iv$iv; VirtualFile it; LinkedHashSet<VirtualFile> linkedHashSet2; Collection<String> collection1; Iterable<VirtualFile> $this$filterTo$iv$iv; Collection<String> destination$iv$iv; int $i$a$-let-EditorContext$Companion$collectEditorContext$2$1; Collection<Object> collection3; int k; Collection<Object> collection2;
/*     */       int $i$f$mapTo, $i$f$filterTo;
/*     */       List list1, list2, list3;
/*  38 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  39 */           editorManager = FileEditorManager.getInstance(this.$project);
/*  40 */           historyManager = EditorHistoryManager.Companion.getInstance(this.$project);
/*     */           
/*  42 */           recentFiles = new LinkedHashSet();
/*  43 */           openFiles = new LinkedHashSet();
/*  44 */           it = editorManager.getSelectedTextEditor().getVirtualFile(); $i$a$-let-EditorContext$Companion$collectEditorContext$2$1 = 0;
/*  45 */           recentFiles.add(it);
/*  46 */           Boxing.boxBoolean(openFiles.add(it));
/*     */           editorManager.getSelectedTextEditor().getVirtualFile();
/*  48 */           recentFiles.addAll(CollectionsKt.reversed(historyManager.getFileList()));
/*  49 */           Intrinsics.checkNotNullExpressionValue(FileEditorManager.getInstance(this.$project).getOpenFiles(), "getOpenFiles(...)"); CollectionsKt.addAll(openFiles, (Object[])FileEditorManager.getInstance(this.$project).getOpenFiles());
/*     */ 
/*     */           
/*  52 */           linkedHashSet1 = recentFiles; companion2 = EditorContext.Companion; j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */           
/* 196 */           linkedHashSet2 = linkedHashSet1; collection3 = new ArrayList(); $i$f$filterTo = 0;
/* 197 */           for (VirtualFile element$iv$iv : linkedHashSet2) { VirtualFile p0 = element$iv$iv; int $i$a$-filter-EditorContext$Companion$collectEditorContext$2$2 = 0; if (companion2.hasNioPath(p0)) collection3.add(element$iv$iv);  }
/* 198 */            iterable1 = collection3; i = 0;
/* 199 */           iterable2 = iterable1; collection1 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10)); k = 0;
/* 200 */           for (Object item$iv$iv : iterable2) {
/* 201 */             VirtualFile virtualFile = (VirtualFile)item$iv$iv; Collection<String> collection = collection1; int $i$a$-map-EditorContext$Companion$collectEditorContext$2$3 = 0; collection.add(virtualFile.getPath());
/* 202 */           }  $this$filter$iv = openFiles; companion1 = EditorContext.Companion; list1 = (List)collection1; $i$f$filter = 0;
/* 203 */           $this$filterTo$iv$iv = $this$filter$iv; collection2 = new ArrayList(); $i$f$filterTo = 0;
/* 204 */           for (VirtualFile element$iv$iv : $this$filterTo$iv$iv) { VirtualFile p0 = element$iv$iv; int $i$a$-filter-EditorContext$Companion$collectEditorContext$2$4 = 0; if (companion1.hasNioPath(p0)) collection2.add(element$iv$iv);  }
/* 205 */            $this$map$iv = collection2; list1 = list1; $i$f$map = 0;
/* 206 */           $this$mapTo$iv$iv = $this$map$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); $i$f$mapTo = 0;
/* 207 */           for (Object item$iv$iv : $this$mapTo$iv$iv) {
/* 208 */             VirtualFile virtualFile = (VirtualFile)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-EditorContext$Companion$collectEditorContext$2$5 = 0; collection.add(virtualFile.getPath());
/* 209 */           }  list2 = (List)destination$iv$iv;
/*     */           list3 = list1;
/*     */           return new Pair(list3, list2); }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */ 
/*     */     
/*     */     int label;
/*     */     
/*     */     EditorContext$Companion$collectEditorContext$2(Project $project, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super EditorContext$Companion$collectEditorContext$2> $completion) {
/*     */       return (Continuation<Unit>)new EditorContext$Companion$collectEditorContext$2(this.$project, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((EditorContext$Companion$collectEditorContext$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private final boolean hasNioPath(VirtualFile it) {
/*     */     boolean bool;
/*     */     try {
/*     */       it.toNioPath();
/*     */       bool = true;
/*     */     } catch (UnsupportedOperationException e) {
/*     */       bool = false;
/*     */     } 
/*     */     return bool;
/*     */   }
/*     */   
/*     */   private final void addJunieGuidelinesFromDirectory(VirtualFile dir, StringBuilder result) {
/*     */     VirtualFile junie, file;
/*     */     if (VirtualFileUtil.findDirectory(dir, ".junie") == null) {
/*     */       VirtualFileUtil.findDirectory(dir, ".junie");
/*     */       return;
/*     */     } 
/*     */     if (VirtualFileUtil.findFile(junie, "guidelines.md") == null) {
/*     */       VirtualFileUtil.findFile(junie, "guidelines.md");
/*     */       return;
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(result.append(VirtualFileUtil.readText(file)), "append(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(result.append(VirtualFileUtil.readText(file)).append('\n'), "append(...)");
/*     */     result.append(VirtualFileUtil.readText(file)).append('\n');
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String collectGuidanceContext(@NotNull ExecutionAgentContext context) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'context'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: new java/lang/StringBuilder
/*     */     //   9: dup
/*     */     //   10: invokespecial <init> : ()V
/*     */     //   13: astore_2
/*     */     //   14: aload_1
/*     */     //   15: invokeinterface getCurrentScreenPosition : ()Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*     */     //   20: dup
/*     */     //   21: ifnull -> 38
/*     */     //   24: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   27: dup
/*     */     //   28: ifnull -> 38
/*     */     //   31: invokevirtual getParent : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   34: dup
/*     */     //   35: ifnonnull -> 45
/*     */     //   38: pop
/*     */     //   39: aload_1
/*     */     //   40: invokeinterface getCurrentDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   45: astore_3
/*     */     //   46: aload_3
/*     */     //   47: ifnull -> 80
/*     */     //   50: aload_3
/*     */     //   51: aload_1
/*     */     //   52: invokeinterface getProjectDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   57: invokevirtual getParent : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   60: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   63: ifne -> 80
/*     */     //   66: aload_0
/*     */     //   67: aload_3
/*     */     //   68: aload_2
/*     */     //   69: invokespecial addJunieGuidelinesFromDirectory : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/StringBuilder;)V
/*     */     //   72: aload_3
/*     */     //   73: invokevirtual getParent : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   76: astore_3
/*     */     //   77: goto -> 46
/*     */     //   80: aload_1
/*     */     //   81: invokeinterface getProjectDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   86: aload_1
/*     */     //   87: invokeinterface getCurrentDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   92: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   95: ifeq -> 310
/*     */     //   98: aload_1
/*     */     //   99: invokeinterface getCurrentScreenPosition : ()Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*     */     //   104: ifnonnull -> 310
/*     */     //   107: aload_1
/*     */     //   108: invokeinterface getProjectDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   113: invokevirtual getChildren : ()[Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   116: dup
/*     */     //   117: ldc 'getChildren(...)'
/*     */     //   119: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   122: checkcast [Ljava/lang/Object;
/*     */     //   125: astore #5
/*     */     //   127: iconst_0
/*     */     //   128: istore #6
/*     */     //   130: aload #5
/*     */     //   132: astore #7
/*     */     //   134: new java/util/ArrayList
/*     */     //   137: dup
/*     */     //   138: invokespecial <init> : ()V
/*     */     //   141: checkcast java/util/Collection
/*     */     //   144: astore #8
/*     */     //   146: iconst_0
/*     */     //   147: istore #9
/*     */     //   149: iconst_0
/*     */     //   150: istore #10
/*     */     //   152: aload #7
/*     */     //   154: arraylength
/*     */     //   155: istore #11
/*     */     //   157: iload #10
/*     */     //   159: iload #11
/*     */     //   161: if_icmpge -> 235
/*     */     //   164: aload #7
/*     */     //   166: iload #10
/*     */     //   168: aaload
/*     */     //   169: astore #12
/*     */     //   171: aload #12
/*     */     //   173: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   176: astore #13
/*     */     //   178: iconst_0
/*     */     //   179: istore #14
/*     */     //   181: aload #13
/*     */     //   183: invokevirtual isDirectory : ()Z
/*     */     //   186: ifeq -> 215
/*     */     //   189: aload #13
/*     */     //   191: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   194: dup
/*     */     //   195: ldc 'getName(...)'
/*     */     //   197: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   200: ldc '.'
/*     */     //   202: iconst_0
/*     */     //   203: iconst_2
/*     */     //   204: aconst_null
/*     */     //   205: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */     //   208: ifne -> 215
/*     */     //   211: iconst_1
/*     */     //   212: goto -> 216
/*     */     //   215: iconst_0
/*     */     //   216: ifeq -> 229
/*     */     //   219: aload #8
/*     */     //   221: aload #12
/*     */     //   223: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   228: pop
/*     */     //   229: iinc #10, 1
/*     */     //   232: goto -> 157
/*     */     //   235: aload #8
/*     */     //   237: checkcast java/util/List
/*     */     //   240: nop
/*     */     //   241: astore #4
/*     */     //   243: aload #4
/*     */     //   245: checkcast java/lang/Iterable
/*     */     //   248: astore #5
/*     */     //   250: iconst_0
/*     */     //   251: istore #6
/*     */     //   253: aload #5
/*     */     //   255: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   260: astore #7
/*     */     //   262: aload #7
/*     */     //   264: invokeinterface hasNext : ()Z
/*     */     //   269: ifeq -> 309
/*     */     //   272: aload #7
/*     */     //   274: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   279: astore #8
/*     */     //   281: aload #8
/*     */     //   283: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   286: astore #9
/*     */     //   288: iconst_0
/*     */     //   289: istore #10
/*     */     //   291: getstatic com/intellij/ml/llm/matterhorn/ej/core/EditorContext.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion;
/*     */     //   294: aload #9
/*     */     //   296: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   299: aload #9
/*     */     //   301: aload_2
/*     */     //   302: invokespecial addJunieGuidelinesFromDirectory : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/StringBuilder;)V
/*     */     //   305: nop
/*     */     //   306: goto -> 262
/*     */     //   309: nop
/*     */     //   310: aload_2
/*     */     //   311: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   314: checkcast java/lang/CharSequence
/*     */     //   317: astore #4
/*     */     //   319: aload #4
/*     */     //   321: invokeinterface length : ()I
/*     */     //   326: ifne -> 333
/*     */     //   329: iconst_1
/*     */     //   330: goto -> 334
/*     */     //   333: iconst_0
/*     */     //   334: ifeq -> 344
/*     */     //   337: iconst_0
/*     */     //   338: istore #5
/*     */     //   340: aconst_null
/*     */     //   341: goto -> 346
/*     */     //   344: aload #4
/*     */     //   346: checkcast java/lang/String
/*     */     //   349: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #77	-> 6
/*     */     //   #79	-> 14
/*     */     //   #81	-> 46
/*     */     //   #82	-> 66
/*     */     //   #83	-> 72
/*     */     //   #87	-> 80
/*     */     //   #88	-> 107
/*     */     //   #196	-> 130
/*     */     //   #197	-> 149
/*     */     //   #88	-> 181
/*     */     //   #197	-> 216
/*     */     //   #198	-> 235
/*     */     //   #196	-> 240
/*     */     //   #88	-> 241
/*     */     //   #89	-> 243
/*     */     //   #199	-> 253
/*     */     //   #89	-> 291
/*     */     //   #199	-> 305
/*     */     //   #200	-> 309
/*     */     //   #92	-> 310
/*     */     //   #201	-> 337
/*     */     //   #92	-> 340
/*     */     //   #92	-> 341
/*     */     //   #92	-> 349
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   181	35	14	$i$a$-filter-EditorContext$Companion$collectGuidanceContext$topLevelDirs$1	I
/*     */     //   178	38	13	it	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   171	58	12	element$iv$iv	Ljava/lang/Object;
/*     */     //   149	88	9	$i$f$filterTo	I
/*     */     //   146	91	7	$this$filterTo$iv$iv	[Ljava/lang/Object;
/*     */     //   146	91	8	destination$iv$iv	Ljava/util/Collection;
/*     */     //   130	111	6	$i$f$filter	I
/*     */     //   127	114	5	$this$filter$iv	[Ljava/lang/Object;
/*     */     //   291	14	10	$i$a$-forEach-EditorContext$Companion$collectGuidanceContext$1	I
/*     */     //   288	17	9	it	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   281	25	8	element$iv	Ljava/lang/Object;
/*     */     //   253	57	6	$i$f$forEach	I
/*     */     //   250	60	5	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   243	67	4	topLevelDirs	Ljava/util/List;
/*     */     //   340	1	5	$i$a$-ifEmpty-EditorContext$Companion$collectGuidanceContext$2	I
/*     */     //   14	336	2	result	Ljava/lang/StringBuilder;
/*     */     //   46	304	3	anchor	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   0	350	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion;
/*     */     //   0	350	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\EditorContext$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */