/*     */ package ai.grazie.tasks.provider.prompt.velocity.resources.lib.validation;
/*     */ import com.fasterxml.jackson.databind.JsonNode;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 2, xi = 48, d1 = {"\000L\n\000\n\002\020\016\n\002\b\n\n\002\030\002\n\000\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\007\n\002\020\013\n\002\b\005\n\002\030\002\n\000\n\002\020\"\n\002\b\003\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\032\030\020\013\032\0020\f*\0020\f2\f\020\r\032\b\022\004\022\0020\0170\016\032 \020\020\032\0020\f*\0020\f2\006\020\021\032\0020\f2\f\020\r\032\b\022\004\022\0020\0170\016\032$\020\022\032\0020\023*\0020\f2\b\020\024\032\004\030\0010\0012\f\020\r\032\b\022\004\022\0020\0170\016H\002\032.\020\025\032\0020\0232\006\020\026\032\0020\f2\006\020\027\032\0020\f2\006\020\024\032\0020\0012\f\020\r\032\b\022\004\022\0020\0170\016H\002\0320\020\030\032\0020\0232\b\020\026\032\004\030\0010\f2\006\020\027\032\0020\f2\006\020\024\032\0020\0012\f\020\r\032\b\022\004\022\0020\0170\016H\002\032<\020\031\032\0020\0232\006\020\026\032\0020\f2\006\020\027\032\0020\f2\f\020\r\032\b\022\004\022\0020\0170\0162\n\b\002\020\024\032\004\030\0010\0012\b\b\002\020\032\032\0020\033H\002\032.\020\034\032\0020\0232\006\020\035\032\0020\f2\006\020\036\032\0020\f2\006\020\024\032\0020\0012\f\020\r\032\b\022\004\022\0020\0170\016H\002\032R\020\037\032\0020\0232\b\020\026\032\004\030\0010\f2\b\020\027\032\004\030\0010\f2\006\020\024\032\0020\0012\f\020\r\032\b\022\004\022\0020\0170\0162\036\020 \032\032\022\004\022\0020\f\022\004\022\0020\f\022\004\022\0020\001\022\004\022\0020\0230!H\002\032\022\020\"\032\b\022\004\022\0020\0010#*\0020\fH\002\032\022\020$\032\b\022\004\022\0020\0010#*\0020\fH\002\032H\020%\032\0020\023*\0020\f2\n\b\002\020\024\032\004\030\0010\0012.\020&\032*\022\004\022\0020\f\022\025\022\023\030\0010\001¢\006\f\b(\022\b\b)\022\004\b\b(\024\022\004\022\0020\0230'¢\006\002\b*H\002\032N\020+\032\0020\023*\0020\f2\006\020,\032\0020\0012\b\020\024\032\004\030\0010\0012.\020&\032*\022\004\022\0020\f\022\025\022\023\030\0010\001¢\006\f\b(\022\b\b)\022\004\b\b(\024\022\004\022\0020\0230'¢\006\002\b*H\002\032\026\020-\032\0020\001*\004\030\0010\0012\006\020\024\032\0020\001H\002\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000\"\016\020\003\032\0020\001XT¢\006\002\n\000\"\016\020\004\032\0020\001XT¢\006\002\n\000\"\016\020\005\032\0020\001XT¢\006\002\n\000\"\016\020\006\032\0020\001XT¢\006\002\n\000\"\016\020\007\032\0020\001XT¢\006\002\n\000\"\016\020\b\032\0020\001XT¢\006\002\n\000\"\016\020\t\032\0020\001XT¢\006\002\n\000\"\016\020\n\032\0020\001XT¢\006\002\n\000¨\006."}, d2 = {"PROPERTIES_FIELD", "", "REQUIRED_FIELD", "TYPE_FIELD", "ITEMS_FIELD", "ALLOF_FIELD", "ANYOF_FIELD", "ONEOF_FIELD", "REF_FIELD", "DEF_FIELD", "LOCAL_REF_PREFIX", "validateFunctionEtalonSchema", "Lcom/fasterxml/jackson/databind/JsonNode;", "errorContext", "Lkotlin/Function0;", "", "validateFunctionTagSchema", "baseSchema", "checkNoInnerDefs", "", "path", "validateSchemasMap", "actual", "expected", "validateSchemasArray", "validateSchema", "forbidDefs", "", "compareStringArrayContent", "actualArray", "expectedArray", "compare", "compareContent", "Lkotlin/Function3;", "stringArrayContent", "", "objectKeys", "visit", "process", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Lkotlin/ExtensionFunctionType;", "visitArrayField", "fieldName", "appendPath", "tasks-provider-llm-prompt-velocity-model"})
/*     */ @SourceDebugExtension({"SMAP\nfunctionSignature.kt\nKotlin\n*S Kotlin\n*F\n+ 1 functionSignature.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/FunctionSignatureKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 utils.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/UtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,189:1\n1557#2:190\n1628#2,3:191\n12#3,2:194\n29#3:196\n15#3:198\n12#3,2:199\n29#3:201\n15#3:203\n12#3,2:204\n29#3:206\n15#3:208\n12#3,2:209\n29#3:211\n15#3:213\n12#3,2:214\n29#3:216\n15#3:218\n12#3,2:219\n29#3:221\n15#3:223\n12#3,2:224\n29#3:226\n15#3:228\n17#3,2:229\n29#3:231\n12#3,2:233\n29#3:235\n15#3:237\n12#3,2:238\n29#3:240\n15#3:242\n12#3,2:243\n29#3:245\n15#3:247\n12#3,2:248\n29#3:250\n15#3:252\n12#3,2:253\n29#3:255\n15#3:257\n17#3,2:263\n29#3:265\n12#3,2:267\n29#3:269\n15#3:271\n12#3,2:272\n29#3:274\n15#3:276\n1#4:197\n1#4:202\n1#4:207\n1#4:212\n1#4:217\n1#4:222\n1#4:227\n1#4:232\n1#4:236\n1#4:241\n1#4:246\n1#4:251\n1#4:256\n1#4:260\n1#4:266\n1#4:270\n1#4:275\n32#5,2:258\n32#5,2:261\n*S KotlinDebug\n*F\n+ 1 functionSignature.kt\nai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/FunctionSignatureKt\n*L\n19#1:190\n19#1:191,3\n53#1:194,2\n53#1:196\n53#1:198\n59#1:199,2\n59#1:201\n59#1:203\n69#1:204,2\n69#1:206\n69#1:208\n73#1:209,2\n73#1:211\n73#1:213\n86#1:214,2\n86#1:216\n86#1:218\n87#1:219,2\n87#1:221\n87#1:223\n91#1:224,2\n91#1:226\n91#1:228\n93#1:229,2\n93#1:231\n100#1:233,2\n100#1:235\n100#1:237\n101#1:238,2\n101#1:240\n101#1:242\n106#1:243,2\n106#1:245\n106#1:247\n138#1:248,2\n138#1:250\n138#1:252\n145#1:253,2\n145#1:255\n145#1:257\n25#1:263,2\n25#1:265\n26#1:267,2\n26#1:269\n26#1:271\n36#1:272,2\n36#1:274\n36#1:276\n53#1:197\n59#1:202\n69#1:207\n73#1:212\n86#1:217\n87#1:222\n91#1:227\n93#1:232\n100#1:236\n101#1:241\n106#1:246\n138#1:251\n145#1:256\n25#1:266\n26#1:270\n36#1:275\n164#1:258,2\n182#1:261,2\n*E\n"})
/*     */ public final class FunctionSignatureKt {
/*     */   @NotNull
/*     */   private static final String PROPERTIES_FIELD = "properties";
/*     */   @NotNull
/*     */   private static final String REQUIRED_FIELD = "required";
/*     */   @NotNull
/*     */   private static final String TYPE_FIELD = "type";
/*     */   @NotNull
/*     */   private static final String ITEMS_FIELD = "items";
/*     */   @NotNull
/*     */   private static final String ALLOF_FIELD = "allOf";
/*     */   @NotNull
/*     */   private static final String ANYOF_FIELD = "anyOf";
/*     */   @NotNull
/*     */   private static final String ONEOF_FIELD = "oneOf";
/*     */   @NotNull
/*     */   private static final String REF_FIELD = "$ref";
/*     */   @NotNull
/*     */   private static final String DEF_FIELD = "$defs";
/*     */   @NotNull
/*     */   private static final String LOCAL_REF_PREFIX = "#/$defs/";
/*     */   
/*     */   @NotNull
/*     */   public static final JsonNode validateFunctionEtalonSchema(@NotNull JsonNode $this$validateFunctionEtalonSchema, @NotNull Function0 errorContext) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_1
/*     */     //   7: ldc 'errorContext'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_0
/*     */     //   13: ldc '$defs'
/*     */     //   15: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   18: dup
/*     */     //   19: ifnull -> 142
/*     */     //   22: astore_3
/*     */     //   23: iconst_0
/*     */     //   24: istore #4
/*     */     //   26: aload_3
/*     */     //   27: invokestatic objectKeys : (Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/Set;
/*     */     //   30: checkcast java/lang/Iterable
/*     */     //   33: astore #5
/*     */     //   35: iconst_0
/*     */     //   36: istore #6
/*     */     //   38: aload #5
/*     */     //   40: astore #7
/*     */     //   42: new java/util/ArrayList
/*     */     //   45: dup
/*     */     //   46: aload #5
/*     */     //   48: bipush #10
/*     */     //   50: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   53: invokespecial <init> : (I)V
/*     */     //   56: checkcast java/util/Collection
/*     */     //   59: astore #8
/*     */     //   61: iconst_0
/*     */     //   62: istore #9
/*     */     //   64: aload #7
/*     */     //   66: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   71: astore #10
/*     */     //   73: aload #10
/*     */     //   75: invokeinterface hasNext : ()Z
/*     */     //   80: ifeq -> 125
/*     */     //   83: aload #10
/*     */     //   85: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   90: astore #11
/*     */     //   92: aload #8
/*     */     //   94: aload #11
/*     */     //   96: checkcast java/lang/String
/*     */     //   99: astore #12
/*     */     //   101: astore #13
/*     */     //   103: iconst_0
/*     */     //   104: istore #14
/*     */     //   106: aload #12
/*     */     //   108: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   113: aload #13
/*     */     //   115: swap
/*     */     //   116: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   121: pop
/*     */     //   122: goto -> 73
/*     */     //   125: aload #8
/*     */     //   127: checkcast java/util/List
/*     */     //   130: nop
/*     */     //   131: checkcast java/lang/Iterable
/*     */     //   134: invokestatic toSet : (Ljava/lang/Iterable;)Ljava/util/Set;
/*     */     //   137: nop
/*     */     //   138: dup
/*     */     //   139: ifnonnull -> 146
/*     */     //   142: pop
/*     */     //   143: invokestatic emptySet : ()Ljava/util/Set;
/*     */     //   146: astore_2
/*     */     //   147: aload_0
/*     */     //   148: aconst_null
/*     */     //   149: aload_1
/*     */     //   150: aload_2
/*     */     //   151: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;Ljava/util/Set;)Lkotlin/jvm/functions/Function2;
/*     */     //   156: iconst_1
/*     */     //   157: aconst_null
/*     */     //   158: invokestatic visit$default : (Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)V
/*     */     //   161: aload_0
/*     */     //   162: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #18	-> 12
/*     */     //   #19	-> 26
/*     */     //   #190	-> 38
/*     */     //   #191	-> 64
/*     */     //   #192	-> 92
/*     */     //   #19	-> 106
/*     */     //   #192	-> 116
/*     */     //   #193	-> 125
/*     */     //   #190	-> 130
/*     */     //   #19	-> 134
/*     */     //   #18	-> 137
/*     */     //   #18	-> 138
/*     */     //   #20	-> 143
/*     */     //   #18	-> 146
/*     */     //   #22	-> 147
/*     */     //   #39	-> 161
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   106	7	14	$i$a$-map-FunctionSignatureKt$validateFunctionEtalonSchema$resolvableRefs$1$1	I
/*     */     //   103	10	12	it	Ljava/lang/String;
/*     */     //   92	30	11	item$iv$iv	Ljava/lang/Object;
/*     */     //   64	63	9	$i$f$mapTo	I
/*     */     //   61	66	7	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   61	66	8	destination$iv$iv	Ljava/util/Collection;
/*     */     //   38	93	6	$i$f$map	I
/*     */     //   35	96	5	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   26	111	4	$i$a$-let-FunctionSignatureKt$validateFunctionEtalonSchema$resolvableRefs$1	I
/*     */     //   23	114	3	it	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   147	16	2	resolvableRefs	Ljava/util/Set;
/*     */     //   0	163	0	$this$validateFunctionEtalonSchema	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   0	163	1	errorContext	Lkotlin/jvm/functions/Function0;
/*     */   }
/*     */   
/*     */   private static final Unit validateFunctionEtalonSchema$lambda$6(Function0<? extends Object> $errorContext, Set $resolvableRefs, JsonNode $this$visit, String path) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc_w '$this$visit'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_2
/*     */     //   8: ldc_w '$ref'
/*     */     //   11: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   14: dup
/*     */     //   15: ifnull -> 203
/*     */     //   18: astore #6
/*     */     //   20: iconst_0
/*     */     //   21: istore #7
/*     */     //   23: aload #6
/*     */     //   25: invokevirtual textValue : ()Ljava/lang/String;
/*     */     //   28: dup
/*     */     //   29: ifnonnull -> 108
/*     */     //   32: pop
/*     */     //   33: aconst_null
/*     */     //   34: astore #8
/*     */     //   36: iconst_0
/*     */     //   37: istore #9
/*     */     //   39: iconst_0
/*     */     //   40: istore #10
/*     */     //   42: aload_0
/*     */     //   43: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   48: dup
/*     */     //   49: ifnull -> 83
/*     */     //   52: astore #11
/*     */     //   54: iconst_0
/*     */     //   55: istore #12
/*     */     //   57: aload #11
/*     */     //   59: astore #13
/*     */     //   61: iconst_0
/*     */     //   62: istore #14
/*     */     //   64: aload_3
/*     */     //   65: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   70: aload #13
/*     */     //   72: swap
/*     */     //   73: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   78: nop
/*     */     //   79: dup
/*     */     //   80: ifnonnull -> 94
/*     */     //   83: pop
/*     */     //   84: iconst_0
/*     */     //   85: istore #14
/*     */     //   87: aload_3
/*     */     //   88: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   93: nop
/*     */     //   94: aload #8
/*     */     //   96: invokestatic velocityLibraryException : (Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/Void;
/*     */     //   99: pop
/*     */     //   100: new kotlin/KotlinNothingValueException
/*     */     //   103: dup
/*     */     //   104: invokespecial <init> : ()V
/*     */     //   107: athrow
/*     */     //   108: astore #15
/*     */     //   110: aload_1
/*     */     //   111: aload #15
/*     */     //   113: invokeinterface contains : (Ljava/lang/Object;)Z
/*     */     //   118: istore #16
/*     */     //   120: iconst_0
/*     */     //   121: istore #8
/*     */     //   123: iload #16
/*     */     //   125: ifne -> 198
/*     */     //   128: iconst_0
/*     */     //   129: istore #9
/*     */     //   131: aload_0
/*     */     //   132: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   137: dup
/*     */     //   138: ifnull -> 172
/*     */     //   141: astore #10
/*     */     //   143: iconst_0
/*     */     //   144: istore #11
/*     */     //   146: aload #10
/*     */     //   148: astore #13
/*     */     //   150: iconst_0
/*     */     //   151: istore #12
/*     */     //   153: aload_3
/*     */     //   154: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   159: aload #13
/*     */     //   161: swap
/*     */     //   162: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   167: nop
/*     */     //   168: dup
/*     */     //   169: ifnonnull -> 183
/*     */     //   172: pop
/*     */     //   173: iconst_0
/*     */     //   174: istore #12
/*     */     //   176: aload_3
/*     */     //   177: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   182: nop
/*     */     //   183: aconst_null
/*     */     //   184: iconst_2
/*     */     //   185: aconst_null
/*     */     //   186: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   189: pop
/*     */     //   190: new kotlin/KotlinNothingValueException
/*     */     //   193: dup
/*     */     //   194: invokespecial <init> : ()V
/*     */     //   197: athrow
/*     */     //   198: nop
/*     */     //   199: nop
/*     */     //   200: goto -> 205
/*     */     //   203: pop
/*     */     //   204: nop
/*     */     //   205: aload_3
/*     */     //   206: ifnull -> 215
/*     */     //   209: aload_2
/*     */     //   210: aload_3
/*     */     //   211: aload_0
/*     */     //   212: invokestatic checkNoInnerDefs : (Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*     */     //   215: aload_2
/*     */     //   216: ldc_w 'required'
/*     */     //   219: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   222: dup
/*     */     //   223: ifnull -> 232
/*     */     //   226: invokestatic stringArrayContent : (Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/Set;
/*     */     //   229: goto -> 234
/*     */     //   232: pop
/*     */     //   233: aconst_null
/*     */     //   234: dup
/*     */     //   235: ifnonnull -> 242
/*     */     //   238: pop
/*     */     //   239: invokestatic emptySet : ()Ljava/util/Set;
/*     */     //   242: astore #4
/*     */     //   244: aload_2
/*     */     //   245: ldc_w 'properties'
/*     */     //   248: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   251: dup
/*     */     //   252: ifnull -> 261
/*     */     //   255: invokestatic objectKeys : (Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/Set;
/*     */     //   258: goto -> 263
/*     */     //   261: pop
/*     */     //   262: aconst_null
/*     */     //   263: dup
/*     */     //   264: ifnonnull -> 271
/*     */     //   267: pop
/*     */     //   268: invokestatic emptySet : ()Ljava/util/Set;
/*     */     //   271: astore #5
/*     */     //   273: aload #5
/*     */     //   275: aload #4
/*     */     //   277: checkcast java/util/Collection
/*     */     //   280: invokeinterface containsAll : (Ljava/util/Collection;)Z
/*     */     //   285: istore #6
/*     */     //   287: iconst_0
/*     */     //   288: istore #7
/*     */     //   290: iload #6
/*     */     //   292: ifne -> 397
/*     */     //   295: iconst_0
/*     */     //   296: istore #8
/*     */     //   298: aload_0
/*     */     //   299: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   304: dup
/*     */     //   305: ifnull -> 355
/*     */     //   308: astore #9
/*     */     //   310: iconst_0
/*     */     //   311: istore #10
/*     */     //   313: aload #9
/*     */     //   315: astore #17
/*     */     //   317: iconst_0
/*     */     //   318: istore #11
/*     */     //   320: aload_3
/*     */     //   321: ldc_w 'required'
/*     */     //   324: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   327: aload #4
/*     */     //   329: aload #5
/*     */     //   331: checkcast java/lang/Iterable
/*     */     //   334: invokestatic minus : (Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
/*     */     //   337: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/util/Set;)Ljava/lang/String;
/*     */     //   342: aload #17
/*     */     //   344: swap
/*     */     //   345: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   350: nop
/*     */     //   351: dup
/*     */     //   352: ifnonnull -> 382
/*     */     //   355: pop
/*     */     //   356: iconst_0
/*     */     //   357: istore #11
/*     */     //   359: aload_3
/*     */     //   360: ldc_w 'required'
/*     */     //   363: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   366: aload #4
/*     */     //   368: aload #5
/*     */     //   370: checkcast java/lang/Iterable
/*     */     //   373: invokestatic minus : (Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
/*     */     //   376: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/util/Set;)Ljava/lang/String;
/*     */     //   381: nop
/*     */     //   382: aconst_null
/*     */     //   383: iconst_2
/*     */     //   384: aconst_null
/*     */     //   385: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   388: pop
/*     */     //   389: new kotlin/KotlinNothingValueException
/*     */     //   392: dup
/*     */     //   393: invokespecial <init> : ()V
/*     */     //   396: athrow
/*     */     //   397: nop
/*     */     //   398: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   401: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #24	-> 7
/*     */     //   #25	-> 23
/*     */     //   #263	-> 33
/*     */     //   #264	-> 39
/*     */     //   #265	-> 42
/*     */     //   #266	-> 54
/*     */     //   #265	-> 57
/*     */     //   #25	-> 64
/*     */     //   #265	-> 73
/*     */     //   #265	-> 78
/*     */     //   #265	-> 79
/*     */     //   #25	-> 87
/*     */     //   #265	-> 93
/*     */     //   #264	-> 94
/*     */     //   #26	-> 110
/*     */     //   #267	-> 123
/*     */     //   #268	-> 128
/*     */     //   #269	-> 131
/*     */     //   #270	-> 143
/*     */     //   #269	-> 146
/*     */     //   #26	-> 153
/*     */     //   #269	-> 162
/*     */     //   #269	-> 167
/*     */     //   #269	-> 168
/*     */     //   #26	-> 176
/*     */     //   #269	-> 182
/*     */     //   #268	-> 183
/*     */     //   #271	-> 198
/*     */     //   #27	-> 199
/*     */     //   #24	-> 200
/*     */     //   #24	-> 203
/*     */     //   #29	-> 205
/*     */     //   #30	-> 209
/*     */     //   #34	-> 215
/*     */     //   #34	-> 242
/*     */     //   #35	-> 244
/*     */     //   #35	-> 271
/*     */     //   #36	-> 273
/*     */     //   #272	-> 290
/*     */     //   #273	-> 295
/*     */     //   #274	-> 298
/*     */     //   #275	-> 310
/*     */     //   #274	-> 313
/*     */     //   #36	-> 320
/*     */     //   #274	-> 345
/*     */     //   #274	-> 350
/*     */     //   #274	-> 351
/*     */     //   #36	-> 359
/*     */     //   #274	-> 381
/*     */     //   #273	-> 382
/*     */     //   #276	-> 397
/*     */     //   #37	-> 398
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   64	6	14	$i$a$-velocityLibraryException$default-FunctionSignatureKt$validateFunctionEtalonSchema$1$1$refValue$1	I
/*     */     //   87	6	14	$i$a$-velocityLibraryException$default-FunctionSignatureKt$validateFunctionEtalonSchema$1$1$refValue$1	I
/*     */     //   57	21	12	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*     */     //   54	24	11	it$iv$iv	Ljava/lang/Object;
/*     */     //   42	52	10	$i$f$buildMessage	I
/*     */     //   39	69	9	$i$f$velocityLibraryException	I
/*     */     //   36	72	8	cause$iv	Ljava/lang/Throwable;
/*     */     //   153	6	12	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateFunctionEtalonSchema$1$1$1	I
/*     */     //   176	6	12	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateFunctionEtalonSchema$1$1$1	I
/*     */     //   146	21	11	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*     */     //   143	24	10	it$iv$iv	Ljava/lang/Object;
/*     */     //   131	52	9	$i$f$buildMessage	I
/*     */     //   123	76	8	$i$f$checkOrVelocityLibraryException	I
/*     */     //   120	79	16	condition$iv	Z
/*     */     //   23	177	7	$i$a$-let-FunctionSignatureKt$validateFunctionEtalonSchema$1$1	I
/*     */     //   110	90	15	refValue	Ljava/lang/String;
/*     */     //   20	180	6	ref	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   320	22	11	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateFunctionEtalonSchema$1$2	I
/*     */     //   359	22	11	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateFunctionEtalonSchema$1$2	I
/*     */     //   313	37	10	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*     */     //   310	40	9	it$iv$iv	Ljava/lang/Object;
/*     */     //   298	84	8	$i$f$buildMessage	I
/*     */     //   290	108	7	$i$f$checkOrVelocityLibraryException	I
/*     */     //   287	111	6	condition$iv	Z
/*     */     //   244	158	4	required	Ljava/util/Set;
/*     */     //   273	129	5	propNames	Ljava/util/Set;
/*     */     //   0	402	0	$errorContext	Lkotlin/jvm/functions/Function0;
/*     */     //   0	402	1	$resolvableRefs	Ljava/util/Set;
/*     */     //   0	402	2	$this$visit	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   0	402	3	path	Ljava/lang/String;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final JsonNode validateFunctionTagSchema(@NotNull JsonNode $this$validateFunctionTagSchema, @NotNull JsonNode baseSchema, @NotNull Function0<? extends Object> errorContext) {
/*  43 */     Intrinsics.checkNotNullParameter($this$validateFunctionTagSchema, "<this>"); Intrinsics.checkNotNullParameter(baseSchema, "baseSchema"); Intrinsics.checkNotNullParameter(errorContext, "errorContext"); compare($this$validateFunctionTagSchema.get("$defs"), baseSchema.get("$defs"), "$defs", errorContext, errorContext::validateFunctionTagSchema$lambda$7);
/*     */ 
/*     */ 
/*     */     
/*  47 */     validateSchema$default($this$validateFunctionTagSchema, baseSchema, errorContext, null, false, 8, null);
/*     */     
/*  49 */     return $this$validateFunctionTagSchema;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Unit validateFunctionTagSchema$lambda$7(Function0<? extends Object> $errorContext, JsonNode actualDefs, JsonNode expectedDefs, String defsPath) {
/*     */     Intrinsics.checkNotNullParameter(actualDefs, "actualDefs");
/*     */     Intrinsics.checkNotNullParameter(expectedDefs, "expectedDefs");
/*     */     Intrinsics.checkNotNullParameter(defsPath, "defsPath");
/*     */     validateSchemasMap(actualDefs, expectedDefs, defsPath, $errorContext);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void checkNoInnerDefs(JsonNode $this$checkNoInnerDefs, String path, Function0 errorContext) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '$defs'
/*     */     //   3: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   6: ifnonnull -> 13
/*     */     //   9: iconst_1
/*     */     //   10: goto -> 14
/*     */     //   13: iconst_0
/*     */     //   14: istore_3
/*     */     //   15: iconst_0
/*     */     //   16: istore #4
/*     */     //   18: iload_3
/*     */     //   19: ifne -> 102
/*     */     //   22: iconst_0
/*     */     //   23: istore #5
/*     */     //   25: aload_2
/*     */     //   26: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   31: dup
/*     */     //   32: ifnull -> 71
/*     */     //   35: astore #6
/*     */     //   37: iconst_0
/*     */     //   38: istore #7
/*     */     //   40: aload #6
/*     */     //   42: astore #9
/*     */     //   44: iconst_0
/*     */     //   45: istore #8
/*     */     //   47: aload_1
/*     */     //   48: ldc '$defs'
/*     */     //   50: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   53: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   58: aload #9
/*     */     //   60: swap
/*     */     //   61: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   66: nop
/*     */     //   67: dup
/*     */     //   68: ifnonnull -> 87
/*     */     //   71: pop
/*     */     //   72: iconst_0
/*     */     //   73: istore #8
/*     */     //   75: aload_1
/*     */     //   76: ldc '$defs'
/*     */     //   78: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   81: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   86: nop
/*     */     //   87: aconst_null
/*     */     //   88: iconst_2
/*     */     //   89: aconst_null
/*     */     //   90: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   93: pop
/*     */     //   94: new kotlin/KotlinNothingValueException
/*     */     //   97: dup
/*     */     //   98: invokespecial <init> : ()V
/*     */     //   101: athrow
/*     */     //   102: nop
/*     */     //   103: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #53	-> 0
/*     */     //   #194	-> 18
/*     */     //   #195	-> 22
/*     */     //   #196	-> 25
/*     */     //   #197	-> 37
/*     */     //   #196	-> 40
/*     */     //   #53	-> 47
/*     */     //   #196	-> 61
/*     */     //   #196	-> 66
/*     */     //   #196	-> 67
/*     */     //   #53	-> 75
/*     */     //   #196	-> 86
/*     */     //   #195	-> 87
/*     */     //   #198	-> 102
/*     */     //   #54	-> 103
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   47	11	8	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$checkNoInnerDefs$1	I
/*     */     //   75	11	8	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$checkNoInnerDefs$1	I
/*     */     //   40	26	7	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*     */     //   37	29	6	it$iv$iv	Ljava/lang/Object;
/*     */     //   25	62	5	$i$f$buildMessage	I
/*     */     //   18	85	4	$i$f$checkOrVelocityLibraryException	I
/*     */     //   15	88	3	condition$iv	Z
/*     */     //   0	104	0	$this$checkNoInnerDefs	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   0	104	1	path	Ljava/lang/String;
/*     */     //   0	104	2	errorContext	Lkotlin/jvm/functions/Function0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void validateSchemasMap(JsonNode actual, JsonNode expected, String path, Function0 errorContext) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokestatic objectKeys : (Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/Set;
/*     */     //   4: astore #4
/*     */     //   6: aload_1
/*     */     //   7: invokestatic objectKeys : (Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/Set;
/*     */     //   10: astore #5
/*     */     //   12: aload #4
/*     */     //   14: aload #5
/*     */     //   16: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   19: istore #6
/*     */     //   21: iconst_0
/*     */     //   22: istore #7
/*     */     //   24: iload #6
/*     */     //   26: ifne -> 107
/*     */     //   29: iconst_0
/*     */     //   30: istore #8
/*     */     //   32: aload_3
/*     */     //   33: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   38: dup
/*     */     //   39: ifnull -> 77
/*     */     //   42: astore #9
/*     */     //   44: iconst_0
/*     */     //   45: istore #10
/*     */     //   47: aload #9
/*     */     //   49: astore #12
/*     */     //   51: iconst_0
/*     */     //   52: istore #11
/*     */     //   54: aload_2
/*     */     //   55: aload #5
/*     */     //   57: aload #4
/*     */     //   59: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)Ljava/lang/String;
/*     */     //   64: aload #12
/*     */     //   66: swap
/*     */     //   67: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   72: nop
/*     */     //   73: dup
/*     */     //   74: ifnonnull -> 92
/*     */     //   77: pop
/*     */     //   78: iconst_0
/*     */     //   79: istore #11
/*     */     //   81: aload_2
/*     */     //   82: aload #5
/*     */     //   84: aload #4
/*     */     //   86: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)Ljava/lang/String;
/*     */     //   91: nop
/*     */     //   92: aconst_null
/*     */     //   93: iconst_2
/*     */     //   94: aconst_null
/*     */     //   95: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   98: pop
/*     */     //   99: new kotlin/KotlinNothingValueException
/*     */     //   102: dup
/*     */     //   103: invokespecial <init> : ()V
/*     */     //   106: athrow
/*     */     //   107: nop
/*     */     //   108: aload #4
/*     */     //   110: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   115: astore #6
/*     */     //   117: aload #6
/*     */     //   119: invokeinterface hasNext : ()Z
/*     */     //   124: ifeq -> 188
/*     */     //   127: aload #6
/*     */     //   129: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   134: checkcast java/lang/String
/*     */     //   137: astore #7
/*     */     //   139: aload_0
/*     */     //   140: aload #7
/*     */     //   142: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   145: astore #8
/*     */     //   147: aload_1
/*     */     //   148: aload #7
/*     */     //   150: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   153: astore #9
/*     */     //   155: aload #8
/*     */     //   157: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   160: aload #8
/*     */     //   162: aload #9
/*     */     //   164: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   167: aload #9
/*     */     //   169: aload_3
/*     */     //   170: aload_2
/*     */     //   171: aload #7
/*     */     //   173: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   178: iconst_0
/*     */     //   179: bipush #16
/*     */     //   181: aconst_null
/*     */     //   182: invokestatic validateSchema$default : (Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZILjava/lang/Object;)V
/*     */     //   185: goto -> 117
/*     */     //   188: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #57	-> 0
/*     */     //   #58	-> 6
/*     */     //   #59	-> 12
/*     */     //   #199	-> 24
/*     */     //   #200	-> 29
/*     */     //   #201	-> 32
/*     */     //   #202	-> 44
/*     */     //   #201	-> 47
/*     */     //   #59	-> 54
/*     */     //   #201	-> 67
/*     */     //   #201	-> 72
/*     */     //   #201	-> 73
/*     */     //   #59	-> 81
/*     */     //   #201	-> 91
/*     */     //   #200	-> 92
/*     */     //   #203	-> 107
/*     */     //   #61	-> 108
/*     */     //   #62	-> 139
/*     */     //   #63	-> 147
/*     */     //   #64	-> 155
/*     */     //   #66	-> 188
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   54	10	11	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateSchemasMap$1	I
/*     */     //   81	10	11	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateSchemasMap$1	I
/*     */     //   47	25	10	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*     */     //   44	28	9	it$iv$iv	Ljava/lang/Object;
/*     */     //   32	60	8	$i$f$buildMessage	I
/*     */     //   24	84	7	$i$f$checkOrVelocityLibraryException	I
/*     */     //   21	87	6	condition$iv	Z
/*     */     //   147	38	8	actualValue	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   155	30	9	expectedValue	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   139	46	7	key	Ljava/lang/String;
/*     */     //   6	183	4	keys	Ljava/util/Set;
/*     */     //   12	177	5	expectedKeys	Ljava/util/Set;
/*     */     //   0	189	0	actual	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   0	189	1	expected	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   0	189	2	path	Ljava/lang/String;
/*     */     //   0	189	3	errorContext	Lkotlin/jvm/functions/Function0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void validateSchemasArray(JsonNode actual, JsonNode expected, String path, Function0 errorContext) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ifnull -> 8
/*     */     //   4: iconst_1
/*     */     //   5: goto -> 9
/*     */     //   8: iconst_0
/*     */     //   9: istore #4
/*     */     //   11: iconst_0
/*     */     //   12: istore #5
/*     */     //   14: iload #4
/*     */     //   16: ifne -> 89
/*     */     //   19: iconst_0
/*     */     //   20: istore #6
/*     */     //   22: aload_3
/*     */     //   23: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   28: dup
/*     */     //   29: ifnull -> 63
/*     */     //   32: astore #7
/*     */     //   34: iconst_0
/*     */     //   35: istore #8
/*     */     //   37: aload #7
/*     */     //   39: astore #12
/*     */     //   41: iconst_0
/*     */     //   42: istore #9
/*     */     //   44: aload_2
/*     */     //   45: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   50: aload #12
/*     */     //   52: swap
/*     */     //   53: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   58: nop
/*     */     //   59: dup
/*     */     //   60: ifnonnull -> 74
/*     */     //   63: pop
/*     */     //   64: iconst_0
/*     */     //   65: istore #9
/*     */     //   67: aload_2
/*     */     //   68: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   73: nop
/*     */     //   74: aconst_null
/*     */     //   75: iconst_2
/*     */     //   76: aconst_null
/*     */     //   77: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   80: pop
/*     */     //   81: new kotlin/KotlinNothingValueException
/*     */     //   84: dup
/*     */     //   85: invokespecial <init> : ()V
/*     */     //   88: athrow
/*     */     //   89: nop
/*     */     //   90: aload_1
/*     */     //   91: invokevirtual elements : ()Ljava/util/Iterator;
/*     */     //   94: dup
/*     */     //   95: ldc 'elements(...)'
/*     */     //   97: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   100: invokestatic asSequence : (Ljava/util/Iterator;)Lkotlin/sequences/Sequence;
/*     */     //   103: invokestatic toList : (Lkotlin/sequences/Sequence;)Ljava/util/List;
/*     */     //   106: astore #4
/*     */     //   108: aload_0
/*     */     //   109: invokevirtual elements : ()Ljava/util/Iterator;
/*     */     //   112: dup
/*     */     //   113: ldc 'elements(...)'
/*     */     //   115: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   118: invokestatic asSequence : (Ljava/util/Iterator;)Lkotlin/sequences/Sequence;
/*     */     //   121: invokestatic toList : (Lkotlin/sequences/Sequence;)Ljava/util/List;
/*     */     //   124: astore #5
/*     */     //   126: aload #4
/*     */     //   128: invokeinterface size : ()I
/*     */     //   133: aload #5
/*     */     //   135: invokeinterface size : ()I
/*     */     //   140: if_icmpne -> 147
/*     */     //   143: iconst_1
/*     */     //   144: goto -> 148
/*     */     //   147: iconst_0
/*     */     //   148: istore #6
/*     */     //   150: iconst_0
/*     */     //   151: istore #7
/*     */     //   153: iload #6
/*     */     //   155: ifne -> 256
/*     */     //   158: iconst_0
/*     */     //   159: istore #8
/*     */     //   161: aload_3
/*     */     //   162: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   167: dup
/*     */     //   168: ifnull -> 216
/*     */     //   171: astore #9
/*     */     //   173: iconst_0
/*     */     //   174: istore #10
/*     */     //   176: aload #9
/*     */     //   178: astore #12
/*     */     //   180: iconst_0
/*     */     //   181: istore #11
/*     */     //   183: aload_2
/*     */     //   184: aload #4
/*     */     //   186: invokeinterface size : ()I
/*     */     //   191: aload #5
/*     */     //   193: invokeinterface size : ()I
/*     */     //   198: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;II)Ljava/lang/String;
/*     */     //   203: aload #12
/*     */     //   205: swap
/*     */     //   206: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   211: nop
/*     */     //   212: dup
/*     */     //   213: ifnonnull -> 241
/*     */     //   216: pop
/*     */     //   217: iconst_0
/*     */     //   218: istore #11
/*     */     //   220: aload_2
/*     */     //   221: aload #4
/*     */     //   223: invokeinterface size : ()I
/*     */     //   228: aload #5
/*     */     //   230: invokeinterface size : ()I
/*     */     //   235: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;II)Ljava/lang/String;
/*     */     //   240: nop
/*     */     //   241: aconst_null
/*     */     //   242: iconst_2
/*     */     //   243: aconst_null
/*     */     //   244: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   247: pop
/*     */     //   248: new kotlin/KotlinNothingValueException
/*     */     //   251: dup
/*     */     //   252: invokespecial <init> : ()V
/*     */     //   255: athrow
/*     */     //   256: nop
/*     */     //   257: iconst_0
/*     */     //   258: istore #6
/*     */     //   260: aload #4
/*     */     //   262: checkcast java/util/Collection
/*     */     //   265: invokeinterface size : ()I
/*     */     //   270: istore #7
/*     */     //   272: iload #6
/*     */     //   274: iload #7
/*     */     //   276: if_icmpge -> 343
/*     */     //   279: aload #4
/*     */     //   281: iload #6
/*     */     //   283: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   288: checkcast com/fasterxml/jackson/databind/JsonNode
/*     */     //   291: astore #8
/*     */     //   293: aload #5
/*     */     //   295: iload #6
/*     */     //   297: invokeinterface get : (I)Ljava/lang/Object;
/*     */     //   302: checkcast com/fasterxml/jackson/databind/JsonNode
/*     */     //   305: astore #9
/*     */     //   307: aload #9
/*     */     //   309: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   312: aload #9
/*     */     //   314: aload #8
/*     */     //   316: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   319: aload #8
/*     */     //   321: aload_3
/*     */     //   322: aload_2
/*     */     //   323: iload #6
/*     */     //   325: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
/*     */     //   330: iconst_0
/*     */     //   331: bipush #16
/*     */     //   333: aconst_null
/*     */     //   334: invokestatic validateSchema$default : (Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZILjava/lang/Object;)V
/*     */     //   337: iinc #6, 1
/*     */     //   340: goto -> 272
/*     */     //   343: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #69	-> 0
/*     */     //   #204	-> 14
/*     */     //   #205	-> 19
/*     */     //   #206	-> 22
/*     */     //   #207	-> 34
/*     */     //   #206	-> 37
/*     */     //   #69	-> 44
/*     */     //   #206	-> 53
/*     */     //   #206	-> 58
/*     */     //   #206	-> 59
/*     */     //   #69	-> 67
/*     */     //   #206	-> 73
/*     */     //   #205	-> 74
/*     */     //   #208	-> 89
/*     */     //   #71	-> 90
/*     */     //   #72	-> 108
/*     */     //   #73	-> 126
/*     */     //   #209	-> 153
/*     */     //   #210	-> 158
/*     */     //   #211	-> 161
/*     */     //   #212	-> 173
/*     */     //   #211	-> 176
/*     */     //   #73	-> 183
/*     */     //   #211	-> 206
/*     */     //   #211	-> 211
/*     */     //   #211	-> 212
/*     */     //   #73	-> 220
/*     */     //   #211	-> 240
/*     */     //   #210	-> 241
/*     */     //   #213	-> 256
/*     */     //   #76	-> 257
/*     */     //   #77	-> 279
/*     */     //   #78	-> 293
/*     */     //   #79	-> 307
/*     */     //   #76	-> 337
/*     */     //   #81	-> 343
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   44	6	9	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateSchemasArray$1	I
/*     */     //   67	6	9	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateSchemasArray$1	I
/*     */     //   37	21	8	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*     */     //   34	24	7	it$iv$iv	Ljava/lang/Object;
/*     */     //   22	52	6	$i$f$buildMessage	I
/*     */     //   14	76	5	$i$f$checkOrVelocityLibraryException	I
/*     */     //   11	79	4	condition$iv	Z
/*     */     //   183	20	11	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateSchemasArray$2	I
/*     */     //   220	20	11	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateSchemasArray$2	I
/*     */     //   176	35	10	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*     */     //   173	38	9	it$iv$iv	Ljava/lang/Object;
/*     */     //   161	80	8	$i$f$buildMessage	I
/*     */     //   153	104	7	$i$f$checkOrVelocityLibraryException	I
/*     */     //   150	107	6	condition$iv	Z
/*     */     //   293	44	8	expectedSchema	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   307	30	9	actualSchema	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   260	83	6	i	I
/*     */     //   108	236	4	expectedItems	Ljava/util/List;
/*     */     //   126	218	5	actualItems	Ljava/util/List;
/*     */     //   0	344	0	actual	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   0	344	1	expected	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   0	344	2	path	Ljava/lang/String;
/*     */     //   0	344	3	errorContext	Lkotlin/jvm/functions/Function0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void validateSchema(JsonNode actual, JsonNode expected, Function0<? extends Object> errorContext, String path, boolean forbidDefs) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'type'
/*     */     //   4: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   7: dup
/*     */     //   8: ifnull -> 529
/*     */     //   11: astore #5
/*     */     //   13: iconst_0
/*     */     //   14: istore #6
/*     */     //   16: aload_0
/*     */     //   17: ldc_w 'type'
/*     */     //   20: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   23: astore #7
/*     */     //   25: aload #7
/*     */     //   27: ifnull -> 34
/*     */     //   30: iconst_1
/*     */     //   31: goto -> 35
/*     */     //   34: iconst_0
/*     */     //   35: istore #8
/*     */     //   37: iconst_0
/*     */     //   38: istore #9
/*     */     //   40: iload #8
/*     */     //   42: ifne -> 127
/*     */     //   45: iconst_0
/*     */     //   46: istore #10
/*     */     //   48: aload_2
/*     */     //   49: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   54: dup
/*     */     //   55: ifnull -> 95
/*     */     //   58: astore #11
/*     */     //   60: iconst_0
/*     */     //   61: istore #12
/*     */     //   63: aload #11
/*     */     //   65: astore #13
/*     */     //   67: iconst_0
/*     */     //   68: istore #14
/*     */     //   70: aload_3
/*     */     //   71: ldc_w 'type'
/*     */     //   74: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   77: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   82: aload #13
/*     */     //   84: swap
/*     */     //   85: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   90: nop
/*     */     //   91: dup
/*     */     //   92: ifnonnull -> 112
/*     */     //   95: pop
/*     */     //   96: iconst_0
/*     */     //   97: istore #14
/*     */     //   99: aload_3
/*     */     //   100: ldc_w 'type'
/*     */     //   103: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   106: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   111: nop
/*     */     //   112: aconst_null
/*     */     //   113: iconst_2
/*     */     //   114: aconst_null
/*     */     //   115: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   118: pop
/*     */     //   119: new kotlin/KotlinNothingValueException
/*     */     //   122: dup
/*     */     //   123: invokespecial <init> : ()V
/*     */     //   126: athrow
/*     */     //   127: nop
/*     */     //   128: aload #7
/*     */     //   130: invokevirtual getNodeType : ()Lcom/fasterxml/jackson/databind/node/JsonNodeType;
/*     */     //   133: aload #5
/*     */     //   135: invokevirtual getNodeType : ()Lcom/fasterxml/jackson/databind/node/JsonNodeType;
/*     */     //   138: if_acmpne -> 145
/*     */     //   141: iconst_1
/*     */     //   142: goto -> 146
/*     */     //   145: iconst_0
/*     */     //   146: istore #8
/*     */     //   148: iconst_0
/*     */     //   149: istore #9
/*     */     //   151: iload #8
/*     */     //   153: ifne -> 246
/*     */     //   156: iconst_0
/*     */     //   157: istore #10
/*     */     //   159: aload_2
/*     */     //   160: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   165: dup
/*     */     //   166: ifnull -> 210
/*     */     //   169: astore #11
/*     */     //   171: iconst_0
/*     */     //   172: istore #12
/*     */     //   174: aload #11
/*     */     //   176: astore #13
/*     */     //   178: iconst_0
/*     */     //   179: istore #14
/*     */     //   181: aload_3
/*     */     //   182: ldc_w 'type'
/*     */     //   185: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   188: aload #5
/*     */     //   190: aload #7
/*     */     //   192: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;
/*     */     //   197: aload #13
/*     */     //   199: swap
/*     */     //   200: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   205: nop
/*     */     //   206: dup
/*     */     //   207: ifnonnull -> 231
/*     */     //   210: pop
/*     */     //   211: iconst_0
/*     */     //   212: istore #14
/*     */     //   214: aload_3
/*     */     //   215: ldc_w 'type'
/*     */     //   218: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   221: aload #5
/*     */     //   223: aload #7
/*     */     //   225: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;
/*     */     //   230: nop
/*     */     //   231: aconst_null
/*     */     //   232: iconst_2
/*     */     //   233: aconst_null
/*     */     //   234: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   237: pop
/*     */     //   238: new kotlin/KotlinNothingValueException
/*     */     //   241: dup
/*     */     //   242: invokespecial <init> : ()V
/*     */     //   245: athrow
/*     */     //   246: nop
/*     */     //   247: aload #5
/*     */     //   249: invokevirtual getNodeType : ()Lcom/fasterxml/jackson/databind/node/JsonNodeType;
/*     */     //   252: dup
/*     */     //   253: ifnonnull -> 261
/*     */     //   256: pop
/*     */     //   257: iconst_m1
/*     */     //   258: goto -> 269
/*     */     //   261: getstatic ai/grazie/tasks/provider/prompt/velocity/resources/lib/validation/FunctionSignatureKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   264: swap
/*     */     //   265: invokevirtual ordinal : ()I
/*     */     //   268: iaload
/*     */     //   269: tableswitch default -> 427, 1 -> 292, 2 -> 310
/*     */     //   292: aload #7
/*     */     //   294: aload #5
/*     */     //   296: aload_3
/*     */     //   297: ldc_w 'type'
/*     */     //   300: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   303: aload_2
/*     */     //   304: invokestatic compareStringArrayContent : (Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*     */     //   307: goto -> 525
/*     */     //   310: aload #5
/*     */     //   312: invokevirtual textValue : ()Ljava/lang/String;
/*     */     //   315: aload #7
/*     */     //   317: invokevirtual textValue : ()Ljava/lang/String;
/*     */     //   320: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   323: istore #10
/*     */     //   325: iconst_0
/*     */     //   326: istore #11
/*     */     //   328: iload #10
/*     */     //   330: ifne -> 423
/*     */     //   333: iconst_0
/*     */     //   334: istore #12
/*     */     //   336: aload_2
/*     */     //   337: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   342: dup
/*     */     //   343: ifnull -> 387
/*     */     //   346: astore #14
/*     */     //   348: iconst_0
/*     */     //   349: istore #15
/*     */     //   351: aload #14
/*     */     //   353: astore #13
/*     */     //   355: iconst_0
/*     */     //   356: istore #16
/*     */     //   358: aload_3
/*     */     //   359: ldc_w 'type'
/*     */     //   362: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   365: aload #5
/*     */     //   367: aload #7
/*     */     //   369: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;
/*     */     //   374: aload #13
/*     */     //   376: swap
/*     */     //   377: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   382: nop
/*     */     //   383: dup
/*     */     //   384: ifnonnull -> 408
/*     */     //   387: pop
/*     */     //   388: iconst_0
/*     */     //   389: istore #16
/*     */     //   391: aload_3
/*     */     //   392: ldc_w 'type'
/*     */     //   395: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   398: aload #5
/*     */     //   400: aload #7
/*     */     //   402: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/lang/String;
/*     */     //   407: nop
/*     */     //   408: aconst_null
/*     */     //   409: iconst_2
/*     */     //   410: aconst_null
/*     */     //   411: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   414: pop
/*     */     //   415: new kotlin/KotlinNothingValueException
/*     */     //   418: dup
/*     */     //   419: invokespecial <init> : ()V
/*     */     //   422: athrow
/*     */     //   423: nop
/*     */     //   424: goto -> 525
/*     */     //   427: nop
/*     */     //   428: aconst_null
/*     */     //   429: astore #10
/*     */     //   431: iconst_0
/*     */     //   432: istore #11
/*     */     //   434: iconst_0
/*     */     //   435: istore #12
/*     */     //   437: aload_2
/*     */     //   438: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   443: dup
/*     */     //   444: ifnull -> 489
/*     */     //   447: astore #14
/*     */     //   449: iconst_0
/*     */     //   450: istore #15
/*     */     //   452: aload #14
/*     */     //   454: astore #13
/*     */     //   456: iconst_0
/*     */     //   457: istore #16
/*     */     //   459: aload_3
/*     */     //   460: ldc_w 'type'
/*     */     //   463: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   466: aload #5
/*     */     //   468: invokevirtual getNodeType : ()Lcom/fasterxml/jackson/databind/node/JsonNodeType;
/*     */     //   471: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Lcom/fasterxml/jackson/databind/node/JsonNodeType;)Ljava/lang/String;
/*     */     //   476: aload #13
/*     */     //   478: swap
/*     */     //   479: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   484: nop
/*     */     //   485: dup
/*     */     //   486: ifnonnull -> 511
/*     */     //   489: pop
/*     */     //   490: iconst_0
/*     */     //   491: istore #16
/*     */     //   493: aload_3
/*     */     //   494: ldc_w 'type'
/*     */     //   497: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   500: aload #5
/*     */     //   502: invokevirtual getNodeType : ()Lcom/fasterxml/jackson/databind/node/JsonNodeType;
/*     */     //   505: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Lcom/fasterxml/jackson/databind/node/JsonNodeType;)Ljava/lang/String;
/*     */     //   510: nop
/*     */     //   511: aload #10
/*     */     //   513: invokestatic velocityLibraryException : (Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/Void;
/*     */     //   516: pop
/*     */     //   517: new kotlin/KotlinNothingValueException
/*     */     //   520: dup
/*     */     //   521: invokespecial <init> : ()V
/*     */     //   524: athrow
/*     */     //   525: nop
/*     */     //   526: goto -> 531
/*     */     //   529: pop
/*     */     //   530: nop
/*     */     //   531: aload_1
/*     */     //   532: ldc_w '$ref'
/*     */     //   535: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   538: dup
/*     */     //   539: ifnull -> 789
/*     */     //   542: astore #5
/*     */     //   544: iconst_0
/*     */     //   545: istore #6
/*     */     //   547: aload_0
/*     */     //   548: ldc_w '$ref'
/*     */     //   551: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   554: astore #7
/*     */     //   556: aload #7
/*     */     //   558: ifnull -> 565
/*     */     //   561: iconst_1
/*     */     //   562: goto -> 566
/*     */     //   565: iconst_0
/*     */     //   566: istore #8
/*     */     //   568: iconst_0
/*     */     //   569: istore #9
/*     */     //   571: iload #8
/*     */     //   573: ifne -> 658
/*     */     //   576: iconst_0
/*     */     //   577: istore #10
/*     */     //   579: aload_2
/*     */     //   580: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   585: dup
/*     */     //   586: ifnull -> 626
/*     */     //   589: astore #11
/*     */     //   591: iconst_0
/*     */     //   592: istore #12
/*     */     //   594: aload #11
/*     */     //   596: astore #13
/*     */     //   598: iconst_0
/*     */     //   599: istore #14
/*     */     //   601: aload_3
/*     */     //   602: ldc_w '$ref'
/*     */     //   605: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   608: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   613: aload #13
/*     */     //   615: swap
/*     */     //   616: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   621: nop
/*     */     //   622: dup
/*     */     //   623: ifnonnull -> 643
/*     */     //   626: pop
/*     */     //   627: iconst_0
/*     */     //   628: istore #14
/*     */     //   630: aload_3
/*     */     //   631: ldc_w '$ref'
/*     */     //   634: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   637: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   642: nop
/*     */     //   643: aconst_null
/*     */     //   644: iconst_2
/*     */     //   645: aconst_null
/*     */     //   646: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   649: pop
/*     */     //   650: new kotlin/KotlinNothingValueException
/*     */     //   653: dup
/*     */     //   654: invokespecial <init> : ()V
/*     */     //   657: athrow
/*     */     //   658: nop
/*     */     //   659: aload #5
/*     */     //   661: invokevirtual textValue : ()Ljava/lang/String;
/*     */     //   664: aload #7
/*     */     //   666: invokevirtual textValue : ()Ljava/lang/String;
/*     */     //   669: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   672: istore #8
/*     */     //   674: iconst_0
/*     */     //   675: istore #9
/*     */     //   677: iload #8
/*     */     //   679: ifne -> 784
/*     */     //   682: iconst_0
/*     */     //   683: istore #10
/*     */     //   685: aload_2
/*     */     //   686: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   691: dup
/*     */     //   692: ifnull -> 742
/*     */     //   695: astore #11
/*     */     //   697: iconst_0
/*     */     //   698: istore #12
/*     */     //   700: aload #11
/*     */     //   702: astore #13
/*     */     //   704: iconst_0
/*     */     //   705: istore #14
/*     */     //   707: aload_3
/*     */     //   708: ldc_w '$ref'
/*     */     //   711: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   714: aload #5
/*     */     //   716: invokevirtual textValue : ()Ljava/lang/String;
/*     */     //   719: aload #7
/*     */     //   721: invokevirtual textValue : ()Ljava/lang/String;
/*     */     //   724: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   729: aload #13
/*     */     //   731: swap
/*     */     //   732: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   737: nop
/*     */     //   738: dup
/*     */     //   739: ifnonnull -> 769
/*     */     //   742: pop
/*     */     //   743: iconst_0
/*     */     //   744: istore #14
/*     */     //   746: aload_3
/*     */     //   747: ldc_w '$ref'
/*     */     //   750: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   753: aload #5
/*     */     //   755: invokevirtual textValue : ()Ljava/lang/String;
/*     */     //   758: aload #7
/*     */     //   760: invokevirtual textValue : ()Ljava/lang/String;
/*     */     //   763: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   768: nop
/*     */     //   769: aconst_null
/*     */     //   770: iconst_2
/*     */     //   771: aconst_null
/*     */     //   772: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   775: pop
/*     */     //   776: new kotlin/KotlinNothingValueException
/*     */     //   779: dup
/*     */     //   780: invokespecial <init> : ()V
/*     */     //   783: athrow
/*     */     //   784: nop
/*     */     //   785: nop
/*     */     //   786: goto -> 791
/*     */     //   789: pop
/*     */     //   790: nop
/*     */     //   791: aload_1
/*     */     //   792: ldc_w 'items'
/*     */     //   795: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   798: dup
/*     */     //   799: ifnull -> 942
/*     */     //   802: astore #5
/*     */     //   804: iconst_0
/*     */     //   805: istore #6
/*     */     //   807: aload_0
/*     */     //   808: ldc_w 'items'
/*     */     //   811: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   814: astore #7
/*     */     //   816: aload #7
/*     */     //   818: ifnull -> 825
/*     */     //   821: iconst_1
/*     */     //   822: goto -> 826
/*     */     //   825: iconst_0
/*     */     //   826: istore #8
/*     */     //   828: iconst_0
/*     */     //   829: istore #9
/*     */     //   831: iload #8
/*     */     //   833: ifne -> 918
/*     */     //   836: iconst_0
/*     */     //   837: istore #10
/*     */     //   839: aload_2
/*     */     //   840: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   845: dup
/*     */     //   846: ifnull -> 886
/*     */     //   849: astore #11
/*     */     //   851: iconst_0
/*     */     //   852: istore #12
/*     */     //   854: aload #11
/*     */     //   856: astore #13
/*     */     //   858: iconst_0
/*     */     //   859: istore #14
/*     */     //   861: aload_3
/*     */     //   862: ldc_w 'items'
/*     */     //   865: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   868: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   873: aload #13
/*     */     //   875: swap
/*     */     //   876: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   881: nop
/*     */     //   882: dup
/*     */     //   883: ifnonnull -> 903
/*     */     //   886: pop
/*     */     //   887: iconst_0
/*     */     //   888: istore #14
/*     */     //   890: aload_3
/*     */     //   891: ldc_w 'items'
/*     */     //   894: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   897: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   902: nop
/*     */     //   903: aconst_null
/*     */     //   904: iconst_2
/*     */     //   905: aconst_null
/*     */     //   906: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   909: pop
/*     */     //   910: new kotlin/KotlinNothingValueException
/*     */     //   913: dup
/*     */     //   914: invokespecial <init> : ()V
/*     */     //   917: athrow
/*     */     //   918: nop
/*     */     //   919: aload #7
/*     */     //   921: aload #5
/*     */     //   923: aload_2
/*     */     //   924: aload_3
/*     */     //   925: ldc_w 'items'
/*     */     //   928: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   931: iconst_0
/*     */     //   932: bipush #16
/*     */     //   934: aconst_null
/*     */     //   935: invokestatic validateSchema$default : (Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZILjava/lang/Object;)V
/*     */     //   938: nop
/*     */     //   939: goto -> 944
/*     */     //   942: pop
/*     */     //   943: nop
/*     */     //   944: aload_0
/*     */     //   945: ldc_w 'properties'
/*     */     //   948: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   951: aload_1
/*     */     //   952: ldc_w 'properties'
/*     */     //   955: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   958: aload_3
/*     */     //   959: ldc_w 'properties'
/*     */     //   962: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   965: aload_2
/*     */     //   966: aload_2
/*     */     //   967: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function3;
/*     */     //   972: invokestatic compare : (Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;)V
/*     */     //   975: aload_0
/*     */     //   976: ldc_w 'required'
/*     */     //   979: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   982: aload_1
/*     */     //   983: ldc_w 'required'
/*     */     //   986: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   989: aload_3
/*     */     //   990: ldc_w 'required'
/*     */     //   993: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   996: aload_2
/*     */     //   997: aload_2
/*     */     //   998: <illegal opcode> invoke : (Lkotlin/jvm/functions/Function0;)Lkotlin/jvm/functions/Function3;
/*     */     //   1003: invokestatic compare : (Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;)V
/*     */     //   1006: aload_1
/*     */     //   1007: ldc_w 'oneOf'
/*     */     //   1010: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   1013: dup
/*     */     //   1014: ifnull -> 1046
/*     */     //   1017: astore #5
/*     */     //   1019: iconst_0
/*     */     //   1020: istore #6
/*     */     //   1022: aload_0
/*     */     //   1023: ldc_w 'oneOf'
/*     */     //   1026: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   1029: aload #5
/*     */     //   1031: aload_3
/*     */     //   1032: ldc_w 'oneOf'
/*     */     //   1035: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1038: aload_2
/*     */     //   1039: invokestatic validateSchemasArray : (Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*     */     //   1042: nop
/*     */     //   1043: goto -> 1048
/*     */     //   1046: pop
/*     */     //   1047: nop
/*     */     //   1048: aload_1
/*     */     //   1049: ldc_w 'allOf'
/*     */     //   1052: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   1055: dup
/*     */     //   1056: ifnull -> 1088
/*     */     //   1059: astore #5
/*     */     //   1061: iconst_0
/*     */     //   1062: istore #6
/*     */     //   1064: aload_0
/*     */     //   1065: ldc_w 'allOf'
/*     */     //   1068: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   1071: aload #5
/*     */     //   1073: aload_3
/*     */     //   1074: ldc_w 'allOf'
/*     */     //   1077: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1080: aload_2
/*     */     //   1081: invokestatic validateSchemasArray : (Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*     */     //   1084: nop
/*     */     //   1085: goto -> 1090
/*     */     //   1088: pop
/*     */     //   1089: nop
/*     */     //   1090: aload_1
/*     */     //   1091: ldc_w 'anyOf'
/*     */     //   1094: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   1097: dup
/*     */     //   1098: ifnull -> 1130
/*     */     //   1101: astore #5
/*     */     //   1103: iconst_0
/*     */     //   1104: istore #6
/*     */     //   1106: aload_0
/*     */     //   1107: ldc_w 'anyOf'
/*     */     //   1110: invokevirtual get : (Ljava/lang/String;)Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   1113: aload #5
/*     */     //   1115: aload_3
/*     */     //   1116: ldc_w 'anyOf'
/*     */     //   1119: invokestatic appendPath : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1122: aload_2
/*     */     //   1123: invokestatic validateSchemasArray : (Lcom/fasterxml/jackson/databind/JsonNode;Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*     */     //   1126: nop
/*     */     //   1127: goto -> 1132
/*     */     //   1130: pop
/*     */     //   1131: nop
/*     */     //   1132: iload #4
/*     */     //   1134: ifeq -> 1143
/*     */     //   1137: aload_0
/*     */     //   1138: aload_3
/*     */     //   1139: aload_2
/*     */     //   1140: invokestatic checkNoInnerDefs : (Lcom/fasterxml/jackson/databind/JsonNode;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*     */     //   1143: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #84	-> 0
/*     */     //   #85	-> 16
/*     */     //   #86	-> 25
/*     */     //   #214	-> 40
/*     */     //   #215	-> 45
/*     */     //   #216	-> 48
/*     */     //   #217	-> 60
/*     */     //   #216	-> 63
/*     */     //   #86	-> 70
/*     */     //   #216	-> 85
/*     */     //   #216	-> 90
/*     */     //   #216	-> 91
/*     */     //   #86	-> 99
/*     */     //   #216	-> 111
/*     */     //   #215	-> 112
/*     */     //   #218	-> 127
/*     */     //   #87	-> 128
/*     */     //   #219	-> 151
/*     */     //   #220	-> 156
/*     */     //   #221	-> 159
/*     */     //   #222	-> 171
/*     */     //   #221	-> 174
/*     */     //   #87	-> 181
/*     */     //   #221	-> 200
/*     */     //   #221	-> 205
/*     */     //   #221	-> 206
/*     */     //   #87	-> 214
/*     */     //   #221	-> 230
/*     */     //   #220	-> 231
/*     */     //   #223	-> 246
/*     */     //   #89	-> 247
/*     */     //   #90	-> 292
/*     */     //   #91	-> 310
/*     */     //   #224	-> 328
/*     */     //   #225	-> 333
/*     */     //   #226	-> 336
/*     */     //   #227	-> 348
/*     */     //   #226	-> 351
/*     */     //   #91	-> 358
/*     */     //   #226	-> 377
/*     */     //   #226	-> 382
/*     */     //   #226	-> 383
/*     */     //   #91	-> 391
/*     */     //   #226	-> 407
/*     */     //   #225	-> 408
/*     */     //   #228	-> 423
/*     */     //   #93	-> 427
/*     */     //   #229	-> 428
/*     */     //   #230	-> 434
/*     */     //   #231	-> 437
/*     */     //   #232	-> 449
/*     */     //   #231	-> 452
/*     */     //   #93	-> 459
/*     */     //   #231	-> 479
/*     */     //   #231	-> 484
/*     */     //   #231	-> 485
/*     */     //   #93	-> 493
/*     */     //   #231	-> 510
/*     */     //   #230	-> 511
/*     */     //   #96	-> 525
/*     */     //   #84	-> 526
/*     */     //   #84	-> 529
/*     */     //   #98	-> 531
/*     */     //   #99	-> 547
/*     */     //   #100	-> 556
/*     */     //   #233	-> 571
/*     */     //   #234	-> 576
/*     */     //   #235	-> 579
/*     */     //   #236	-> 591
/*     */     //   #235	-> 594
/*     */     //   #100	-> 601
/*     */     //   #235	-> 616
/*     */     //   #235	-> 621
/*     */     //   #235	-> 622
/*     */     //   #100	-> 630
/*     */     //   #235	-> 642
/*     */     //   #234	-> 643
/*     */     //   #237	-> 658
/*     */     //   #101	-> 659
/*     */     //   #238	-> 677
/*     */     //   #239	-> 682
/*     */     //   #240	-> 685
/*     */     //   #241	-> 697
/*     */     //   #240	-> 700
/*     */     //   #101	-> 707
/*     */     //   #240	-> 732
/*     */     //   #240	-> 737
/*     */     //   #240	-> 738
/*     */     //   #101	-> 746
/*     */     //   #240	-> 768
/*     */     //   #239	-> 769
/*     */     //   #242	-> 784
/*     */     //   #102	-> 785
/*     */     //   #98	-> 786
/*     */     //   #98	-> 789
/*     */     //   #104	-> 791
/*     */     //   #105	-> 807
/*     */     //   #106	-> 816
/*     */     //   #243	-> 831
/*     */     //   #244	-> 836
/*     */     //   #245	-> 839
/*     */     //   #246	-> 851
/*     */     //   #245	-> 854
/*     */     //   #106	-> 861
/*     */     //   #245	-> 876
/*     */     //   #245	-> 881
/*     */     //   #245	-> 882
/*     */     //   #106	-> 890
/*     */     //   #245	-> 902
/*     */     //   #244	-> 903
/*     */     //   #247	-> 918
/*     */     //   #107	-> 919
/*     */     //   #108	-> 938
/*     */     //   #104	-> 939
/*     */     //   #104	-> 942
/*     */     //   #110	-> 944
/*     */     //   #114	-> 975
/*     */     //   #118	-> 1006
/*     */     //   #119	-> 1022
/*     */     //   #120	-> 1042
/*     */     //   #118	-> 1043
/*     */     //   #118	-> 1046
/*     */     //   #122	-> 1048
/*     */     //   #123	-> 1064
/*     */     //   #124	-> 1084
/*     */     //   #122	-> 1085
/*     */     //   #122	-> 1088
/*     */     //   #126	-> 1090
/*     */     //   #127	-> 1106
/*     */     //   #128	-> 1126
/*     */     //   #126	-> 1127
/*     */     //   #126	-> 1130
/*     */     //   #130	-> 1132
/*     */     //   #131	-> 1137
/*     */     //   #133	-> 1143
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   70	12	14	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateSchema$1$1	I
/*     */     //   99	12	14	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateSchema$1$1	I
/*     */     //   63	27	12	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*     */     //   60	30	11	it$iv$iv	Ljava/lang/Object;
/*     */     //   48	64	10	$i$f$buildMessage	I
/*     */     //   40	88	9	$i$f$checkOrVelocityLibraryException	I
/*     */     //   37	91	8	condition$iv	Z
/*     */     //   181	16	14	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateSchema$1$2	I
/*     */     //   214	16	14	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateSchema$1$2	I
/*     */     //   174	31	12	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*     */     //   171	34	11	it$iv$iv	Ljava/lang/Object;
/*     */     //   159	72	10	$i$f$buildMessage	I
/*     */     //   151	96	9	$i$f$checkOrVelocityLibraryException	I
/*     */     //   148	99	8	condition$iv	Z
/*     */     //   358	16	16	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateSchema$1$3	I
/*     */     //   391	16	16	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateSchema$1$3	I
/*     */     //   351	31	15	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*     */     //   348	34	14	it$iv$iv	Ljava/lang/Object;
/*     */     //   336	72	12	$i$f$buildMessage	I
/*     */     //   328	96	11	$i$f$checkOrVelocityLibraryException	I
/*     */     //   325	99	10	condition$iv	Z
/*     */     //   459	17	16	$i$a$-velocityLibraryException$default-FunctionSignatureKt$validateSchema$1$4	I
/*     */     //   493	17	16	$i$a$-velocityLibraryException$default-FunctionSignatureKt$validateSchema$1$4	I
/*     */     //   452	32	15	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*     */     //   449	35	14	it$iv$iv	Ljava/lang/Object;
/*     */     //   437	74	12	$i$f$buildMessage	I
/*     */     //   434	91	11	$i$f$velocityLibraryException	I
/*     */     //   431	94	10	cause$iv	Ljava/lang/Throwable;
/*     */     //   16	510	6	$i$a$-let-FunctionSignatureKt$validateSchema$1	I
/*     */     //   25	501	7	actualType	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   13	513	5	expectedType	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   601	12	14	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateSchema$2$1	I
/*     */     //   630	12	14	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateSchema$2$1	I
/*     */     //   594	27	12	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*     */     //   591	30	11	it$iv$iv	Ljava/lang/Object;
/*     */     //   579	64	10	$i$f$buildMessage	I
/*     */     //   571	88	9	$i$f$checkOrVelocityLibraryException	I
/*     */     //   568	91	8	condition$iv	Z
/*     */     //   707	22	14	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateSchema$2$2	I
/*     */     //   746	22	14	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateSchema$2$2	I
/*     */     //   700	37	12	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*     */     //   697	40	11	it$iv$iv	Ljava/lang/Object;
/*     */     //   685	84	10	$i$f$buildMessage	I
/*     */     //   677	108	9	$i$f$checkOrVelocityLibraryException	I
/*     */     //   674	111	8	condition$iv	Z
/*     */     //   547	239	6	$i$a$-let-FunctionSignatureKt$validateSchema$2	I
/*     */     //   556	230	7	actualRef	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   544	242	5	expectedRef	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   861	12	14	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateSchema$3$1	I
/*     */     //   890	12	14	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$validateSchema$3$1	I
/*     */     //   854	27	12	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*     */     //   851	30	11	it$iv$iv	Ljava/lang/Object;
/*     */     //   839	64	10	$i$f$buildMessage	I
/*     */     //   831	88	9	$i$f$checkOrVelocityLibraryException	I
/*     */     //   828	91	8	condition$iv	Z
/*     */     //   807	132	6	$i$a$-let-FunctionSignatureKt$validateSchema$3	I
/*     */     //   816	123	7	actualItems	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   804	135	5	expectedItems	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   1022	21	6	$i$a$-let-FunctionSignatureKt$validateSchema$6	I
/*     */     //   1019	24	5	expectedOneOf	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   1064	21	6	$i$a$-let-FunctionSignatureKt$validateSchema$7	I
/*     */     //   1061	24	5	expectedOneOf	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   1106	21	6	$i$a$-let-FunctionSignatureKt$validateSchema$8	I
/*     */     //   1103	24	5	expectedOneOf	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   0	1144	0	actual	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   0	1144	1	expected	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   0	1144	2	errorContext	Lkotlin/jvm/functions/Function0;
/*     */     //   0	1144	3	path	Ljava/lang/String;
/*     */     //   0	1144	4	forbidDefs	Z
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Unit validateSchema$lambda$22(Function0<? extends Object> $errorContext, JsonNode actualProps, JsonNode expectedProps, String propsPath) {
/* 111 */     Intrinsics.checkNotNullParameter(actualProps, "actualProps"); Intrinsics.checkNotNullParameter(expectedProps, "expectedProps"); Intrinsics.checkNotNullParameter(propsPath, "propsPath"); validateSchemasMap(actualProps, expectedProps, propsPath, $errorContext);
/* 112 */     return Unit.INSTANCE;
/*     */   }
/*     */   private static final Unit validateSchema$lambda$23(Function0<? extends Object> $errorContext, JsonNode actualReq, JsonNode expectedReq, String reqPath) {
/* 115 */     Intrinsics.checkNotNullParameter(actualReq, "actualReq"); Intrinsics.checkNotNullParameter(expectedReq, "expectedReq"); Intrinsics.checkNotNullParameter(reqPath, "reqPath"); compareStringArrayContent(actualReq, expectedReq, reqPath, $errorContext);
/* 116 */     return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void compareStringArrayContent(JsonNode actualArray, JsonNode expectedArray, String path, Function0 errorContext) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokestatic stringArrayContent : (Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/Set;
/*     */     //   4: astore #4
/*     */     //   6: aload_1
/*     */     //   7: invokestatic stringArrayContent : (Lcom/fasterxml/jackson/databind/JsonNode;)Ljava/util/Set;
/*     */     //   10: astore #5
/*     */     //   12: aload #4
/*     */     //   14: aload #5
/*     */     //   16: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   19: istore #6
/*     */     //   21: iconst_0
/*     */     //   22: istore #7
/*     */     //   24: iload #6
/*     */     //   26: ifne -> 107
/*     */     //   29: iconst_0
/*     */     //   30: istore #8
/*     */     //   32: aload_3
/*     */     //   33: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   38: dup
/*     */     //   39: ifnull -> 77
/*     */     //   42: astore #9
/*     */     //   44: iconst_0
/*     */     //   45: istore #10
/*     */     //   47: aload #9
/*     */     //   49: astore #12
/*     */     //   51: iconst_0
/*     */     //   52: istore #11
/*     */     //   54: aload_2
/*     */     //   55: aload #5
/*     */     //   57: aload #4
/*     */     //   59: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)Ljava/lang/String;
/*     */     //   64: aload #12
/*     */     //   66: swap
/*     */     //   67: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   72: nop
/*     */     //   73: dup
/*     */     //   74: ifnonnull -> 92
/*     */     //   77: pop
/*     */     //   78: iconst_0
/*     */     //   79: istore #11
/*     */     //   81: aload_2
/*     */     //   82: aload #5
/*     */     //   84: aload #4
/*     */     //   86: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/util/Set;Ljava/util/Set;)Ljava/lang/String;
/*     */     //   91: nop
/*     */     //   92: aconst_null
/*     */     //   93: iconst_2
/*     */     //   94: aconst_null
/*     */     //   95: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   98: pop
/*     */     //   99: new kotlin/KotlinNothingValueException
/*     */     //   102: dup
/*     */     //   103: invokespecial <init> : ()V
/*     */     //   106: athrow
/*     */     //   107: nop
/*     */     //   108: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #136	-> 0
/*     */     //   #137	-> 6
/*     */     //   #138	-> 12
/*     */     //   #248	-> 24
/*     */     //   #249	-> 29
/*     */     //   #250	-> 32
/*     */     //   #251	-> 44
/*     */     //   #250	-> 47
/*     */     //   #138	-> 54
/*     */     //   #250	-> 67
/*     */     //   #250	-> 72
/*     */     //   #250	-> 73
/*     */     //   #138	-> 81
/*     */     //   #250	-> 91
/*     */     //   #249	-> 92
/*     */     //   #252	-> 107
/*     */     //   #139	-> 108
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   54	10	11	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$compareStringArrayContent$1	I
/*     */     //   81	10	11	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$compareStringArrayContent$1	I
/*     */     //   47	25	10	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*     */     //   44	28	9	it$iv$iv	Ljava/lang/Object;
/*     */     //   32	60	8	$i$f$buildMessage	I
/*     */     //   24	84	7	$i$f$checkOrVelocityLibraryException	I
/*     */     //   21	87	6	condition$iv	Z
/*     */     //   6	103	4	content	Ljava/util/Set;
/*     */     //   12	97	5	expectedContent	Ljava/util/Set;
/*     */     //   0	109	0	actualArray	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   0	109	1	expectedArray	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   0	109	2	path	Ljava/lang/String;
/*     */     //   0	109	3	errorContext	Lkotlin/jvm/functions/Function0;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final void compare(JsonNode actual, JsonNode expected, String path, Function0 errorContext, Function3 compareContent) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ifnull -> 11
/*     */     //   4: aload_0
/*     */     //   5: invokevirtual isEmpty : ()Z
/*     */     //   8: ifeq -> 15
/*     */     //   11: iconst_1
/*     */     //   12: goto -> 16
/*     */     //   15: iconst_0
/*     */     //   16: istore #5
/*     */     //   18: aload_1
/*     */     //   19: ifnull -> 29
/*     */     //   22: aload_1
/*     */     //   23: invokevirtual isEmpty : ()Z
/*     */     //   26: ifeq -> 33
/*     */     //   29: iconst_1
/*     */     //   30: goto -> 34
/*     */     //   33: iconst_0
/*     */     //   34: istore #6
/*     */     //   36: iload #6
/*     */     //   38: iload #5
/*     */     //   40: if_icmpne -> 47
/*     */     //   43: iconst_1
/*     */     //   44: goto -> 48
/*     */     //   47: iconst_0
/*     */     //   48: istore #7
/*     */     //   50: iconst_0
/*     */     //   51: istore #8
/*     */     //   53: iload #7
/*     */     //   55: ifne -> 184
/*     */     //   58: iconst_0
/*     */     //   59: istore #9
/*     */     //   61: aload_3
/*     */     //   62: invokeinterface invoke : ()Ljava/lang/Object;
/*     */     //   67: dup
/*     */     //   68: ifnull -> 130
/*     */     //   71: astore #10
/*     */     //   73: iconst_0
/*     */     //   74: istore #11
/*     */     //   76: aload #10
/*     */     //   78: astore #13
/*     */     //   80: iconst_0
/*     */     //   81: istore #12
/*     */     //   83: aload_2
/*     */     //   84: iload #6
/*     */     //   86: ifeq -> 95
/*     */     //   89: ldc_w 'empty'
/*     */     //   92: goto -> 98
/*     */     //   95: ldc_w 'non-empty'
/*     */     //   98: iload #5
/*     */     //   100: ifeq -> 109
/*     */     //   103: ldc_w 'empty'
/*     */     //   106: goto -> 112
/*     */     //   109: ldc_w 'non-empty'
/*     */     //   112: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   117: aload #13
/*     */     //   119: swap
/*     */     //   120: <illegal opcode> makeConcatWithConstants : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   125: nop
/*     */     //   126: dup
/*     */     //   127: ifnonnull -> 169
/*     */     //   130: pop
/*     */     //   131: iconst_0
/*     */     //   132: istore #12
/*     */     //   134: aload_2
/*     */     //   135: iload #6
/*     */     //   137: ifeq -> 146
/*     */     //   140: ldc_w 'empty'
/*     */     //   143: goto -> 149
/*     */     //   146: ldc_w 'non-empty'
/*     */     //   149: iload #5
/*     */     //   151: ifeq -> 160
/*     */     //   154: ldc_w 'empty'
/*     */     //   157: goto -> 163
/*     */     //   160: ldc_w 'non-empty'
/*     */     //   163: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   168: nop
/*     */     //   169: aconst_null
/*     */     //   170: iconst_2
/*     */     //   171: aconst_null
/*     */     //   172: invokestatic velocityLibraryException$default : (Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)Ljava/lang/Void;
/*     */     //   175: pop
/*     */     //   176: new kotlin/KotlinNothingValueException
/*     */     //   179: dup
/*     */     //   180: invokespecial <init> : ()V
/*     */     //   183: athrow
/*     */     //   184: nop
/*     */     //   185: iload #5
/*     */     //   187: ifne -> 214
/*     */     //   190: iload #6
/*     */     //   192: ifne -> 214
/*     */     //   195: aload #4
/*     */     //   197: aload_0
/*     */     //   198: dup
/*     */     //   199: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   202: aload_1
/*     */     //   203: dup
/*     */     //   204: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   207: aload_2
/*     */     //   208: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   213: pop
/*     */     //   214: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #142	-> 0
/*     */     //   #143	-> 18
/*     */     //   #145	-> 36
/*     */     //   #253	-> 53
/*     */     //   #254	-> 58
/*     */     //   #255	-> 61
/*     */     //   #256	-> 73
/*     */     //   #255	-> 76
/*     */     //   #146	-> 83
/*     */     //   #255	-> 120
/*     */     //   #255	-> 125
/*     */     //   #255	-> 126
/*     */     //   #146	-> 134
/*     */     //   #255	-> 168
/*     */     //   #254	-> 169
/*     */     //   #257	-> 184
/*     */     //   #149	-> 185
/*     */     //   #150	-> 195
/*     */     //   #152	-> 214
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   83	34	12	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$compare$1	I
/*     */     //   134	34	12	$i$a$-checkOrVelocityLibraryException-FunctionSignatureKt$compare$1	I
/*     */     //   76	49	11	$i$a$-let-UtilsKt$buildMessage$1$iv$iv	I
/*     */     //   73	52	10	it$iv$iv	Ljava/lang/Object;
/*     */     //   61	108	9	$i$f$buildMessage	I
/*     */     //   53	132	8	$i$f$checkOrVelocityLibraryException	I
/*     */     //   50	135	7	condition$iv	Z
/*     */     //   18	197	5	actualNullOrEmpty	Z
/*     */     //   36	179	6	expectedNullOrEmpty	Z
/*     */     //   0	215	0	actual	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   0	215	1	expected	Lcom/fasterxml/jackson/databind/JsonNode;
/*     */     //   0	215	2	path	Ljava/lang/String;
/*     */     //   0	215	3	errorContext	Lkotlin/jvm/functions/Function0;
/*     */     //   0	215	4	compareContent	Lkotlin/jvm/functions/Function3;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Set<String> stringArrayContent(JsonNode $this$stringArrayContent) {
/* 154 */     Intrinsics.checkNotNullExpressionValue($this$stringArrayContent.elements(), "elements(...)"); return SequencesKt.toSet(SequencesKt.map(SequencesKt.asSequence($this$stringArrayContent.elements()), FunctionSignatureKt::stringArrayContent$lambda$29)); } private static final String stringArrayContent$lambda$29(JsonNode it) { return it.textValue(); }
/*     */    private static final Set<String> objectKeys(JsonNode $this$objectKeys) {
/* 156 */     Intrinsics.checkNotNullExpressionValue($this$objectKeys.fieldNames(), "fieldNames(...)"); return SequencesKt.toSet(SequencesKt.asSequence($this$objectKeys.fieldNames()));
/*     */   }
/*     */ 
/*     */   
/*     */   private static final void visit(JsonNode $this$visit, String path, Function2<? super JsonNode, ? super String, Unit> process) {
/*     */     Iterator iterator;
/* 162 */     process.invoke($this$visit, path);
/*     */     
/* 164 */     if ($this$visit.get("properties") != null && $this$visit.get("properties").fields() != null) { Iterator $this$forEach$iv = $this$visit.get("properties").fields(); int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 258 */       iterator = $this$forEach$iv; }
/*     */     else { $this$visit.get("properties").fields(); if ($this$visit.get("items") != null)
/* 260 */       { JsonNode it = $this$visit.get("items"); int $i$a$-let-FunctionSignatureKt$visit$2 = 0; visit(it, appendPath(path, "items"), process); } else { $this$visit.get("items"); }  }  if (iterator.hasNext()) { Object element$iv = iterator.next(); Map.Entry it = (Map.Entry)element$iv; int $i$a$-forEach-FunctionSignatureKt$visit$1 = 0; Intrinsics.checkNotNullExpressionValue(it.getValue(), "<get-value>(...)"); Intrinsics.checkNotNullExpressionValue(it.getKey(), "<get-key>(...)"); visit((JsonNode)it.getValue(), appendPath(appendPath(path, "properties"), (String)it.getKey()), process); }
/* 261 */      } private static final void visitArrayField(JsonNode $this$visitArrayField, String fieldName, String path, Function2<? super JsonNode, ? super String, Unit> process) { int i; Iterator iterator; if ($this$visitArrayField.get(fieldName) != null) { JsonNode arrayField = $this$visitArrayField.get(fieldName); int $i$a$-let-FunctionSignatureKt$visitArrayField$1 = 0; i = 0; Intrinsics.checkNotNullExpressionValue(arrayField.elements(), "elements(...)"); Iterator $this$forEach$iv = arrayField.elements(); int $i$f$forEach = 0; iterator = $this$forEach$iv; } else { $this$visitArrayField.get(fieldName); return; }  if (iterator.hasNext()) { Object element$iv = iterator.next(); JsonNode it = (JsonNode)element$iv; int $i$a$-forEach-FunctionSignatureKt$visitArrayField$1$1 = 0;
/*     */       Intrinsics.checkNotNull(it);
/*     */       int j = i;
/*     */       i = j + 1;
/*     */       visit(it, appendPath(path, fieldName + "[" + fieldName + "]"), process); }
/*     */      }
/*     */ 
/*     */   
/*     */   private static final String appendPath(String $this$appendPath, String path) {
/*     */     if ($this$appendPath != null) {
/*     */       String it = $this$appendPath;
/*     */       int $i$a$-let-FunctionSignatureKt$appendPath$1 = 0;
/*     */       if ($this$appendPath + "." + $this$appendPath == null) {
/*     */         $this$appendPath + "." + $this$appendPath;
/*     */         return path;
/*     */       } 
/*     */       return $this$appendPath + "." + $this$appendPath;
/*     */     } 
/*     */     $this$appendPath + "." + $this$appendPath;
/*     */     return path;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-model-0.4.32.jar!\ai\grazie\tasks\provider\prompt\velocity\resources\lib\validation\FunctionSignatureKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */