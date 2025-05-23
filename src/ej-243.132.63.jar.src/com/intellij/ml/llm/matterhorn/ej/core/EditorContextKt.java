/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.openapi.vcs.changes.Change;
/*     */ import com.intellij.openapi.vcs.changes.ChangeListManager;
/*     */ import java.nio.file.Path;
/*     */ import java.util.Collection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.functions.Function2;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0002\n\000\n\002\020\016\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\020\000\n\002\b\003\n\002\020\036\n\002\b\002\032\f\020\000\032\0020\001*\0020\002H\002\0328\020\003\032\004\030\0010\001*\0020\0042\"\020\005\032\036\b\001\022\004\022\0020\007\022\n\022\b\022\004\022\0020\t0\b\022\006\022\004\030\0010\n0\006H@¢\006\002\020\013\032B\020\f\032\004\030\0010\0012\f\020\r\032\b\022\004\022\0020\0020\0162\"\020\005\032\036\b\001\022\004\022\0020\007\022\n\022\b\022\004\022\0020\t0\b\022\006\022\004\030\0010\n0\006H@¢\006\002\020\017¨\006\020"}, d2 = {"toDisplayString", "", "Lcom/intellij/openapi/vcs/changes/Change;", "collectVCSContext", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "mustIgnore", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lkotlin/coroutines/Continuation;", "", "", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createVCSContext", "changes", "", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nEditorContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/EditorContextKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,195:1\n1863#2,2:196\n*S KotlinDebug\n*F\n+ 1 EditorContext.kt\ncom/intellij/ml/llm/matterhorn/ej/core/EditorContextKt\n*L\n177#1:196,2\n*E\n"})
/*     */ public final class EditorContextKt
/*     */ {
/*     */   private static final String toDisplayString(Change $this$toDisplayString) {
/* 160 */     switch (WhenMappings.$EnumSwitchMapping$0[$this$toDisplayString.getType().ordinal()]) { case 1:
/* 161 */         $this$toDisplayString.getAfterRevision();
/* 162 */       case 2: $this$toDisplayString.getBeforeRevision();
/* 163 */       case 3: $this$toDisplayString.getBeforeRevision(); $this$toDisplayString.getAfterRevision();
/* 164 */       case 4: $this$toDisplayString.getAfterRevision(); }
/*     */     
/*     */     throw new NoWhenBranchMatchedException();
/*     */   }
/*     */   private static final Object collectVCSContext(ExecutionAgentContext $this$collectVCSContext, Function2<? super Path, ? super Continuation<? super Boolean>, ? extends Object> mustIgnore, Continuation<? super String> $completion) {
/* 169 */     Intrinsics.checkNotNullExpressionValue(ChangeListManager.getInstance($this$collectVCSContext.getProject()), "getInstance(...)"); ChangeListManager manager = ChangeListManager.getInstance($this$collectVCSContext.getProject());
/* 170 */     Intrinsics.checkNotNullExpressionValue(manager.getAllChanges(), "getAllChanges(...)"); return createVCSContext(manager.getAllChanges(), mustIgnore, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Object createVCSContext(@NotNull Collection changes, @NotNull Function2 mustIgnore, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/EditorContextKt$createVCSContext$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/EditorContextKt$createVCSContext$1
/*     */     //   11: astore #15
/*     */     //   13: aload #15
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #15
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 49
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/EditorContextKt$createVCSContext$1
/*     */     //   42: dup
/*     */     //   43: aload_2
/*     */     //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   47: astore #15
/*     */     //   49: aload #15
/*     */     //   51: getfield result : Ljava/lang/Object;
/*     */     //   54: astore #14
/*     */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   59: astore #16
/*     */     //   61: aload #15
/*     */     //   63: getfield label : I
/*     */     //   66: tableswitch default -> 544, 0 -> 88, 1 -> 286
/*     */     //   88: aload #14
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: invokeinterface isEmpty : ()Z
/*     */     //   99: ifeq -> 104
/*     */     //   102: aconst_null
/*     */     //   103: areturn
/*     */     //   104: new java/lang/StringBuilder
/*     */     //   107: dup
/*     */     //   108: invokespecial <init> : ()V
/*     */     //   111: astore_3
/*     */     //   112: aload_3
/*     */     //   113: astore #4
/*     */     //   115: iconst_0
/*     */     //   116: istore #5
/*     */     //   118: aload #4
/*     */     //   120: ldc '#### INITIAL CHANGED FILES:'
/*     */     //   122: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   125: dup
/*     */     //   126: ldc 'append(...)'
/*     */     //   128: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   131: bipush #10
/*     */     //   133: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   136: dup
/*     */     //   137: ldc 'append(...)'
/*     */     //   139: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   142: pop
/*     */     //   143: aload_0
/*     */     //   144: checkcast java/lang/Iterable
/*     */     //   147: bipush #10
/*     */     //   149: invokestatic take : (Ljava/lang/Iterable;I)Ljava/util/List;
/*     */     //   152: checkcast java/lang/Iterable
/*     */     //   155: astore #6
/*     */     //   157: iconst_0
/*     */     //   158: istore #7
/*     */     //   160: aload #6
/*     */     //   162: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   167: astore #8
/*     */     //   169: aload #8
/*     */     //   171: invokeinterface hasNext : ()Z
/*     */     //   176: ifeq -> 403
/*     */     //   179: aload #8
/*     */     //   181: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   186: astore #9
/*     */     //   188: aload #9
/*     */     //   190: checkcast com/intellij/openapi/vcs/changes/Change
/*     */     //   193: astore #10
/*     */     //   195: iconst_0
/*     */     //   196: istore #11
/*     */     //   198: aload #10
/*     */     //   200: invokevirtual getVirtualFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   203: astore #12
/*     */     //   205: aload #12
/*     */     //   207: ifnull -> 399
/*     */     //   210: aload #12
/*     */     //   212: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*     */     //   215: astore #13
/*     */     //   217: aload #13
/*     */     //   219: ifnull -> 400
/*     */     //   222: aload_1
/*     */     //   223: aload #13
/*     */     //   225: aload #15
/*     */     //   227: aload #15
/*     */     //   229: aload_0
/*     */     //   230: putfield L$0 : Ljava/lang/Object;
/*     */     //   233: aload #15
/*     */     //   235: aload_1
/*     */     //   236: putfield L$1 : Ljava/lang/Object;
/*     */     //   239: aload #15
/*     */     //   241: aload_3
/*     */     //   242: putfield L$2 : Ljava/lang/Object;
/*     */     //   245: aload #15
/*     */     //   247: aload #4
/*     */     //   249: putfield L$3 : Ljava/lang/Object;
/*     */     //   252: aload #15
/*     */     //   254: aload #8
/*     */     //   256: putfield L$4 : Ljava/lang/Object;
/*     */     //   259: aload #15
/*     */     //   261: aload #10
/*     */     //   263: putfield L$5 : Ljava/lang/Object;
/*     */     //   266: aload #15
/*     */     //   268: iconst_1
/*     */     //   269: putfield label : I
/*     */     //   272: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   277: dup
/*     */     //   278: aload #16
/*     */     //   280: if_acmpne -> 359
/*     */     //   283: aload #16
/*     */     //   285: areturn
/*     */     //   286: iconst_0
/*     */     //   287: istore #5
/*     */     //   289: iconst_0
/*     */     //   290: istore #7
/*     */     //   292: iconst_0
/*     */     //   293: istore #11
/*     */     //   295: aload #15
/*     */     //   297: getfield L$5 : Ljava/lang/Object;
/*     */     //   300: checkcast com/intellij/openapi/vcs/changes/Change
/*     */     //   303: astore #10
/*     */     //   305: aload #15
/*     */     //   307: getfield L$4 : Ljava/lang/Object;
/*     */     //   310: checkcast java/util/Iterator
/*     */     //   313: astore #8
/*     */     //   315: aload #15
/*     */     //   317: getfield L$3 : Ljava/lang/Object;
/*     */     //   320: checkcast java/lang/StringBuilder
/*     */     //   323: astore #4
/*     */     //   325: aload #15
/*     */     //   327: getfield L$2 : Ljava/lang/Object;
/*     */     //   330: checkcast java/lang/StringBuilder
/*     */     //   333: astore_3
/*     */     //   334: aload #15
/*     */     //   336: getfield L$1 : Ljava/lang/Object;
/*     */     //   339: checkcast kotlin/jvm/functions/Function2
/*     */     //   342: astore_1
/*     */     //   343: aload #15
/*     */     //   345: getfield L$0 : Ljava/lang/Object;
/*     */     //   348: checkcast java/util/Collection
/*     */     //   351: astore_0
/*     */     //   352: aload #14
/*     */     //   354: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   357: aload #14
/*     */     //   359: checkcast java/lang/Boolean
/*     */     //   362: invokevirtual booleanValue : ()Z
/*     */     //   365: ifeq -> 371
/*     */     //   368: goto -> 400
/*     */     //   371: aload #4
/*     */     //   373: aload #10
/*     */     //   375: invokestatic toDisplayString : (Lcom/intellij/openapi/vcs/changes/Change;)Ljava/lang/String;
/*     */     //   378: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   381: dup
/*     */     //   382: ldc 'append(...)'
/*     */     //   384: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   387: bipush #10
/*     */     //   389: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   392: dup
/*     */     //   393: ldc 'append(...)'
/*     */     //   395: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   398: pop
/*     */     //   399: nop
/*     */     //   400: goto -> 169
/*     */     //   403: nop
/*     */     //   404: aload_0
/*     */     //   405: invokeinterface size : ()I
/*     */     //   410: bipush #10
/*     */     //   412: if_icmple -> 493
/*     */     //   415: aload #4
/*     */     //   417: aload_0
/*     */     //   418: invokeinterface size : ()I
/*     */     //   423: bipush #10
/*     */     //   425: isub
/*     */     //   426: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   431: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   434: dup
/*     */     //   435: ldc 'append(...)'
/*     */     //   437: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   440: bipush #10
/*     */     //   442: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   445: dup
/*     */     //   446: ldc 'append(...)'
/*     */     //   448: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   451: pop
/*     */     //   452: aload #4
/*     */     //   454: bipush #10
/*     */     //   456: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   459: dup
/*     */     //   460: ldc 'append(...)'
/*     */     //   462: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   465: pop
/*     */     //   466: aload #4
/*     */     //   468: ldc 'Use `git status` to check changes.'
/*     */     //   470: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   473: dup
/*     */     //   474: ldc 'append(...)'
/*     */     //   476: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   479: bipush #10
/*     */     //   481: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   484: dup
/*     */     //   485: ldc 'append(...)'
/*     */     //   487: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   490: goto -> 531
/*     */     //   493: aload #4
/*     */     //   495: bipush #10
/*     */     //   497: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   500: dup
/*     */     //   501: ldc 'append(...)'
/*     */     //   503: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   506: pop
/*     */     //   507: aload #4
/*     */     //   509: ldc 'Use `git diff` to check changes.'
/*     */     //   511: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   514: dup
/*     */     //   515: ldc 'append(...)'
/*     */     //   517: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   520: bipush #10
/*     */     //   522: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   525: dup
/*     */     //   526: ldc 'append(...)'
/*     */     //   528: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   531: pop
/*     */     //   532: nop
/*     */     //   533: aload_3
/*     */     //   534: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   537: dup
/*     */     //   538: ldc 'toString(...)'
/*     */     //   540: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   543: areturn
/*     */     //   544: new java/lang/IllegalStateException
/*     */     //   547: dup
/*     */     //   548: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   550: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   553: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #173	-> 59
/*     */     //   #174	-> 93
/*     */     //   #175	-> 104
/*     */     //   #176	-> 118
/*     */     //   #177	-> 143
/*     */     //   #196	-> 160
/*     */     //   #178	-> 198
/*     */     //   #179	-> 205
/*     */     //   #180	-> 210
/*     */     //   #181	-> 217
/*     */     //   #173	-> 283
/*     */     //   #181	-> 359
/*     */     //   #182	-> 371
/*     */     //   #184	-> 399
/*     */     //   #196	-> 400
/*     */     //   #197	-> 403
/*     */     //   #185	-> 404
/*     */     //   #186	-> 415
/*     */     //   #187	-> 452
/*     */     //   #188	-> 466
/*     */     //   #190	-> 493
/*     */     //   #191	-> 507
/*     */     //   #193	-> 532
/*     */     //   #175	-> 533
/*     */     //   #175	-> 543
/*     */     //   #173	-> 544
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	11	0	changes	Ljava/util/Collection;
/*     */     //   104	182	0	changes	Ljava/util/Collection;
/*     */     //   352	99	0	changes	Ljava/util/Collection;
/*     */     //   93	11	1	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   104	182	1	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   343	60	1	mustIgnore	Lkotlin/jvm/functions/Function2;
/*     */     //   115	171	4	$this$createVCSContext_u24lambda_u241	Ljava/lang/StringBuilder;
/*     */     //   325	165	4	$this$createVCSContext_u24lambda_u241	Ljava/lang/StringBuilder;
/*     */     //   493	38	4	$this$createVCSContext_u24lambda_u241	Ljava/lang/StringBuilder;
/*     */     //   157	12	6	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   188	7	9	element$iv	Ljava/lang/Object;
/*     */     //   195	91	10	change	Lcom/intellij/openapi/vcs/changes/Change;
/*     */     //   305	63	10	change	Lcom/intellij/openapi/vcs/changes/Change;
/*     */     //   371	27	10	change	Lcom/intellij/openapi/vcs/changes/Change;
/*     */     //   205	12	12	changeFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   217	60	13	path	Ljava/nio/file/Path;
/*     */     //   198	88	11	$i$a$-forEach-EditorContextKt$createVCSContext$2$1	I
/*     */     //   160	126	7	$i$f$forEach	I
/*     */     //   118	168	5	$i$a$-buildString-EditorContextKt$createVCSContext$2	I
/*     */     //   0	554	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   49	495	15	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   56	488	14	$result	Ljava/lang/Object;
/*     */     //   295	105	11	$i$a$-forEach-EditorContextKt$createVCSContext$2$1	I
/*     */     //   292	112	7	$i$f$forEach	I
/*     */     //   289	244	5	$i$a$-buildString-EditorContextKt$createVCSContext$2	I
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "EditorContext.kt", l = {181}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$3", "L$5"}, n = {"changes", "mustIgnore", "$this$createVCSContext_u24lambda_u241", "change"}, m = "createVCSContext", c = "com.intellij.ml.llm.matterhorn.ej.core.EditorContextKt")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class EditorContextKt$createVCSContext$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     int label;
/*     */     
/*     */     EditorContextKt$createVCSContext$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return EditorContextKt.createVCSContext(null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\EditorContextKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */