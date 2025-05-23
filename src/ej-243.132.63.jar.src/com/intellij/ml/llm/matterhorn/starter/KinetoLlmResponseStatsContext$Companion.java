/*    */ package com.intellij.ml.llm.matterhorn.starter;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020$\n\002\020\016\n\002\030\002\n\000\n\002\020\034\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J \020\t\032\016\022\004\022\0020\013\022\004\022\0020\f0\n2\f\020\r\032\b\022\004\022\0020\f0\016J\030\020\017\032\004\030\0010\f2\f\020\020\032\b\022\004\022\0020\f0\016H\002R\027\020\004\032\b\022\004\022\0020\0060\005¢\006\b\n\000\032\004\b\007\020\b¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStatsContext$Companion;", "", "<init>", "()V", "KEY", "Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;", "Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStatsContext;", "getKEY", "()Lcom/intellij/ml/llm/matterhorn/ExecutionContextUserDataKey;", "calculateMaxStats", "", "", "Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats;", "allStats", "", "maxStats", "statsList", "matterhorn"})
/*    */ @SourceDebugExtension({"SMAP\nKinetoLlmResponseStatsContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KinetoLlmResponseStatsContext.kt\ncom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStatsContext$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,59:1\n1485#2:60\n1510#2,3:61\n1513#2,3:71\n381#3,7:64\n1#4:74\n*S KotlinDebug\n*F\n+ 1 KinetoLlmResponseStatsContext.kt\ncom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStatsContext$Companion\n*L\n14#1:60\n14#1:61,3\n14#1:71,3\n14#1:64,7\n*E\n"})
/*    */ public final class Companion {
/*    */   @NotNull
/*    */   public final ExecutionContextUserDataKey<KinetoLlmResponseStatsContext> getKEY() {
/* 10 */     return KinetoLlmResponseStatsContext.access$getKEY$cp();
/*    */   } private Companion() {} @NotNull
/*    */   public final Map<String, KinetoLlmResponseStats> calculateMaxStats(@NotNull Iterable allStats) {
/* 13 */     Intrinsics.checkNotNullParameter(allStats, "allStats"); Map<String, KinetoLlmResponseStats> map1 = MapsKt.createMapBuilder(), $this$calculateMaxStats_u24lambda_u242 = map1; int $i$a$-buildMap-KinetoLlmResponseStatsContext$Companion$calculateMaxStats$1 = 0;
/* 14 */     Iterable $this$groupBy$iv = allStats; int $i$f$groupBy = 0;
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
/* 60 */     Iterable iterable1 = $this$groupBy$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(); int $i$f$groupByTo = 0;
/* 61 */     for (Object element$iv$iv : iterable1) {
/* 62 */       KinetoLlmResponseStats it = (KinetoLlmResponseStats)element$iv$iv; int $i$a$-groupBy-KinetoLlmResponseStatsContext$Companion$calculateMaxStats$1$1 = 0; Object key$iv$iv = it.getLlmName();
/* 63 */       Map<Object, Object> $this$getOrPut$iv$iv$iv = destination$iv$iv; int $i$f$getOrPut = 0;
/* 64 */       Object value$iv$iv$iv = $this$getOrPut$iv$iv$iv.get(key$iv$iv);
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 73 */     for (Map.Entry<Object, Object> entry : destination$iv$iv.entrySet()) { String llmName = (String)entry.getKey(); List<KinetoLlmResponseStats> stats = (List)entry.getValue(); if (KinetoLlmResponseStatsContext.Companion.maxStats(stats) != null) {
/* 74 */         KinetoLlmResponseStats it = KinetoLlmResponseStatsContext.Companion.maxStats(stats); int $i$a$-let-KinetoLlmResponseStatsContext$Companion$calculateMaxStats$1$2 = 0;
/*    */         (KinetoLlmResponseStats)$this$calculateMaxStats_u24lambda_u242.put(llmName, it);
/*    */         continue;
/*    */       } 
/*    */       KinetoLlmResponseStatsContext.Companion.maxStats(stats); }
/*    */     
/*    */     return MapsKt.build(map1);
/*    */   }
/*    */   
/*    */   private final KinetoLlmResponseStats maxStats(Iterable statsList) {
/*    */     // Byte code:
/*    */     //   0: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*    */     //   3: pop
/*    */     //   4: iconst_1
/*    */     //   5: getstatic kotlin/time/DurationUnit.MINUTES : Lkotlin/time/DurationUnit;
/*    */     //   8: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*    */     //   11: invokestatic getInWholeMilliseconds-impl : (J)J
/*    */     //   14: lstore_2
/*    */     //   15: new kotlin/collections/ArrayDeque
/*    */     //   18: dup
/*    */     //   19: invokespecial <init> : ()V
/*    */     //   22: astore #4
/*    */     //   24: aconst_null
/*    */     //   25: astore #5
/*    */     //   27: aconst_null
/*    */     //   28: astore #6
/*    */     //   30: aload_1
/*    */     //   31: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   36: astore #7
/*    */     //   38: aload #7
/*    */     //   40: invokeinterface hasNext : ()Z
/*    */     //   45: ifeq -> 241
/*    */     //   48: aload #7
/*    */     //   50: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   55: checkcast com/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats
/*    */     //   58: astore #8
/*    */     //   60: aload #8
/*    */     //   62: invokevirtual getTimestamp : ()J
/*    */     //   65: lload_2
/*    */     //   66: lsub
/*    */     //   67: lstore #9
/*    */     //   69: aload #4
/*    */     //   71: checkcast java/util/Collection
/*    */     //   74: invokeinterface isEmpty : ()Z
/*    */     //   79: ifne -> 86
/*    */     //   82: iconst_1
/*    */     //   83: goto -> 87
/*    */     //   86: iconst_0
/*    */     //   87: ifeq -> 142
/*    */     //   90: aload #4
/*    */     //   92: iconst_0
/*    */     //   93: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   96: checkcast com/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats
/*    */     //   99: invokevirtual getTimestamp : ()J
/*    */     //   102: lload #9
/*    */     //   104: lcmp
/*    */     //   105: ifge -> 142
/*    */     //   108: aload #5
/*    */     //   110: dup
/*    */     //   111: ifnull -> 129
/*    */     //   114: aload #4
/*    */     //   116: iconst_0
/*    */     //   117: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   120: checkcast com/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats
/*    */     //   123: invokevirtual minus : (Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats;)Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats;
/*    */     //   126: goto -> 131
/*    */     //   129: pop
/*    */     //   130: aconst_null
/*    */     //   131: astore #5
/*    */     //   133: aload #4
/*    */     //   135: invokevirtual removeFirst : ()Ljava/lang/Object;
/*    */     //   138: pop
/*    */     //   139: goto -> 69
/*    */     //   142: aload #5
/*    */     //   144: dup
/*    */     //   145: ifnull -> 157
/*    */     //   148: aload #8
/*    */     //   150: invokevirtual plus : (Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats;)Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats;
/*    */     //   153: dup
/*    */     //   154: ifnonnull -> 160
/*    */     //   157: pop
/*    */     //   158: aload #8
/*    */     //   160: astore #5
/*    */     //   162: aload #4
/*    */     //   164: aload #8
/*    */     //   166: invokevirtual addLast : (Ljava/lang/Object;)V
/*    */     //   169: aload #6
/*    */     //   171: dup
/*    */     //   172: ifnull -> 195
/*    */     //   175: astore #11
/*    */     //   177: iconst_0
/*    */     //   178: istore #12
/*    */     //   180: getstatic com/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats.Companion : Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats$Companion;
/*    */     //   183: aload #11
/*    */     //   185: aload #5
/*    */     //   187: invokevirtual maxOf : (Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats;Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats;)Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats;
/*    */     //   190: nop
/*    */     //   191: dup
/*    */     //   192: ifnonnull -> 198
/*    */     //   195: pop
/*    */     //   196: aload #5
/*    */     //   198: astore #6
/*    */     //   200: aload #5
/*    */     //   202: invokevirtual getInputTokens : ()J
/*    */     //   205: aload #6
/*    */     //   207: invokevirtual getInputTokens : ()J
/*    */     //   210: lcmp
/*    */     //   211: ifne -> 38
/*    */     //   214: aload #6
/*    */     //   216: aload #8
/*    */     //   218: invokevirtual getTimestamp : ()J
/*    */     //   221: aconst_null
/*    */     //   222: lconst_0
/*    */     //   223: lconst_0
/*    */     //   224: lconst_0
/*    */     //   225: lconst_0
/*    */     //   226: lconst_0
/*    */     //   227: iconst_0
/*    */     //   228: aconst_null
/*    */     //   229: sipush #510
/*    */     //   232: aconst_null
/*    */     //   233: invokestatic copy$default : (Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats;JLjava/lang/String;JJJJJZLjava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats;
/*    */     //   236: astore #6
/*    */     //   238: goto -> 38
/*    */     //   241: aload #6
/*    */     //   243: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #21	-> 0
/*    */     //   #21	-> 11
/*    */     //   #22	-> 15
/*    */     //   #23	-> 24
/*    */     //   #24	-> 27
/*    */     //   #25	-> 30
/*    */     //   #26	-> 60
/*    */     //   #28	-> 69
/*    */     //   #28	-> 87
/*    */     //   #29	-> 108
/*    */     //   #30	-> 133
/*    */     //   #33	-> 142
/*    */     //   #34	-> 162
/*    */     //   #36	-> 169
/*    */     //   #74	-> 177
/*    */     //   #36	-> 180
/*    */     //   #36	-> 190
/*    */     //   #36	-> 191
/*    */     //   #38	-> 200
/*    */     //   #39	-> 214
/*    */     //   #41	-> 241
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   180	10	12	$i$a$-let-KinetoLlmResponseStatsContext$Companion$maxStats$1	I
/*    */     //   177	13	11	it	Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats;
/*    */     //   69	169	9	start	J
/*    */     //   60	178	8	stats	Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats;
/*    */     //   15	229	2	windowSize	J
/*    */     //   24	220	4	window	Lkotlin/collections/ArrayDeque;
/*    */     //   27	217	5	sum	Ljava/lang/Object;
/*    */     //   30	214	6	max	Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStats;
/*    */     //   0	244	0	this	Lcom/intellij/ml/llm/matterhorn/starter/KinetoLlmResponseStatsContext$Companion;
/*    */     //   0	244	1	statsList	Ljava/lang/Iterable;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\KinetoLlmResponseStatsContext$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */