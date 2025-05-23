/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.openapi.fileEditor.FileDocumentManager;
/*     */ import com.intellij.openapi.vfs.AsyncFileListener;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.openapi.vfs.VirtualFileVisitor;
/*     */ import com.intellij.openapi.vfs.newvfs.events.VFileEvent;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.concurrent.ConcurrentLinkedQueue;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Result;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Charsets;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\004\030\0010\0032\f\020\004\032\b\022\004\022\0020\0060\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2$1", "Lcom/intellij/openapi/vfs/AsyncFileListener;", "prepareChange", "Lcom/intellij/openapi/vfs/AsyncFileListener$ChangeApplier;", "events", "", "Lcom/intellij/openapi/vfs/newvfs/events/VFileEvent;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAgentActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentActions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,414:1\n1863#2:415\n1864#2:417\n1#3:416\n*S KotlinDebug\n*F\n+ 1 AgentActions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2$1\n*L\n303#1:415\n303#1:417\n*E\n"})
/*     */ public final class null
/*     */   implements AsyncFileListener
/*     */ {
/*     */   null(FileDocumentManager $docMgr, ConcurrentLinkedQueue<Raw> $collected) {}
/*     */   
/*     */   public AsyncFileListener.ChangeApplier prepareChange(List<? extends VFileEvent> events) {
/* 301 */     Intrinsics.checkNotNullParameter(events, "events"); HashMap<Object, Object> beforeMap = new HashMap<>();
/*     */     
/* 303 */     List<? extends VFileEvent> list = events; FileDocumentManager fileDocumentManager = this.$docMgr; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 415 */     Iterator iterator = list.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); VFileEvent ev = (VFileEvent)element$iv; int $i$a$-forEach-AgentActionsKt$trackFileChanges$2$1$prepareChange$1 = 0; VFileEvent vFileEvent1 = ev; }  return new AgentActionsKt$trackFileChanges$2$1$prepareChange$2(events, (HashMap)beforeMap, this.$docMgr, this.$collected); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\033\n\000\n\002\030\002\n\002\020\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\b\022\004\022\0020\0020\001J\020\020\003\032\0020\0042\006\020\005\032\0020\006H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2$1$prepareChange$1$1", "Lcom/intellij/openapi/vfs/VirtualFileVisitor;", "", "visitFile", "", "f", "Lcom/intellij/openapi/vfs/VirtualFile;", "ej-core"}) @SourceDebugExtension({"SMAP\nAgentActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentActions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2$1$prepareChange$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,414:1\n1#2:415\n*E\n"}) public static final class AgentActionsKt$trackFileChanges$2$1$prepareChange$1$1 extends VirtualFileVisitor<Unit> { public boolean visitFile(VirtualFile f) { Intrinsics.checkNotNullParameter(f, "f"); if (f.isDirectory()) return true;  HashMap<VirtualFile, String> hashMap = this.$beforeMap; if (this.$docMgr.getDocument(f) == null || this.$docMgr.getDocument(f).getText() == null) { Object object2; this.$docMgr.getDocument(f).getText(); AgentActionsKt$trackFileChanges$2$1$prepareChange$1$1 agentActionsKt$trackFileChanges$2$1$prepareChange$1$1 = this; try { AgentActionsKt$trackFileChanges$2$1$prepareChange$1$1 $this$visitFile_u24lambda_u240 = agentActionsKt$trackFileChanges$2$1$prepareChange$1$1; int $i$a$-runCatching-AgentActionsKt$trackFileChanges$2$1$prepareChange$1$1$visitFile$1 = 0;
/*     */           Intrinsics.checkNotNullExpressionValue(f.contentsToByteArray(), "contentsToByteArray(...)");
/*     */           byte[] arrayOfByte = f.contentsToByteArray();
/*     */           object2 = Result.constructor-impl(new String(arrayOfByte, Charsets.UTF_8)); }
/*     */         catch (Throwable throwable)
/*     */         { object2 = Result.constructor-impl(ResultKt.createFailure(throwable)); }
/*     */         
/*     */         Object object1 = object2; }
/*     */       
/*     */       String str = Result.isFailure-impl(object1) ? null : (String)object1;
/*     */       hashMap.put(f, str);
/*     */       return false; }
/*     */ 
/*     */     
/*     */     AgentActionsKt$trackFileChanges$2$1$prepareChange$1$1(HashMap<VirtualFile, String> $beforeMap, FileDocumentManager $docMgr, VirtualFileVisitor.Option[] $super_call_param$1) {
/*     */       super($super_call_param$1);
/*     */     } }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\021\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\b\020\002\032\0020\003H\026¨\006\004"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2$1$prepareChange$2", "Lcom/intellij/openapi/vfs/AsyncFileListener$ChangeApplier;", "afterVfsChange", "", "ej-core"})
/*     */   @SourceDebugExtension({"SMAP\nAgentActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentActions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2$1$prepareChange$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,414:1\n1863#2:415\n1864#2:419\n1#3:416\n216#4,2:417\n*S KotlinDebug\n*F\n+ 1 AgentActions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2$1$prepareChange$2\n*L\n333#1:415\n333#1:419\n354#1:417,2\n*E\n"})
/*     */   public static final class AgentActionsKt$trackFileChanges$2$1$prepareChange$2 implements AsyncFileListener.ChangeApplier {
/*     */     AgentActionsKt$trackFileChanges$2$1$prepareChange$2(List<VFileEvent> $events, HashMap<VirtualFile, String> $beforeMap, FileDocumentManager $docMgr, ConcurrentLinkedQueue<Raw> $collected) {}
/*     */     
/*     */     public void afterVfsChange() {
/*     */       // Byte code:
/*     */       //   0: aload_0
/*     */       //   1: getfield $events : Ljava/util/List;
/*     */       //   4: checkcast java/lang/Iterable
/*     */       //   7: astore_1
/*     */       //   8: aload_0
/*     */       //   9: getfield $beforeMap : Ljava/util/HashMap;
/*     */       //   12: astore_2
/*     */       //   13: aload_0
/*     */       //   14: getfield $docMgr : Lcom/intellij/openapi/fileEditor/FileDocumentManager;
/*     */       //   17: astore_3
/*     */       //   18: aload_0
/*     */       //   19: getfield $collected : Ljava/util/concurrent/ConcurrentLinkedQueue;
/*     */       //   22: astore #4
/*     */       //   24: iconst_0
/*     */       //   25: istore #5
/*     */       //   27: aload_1
/*     */       //   28: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   33: astore #6
/*     */       //   35: aload #6
/*     */       //   37: invokeinterface hasNext : ()Z
/*     */       //   42: ifeq -> 676
/*     */       //   45: aload #6
/*     */       //   47: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   52: astore #7
/*     */       //   54: aload #7
/*     */       //   56: checkcast com/intellij/openapi/vfs/newvfs/events/VFileEvent
/*     */       //   59: astore #8
/*     */       //   61: iconst_0
/*     */       //   62: istore #9
/*     */       //   64: aload #8
/*     */       //   66: astore #10
/*     */       //   68: aload #10
/*     */       //   70: instanceof com/intellij/openapi/vfs/newvfs/events/VFileCreateEvent
/*     */       //   73: ifeq -> 274
/*     */       //   76: aload #8
/*     */       //   78: checkcast com/intellij/openapi/vfs/newvfs/events/VFileCreateEvent
/*     */       //   81: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   84: dup
/*     */       //   85: ifnull -> 270
/*     */       //   88: astore #11
/*     */       //   90: aload #11
/*     */       //   92: astore #12
/*     */       //   94: iconst_0
/*     */       //   95: istore #13
/*     */       //   97: aload #12
/*     */       //   99: invokevirtual isDirectory : ()Z
/*     */       //   102: ifne -> 109
/*     */       //   105: iconst_1
/*     */       //   106: goto -> 110
/*     */       //   109: iconst_0
/*     */       //   110: ifeq -> 118
/*     */       //   113: aload #11
/*     */       //   115: goto -> 119
/*     */       //   118: aconst_null
/*     */       //   119: dup
/*     */       //   120: ifnull -> 270
/*     */       //   123: astore #12
/*     */       //   125: iconst_0
/*     */       //   126: istore #13
/*     */       //   128: aload_3
/*     */       //   129: aload #12
/*     */       //   131: invokevirtual getDocument : (Lcom/intellij/openapi/vfs/VirtualFile;)Lcom/intellij/openapi/editor/Document;
/*     */       //   134: dup
/*     */       //   135: ifnull -> 147
/*     */       //   138: invokeinterface getText : ()Ljava/lang/String;
/*     */       //   143: dup
/*     */       //   144: ifnonnull -> 237
/*     */       //   147: pop
/*     */       //   148: aload_0
/*     */       //   149: astore #14
/*     */       //   151: nop
/*     */       //   152: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */       //   155: pop
/*     */       //   156: aload #14
/*     */       //   158: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2$1$prepareChange$2
/*     */       //   161: astore #15
/*     */       //   163: iconst_0
/*     */       //   164: istore #16
/*     */       //   166: aload #12
/*     */       //   168: invokevirtual contentsToByteArray : ()[B
/*     */       //   171: dup
/*     */       //   172: ldc 'contentsToByteArray(...)'
/*     */       //   174: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   177: astore #17
/*     */       //   179: new java/lang/String
/*     */       //   182: dup
/*     */       //   183: aload #17
/*     */       //   185: getstatic kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
/*     */       //   188: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
/*     */       //   191: nop
/*     */       //   192: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   195: astore #15
/*     */       //   197: goto -> 216
/*     */       //   200: astore #16
/*     */       //   202: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */       //   205: pop
/*     */       //   206: aload #16
/*     */       //   208: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*     */       //   211: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   214: astore #15
/*     */       //   216: aload #15
/*     */       //   218: astore #14
/*     */       //   220: aload #14
/*     */       //   222: invokestatic isFailure-impl : (Ljava/lang/Object;)Z
/*     */       //   225: ifeq -> 232
/*     */       //   228: aconst_null
/*     */       //   229: goto -> 234
/*     */       //   232: aload #14
/*     */       //   234: checkcast java/lang/String
/*     */       //   237: astore #18
/*     */       //   239: aload #18
/*     */       //   241: ifnull -> 266
/*     */       //   244: aload #4
/*     */       //   246: checkcast java/util/Collection
/*     */       //   249: new com/intellij/ml/llm/matterhorn/ej/core/Raw$Create
/*     */       //   252: dup
/*     */       //   253: aload #12
/*     */       //   255: aload #18
/*     */       //   257: invokespecial <init> : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;)V
/*     */       //   260: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   265: pop
/*     */       //   266: nop
/*     */       //   267: goto -> 671
/*     */       //   270: pop
/*     */       //   271: goto -> 671
/*     */       //   274: aload #10
/*     */       //   276: instanceof com/intellij/openapi/vfs/newvfs/events/VFileContentChangeEvent
/*     */       //   279: ifeq -> 476
/*     */       //   282: aload_2
/*     */       //   283: aload #8
/*     */       //   285: checkcast com/intellij/openapi/vfs/newvfs/events/VFileContentChangeEvent
/*     */       //   288: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   291: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   294: checkcast java/lang/String
/*     */       //   297: astore #19
/*     */       //   299: aload_3
/*     */       //   300: aload #8
/*     */       //   302: checkcast com/intellij/openapi/vfs/newvfs/events/VFileContentChangeEvent
/*     */       //   305: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   308: invokevirtual getDocument : (Lcom/intellij/openapi/vfs/VirtualFile;)Lcom/intellij/openapi/editor/Document;
/*     */       //   311: dup
/*     */       //   312: ifnull -> 324
/*     */       //   315: invokeinterface getText : ()Ljava/lang/String;
/*     */       //   320: dup
/*     */       //   321: ifnonnull -> 420
/*     */       //   324: pop
/*     */       //   325: aload_0
/*     */       //   326: astore #13
/*     */       //   328: nop
/*     */       //   329: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */       //   332: pop
/*     */       //   333: aload #13
/*     */       //   335: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2$1$prepareChange$2
/*     */       //   338: astore #14
/*     */       //   340: iconst_0
/*     */       //   341: istore #15
/*     */       //   343: aload #8
/*     */       //   345: checkcast com/intellij/openapi/vfs/newvfs/events/VFileContentChangeEvent
/*     */       //   348: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   351: invokevirtual contentsToByteArray : ()[B
/*     */       //   354: dup
/*     */       //   355: ldc 'contentsToByteArray(...)'
/*     */       //   357: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   360: astore #16
/*     */       //   362: new java/lang/String
/*     */       //   365: dup
/*     */       //   366: aload #16
/*     */       //   368: getstatic kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
/*     */       //   371: invokespecial <init> : ([BLjava/nio/charset/Charset;)V
/*     */       //   374: nop
/*     */       //   375: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   378: astore #14
/*     */       //   380: goto -> 399
/*     */       //   383: astore #15
/*     */       //   385: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */       //   388: pop
/*     */       //   389: aload #15
/*     */       //   391: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*     */       //   394: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   397: astore #14
/*     */       //   399: aload #14
/*     */       //   401: astore #13
/*     */       //   403: aload #13
/*     */       //   405: invokestatic isFailure-impl : (Ljava/lang/Object;)Z
/*     */       //   408: ifeq -> 415
/*     */       //   411: aconst_null
/*     */       //   412: goto -> 417
/*     */       //   415: aload #13
/*     */       //   417: checkcast java/lang/String
/*     */       //   420: astore #20
/*     */       //   422: aload #19
/*     */       //   424: aload #20
/*     */       //   426: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   429: ifne -> 671
/*     */       //   432: aload #4
/*     */       //   434: checkcast java/util/Collection
/*     */       //   437: astore #11
/*     */       //   439: new com/intellij/ml/llm/matterhorn/ej/core/Raw$Modify
/*     */       //   442: dup
/*     */       //   443: aload #8
/*     */       //   445: checkcast com/intellij/openapi/vfs/newvfs/events/VFileContentChangeEvent
/*     */       //   448: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   451: dup
/*     */       //   452: ldc 'getFile(...)'
/*     */       //   454: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   457: aload #19
/*     */       //   459: aload #20
/*     */       //   461: invokespecial <init> : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;Ljava/lang/String;)V
/*     */       //   464: aload #11
/*     */       //   466: swap
/*     */       //   467: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   472: pop
/*     */       //   473: goto -> 671
/*     */       //   476: aload #10
/*     */       //   478: instanceof com/intellij/openapi/vfs/newvfs/events/VFileDeleteEvent
/*     */       //   481: ifeq -> 671
/*     */       //   484: aload #8
/*     */       //   486: checkcast com/intellij/openapi/vfs/newvfs/events/VFileDeleteEvent
/*     */       //   489: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   492: invokevirtual isDirectory : ()Z
/*     */       //   495: ifeq -> 610
/*     */       //   498: aload_2
/*     */       //   499: checkcast java/util/Map
/*     */       //   502: astore #19
/*     */       //   504: iconst_0
/*     */       //   505: istore #20
/*     */       //   507: aload #19
/*     */       //   509: invokeinterface entrySet : ()Ljava/util/Set;
/*     */       //   514: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   519: astore #11
/*     */       //   521: aload #11
/*     */       //   523: invokeinterface hasNext : ()Z
/*     */       //   528: ifeq -> 606
/*     */       //   531: aload #11
/*     */       //   533: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   538: checkcast java/util/Map$Entry
/*     */       //   541: astore #12
/*     */       //   543: aload #12
/*     */       //   545: astore #13
/*     */       //   547: iconst_0
/*     */       //   548: istore #14
/*     */       //   550: aload #13
/*     */       //   552: invokeinterface getKey : ()Ljava/lang/Object;
/*     */       //   557: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */       //   560: astore #15
/*     */       //   562: aload #13
/*     */       //   564: invokeinterface getValue : ()Ljava/lang/Object;
/*     */       //   569: checkcast java/lang/String
/*     */       //   572: astore #16
/*     */       //   574: aload #16
/*     */       //   576: ifnull -> 601
/*     */       //   579: aload #4
/*     */       //   581: checkcast java/util/Collection
/*     */       //   584: new com/intellij/ml/llm/matterhorn/ej/core/Raw$Delete
/*     */       //   587: dup
/*     */       //   588: aload #15
/*     */       //   590: aload #16
/*     */       //   592: invokespecial <init> : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;)V
/*     */       //   595: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   600: pop
/*     */       //   601: nop
/*     */       //   602: nop
/*     */       //   603: goto -> 521
/*     */       //   606: nop
/*     */       //   607: goto -> 671
/*     */       //   610: aload_2
/*     */       //   611: aload #8
/*     */       //   613: checkcast com/intellij/openapi/vfs/newvfs/events/VFileDeleteEvent
/*     */       //   616: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   619: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */       //   622: checkcast java/lang/String
/*     */       //   625: astore #19
/*     */       //   627: aload #19
/*     */       //   629: ifnull -> 671
/*     */       //   632: aload #4
/*     */       //   634: checkcast java/util/Collection
/*     */       //   637: astore #20
/*     */       //   639: new com/intellij/ml/llm/matterhorn/ej/core/Raw$Delete
/*     */       //   642: dup
/*     */       //   643: aload #8
/*     */       //   645: checkcast com/intellij/openapi/vfs/newvfs/events/VFileDeleteEvent
/*     */       //   648: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   651: dup
/*     */       //   652: ldc 'getFile(...)'
/*     */       //   654: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   657: aload #19
/*     */       //   659: invokespecial <init> : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;)V
/*     */       //   662: aload #20
/*     */       //   664: swap
/*     */       //   665: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   670: pop
/*     */       //   671: nop
/*     */       //   672: nop
/*     */       //   673: goto -> 35
/*     */       //   676: nop
/*     */       //   677: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #333	-> 0
/*     */       //   #415	-> 27
/*     */       //   #334	-> 64
/*     */       //   #336	-> 68
/*     */       //   #416	-> 94
/*     */       //   #336	-> 97
/*     */       //   #336	-> 110
/*     */       //   #336	-> 119
/*     */       //   #337	-> 128
/*     */       //   #338	-> 148
/*     */       //   #416	-> 163
/*     */       //   #338	-> 166
/*     */       //   #338	-> 191
/*     */       //   #338	-> 192
/*     */       //   #338	-> 220
/*     */       //   #337	-> 237
/*     */       //   #339	-> 239
/*     */       //   #340	-> 244
/*     */       //   #342	-> 266
/*     */       //   #336	-> 267
/*     */       //   #336	-> 270
/*     */       //   #344	-> 274
/*     */       //   #345	-> 282
/*     */       //   #346	-> 299
/*     */       //   #347	-> 325
/*     */       //   #416	-> 340
/*     */       //   #347	-> 343
/*     */       //   #347	-> 374
/*     */       //   #347	-> 375
/*     */       //   #347	-> 403
/*     */       //   #346	-> 420
/*     */       //   #348	-> 422
/*     */       //   #349	-> 432
/*     */       //   #352	-> 476
/*     */       //   #353	-> 484
/*     */       //   #354	-> 498
/*     */       //   #417	-> 507
/*     */       //   #417	-> 519
/*     */       //   #354	-> 550
/*     */       //   #354	-> 557
/*     */       //   #354	-> 569
/*     */       //   #355	-> 574
/*     */       //   #356	-> 579
/*     */       //   #358	-> 601
/*     */       //   #417	-> 602
/*     */       //   #418	-> 606
/*     */       //   #360	-> 610
/*     */       //   #361	-> 627
/*     */       //   #362	-> 632
/*     */       //   #367	-> 671
/*     */       //   #415	-> 672
/*     */       //   #419	-> 676
/*     */       //   #368	-> 677
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   97	13	13	$i$a$-takeIf-AgentActionsKt$trackFileChanges$2$1$prepareChange$2$afterVfsChange$1$1	I
/*     */       //   94	16	12	it	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   166	26	16	$i$a$-runCatching-AgentActionsKt$trackFileChanges$2$1$prepareChange$2$afterVfsChange$1$2$after$1	I
/*     */       //   163	29	15	$this$afterVfsChange_u24lambda_u245_u24lambda_u242_u24lambda_u241	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2$1$prepareChange$2;
/*     */       //   128	139	13	$i$a$-let-AgentActionsKt$trackFileChanges$2$1$prepareChange$2$afterVfsChange$1$2	I
/*     */       //   239	28	18	after	Ljava/lang/String;
/*     */       //   125	142	12	vf	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   343	32	15	$i$a$-runCatching-AgentActionsKt$trackFileChanges$2$1$prepareChange$2$afterVfsChange$1$after$1	I
/*     */       //   340	35	14	$this$afterVfsChange_u24lambda_u245_u24lambda_u243	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2$1$prepareChange$2;
/*     */       //   299	174	19	before	Ljava/lang/String;
/*     */       //   422	51	20	after	Ljava/lang/String;
/*     */       //   550	52	14	$i$a$-forEach-AgentActionsKt$trackFileChanges$2$1$prepareChange$2$afterVfsChange$1$3	I
/*     */       //   562	40	15	child	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   574	28	16	txt	Ljava/lang/String;
/*     */       //   543	60	12	element$iv	Ljava/util/Map$Entry;
/*     */       //   507	100	20	$i$f$forEach	I
/*     */       //   504	103	19	$this$forEach$iv	Ljava/util/Map;
/*     */       //   627	44	19	before	Ljava/lang/String;
/*     */       //   64	608	9	$i$a$-forEach-AgentActionsKt$trackFileChanges$2$1$prepareChange$2$afterVfsChange$1	I
/*     */       //   61	611	8	ev	Lcom/intellij/openapi/vfs/newvfs/events/VFileEvent;
/*     */       //   54	619	7	element$iv	Ljava/lang/Object;
/*     */       //   27	650	5	$i$f$forEach	I
/*     */       //   24	653	1	$this$forEach$iv	Ljava/lang/Iterable;
/*     */       //   0	678	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentActionsKt$trackFileChanges$2$1$prepareChange$2;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   151	197	200	java/lang/Throwable
/*     */       //   328	380	383	java/lang/Throwable
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentActionsKt$trackFileChanges$2$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */