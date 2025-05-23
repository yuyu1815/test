/*    */ package ai.grazie.model.llm.definitions;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\020\"\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bf\030\000 \0172\0020\001:\001\017J \020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\016H\026R\030\020\002\032\b\022\004\022\0020\0040\003X¦\004¢\006\006\032\004\b\005\020\006ø\001\000\002\006\n\004\b!0\001¨\006\020À\006\001"}, d2 = {"Lai/grazie/model/llm/definitions/ParameterDefinition;", "", "supportedParameters", "", "Lai/grazie/utils/attributes/Attributes$Key;", "getSupportedParameters", "()Ljava/util/Set;", "validateParameters", "", "name", "", "parameters", "Lai/grazie/utils/attributes/Attributes;", "profile", "Lai/grazie/model/llm/profile/LLMProfile;", "Companion", "model-llm"})
/*    */ public interface ParameterDefinition {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @NotNull
/*    */   Set<Attributes.Key> getSupportedParameters();
/*    */   
/*    */   default void validateParameters(@NotNull String name, @NotNull Attributes parameters, @NotNull LLMProfile profile) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'name'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_2
/*    */     //   7: ldc 'parameters'
/*    */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   12: aload_3
/*    */     //   13: ldc 'profile'
/*    */     //   15: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   18: aload_2
/*    */     //   19: invokevirtual getKeys : ()[Lai/grazie/utils/attributes/Attributes$Key;
/*    */     //   22: aload_0
/*    */     //   23: invokeinterface getSupportedParameters : ()Ljava/util/Set;
/*    */     //   28: checkcast java/lang/Iterable
/*    */     //   31: invokestatic subtract : ([Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/Set;
/*    */     //   34: astore #4
/*    */     //   36: aload #4
/*    */     //   38: invokeinterface isEmpty : ()Z
/*    */     //   43: new ai/grazie/model/llm/definitions/ParameterDefinition$validateParameters$1
/*    */     //   46: dup
/*    */     //   47: aload #4
/*    */     //   49: aload_1
/*    */     //   50: invokespecial <init> : (Ljava/util/Set;Ljava/lang/String;)V
/*    */     //   53: checkcast kotlin/jvm/functions/Function0
/*    */     //   56: invokestatic requireOrBadRequest : (ZLkotlin/jvm/functions/Function0;)Z
/*    */     //   59: pop
/*    */     //   60: aload_2
/*    */     //   61: invokestatic getLength : (Lai/grazie/utils/attributes/Attributes;)Ljava/lang/Long;
/*    */     //   64: dup
/*    */     //   65: ifnull -> 141
/*    */     //   68: checkcast java/lang/Number
/*    */     //   71: invokevirtual longValue : ()J
/*    */     //   74: lstore #5
/*    */     //   76: iconst_0
/*    */     //   77: istore #7
/*    */     //   79: aload_3
/*    */     //   80: invokevirtual getMetadata : ()Lai/grazie/model/llm/profile/LLMProfileMetadata;
/*    */     //   83: dup
/*    */     //   84: ifnull -> 100
/*    */     //   87: invokevirtual getMaxOutputTokens : ()Ljava/lang/Integer;
/*    */     //   90: dup
/*    */     //   91: ifnull -> 100
/*    */     //   94: invokevirtual intValue : ()I
/*    */     //   97: goto -> 104
/*    */     //   100: pop
/*    */     //   101: goto -> 138
/*    */     //   104: istore #8
/*    */     //   106: lload #5
/*    */     //   108: iload #8
/*    */     //   110: i2l
/*    */     //   111: lcmp
/*    */     //   112: ifgt -> 119
/*    */     //   115: iconst_1
/*    */     //   116: goto -> 120
/*    */     //   119: iconst_0
/*    */     //   120: new ai/grazie/model/llm/definitions/ParameterDefinition$validateParameters$2$1
/*    */     //   123: dup
/*    */     //   124: aload_3
/*    */     //   125: iload #8
/*    */     //   127: invokespecial <init> : (Lai/grazie/model/llm/profile/LLMProfile;I)V
/*    */     //   130: checkcast kotlin/jvm/functions/Function0
/*    */     //   133: invokestatic requireOrBadRequest : (ZLkotlin/jvm/functions/Function0;)Z
/*    */     //   136: pop
/*    */     //   137: nop
/*    */     //   138: goto -> 143
/*    */     //   141: pop
/*    */     //   142: nop
/*    */     //   143: aload_2
/*    */     //   144: invokestatic getNumberOfChoices : (Lai/grazie/utils/attributes/Attributes;)Ljava/lang/Long;
/*    */     //   147: dup
/*    */     //   148: ifnull -> 187
/*    */     //   151: checkcast java/lang/Number
/*    */     //   154: invokevirtual longValue : ()J
/*    */     //   157: lstore #5
/*    */     //   159: iconst_0
/*    */     //   160: istore #7
/*    */     //   162: lload #5
/*    */     //   164: lconst_1
/*    */     //   165: lcmp
/*    */     //   166: iflt -> 173
/*    */     //   169: iconst_1
/*    */     //   170: goto -> 174
/*    */     //   173: iconst_0
/*    */     //   174: getstatic ai/grazie/model/llm/definitions/ParameterDefinition$validateParameters$3$1.INSTANCE : Lai/grazie/model/llm/definitions/ParameterDefinition$validateParameters$3$1;
/*    */     //   177: checkcast kotlin/jvm/functions/Function0
/*    */     //   180: invokestatic requireOrBadRequest : (ZLkotlin/jvm/functions/Function0;)Z
/*    */     //   183: pop
/*    */     //   184: goto -> 189
/*    */     //   187: pop
/*    */     //   188: nop
/*    */     //   189: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 18
/*    */     //   #18	-> 36
/*    */     //   #20	-> 60
/*    */     //   #21	-> 79
/*    */     //   #22	-> 106
/*    */     //   #23	-> 137
/*    */     //   #20	-> 138
/*    */     //   #20	-> 141
/*    */     //   #25	-> 143
/*    */     //   #26	-> 162
/*    */     //   #25	-> 184
/*    */     //   #25	-> 187
/*    */     //   #28	-> 189
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   79	59	7	$i$a$-let-ParameterDefinition$validateParameters$2	I
/*    */     //   106	32	8	modelMaxOutputTokens	I
/*    */     //   76	62	5	length	J
/*    */     //   162	21	7	$i$a$-let-ParameterDefinition$validateParameters$3	I
/*    */     //   159	24	5	number	J
/*    */     //   36	154	4	unsupportedParameters	Ljava/util/Set;
/*    */     //   0	190	0	this	Lai/grazie/model/llm/definitions/ParameterDefinition;
/*    */     //   0	190	1	name	Ljava/lang/String;
/*    */     //   0	190	2	parameters	Lai/grazie/utils/attributes/Attributes;
/*    */     //   0	190	3	profile	Lai/grazie/model/llm/profile/LLMProfile;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   @SourceDebugExtension({"SMAP\nParameterDefinition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParameterDefinition.kt\nai/grazie/model/llm/definitions/ParameterDefinition$validateParameters$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1557#2:37\n1628#2,3:38\n*S KotlinDebug\n*F\n+ 1 ParameterDefinition.kt\nai/grazie/model/llm/definitions/ParameterDefinition$validateParameters$1\n*L\n18#1:37\n18#1:38,3\n*E\n"})
/*    */   static final class ParameterDefinition$validateParameters$1 extends Lambda implements Function0<String> {
/*    */     public final String invoke() {
/* 18 */       Iterable<Attributes.Key> $this$map$iv = this.$unsupportedParameters; int $i$f$map = 0;
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
/* 37 */       Iterable<Attributes.Key> iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 38 */       for (Attributes.Key item$iv$iv : iterable1) {
/* 39 */         Attributes.Key key1 = item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-ParameterDefinition$validateParameters$1$1 = 0; collection.add(key1.getFqdn());
/* 40 */       }  return "Parameters " + (List)destination$iv$iv + " are not supported for chat " + this.$name + " provider";
/*    */     }
/*    */     
/*    */     ParameterDefinition$validateParameters$1(Set<Attributes.Key> $unsupportedParameters, String $name) {
/*    */       super(0);
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class ParameterDefinition$validateParameters$2$1 extends Lambda implements Function0<String> {
/*    */     ParameterDefinition$validateParameters$2$1(LLMProfile $profile, int $modelMaxOutputTokens) {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     public final String invoke() {
/*    */       return "Parameter " + LLMParameters.INSTANCE.getLength() + " is bigger than " + this.$profile.getId() + " maximum output tokens limits: " + this.$modelMaxOutputTokens;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*    */   static final class ParameterDefinition$validateParameters$3$1 extends Lambda implements Function0<String> {
/*    */     public static final ParameterDefinition$validateParameters$3$1 INSTANCE = new ParameterDefinition$validateParameters$3$1();
/*    */     
/*    */     ParameterDefinition$validateParameters$3$1() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     public final String invoke() {
/*    */       return "Parameter " + LLMParameters.INSTANCE.getNumberOfChoices() + " mustn't be smaller than 1";
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"Lai/grazie/model/llm/definitions/ParameterDefinition$Companion;", "", "()V", "EMPTY", "Lai/grazie/model/llm/definitions/ParameterDefinition;", "getEMPTY", "()Lai/grazie/model/llm/definitions/ParameterDefinition;", "model-llm"})
/*    */   public static final class Companion {
/*    */     @NotNull
/*    */     private static final ParameterDefinition EMPTY = new ParameterDefinition$Companion$EMPTY$1();
/*    */     
/*    */     @NotNull
/*    */     public final ParameterDefinition getEMPTY() {
/*    */       return EMPTY;
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\"\n\002\030\002\n\002\b\003*\001\000\b\n\030\0002\0020\001R\032\020\002\032\b\022\004\022\0020\0040\003X\004¢\006\b\n\000\032\004\b\005\020\006¨\006\007"}, d2 = {"ai/grazie/model/llm/definitions/ParameterDefinition$Companion$EMPTY$1", "Lai/grazie/model/llm/definitions/ParameterDefinition;", "supportedParameters", "", "Lai/grazie/utils/attributes/Attributes$Key;", "getSupportedParameters", "()Ljava/util/Set;", "model-llm"})
/*    */     public static final class ParameterDefinition$Companion$EMPTY$1 implements ParameterDefinition {
/*    */       private final Set<Attributes.Key> supportedParameters = SetsKt.emptySet();
/*    */       
/*    */       public Set<Attributes.Key> getSupportedParameters() {
/*    */         return this.supportedParameters;
/*    */       }
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\definitions\ParameterDefinition.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */