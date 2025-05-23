/*    */ package ai.grazie.nlp.patterns;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\000\n\002\020 \n\002\b\004\n\002\030\002\n\000\n\002\020\r\n\000\n\002\020\013\n\000\b\026\030\0002\0020\001B\037\b\026\022\026\020\002\032\f\022\b\b\001\022\004\030\0010\0010\003\"\004\030\0010\001¢\006\002\020\004B\023\022\f\020\002\032\b\022\004\022\0020\0010\005¢\006\002\020\006J\026\020\t\032\b\022\004\022\0020\n0\0052\006\020\013\032\0020\fH\026J\020\020\r\032\0020\0162\006\020\013\032\0020\fH\026R\027\020\002\032\b\022\004\022\0020\0010\005¢\006\b\n\000\032\004\b\007\020\b¨\006\017"}, d2 = {"Lai/grazie/nlp/patterns/AggregatedPattern;", "Lai/grazie/nlp/patterns/Pattern;", "patterns", "", "([Lai/grazie/nlp/patterns/Pattern;)V", "", "(Ljava/util/List;)V", "getPatterns", "()Ljava/util/List;", "find", "Lai/grazie/text/TextRange;", "text", "", "matches", "", "nlp-patterns"})
/*    */ @SourceDebugExtension({"SMAP\nAggregatedPattern.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AggregatedPattern.kt\nai/grazie/nlp/patterns/AggregatedPattern\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,17:1\n1368#2:18\n1454#2,5:19\n1755#2,3:24\n*S KotlinDebug\n*F\n+ 1 AggregatedPattern.kt\nai/grazie/nlp/patterns/AggregatedPattern\n*L\n9#1:18\n9#1:19,5\n14#1:24,3\n*E\n"})
/*    */ public class AggregatedPattern implements Pattern {
/*  5 */   public AggregatedPattern(@NotNull List<Pattern> patterns) { this.patterns = patterns; } @NotNull private final List<Pattern> patterns; @NotNull public final List<Pattern> getPatterns() { return this.patterns; } public AggregatedPattern(@NotNull Pattern... patterns) {
/*  6 */     this(CollectionsKt.toList(ArraysKt.filterNotNull((Object[])patterns)));
/*    */   } @NotNull
/*    */   public List<TextRange> find(@NotNull CharSequence text) {
/*  9 */     Intrinsics.checkNotNullParameter(text, "text"); Iterable<Pattern> $this$flatMap$iv = this.patterns; int $i$f$flatMap = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 18 */     Iterable<Pattern> iterable1 = $this$flatMap$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 19 */     for (Pattern element$iv$iv : iterable1) {
/* 20 */       Pattern it = element$iv$iv; int $i$a$-flatMap-AggregatedPattern$find$raw$1 = 0; Iterable<TextRange> list$iv$iv = it.find(text);
/* 21 */       CollectionsKt.addAll(destination$iv$iv, list$iv$iv);
/*    */     } 
/* 23 */     List<TextRange> raw = (List)destination$iv$iv;
/*    */     return raw.isEmpty() ? raw : CollectionsKt.distinct(raw);
/*    */   }
/*    */   
/*    */   public boolean matches(@NotNull CharSequence text) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'text'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: getfield patterns : Ljava/util/List;
/*    */     //   10: checkcast java/lang/Iterable
/*    */     //   13: astore_2
/*    */     //   14: iconst_0
/*    */     //   15: istore_3
/*    */     //   16: aload_2
/*    */     //   17: instanceof java/util/Collection
/*    */     //   20: ifeq -> 39
/*    */     //   23: aload_2
/*    */     //   24: checkcast java/util/Collection
/*    */     //   27: invokeinterface isEmpty : ()Z
/*    */     //   32: ifeq -> 39
/*    */     //   35: iconst_0
/*    */     //   36: goto -> 92
/*    */     //   39: aload_2
/*    */     //   40: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   45: astore #4
/*    */     //   47: aload #4
/*    */     //   49: invokeinterface hasNext : ()Z
/*    */     //   54: ifeq -> 91
/*    */     //   57: aload #4
/*    */     //   59: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   64: astore #5
/*    */     //   66: aload #5
/*    */     //   68: checkcast ai/grazie/nlp/patterns/Pattern
/*    */     //   71: astore #6
/*    */     //   73: iconst_0
/*    */     //   74: istore #7
/*    */     //   76: aload #6
/*    */     //   78: aload_1
/*    */     //   79: invokeinterface matches : (Ljava/lang/CharSequence;)Z
/*    */     //   84: ifeq -> 47
/*    */     //   87: iconst_1
/*    */     //   88: goto -> 92
/*    */     //   91: iconst_0
/*    */     //   92: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #14	-> 6
/*    */     //   #24	-> 16
/*    */     //   #25	-> 39
/*    */     //   #14	-> 76
/*    */     //   #25	-> 84
/*    */     //   #26	-> 91
/*    */     //   #14	-> 92
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   76	8	7	$i$a$-any-AggregatedPattern$matches$1	I
/*    */     //   73	11	6	it	Lai/grazie/nlp/patterns/Pattern;
/*    */     //   66	25	5	element$iv	Ljava/lang/Object;
/*    */     //   16	76	3	$i$f$any	I
/*    */     //   14	78	2	$this$any$iv	Ljava/lang/Iterable;
/*    */     //   0	93	0	this	Lai/grazie/nlp/patterns/AggregatedPattern;
/*    */     //   0	93	1	text	Ljava/lang/CharSequence;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-patterns-jvm-0.4.32.jar!\ai\grazie\nlp\patterns\AggregatedPattern.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */