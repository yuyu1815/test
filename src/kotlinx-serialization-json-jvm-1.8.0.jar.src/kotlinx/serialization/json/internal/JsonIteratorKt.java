/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import java.util.Iterator;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.NoWhenBranchMatchedException;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.json.DecodeSequenceMode;
/*    */ import kotlinx.serialization.json.Json;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\0000\n\000\n\002\020(\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\032:\020\000\032\b\022\004\022\002H\0020\001\"\004\b\000\020\0022\006\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\f\020\t\032\b\022\004\022\002H\0020\nH\000\032\024\020\013\032\0020\004*\0020\f2\006\020\r\032\0020\004H\002\032\f\020\016\032\0020\017*\0020\fH\002¨\006\020"}, d2 = {"JsonIterator", "", "T", "mode", "Lkotlinx/serialization/json/DecodeSequenceMode;", "json", "Lkotlinx/serialization/json/Json;", "lexer", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "determineFormat", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "suggested", "tryConsumeStartArray", "", "kotlinx-serialization-json"})
/*    */ @SourceDebugExtension({"SMAP\nJsonIterator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonIterator.kt\nkotlinx/serialization/json/internal/JsonIteratorKt\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 3 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer$fail$1\n*L\n1#1,103:1\n226#2,10:104\n229#3:114\n*S KotlinDebug\n*F\n+ 1 JsonIterator.kt\nkotlinx/serialization/json/internal/JsonIteratorKt\n*L\n39#1:104,10\n39#1:114\n*E\n"})
/*    */ public final class JsonIteratorKt
/*    */ {
/*    */   @NotNull
/*    */   public static final <T> Iterator<T> JsonIterator(@NotNull DecodeSequenceMode mode, @NotNull Json json, @NotNull ReaderJsonLexer lexer, @NotNull DeserializationStrategy deserializer) {
/* 19 */     Intrinsics.checkNotNullParameter(mode, "mode"); Intrinsics.checkNotNullParameter(json, "json"); Intrinsics.checkNotNullParameter(lexer, "lexer"); Intrinsics.checkNotNullParameter(deserializer, "deserializer"); switch (WhenMappings.$EnumSwitchMapping$0[determineFormat(lexer, mode).ordinal()]) {
/*    */       case 1:
/*    */       
/*    */       case 2:
/*    */       
/*    */       case 3:
/* 25 */         throw new IllegalStateException(
/*    */ 
/*    */ 
/*    */ 
/*    */             
/* 30 */             "AbstractJsonLexer.determineFormat must be called beforehand.".toString());
/*    */     } 
/*    */     throw new NoWhenBranchMatchedException();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final DecodeSequenceMode determineFormat(AbstractJsonLexer $this$determineFormat, DecodeSequenceMode suggested) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: getstatic kotlinx/serialization/json/internal/JsonIteratorKt$WhenMappings.$EnumSwitchMapping$0 : [I
/*    */     //   4: swap
/*    */     //   5: invokevirtual ordinal : ()I
/*    */     //   8: iaload
/*    */     //   9: tableswitch default -> 215, 1 -> 36, 2 -> 42, 3 -> 196
/*    */     //   36: getstatic kotlinx/serialization/json/DecodeSequenceMode.WHITESPACE_SEPARATED : Lkotlinx/serialization/json/DecodeSequenceMode;
/*    */     //   39: goto -> 223
/*    */     //   42: aload_0
/*    */     //   43: invokestatic tryConsumeStartArray : (Lkotlinx/serialization/json/internal/AbstractJsonLexer;)Z
/*    */     //   46: ifeq -> 55
/*    */     //   49: getstatic kotlinx/serialization/json/DecodeSequenceMode.ARRAY_WRAPPED : Lkotlinx/serialization/json/DecodeSequenceMode;
/*    */     //   52: goto -> 223
/*    */     //   55: bipush #8
/*    */     //   57: istore_2
/*    */     //   58: iconst_1
/*    */     //   59: istore_3
/*    */     //   60: iconst_0
/*    */     //   61: istore #4
/*    */     //   63: iload_2
/*    */     //   64: invokestatic tokenDescription : (B)Ljava/lang/String;
/*    */     //   67: astore #5
/*    */     //   69: aload_0
/*    */     //   70: getfield currentPosition : I
/*    */     //   73: iconst_1
/*    */     //   74: isub
/*    */     //   75: istore #6
/*    */     //   77: aload_0
/*    */     //   78: getfield currentPosition : I
/*    */     //   81: aload_0
/*    */     //   82: invokestatic access$getSource : (Lkotlinx/serialization/json/internal/AbstractJsonLexer;)Ljava/lang/CharSequence;
/*    */     //   85: invokeinterface length : ()I
/*    */     //   90: if_icmpeq -> 98
/*    */     //   93: iload #6
/*    */     //   95: ifge -> 103
/*    */     //   98: ldc 'EOF'
/*    */     //   100: goto -> 117
/*    */     //   103: aload_0
/*    */     //   104: invokestatic access$getSource : (Lkotlinx/serialization/json/internal/AbstractJsonLexer;)Ljava/lang/CharSequence;
/*    */     //   107: iload #6
/*    */     //   109: invokeinterface charAt : (I)C
/*    */     //   114: invokestatic valueOf : (C)Ljava/lang/String;
/*    */     //   117: astore #7
/*    */     //   119: aload_0
/*    */     //   120: aload #5
/*    */     //   122: aload #7
/*    */     //   124: astore #8
/*    */     //   126: astore #9
/*    */     //   128: astore #11
/*    */     //   130: iconst_0
/*    */     //   131: istore #10
/*    */     //   133: aload #9
/*    */     //   135: aload #8
/*    */     //   137: astore #8
/*    */     //   139: astore #9
/*    */     //   141: new java/lang/StringBuilder
/*    */     //   144: dup
/*    */     //   145: invokespecial <init> : ()V
/*    */     //   148: ldc 'Expected '
/*    */     //   150: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   153: aload #9
/*    */     //   155: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   158: ldc ', but had ''
/*    */     //   160: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   163: aload #8
/*    */     //   165: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   168: ldc '' instead'
/*    */     //   170: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   173: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   176: aload #11
/*    */     //   178: swap
/*    */     //   179: iload #6
/*    */     //   181: aconst_null
/*    */     //   182: iconst_4
/*    */     //   183: aconst_null
/*    */     //   184: invokestatic fail$default : (Lkotlinx/serialization/json/internal/AbstractJsonLexer;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Ljava/lang/Void;
/*    */     //   187: pop
/*    */     //   188: new kotlin/KotlinNothingValueException
/*    */     //   191: dup
/*    */     //   192: invokespecial <init> : ()V
/*    */     //   195: athrow
/*    */     //   196: aload_0
/*    */     //   197: invokestatic tryConsumeStartArray : (Lkotlinx/serialization/json/internal/AbstractJsonLexer;)Z
/*    */     //   200: ifeq -> 209
/*    */     //   203: getstatic kotlinx/serialization/json/DecodeSequenceMode.ARRAY_WRAPPED : Lkotlinx/serialization/json/DecodeSequenceMode;
/*    */     //   206: goto -> 223
/*    */     //   209: getstatic kotlinx/serialization/json/DecodeSequenceMode.WHITESPACE_SEPARATED : Lkotlinx/serialization/json/DecodeSequenceMode;
/*    */     //   212: goto -> 223
/*    */     //   215: new kotlin/NoWhenBranchMatchedException
/*    */     //   218: dup
/*    */     //   219: invokespecial <init> : ()V
/*    */     //   222: athrow
/*    */     //   223: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #34	-> 0
/*    */     //   #36	-> 36
/*    */     //   #38	-> 42
/*    */     //   #39	-> 55
/*    */     //   #104	-> 58
/*    */     //   #106	-> 58
/*    */     //   #104	-> 60
/*    */     //   #107	-> 60
/*    */     //   #104	-> 60
/*    */     //   #110	-> 63
/*    */     //   #111	-> 69
/*    */     //   #112	-> 77
/*    */     //   #113	-> 119
/*    */     //   #114	-> 141
/*    */     //   #113	-> 179
/*    */     //   #41	-> 196
/*    */     //   #42	-> 209
/*    */     //   #34	-> 215
/*    */     //   #43	-> 223
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   141	35	9	expected	Ljava/lang/String;
/*    */     //   141	35	8	source	Ljava/lang/String;
/*    */     //   133	43	10	$i$a$-fail$kotlinx_serialization_json-AbstractJsonLexer$fail$1	I
/*    */     //   63	133	4	$i$f$fail$kotlinx_serialization_json	I
/*    */     //   69	127	5	expected$iv	Ljava/lang/String;
/*    */     //   77	119	6	position$iv	I
/*    */     //   119	77	7	s$iv	Ljava/lang/String;
/*    */     //   58	138	2	expectedToken$iv	B
/*    */     //   60	136	3	wasConsumed$iv	Z
/*    */     //   0	224	0	$this$determineFormat	Lkotlinx/serialization/json/internal/AbstractJsonLexer;
/*    */     //   0	224	1	suggested	Lkotlinx/serialization/json/DecodeSequenceMode;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final boolean tryConsumeStartArray(AbstractJsonLexer $this$tryConsumeStartArray) {
/* 46 */     if ($this$tryConsumeStartArray.peekNextToken() == 8) {
/* 47 */       $this$tryConsumeStartArray.consumeNextToken((byte)8);
/* 48 */       return true;
/*    */     } 
/* 50 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonIteratorKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */