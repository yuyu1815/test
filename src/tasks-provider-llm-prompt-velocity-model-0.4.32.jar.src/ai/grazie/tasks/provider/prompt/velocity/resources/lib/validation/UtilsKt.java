/*    */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib.validation;
/*    */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000P\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\001\n\000\n\002\020\003\n\002\b\003\n\002\020\036\n\002\020 \n\000\n\002\020$\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032?\020\000\032\0020\0012\006\020\002\032\0020\0032\020\b\002\020\004\032\n\022\006\022\004\030\0010\0060\0052\f\020\007\032\b\022\004\022\0020\b0\005H\bø\001\000\002\b\n\006\b\000\032\002\020\001\0328\020\t\032\0020\n2\020\b\002\020\004\032\n\022\006\022\004\030\0010\0060\0052\n\b\002\020\013\032\004\030\0010\f2\f\020\007\032\b\022\004\022\0020\b0\005H\bø\001\000\0328\020\r\032\0020\n2\020\b\002\020\004\032\n\022\006\022\004\030\0010\0060\0052\n\b\002\020\013\032\004\030\0010\f2\f\020\007\032\b\022\004\022\0020\b0\005H\bø\001\000\032\034\020\t\032\0020\n2\006\020\007\032\0020\b2\n\b\002\020\013\032\004\030\0010\fH\000\032\034\020\r\032\0020\n2\006\020\007\032\0020\b2\n\b\002\020\013\032\004\030\0010\fH\000\032'\020\016\032\0020\b2\016\020\004\032\n\022\006\022\004\030\0010\0060\0052\f\020\007\032\b\022\004\022\0020\b0\005H\b\032\026\020\017\032\b\022\004\022\0020\b0\020*\b\022\004\022\0020\b0\021\032V\020\022\032\024\022\004\022\0020\b\022\n\022\b\022\004\022\0020\0060\0210\023\"\f\b\000\020\024*\006\022\002\b\0030\025\"\004\b\001\020\026*\024\022\020\022\016\022\004\022\002H\026\022\004\022\002H\0240\0270\0212\022\020\030\032\016\022\004\022\002H\026\022\004\022\0020\0060\031\032\032\020\032\032\0020\b*\022\022\004\022\0020\b\022\b\022\006\022\002\b\0030\0210\023\002\007\n\005\b20\001¨\006\033"}, d2 = {"checkOrVelocityLibraryException", "", "condition", "", "context", "Lkotlin/Function0;", "", "message", "", "velocityLibraryException", "", "cause", "", "velocityParseException", "buildMessage", "duplicates", "", "", "findDuplicates", "", "ValueT", "Lai/grazie/tasks/provider/prompt/velocity/resources/lib/TaggedEntity;", "SrcT", "Lkotlin/Pair;", "relativize", "Lkotlin/Function1;", "prettyPrint", "tasks-provider-llm-prompt-velocity-model"})
/*    */ @SourceDebugExtension({"SMAP\nutils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utils.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,45:1\n29#1:46\n29#1:48\n29#1:50\n1#2:47\n1#2:49\n1#2:51\n1#2:52\n1544#3:53\n1485#3:61\n1510#3,3:62\n1513#3,3:72\n1246#3,2:84\n1557#3:86\n1628#3,3:87\n1249#3:90\n535#4:54\n520#4,6:55\n381#4,7:65\n535#4:75\n520#4,6:76\n462#4:82\n412#4:83\n*S KotlinDebug\n*F\n+ 1 utils.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/UtilsKt\n*L\n13#1:46\n18#1:48\n22#1:50\n13#1:47\n18#1:49\n22#1:51\n32#1:53\n36#1:61\n36#1:62,3\n36#1:72,3\n38#1:84,2\n38#1:86\n38#1:87,3\n38#1:90\n32#1:54\n32#1:55,6\n36#1:65,7\n37#1:75\n37#1:76,6\n38#1:82\n38#1:83\n*E\n"})
/*    */ public final class UtilsKt { @Metadata(mv = {2, 0, 0}, k = 3, xi = 176)
/*    */   public static final class UtilsKt$checkOrVelocityLibraryException$1 implements Function0 { public static final UtilsKt$checkOrVelocityLibraryException$1 INSTANCE = new UtilsKt$checkOrVelocityLibraryException$1();
/*    */     
/*    */     public final Void invoke() {
/*  8 */       return null;
/*    */     } }
/*    */   public static final void checkOrVelocityLibraryException(boolean condition, @NotNull Function0 context, @NotNull Function0 message) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'context'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'message'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: iconst_0
/*    */     //   13: istore_3
/*    */     //   14: iload_0
/*    */     //   15: ifne -> 79
/*    */     //   18: iconst_0
/*    */     //   19: istore #4
/*    */     //   21: aload_1
/*    */     //   22: invokeinterface invoke : ()Ljava/lang/Object;
/*    */     //   27: dup
/*    */     //   28: ifnull -> 54
/*    */     //   31: astore #5
/*    */     //   33: iconst_0
/*    */     //   34: istore #6
/*    */     //   36: aload #5
/*    */     //   38: aload_2
/*    */     //   39: invokeinterface invoke : ()Ljava/lang/Object;
/*    */     //   44: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   49: nop
/*    */     //   50: dup
/*    */     //   51: ifnonnull -> 64
/*    */     //   54: pop
/*    */     //   55: aload_2
/*    */     //   56: invokeinterface invoke : ()Ljava/lang/Object;
/*    */     //   61: checkcast java/lang/String
/*    */     //   64: aconst_null
/*    */     //   65: iconst_2
/*    */     //   66: aconst_null
/*    */     //   67: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*    */     //   70: pop
/*    */     //   71: new kotlin/KotlinNothingValueException
/*    */     //   74: dup
/*    */     //   75: invokespecial <init> : ()V
/*    */     //   78: athrow
/*    */     //   79: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #12	-> 14
/*    */     //   #13	-> 18
/*    */     //   #46	-> 21
/*    */     //   #47	-> 33
/*    */     //   #46	-> 36
/*    */     //   #46	-> 49
/*    */     //   #46	-> 50
/*    */     //   #13	-> 64
/*    */     //   #15	-> 79
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   36	13	6	$i$a$-let-UtilsKt$buildMessage$1$iv	I
/*    */     //   33	16	5	it$iv	Ljava/lang/Object;
/*    */     //   21	43	4	$i$f$buildMessage	I
/*    */     //   14	66	3	$i$f$checkOrVelocityLibraryException	I
/*    */     //   0	80	0	condition	Z
/*    */     //   0	80	1	context	Lkotlin/jvm/functions/Function0;
/*    */     //   0	80	2	message	Lkotlin/jvm/functions/Function0;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 176)
/*    */   public static final class UtilsKt$velocityLibraryException$1 implements Function0 { public static final UtilsKt$velocityLibraryException$1 INSTANCE = new UtilsKt$velocityLibraryException$1();
/*    */     
/* 17 */     public final Void invoke() { return null; } } @NotNull
/* 18 */   public static final Void velocityLibraryException(@NotNull Function0 context, @Nullable Throwable cause, @NotNull Function0 message) { Intrinsics.checkNotNullParameter(context, "context"); Intrinsics.checkNotNullParameter(message, "message"); int $i$f$velocityLibraryException = 0, $i$f$buildMessage = 0;
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
/* 48 */     if (context.invoke() != null) { Object it$iv = context.invoke();
/* 49 */       int $i$a$-let-UtilsKt$buildMessage$1$iv = 0; if ("[" + it$iv + "] " + message.invoke() == null) { "[" + it$iv + "] " + message.invoke(); velocityLibraryException((String)message.invoke(), cause); throw new KotlinNothingValueException(); }  velocityLibraryException("[" + it$iv + "] " + message.invoke(), cause); throw new KotlinNothingValueException(); }  "[" + it$iv + "] " + message.invoke(); velocityLibraryException((String)message.invoke(), cause); throw new KotlinNothingValueException(); } @Metadata(mv = {2, 0, 0}, k = 3, xi = 176) public static final class UtilsKt$velocityParseException$1 implements Function0 {
/* 50 */     public static final UtilsKt$velocityParseException$1 INSTANCE = new UtilsKt$velocityParseException$1(); public final Void invoke() { return null; } } @NotNull public static final Void velocityParseException(@NotNull Function0 context, @Nullable Throwable cause, @NotNull Function0 message) { Intrinsics.checkNotNullParameter(context, "context"); Intrinsics.checkNotNullParameter(message, "message"); int $i$f$velocityParseException = 0, $i$f$buildMessage = 0; if (context.invoke() != null) { Object it$iv = context.invoke();
/* 51 */       int $i$a$-let-UtilsKt$buildMessage$1$iv = 0; if ("[" + it$iv + "] " + message.invoke() == null) { "[" + it$iv + "] " + message.invoke(); velocityParseException((String)message.invoke(), cause); throw new KotlinNothingValueException(); }  velocityParseException("[" + it$iv + "] " + message.invoke(), cause); throw new KotlinNothingValueException(); }  "[" + it$iv + "] " + message.invoke(); velocityParseException((String)message.invoke(), cause); throw new KotlinNothingValueException(); }
/* 52 */   @NotNull public static final Void velocityLibraryException(@NotNull String message, @Nullable Throwable cause) { Intrinsics.checkNotNullParameter(message, "message"); throw new VelocityLibraryException(message, cause); } private static final String buildMessage(Function0 context, Function0 message) { int $i$f$buildMessage = 0; if (context.invoke() != null) { Object it = context.invoke(); int $i$a$-let-UtilsKt$buildMessage$1 = 0; if ("[" + it + "] " + message.invoke() == null) { "[" + it + "] " + message.invoke(); return (String)message.invoke(); }  return "[" + it + "] " + message.invoke(); }  "[" + it + "] " + message.invoke(); return (String)message.invoke(); }
/* 53 */   @NotNull public static final Void velocityParseException(@NotNull String message, @Nullable Throwable cause) { Intrinsics.checkNotNullParameter(message, "message"); throw new VelocityParseException(message, cause); } @NotNull public static final Collection<String> duplicates(@NotNull List $this$duplicates) { Intrinsics.checkNotNullParameter($this$duplicates, "<this>"); Iterable $this$groupingBy$iv = $this$duplicates; int $i$f$groupingBy = 0; Map $this$filter$iv = GroupingKt.eachCount(new UtilsKt$duplicates$$inlined$groupingBy$1($this$groupingBy$iv)); int $i$f$filter = 0;
/* 54 */     Map map1 = $this$filter$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(); int $i$f$filterTo = 0;
/* 55 */     for (Map.Entry element$iv$iv : map1.entrySet()) {
/* 56 */       Map.Entry it = element$iv$iv; int $i$a$-filter-UtilsKt$duplicates$2 = 0; if ((((Number)it.getValue()).intValue() > 1)) {
/* 57 */         destination$iv$iv.put(element$iv$iv.getKey(), element$iv$iv.getValue());
/*    */       }
/*    */     } 
/* 60 */     return destination$iv$iv.keySet(); } @NotNull public static final <ValueT extends TaggedEntity<?>, SrcT> Map<String, List<Object>> findDuplicates(@NotNull List $this$findDuplicates, @NotNull Function1 relativize) { Intrinsics.checkNotNullParameter($this$findDuplicates, "<this>"); Intrinsics.checkNotNullParameter(relativize, "relativize"); Iterable $this$groupBy$iv = $this$findDuplicates; int $i$f$groupBy = 0;
/* 61 */     Iterable iterable1 = $this$groupBy$iv; Map<Object, Object> map4 = new LinkedHashMap<>(); int $i$f$groupByTo = 0;
/* 62 */     for (Object element$iv$iv : iterable1) {
/* 63 */       Pair it = (Pair)element$iv$iv; int $i$a$-groupBy-UtilsKt$findDuplicates$1 = 0; Object key$iv$iv = ((TaggedEntity)it.getSecond()).getEntityName();
/* 64 */       Map<Object, Object> $this$getOrPut$iv$iv$iv = map4; int $i$f$getOrPut = 0;
/* 65 */       Object value$iv$iv$iv = $this$getOrPut$iv$iv$iv.get(key$iv$iv);
/*    */     } 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 74 */     Map<Object, Object> map1 = map4; int $i$f$filter = 0;
/* 75 */     Map<Object, Object> map2 = map1, map3 = new LinkedHashMap<>(); int $i$f$filterTo = 0;
/* 76 */     for (Map.Entry<Object, Object> element$iv$iv : map2.entrySet()) {
/* 77 */       Map.Entry<Object, Object> it = element$iv$iv; int $i$a$-filter-UtilsKt$findDuplicates$2 = 0; if ((((List)it.getValue()).size() > 1)) {
/* 78 */         map3.put(element$iv$iv.getKey(), element$iv$iv.getValue());
/*    */       }
/*    */     } 
/* 81 */     Map<Object, Object> $this$filter$iv = map3; int $i$f$mapValues = 0;
/* 82 */     Map<Object, Object> $this$filterTo$iv$iv = $this$filter$iv, destination$iv$iv = new LinkedHashMap<>(MapsKt.mapCapacity($this$filter$iv.size())); int $i$f$mapValuesTo = 0;
/* 83 */     Iterable<Map.Entry<Object, Object>> $this$associateByTo$iv$iv$iv = $this$filterTo$iv$iv.entrySet(); int $i$f$associateByTo = 0;
/* 84 */     for (Object<Object, Object> element$iv$iv$iv : $this$associateByTo$iv$iv$iv) {
/* 85 */       Map.Entry entry1 = (Map.Entry)element$iv$iv$iv; Map<Object, Object> map5 = destination$iv$iv; int $i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv = 0; Map.Entry entry2 = (Map.Entry)element$iv$iv$iv; Object object = entry1.getKey(); Map<Object, Object> map6 = map5; int $i$a$-mapValues-UtilsKt$findDuplicates$3 = 0;
/*    */     } 
/*    */ 
/*    */ 
/*    */     
/* 90 */     return (Map)destination$iv$iv; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final String prettyPrint(@NotNull Map $this$prettyPrint) {
/*    */     Intrinsics.checkNotNullParameter($this$prettyPrint, "<this>");
/*    */     return "" + $this$prettyPrint.keySet() + "\n" + $this$prettyPrint.keySet();
/*    */   }
/*    */   
/*    */   private static final CharSequence prettyPrint$lambda$8$lambda$7(Object it) {
/*    */     return " * " + it;
/*    */   }
/*    */   
/*    */   private static final CharSequence prettyPrint$lambda$8(Map.Entry it) {
/*    */     Intrinsics.checkNotNullParameter(it, "it");
/*    */     return "" + it.getKey() + " (" + it.getKey() + ")\n" + ((List)it.getValue()).size();
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\validation\UtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */