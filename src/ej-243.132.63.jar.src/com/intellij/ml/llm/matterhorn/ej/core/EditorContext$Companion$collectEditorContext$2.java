/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ import com.intellij.openapi.fileEditor.FileEditorManager;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.util.Collection;
/*     */ import java.util.LinkedHashSet;
/*     */ import java.util.List;
/*     */ import kotlin.coroutines.Continuation;
/*     */ 
/*     */ @DebugMetadata(f = "EditorContext.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.EditorContext$Companion$collectEditorContext$2")
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\036\n\000\n\002\030\002\n\002\020 \n\002\020\016\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\020\000\0328\022\031\022\027\022\023\022\0210\003¢\006\002\b\004¢\006\002\b\005¢\006\002\b\0060\002\022\031\022\027\022\023\022\0210\003¢\006\002\b\004¢\006\002\b\005¢\006\002\b\0060\0020\001*\0020\007H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "", "Lorg/jetbrains/annotations/NonNls;", "Lorg/jetbrains/annotations/NotNull;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */ @SourceDebugExtension({"SMAP\nEditorContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion$collectEditorContext$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,195:1\n774#2:196\n865#2,2:197\n1557#2:199\n1628#2,3:200\n774#2:203\n865#2,2:204\n1557#2:206\n1628#2,3:207\n*S KotlinDebug\n*F\n+ 1 EditorContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/EditorContext$Companion$collectEditorContext$2\n*L\n52#1:196\n52#1:197,2\n52#1:199\n52#1:200,3\n53#1:203\n53#1:204,2\n53#1:206\n53#1:207,3\n*E\n"})
/*     */ final class EditorContext$Companion$collectEditorContext$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends List<? extends String>, ? extends List<? extends String>>>, Object> {
/*     */   public final Object invokeSuspend(Object $result) {
/*     */     FileEditorManager editorManager;
/*     */     EditorHistoryManager historyManager;
/*     */     LinkedHashSet<VirtualFile> recentFiles, openFiles, linkedHashSet1;
/*     */     Iterable iterable1;
/*     */     Iterable<VirtualFile> $this$filter$iv;
/*     */     Iterable $this$map$iv;
/*     */     EditorContext.Companion companion2;
/*     */     int i;
/*     */     EditorContext.Companion companion1;
/*     */     int $i$f$map, j;
/*     */     Iterable iterable2;
/*     */     int $i$f$filter;
/*     */     Iterable $this$mapTo$iv$iv;
/*     */     VirtualFile it;
/*     */     LinkedHashSet<VirtualFile> linkedHashSet2;
/*     */     Collection<String> collection1;
/*     */     Iterable<VirtualFile> $this$filterTo$iv$iv;
/*     */     Collection<String> destination$iv$iv;
/*     */     int $i$a$-let-EditorContext$Companion$collectEditorContext$2$1;
/*     */     Collection<Object> collection3;
/*     */     int k;
/*     */     Collection<Object> collection2;
/*     */     int $i$f$mapTo, $i$f$filterTo;
/*     */     List list1, list2, list3;
/*  38 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  39 */         editorManager = FileEditorManager.getInstance(this.$project);
/*  40 */         historyManager = EditorHistoryManager.Companion.getInstance(this.$project);
/*     */         
/*  42 */         recentFiles = new LinkedHashSet();
/*  43 */         openFiles = new LinkedHashSet();
/*  44 */         it = editorManager.getSelectedTextEditor().getVirtualFile(); $i$a$-let-EditorContext$Companion$collectEditorContext$2$1 = 0;
/*  45 */         recentFiles.add(it);
/*  46 */         Boxing.boxBoolean(openFiles.add(it));
/*     */         editorManager.getSelectedTextEditor().getVirtualFile();
/*  48 */         recentFiles.addAll(CollectionsKt.reversed(historyManager.getFileList()));
/*  49 */         Intrinsics.checkNotNullExpressionValue(FileEditorManager.getInstance(this.$project).getOpenFiles(), "getOpenFiles(...)"); CollectionsKt.addAll(openFiles, (Object[])FileEditorManager.getInstance(this.$project).getOpenFiles());
/*     */ 
/*     */         
/*  52 */         linkedHashSet1 = recentFiles; companion2 = EditorContext.Companion; j = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 196 */         linkedHashSet2 = linkedHashSet1; collection3 = new ArrayList(); $i$f$filterTo = 0;
/* 197 */         for (VirtualFile element$iv$iv : linkedHashSet2) { VirtualFile p0 = element$iv$iv; int $i$a$-filter-EditorContext$Companion$collectEditorContext$2$2 = 0; if (EditorContext.Companion.access$hasNioPath(companion2, p0)) collection3.add(element$iv$iv);  }
/* 198 */          iterable1 = collection3; i = 0;
/* 199 */         iterable2 = iterable1; collection1 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10)); k = 0;
/* 200 */         for (Object item$iv$iv : iterable2) {
/* 201 */           VirtualFile virtualFile = (VirtualFile)item$iv$iv; Collection<String> collection = collection1; int $i$a$-map-EditorContext$Companion$collectEditorContext$2$3 = 0; collection.add(virtualFile.getPath());
/* 202 */         }  $this$filter$iv = openFiles; companion1 = EditorContext.Companion; list1 = (List)collection1; $i$f$filter = 0;
/* 203 */         $this$filterTo$iv$iv = $this$filter$iv; collection2 = new ArrayList(); $i$f$filterTo = 0;
/* 204 */         for (VirtualFile element$iv$iv : $this$filterTo$iv$iv) { VirtualFile p0 = element$iv$iv; int $i$a$-filter-EditorContext$Companion$collectEditorContext$2$4 = 0; if (EditorContext.Companion.access$hasNioPath(companion1, p0)) collection2.add(element$iv$iv);  }
/* 205 */          $this$map$iv = collection2; list1 = list1; $i$f$map = 0;
/* 206 */         $this$mapTo$iv$iv = $this$map$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); $i$f$mapTo = 0;
/* 207 */         for (Object item$iv$iv : $this$mapTo$iv$iv) {
/* 208 */           VirtualFile virtualFile = (VirtualFile)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-EditorContext$Companion$collectEditorContext$2$5 = 0; collection.add(virtualFile.getPath());
/* 209 */         }  list2 = (List)destination$iv$iv;
/*     */         list3 = list1;
/*     */         return new Pair(list3, list2); }
/*     */     
/*     */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */   }
/*     */   
/*     */   int label;
/*     */   
/*     */   EditorContext$Companion$collectEditorContext$2(Project $project, Continuation $completion) {
/*     */     super(2, $completion);
/*     */   }
/*     */   
/*     */   public final Continuation<Unit> create(Object value, Continuation<? super EditorContext$Companion$collectEditorContext$2> $completion) {
/*     */     return (Continuation<Unit>)new EditorContext$Companion$collectEditorContext$2(this.$project, $completion);
/*     */   }
/*     */   
/*     */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */     return ((EditorContext$Companion$collectEditorContext$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\EditorContext$Companion$collectEditorContext$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */