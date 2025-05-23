/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.run;
/*    */ 
/*    */ import com.intellij.build.BuildProgressListener;
/*    */ import com.intellij.build.events.BuildEvent;
/*    */ import com.intellij.build.events.Failure;
/*    */ import java.util.Collections;
/*    */ import java.util.LinkedHashMap;
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000;\n\000\n\002\030\002\n\000\n\002\020%\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\002\020$\n\002\b\004\n\002\020\013\n\002\b\005\n\002\020\002\n\002\b\002\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\030\020\022\032\0020\0232\006\020\024\032\0020\0042\006\020\025\032\0020\026H\026Rg\020\002\032V\022\f\022\n \005*\004\030\0010\0040\004\022\026\022\024 \005*\n\030\0010\006j\004\030\001`\0070\006j\002`\007 \005**\022\f\022\n \005*\004\030\0010\0040\004\022\026\022\024 \005*\n\030\0010\006j\004\030\001`\0070\006j\002`\007\030\0010\b0\003¢\006\n\n\002\020\013\032\004\b\t\020\nR\032\020\f\032\0020\rX\016¢\006\016\n\000\032\004\b\016\020\017\"\004\b\020\020\021¨\006\027"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/idea/run/BuildProgressListenerRegistrar$register$buildProgressListener$1", "Lcom/intellij/build/BuildProgressListener;", "activeBuilds", "", "", "kotlin.jvm.PlatformType", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "getActiveBuilds", "()Ljava/util/Map;", "Ljava/util/Map;", "hasErrors", "", "getHasErrors", "()Z", "setHasErrors", "(Z)V", "onEvent", "", "buildId", "event", "Lcom/intellij/build/events/BuildEvent;", "ej-idea"})
/*    */ @SourceDebugExtension({"SMAP\nBuildProgressListenerRegistrar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuildProgressListenerRegistrar.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/run/BuildProgressListenerRegistrar$register$buildProgressListener$1\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,72:1\n61#2,5:73\n61#2,5:78\n*S KotlinDebug\n*F\n+ 1 BuildProgressListenerRegistrar.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/run/BuildProgressListenerRegistrar$register$buildProgressListener$1\n*L\n26#1:73,5\n53#1:78,5\n*E\n"})
/*    */ public final class BuildProgressListenerRegistrar$register$buildProgressListener$1
/*    */   implements BuildProgressListener {
/*    */   private volatile boolean hasErrors;
/*    */   
/*    */   BuildProgressListenerRegistrar$register$buildProgressListener$1(BuildListener $listener) {}
/*    */   
/* 20 */   private final Map<Object, StringBuilder> activeBuilds = Collections.synchronizedMap(new LinkedHashMap<>()); public final Map<Object, StringBuilder> getActiveBuilds() { return this.activeBuilds; }
/*    */   
/* 22 */   public final boolean getHasErrors() { return this.hasErrors; } public final void setHasErrors(boolean <set-?>) { this.hasErrors = <set-?>; }
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
/*    */   public void onEvent(Object buildId, BuildEvent event) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'buildId'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'event'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: invokestatic access$getLogger$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   15: astore_3
/*    */     //   16: aconst_null
/*    */     //   17: astore #4
/*    */     //   19: iconst_0
/*    */     //   20: istore #5
/*    */     //   22: aload_3
/*    */     //   23: invokevirtual isDebugEnabled : ()Z
/*    */     //   26: ifeq -> 61
/*    */     //   29: aload_3
/*    */     //   30: astore #11
/*    */     //   32: iconst_0
/*    */     //   33: istore #6
/*    */     //   35: aload_2
/*    */     //   36: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   39: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   42: aload_2
/*    */     //   43: invokeinterface getMessage : ()Ljava/lang/String;
/*    */     //   48: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   53: aload #11
/*    */     //   55: swap
/*    */     //   56: aload #4
/*    */     //   58: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   61: nop
/*    */     //   62: aload_2
/*    */     //   63: astore_3
/*    */     //   64: aload_3
/*    */     //   65: instanceof com/intellij/build/events/StartBuildEvent
/*    */     //   68: ifeq -> 106
/*    */     //   71: aload_0
/*    */     //   72: getfield activeBuilds : Ljava/util/Map;
/*    */     //   75: dup
/*    */     //   76: ldc 'activeBuilds'
/*    */     //   78: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   81: astore #4
/*    */     //   83: new java/lang/StringBuilder
/*    */     //   86: dup
/*    */     //   87: invokespecial <init> : ()V
/*    */     //   90: astore #5
/*    */     //   92: aload #4
/*    */     //   94: aload_1
/*    */     //   95: aload #5
/*    */     //   97: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   102: pop
/*    */     //   103: goto -> 465
/*    */     //   106: aload_3
/*    */     //   107: instanceof com/intellij/build/events/OutputBuildEvent
/*    */     //   110: ifeq -> 158
/*    */     //   113: aload_2
/*    */     //   114: checkcast com/intellij/build/events/OutputBuildEvent
/*    */     //   117: invokeinterface isStdOut : ()Z
/*    */     //   122: ifne -> 465
/*    */     //   125: aload_0
/*    */     //   126: getfield activeBuilds : Ljava/util/Map;
/*    */     //   129: aload_1
/*    */     //   130: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   135: dup
/*    */     //   136: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   139: checkcast java/lang/StringBuilder
/*    */     //   142: aload_2
/*    */     //   143: checkcast com/intellij/build/events/OutputBuildEvent
/*    */     //   146: invokeinterface getMessage : ()Ljava/lang/String;
/*    */     //   151: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   154: pop
/*    */     //   155: goto -> 465
/*    */     //   158: aload_3
/*    */     //   159: instanceof com/intellij/build/events/FileMessageEvent
/*    */     //   162: ifeq -> 233
/*    */     //   165: aload_2
/*    */     //   166: checkcast com/intellij/build/events/FileMessageEvent
/*    */     //   169: invokeinterface getResult : ()Lcom/intellij/build/events/FileMessageEventResult;
/*    */     //   174: invokeinterface getKind : ()Lcom/intellij/build/events/MessageEvent$Kind;
/*    */     //   179: getstatic com/intellij/build/events/MessageEvent$Kind.ERROR : Lcom/intellij/build/events/MessageEvent$Kind;
/*    */     //   182: if_acmpne -> 465
/*    */     //   185: aload_0
/*    */     //   186: iconst_1
/*    */     //   187: putfield hasErrors : Z
/*    */     //   190: aload_0
/*    */     //   191: getfield $listener : Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildListener;
/*    */     //   194: new com/intellij/ml/llm/matterhorn/ej/idea/run/BuildErrorEvent
/*    */     //   197: dup
/*    */     //   198: aload_2
/*    */     //   199: checkcast com/intellij/build/events/FileMessageEvent
/*    */     //   202: invokeinterface getMessage : ()Ljava/lang/String;
/*    */     //   207: dup
/*    */     //   208: ldc 'getMessage(...)'
/*    */     //   210: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   213: aload_2
/*    */     //   214: checkcast com/intellij/build/events/FileMessageEvent
/*    */     //   217: invokeinterface getFilePosition : ()Lcom/intellij/build/FilePosition;
/*    */     //   222: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/build/FilePosition;)V
/*    */     //   225: invokeinterface onBuildError : (Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildErrorEvent;)V
/*    */     //   230: goto -> 465
/*    */     //   233: aload_3
/*    */     //   234: instanceof com/intellij/build/events/FinishBuildEvent
/*    */     //   237: ifeq -> 465
/*    */     //   240: aload_0
/*    */     //   241: getfield activeBuilds : Ljava/util/Map;
/*    */     //   244: aload_1
/*    */     //   245: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   250: dup
/*    */     //   251: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   254: checkcast java/lang/StringBuilder
/*    */     //   257: astore #4
/*    */     //   259: aload #4
/*    */     //   261: checkcast java/lang/CharSequence
/*    */     //   264: invokeinterface length : ()I
/*    */     //   269: ifne -> 276
/*    */     //   272: iconst_1
/*    */     //   273: goto -> 277
/*    */     //   276: iconst_0
/*    */     //   277: ifne -> 315
/*    */     //   280: aload_0
/*    */     //   281: iconst_1
/*    */     //   282: putfield hasErrors : Z
/*    */     //   285: aload_0
/*    */     //   286: getfield $listener : Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildListener;
/*    */     //   289: new com/intellij/ml/llm/matterhorn/ej/idea/run/BuildErrorEvent
/*    */     //   292: dup
/*    */     //   293: aload #4
/*    */     //   295: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   298: dup
/*    */     //   299: ldc 'toString(...)'
/*    */     //   301: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   304: aconst_null
/*    */     //   305: iconst_2
/*    */     //   306: aconst_null
/*    */     //   307: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/build/FilePosition;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   310: invokeinterface onBuildError : (Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildErrorEvent;)V
/*    */     //   315: aload_2
/*    */     //   316: checkcast com/intellij/build/events/FinishBuildEvent
/*    */     //   319: invokeinterface getResult : ()Lcom/intellij/build/events/EventResult;
/*    */     //   324: astore #5
/*    */     //   326: invokestatic access$getLogger$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   329: astore #6
/*    */     //   331: aconst_null
/*    */     //   332: astore #7
/*    */     //   334: iconst_0
/*    */     //   335: istore #8
/*    */     //   337: aload #6
/*    */     //   339: invokevirtual isDebugEnabled : ()Z
/*    */     //   342: ifeq -> 426
/*    */     //   345: aload #6
/*    */     //   347: astore #11
/*    */     //   349: iconst_0
/*    */     //   350: istore #9
/*    */     //   352: aload #5
/*    */     //   354: instanceof com/intellij/build/events/FailureResult
/*    */     //   357: ifeq -> 398
/*    */     //   360: aload #5
/*    */     //   362: checkcast com/intellij/build/events/FailureResult
/*    */     //   365: invokeinterface getFailures : ()Ljava/util/List;
/*    */     //   370: dup
/*    */     //   371: ldc 'getFailures(...)'
/*    */     //   373: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   376: checkcast java/lang/Iterable
/*    */     //   379: aconst_null
/*    */     //   380: aconst_null
/*    */     //   381: aconst_null
/*    */     //   382: iconst_0
/*    */     //   383: aconst_null
/*    */     //   384: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*    */     //   389: bipush #31
/*    */     //   391: aconst_null
/*    */     //   392: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*    */     //   395: goto -> 400
/*    */     //   398: ldc ''
/*    */     //   400: astore #10
/*    */     //   402: aload #5
/*    */     //   404: instanceof com/intellij/build/events/FailureResult
/*    */     //   407: aload_0
/*    */     //   408: getfield hasErrors : Z
/*    */     //   411: aload #10
/*    */     //   413: <illegal opcode> makeConcatWithConstants : (ZZLjava/lang/String;)Ljava/lang/String;
/*    */     //   418: aload #11
/*    */     //   420: swap
/*    */     //   421: aload #7
/*    */     //   423: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   426: nop
/*    */     //   427: aload #5
/*    */     //   429: instanceof com/intellij/build/events/FailureResult
/*    */     //   432: ifeq -> 440
/*    */     //   435: aload_0
/*    */     //   436: iconst_1
/*    */     //   437: putfield hasErrors : Z
/*    */     //   440: aload_0
/*    */     //   441: getfield activeBuilds : Ljava/util/Map;
/*    */     //   444: invokeinterface isEmpty : ()Z
/*    */     //   449: ifeq -> 465
/*    */     //   452: aload_0
/*    */     //   453: getfield $listener : Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildListener;
/*    */     //   456: aload_0
/*    */     //   457: getfield hasErrors : Z
/*    */     //   460: invokeinterface onBuildFinished : (Z)V
/*    */     //   465: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #26	-> 12
/*    */     //   #73	-> 16
/*    */     //   #74	-> 22
/*    */     //   #75	-> 29
/*    */     //   #27	-> 35
/*    */     //   #75	-> 56
/*    */     //   #77	-> 61
/*    */     //   #30	-> 62
/*    */     //   #31	-> 64
/*    */     //   #32	-> 106
/*    */     //   #33	-> 113
/*    */     //   #34	-> 125
/*    */     //   #38	-> 158
/*    */     //   #39	-> 165
/*    */     //   #40	-> 185
/*    */     //   #41	-> 190
/*    */     //   #45	-> 233
/*    */     //   #46	-> 240
/*    */     //   #47	-> 259
/*    */     //   #47	-> 277
/*    */     //   #48	-> 280
/*    */     //   #49	-> 285
/*    */     //   #52	-> 315
/*    */     //   #53	-> 326
/*    */     //   #78	-> 331
/*    */     //   #79	-> 337
/*    */     //   #80	-> 345
/*    */     //   #54	-> 352
/*    */     //   #55	-> 360
/*    */     //   #58	-> 398
/*    */     //   #54	-> 400
/*    */     //   #60	-> 402
/*    */     //   #80	-> 421
/*    */     //   #82	-> 426
/*    */     //   #62	-> 427
/*    */     //   #63	-> 440
/*    */     //   #66	-> 465
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   35	18	6	$i$a$-debug$default-BuildProgressListenerRegistrar$register$buildProgressListener$1$onEvent$1	I
/*    */     //   22	40	5	$i$f$debug	I
/*    */     //   16	46	3	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   19	43	4	e$iv	Ljava/lang/Exception;
/*    */     //   352	66	9	$i$a$-debug$default-BuildProgressListenerRegistrar$register$buildProgressListener$1$onEvent$2	I
/*    */     //   402	16	10	failures	Ljava/lang/String;
/*    */     //   337	90	8	$i$f$debug	I
/*    */     //   331	96	6	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*    */     //   334	93	7	e$iv	Ljava/lang/Exception;
/*    */     //   259	206	4	stdErr	Ljava/lang/StringBuilder;
/*    */     //   326	139	5	result	Lcom/intellij/build/events/EventResult;
/*    */     //   0	466	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/run/BuildProgressListenerRegistrar$register$buildProgressListener$1;
/*    */     //   0	466	1	buildId	Ljava/lang/Object;
/*    */     //   0	466	2	event	Lcom/intellij/build/events/BuildEvent;
/*    */   }
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
/*    */   private static final CharSequence onEvent$lambda$2$lambda$1(Failure it) {
/* 56 */     return it.getMessage() + " | " + it.getMessage();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\run\BuildProgressListenerRegistrar$register$buildProgressListener$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */