/*     */ package com.intellij.ml.llm.matterhorn.llm;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000@\n\000\n\002\030\002\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\n\002\020 \n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\032\n\020\000\032\0020\001*\0020\002\032\n\020\003\032\0020\001*\0020\002\032\n\020\020\032\0020\005*\0020\021\032,\020\022\032\0020\0232\f\020\024\032\b\022\004\022\0020\0250\r2\006\020\026\032\0020\0272\006\020\030\032\0020\0252\006\020\031\032\0020\t\"\025\020\004\032\0020\002*\0020\0058F¢\006\006\032\004\b\006\020\007\"\025\020\b\032\0020\t*\0020\0058F¢\006\006\032\004\b\n\020\013\"\033\020\f\032\b\022\004\022\0020\t0\r*\0020\0058F¢\006\006\032\004\b\016\020\017¨\006\032"}, d2 = {"toUserMessage", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatMessage;", "", "toAssistantMessage", "stringValue", "Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;", "getStringValue", "(Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;)Ljava/lang/String;", "integerValue", "", "getIntegerValue", "(Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;)I", "integerListValue", "", "getIntegerListValue", "(Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;)Ljava/util/List;", "toParameterValue", "Lkotlinx/serialization/json/JsonElement;", "shouldAddCachePoint", "", "messages", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChatElement;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "message", "userMessageOffset", "core"})
/*     */ @SourceDebugExtension({"SMAP\nMatterhornChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MatterhornChat.kt\ncom/intellij/ml/llm/matterhorn/llm/MatterhornChatKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,340:1\n1#2:341\n1557#3:342\n1628#3,3:343\n1734#3,3:346\n1782#3,4:349\n*S KotlinDebug\n*F\n+ 1 MatterhornChat.kt\ncom/intellij/ml/llm/matterhorn/llm/MatterhornChatKt\n*L\n135#1:342\n135#1:343,3\n325#1:346,3\n337#1:349,4\n*E\n"})
/*     */ public final class MatterhornChatKt
/*     */ {
/*     */   @NotNull
/*     */   public static final MatterhornChatMessage toUserMessage(@NotNull String $this$toUserMessage) {
/* 116 */     Intrinsics.checkNotNullParameter($this$toUserMessage, "<this>"); return new MatterhornChatMessage($this$toUserMessage, MatterhornChatMessageKind.User, null, null, 12, null);
/*     */   }
/*     */   @NotNull
/*     */   public static final MatterhornChatMessage toAssistantMessage(@NotNull String $this$toAssistantMessage) {
/* 120 */     Intrinsics.checkNotNullParameter($this$toAssistantMessage, "<this>"); return new MatterhornChatMessage($this$toAssistantMessage, MatterhornChatMessageKind.Assistant, null, null, 12, null);
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
/*     */   @NotNull
/*     */   public static final String getStringValue(@NotNull ParameterValue $this$stringValue) {
/* 133 */     Intrinsics.checkNotNullParameter($this$stringValue, "<this>"); if (!(($this$stringValue.getType() == ArgumentType.STRING) ? 1 : 0)) { String str = "Failed requirement."; throw new IllegalArgumentException(str.toString()); }  Unit it = Unit.INSTANCE;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 341 */     int $i$a$-let-MatterhornChatKt$stringValue$1 = 0; return $this$stringValue.getValue(); } public static final int getIntegerValue(@NotNull ParameterValue $this$integerValue) { Intrinsics.checkNotNullParameter($this$integerValue, "<this>"); if (!(($this$integerValue.getType() == ArgumentType.INTEGER) ? 1 : 0)) { String str = "Failed requirement."; throw new IllegalArgumentException(str.toString()); }  Unit it = Unit.INSTANCE; int $i$a$-let-MatterhornChatKt$integerValue$1 = 0; return Integer.parseInt($this$integerValue.getValue()); } @NotNull public static final List<Integer> getIntegerListValue(@NotNull ParameterValue $this$integerListValue) { Intrinsics.checkNotNullParameter($this$integerListValue, "<this>"); if (!(($this$integerListValue.getType() == ArgumentType.INTEGER_ARRAY) ? 1 : 0)) { String str = "Failed requirement."; throw new IllegalArgumentException(str.toString()); }  Unit it = Unit.INSTANCE; int $i$a$-let-MatterhornChatKt$integerListValue$1 = 0; String[] arrayOfString = new String[1]; arrayOfString[0] = ","; Iterable $this$map$iv = StringsKt.split$default($this$integerListValue.getValue(), arrayOfString, false, 0, 6, null); int $i$f$map = 0;
/* 342 */     Iterable iterable1 = $this$map$iv; Collection<Integer> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 343 */     for (Object item$iv$iv : iterable1) {
/* 344 */       String str = (String)item$iv$iv; Collection<Integer> collection = destination$iv$iv; int $i$a$-map-MatterhornChatKt$integerListValue$1$1 = 0; collection.add(Integer.valueOf(Integer.parseInt(str)));
/* 345 */     }  return (List<Integer>)destination$iv$iv; }
/*     */   @NotNull public static final ParameterValue toParameterValue(@NotNull JsonElement $this$toParameterValue) { // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_0
/*     */     //   7: instanceof kotlinx/serialization/json/JsonPrimitive
/*     */     //   10: ifeq -> 98
/*     */     //   13: nop
/*     */     //   14: aload_0
/*     */     //   15: checkcast kotlinx/serialization/json/JsonPrimitive
/*     */     //   18: invokevirtual isString : ()Z
/*     */     //   21: ifeq -> 42
/*     */     //   24: new com/intellij/ml/llm/matterhorn/llm/ParameterValue
/*     */     //   27: dup
/*     */     //   28: getstatic com/intellij/ml/llm/matterhorn/llm/ArgumentType.STRING : Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;
/*     */     //   31: aload_0
/*     */     //   32: checkcast kotlinx/serialization/json/JsonPrimitive
/*     */     //   35: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   38: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;Ljava/lang/String;)V
/*     */     //   41: areturn
/*     */     //   42: aload_0
/*     */     //   43: checkcast kotlinx/serialization/json/JsonPrimitive
/*     */     //   46: invokestatic getIntOrNull : (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;
/*     */     //   49: ifnull -> 70
/*     */     //   52: new com/intellij/ml/llm/matterhorn/llm/ParameterValue
/*     */     //   55: dup
/*     */     //   56: getstatic com/intellij/ml/llm/matterhorn/llm/ArgumentType.INTEGER : Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;
/*     */     //   59: aload_0
/*     */     //   60: checkcast kotlinx/serialization/json/JsonPrimitive
/*     */     //   63: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   66: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;Ljava/lang/String;)V
/*     */     //   69: areturn
/*     */     //   70: aload_0
/*     */     //   71: checkcast kotlinx/serialization/json/JsonPrimitive
/*     */     //   74: invokestatic getBooleanOrNull : (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;
/*     */     //   77: ifnull -> 98
/*     */     //   80: new com/intellij/ml/llm/matterhorn/llm/ParameterValue
/*     */     //   83: dup
/*     */     //   84: getstatic com/intellij/ml/llm/matterhorn/llm/ArgumentType.BOOLEAN : Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;
/*     */     //   87: aload_0
/*     */     //   88: checkcast kotlinx/serialization/json/JsonPrimitive
/*     */     //   91: invokevirtual getContent : ()Ljava/lang/String;
/*     */     //   94: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;Ljava/lang/String;)V
/*     */     //   97: areturn
/*     */     //   98: aload_0
/*     */     //   99: instanceof kotlinx/serialization/json/JsonArray
/*     */     //   102: ifeq -> 235
/*     */     //   105: aload_0
/*     */     //   106: checkcast java/lang/Iterable
/*     */     //   109: astore_1
/*     */     //   110: iconst_0
/*     */     //   111: istore_2
/*     */     //   112: aload_1
/*     */     //   113: instanceof java/util/Collection
/*     */     //   116: ifeq -> 135
/*     */     //   119: aload_1
/*     */     //   120: checkcast java/util/Collection
/*     */     //   123: invokeinterface isEmpty : ()Z
/*     */     //   128: ifeq -> 135
/*     */     //   131: iconst_1
/*     */     //   132: goto -> 201
/*     */     //   135: aload_1
/*     */     //   136: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   141: astore_3
/*     */     //   142: aload_3
/*     */     //   143: invokeinterface hasNext : ()Z
/*     */     //   148: ifeq -> 200
/*     */     //   151: aload_3
/*     */     //   152: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   157: astore #4
/*     */     //   159: aload #4
/*     */     //   161: checkcast kotlinx/serialization/json/JsonElement
/*     */     //   164: astore #5
/*     */     //   166: iconst_0
/*     */     //   167: istore #6
/*     */     //   169: aload #5
/*     */     //   171: instanceof kotlinx/serialization/json/JsonPrimitive
/*     */     //   174: ifeq -> 192
/*     */     //   177: aload #5
/*     */     //   179: checkcast kotlinx/serialization/json/JsonPrimitive
/*     */     //   182: invokestatic getIntOrNull : (Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Integer;
/*     */     //   185: ifnull -> 192
/*     */     //   188: iconst_1
/*     */     //   189: goto -> 193
/*     */     //   192: iconst_0
/*     */     //   193: ifne -> 142
/*     */     //   196: iconst_0
/*     */     //   197: goto -> 201
/*     */     //   200: iconst_1
/*     */     //   201: ifeq -> 235
/*     */     //   204: new com/intellij/ml/llm/matterhorn/llm/ParameterValue
/*     */     //   207: dup
/*     */     //   208: getstatic com/intellij/ml/llm/matterhorn/llm/ArgumentType.INTEGER_ARRAY : Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;
/*     */     //   211: aload_0
/*     */     //   212: checkcast java/lang/Iterable
/*     */     //   215: ldc ','
/*     */     //   217: checkcast java/lang/CharSequence
/*     */     //   220: aconst_null
/*     */     //   221: aconst_null
/*     */     //   222: iconst_0
/*     */     //   223: aconst_null
/*     */     //   224: aconst_null
/*     */     //   225: bipush #62
/*     */     //   227: aconst_null
/*     */     //   228: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   231: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;Ljava/lang/String;)V
/*     */     //   234: areturn
/*     */     //   235: new com/intellij/ml/llm/matterhorn/llm/ParameterValue
/*     */     //   238: dup
/*     */     //   239: getstatic com/intellij/ml/llm/matterhorn/llm/ArgumentType.STRING : Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;
/*     */     //   242: aload_0
/*     */     //   243: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   246: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/ArgumentType;Ljava/lang/String;)V
/*     */     //   249: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #318	-> 6
/*     */     //   #319	-> 13
/*     */     //   #322	-> 14
/*     */     //   #320	-> 18
/*     */     //   #322	-> 31
/*     */     //   #320	-> 35
/*     */     //   #321	-> 42
/*     */     //   #322	-> 42
/*     */     //   #321	-> 46
/*     */     //   #322	-> 59
/*     */     //   #321	-> 63
/*     */     //   #322	-> 70
/*     */     //   #325	-> 98
/*     */     //   #346	-> 112
/*     */     //   #347	-> 135
/*     */     //   #325	-> 169
/*     */     //   #347	-> 193
/*     */     //   #348	-> 200
/*     */     //   #325	-> 201
/*     */     //   #326	-> 204
/*     */     //   #328	-> 235
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   169	24	6	$i$a$-all-MatterhornChatKt$toParameterValue$1	I
/*     */     //   166	27	5	it	Lkotlinx/serialization/json/JsonElement;
/*     */     //   159	41	4	element$iv	Ljava/lang/Object;
/*     */     //   112	89	2	$i$f$all	I
/*     */     //   110	91	1	$this$all$iv	Ljava/lang/Iterable;
/*     */     //   0	250	0	$this$toParameterValue	Lkotlinx/serialization/json/JsonElement; } public static final boolean shouldAddCachePoint(@NotNull List messages, @NotNull ModelParameters modelParameters, @NotNull MatterhornChatElement message, int userMessageOffset) { Intrinsics.checkNotNullParameter(messages, "messages"); Intrinsics.checkNotNullParameter(modelParameters, "modelParameters");
/*     */     Intrinsics.checkNotNullParameter(message, "message");
/*     */     Iterable $this$count$iv = messages;
/*     */     int $i$f$count = 0;
/* 350 */     int count$iv = 0;
/* 351 */     for (Object element$iv : $this$count$iv) { MatterhornChatElement it = (MatterhornChatElement)element$iv; int $i$a$-count-MatterhornChatKt$shouldAddCachePoint$userMessagesCount$1 = 0; if (((it.getKind() == MatterhornChatMessageKind.User)) && ++count$iv < 0) CollectionsKt.throwCountOverflow();  }
/* 352 */      int userMessagesCount = ($this$count$iv instanceof Collection && ((Collection)$this$count$iv).isEmpty()) ? 0 : count$iv;
/*     */     int userMessageEndOffset = userMessagesCount - userMessageOffset - 1 - 0;
/*     */     if (modelParameters.getPromptCacheEnabled() && message.getKind() == MatterhornChatMessageKind.User)
/*     */       if ((0 <= userMessageEndOffset) ? ((userMessageEndOffset < 2)) : false); 
/*     */     return false; }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\llm\MatterhornChatKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */