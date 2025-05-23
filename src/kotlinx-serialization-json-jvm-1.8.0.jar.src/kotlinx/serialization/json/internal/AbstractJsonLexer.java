/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.InlineMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000x\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\r\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\013\n\002\020\f\n\000\n\002\020\002\n\002\b\005\n\002\020\005\n\002\b\005\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\b\007\n\002\020\001\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\024\n\002\030\002\n\002\b\024\n\002\030\002\n\002\b\t\n\002\020\t\n\002\b\013\b \030\0002\0020\001B\007¢\006\004\b\002\020\003J\r\020\f\032\0020\r*\0020\016H\bJ\b\020\017\032\0020\020H\026J\006\020\021\032\0020\rJ\020\020\022\032\0020\t2\006\020\023\032\0020\tH&J\b\020\024\032\0020\rH&J\b\020\025\032\0020\026H&J\006\020\027\032\0020\rJ\020\020\030\032\0020\r2\006\020\031\032\0020\016H\004J\006\020\032\032\0020\020J\016\020\025\032\0020\0262\006\020$\032\0020\026J\020\020\025\032\0020\0202\006\020$\032\0020\016H&J\020\020%\032\0020\0202\006\020$\032\0020\016H\004J]\020&\032\0020'2\006\020(\032\0020\0262\b\b\002\020)\032\0020\r28\b\002\020*\0322\022\023\022\0210\034¢\006\f\b,\022\b\b-\022\004\b\b($\022\023\022\0210\034¢\006\f\b,\022\b\b-\022\004\b\b(\004\022\004\022\0020\0340+H\bø\001\000¢\006\002\b.J\b\020/\032\0020\026H\026J\020\0200\032\0020\r2\b\b\002\0201\032\0020\rJ\b\0202\032\0020\tH&J\032\0203\032\004\030\0010\0342\006\0204\032\0020\0342\006\0205\032\0020\rH&J\020\0206\032\004\030\0010\0342\006\0205\032\0020\rJ\006\0207\032\0020\020J\030\0208\032\0020\t2\006\0209\032\0020\0162\006\020:\032\0020\tH\026J\030\020;\032\0020\0342\006\020:\032\0020\t2\006\020<\032\0020\tH\026J\b\020=\032\0020\034H&J\030\020>\032\0020\r2\006\0205\032\0020\r2\006\0209\032\0020\016H\002J3\020?\032\0020\0202\006\0205\032\0020\r2!\020@\032\035\022\023\022\0210\034¢\006\f\b,\022\b\b-\022\004\b\b(B\022\004\022\0020\0200AH\026JC\020C\032\0020\0202\006\020D\032\0020\t2\006\020E\032\0020\t2\006\020F\032\0020\r2!\020@\032\035\022\023\022\0210\034¢\006\f\b,\022\b\b-\022\004\b\b(B\022\004\022\0020\0200AH\002J\006\020G\032\0020\034J \020G\032\0020\0342\006\020\004\032\0020\0052\006\020H\032\0020\t2\006\020I\032\0020\tH\005J\030\020J\032\0020\t2\006\020K\032\0020\t2\006\020I\032\0020\tH\002J\030\020L\032\0020\0342\006\020K\032\0020\t2\006\020\b\032\0020\tH\002J\b\020M\032\0020\034H\002J\006\020N\032\0020\034J\b\020O\032\0020\rH\002J\006\020P\032\0020\034J\030\020Q\032\0020\0202\006\020D\032\0020\t2\006\020E\032\0020\tH\024J\020\020R\032\0020\t2\006\020H\032\0020\tH\002J\030\020S\032\0020\t2\006\020\004\032\0020\0052\006\020:\032\0020\tH\002J1\020T\032\0020\0202\006\020U\032\0020\r2\b\b\002\020\023\032\0020\t2\f\020*\032\b\022\004\022\0020\0340VH\bø\001\000¢\006\002\bWJ\030\020X\032\0020\t2\006\020\004\032\0020\0052\006\020\b\032\0020\tH\002J\016\020Y\032\0020\0202\006\020Z\032\0020\rJ\b\020[\032\0020\034H\026J\016\020\\\032\0020\0202\006\020]\032\0020\034J\"\020&\032\0020'2\006\020*\032\0020\0342\b\b\002\020\023\032\0020\t2\b\b\002\020^\032\0020\034J\006\020_\032\0020`J\006\020a\032\0020`J\006\020b\032\0020\rJ\006\020c\032\0020\rJ\020\020b\032\0020\r2\006\020d\032\0020\tH\003J\030\020e\032\0020\0202\006\020f\032\0020\0342\006\020I\032\0020\tH\002J\"\020g\032\002Hh\"\004\b\000\020h2\f\020i\032\b\022\004\022\002Hh0VH\b¢\006\002\020jR\022\020\004\032\0020\005X¤\004¢\006\006\032\004\b\006\020\007R\022\020\b\032\0020\t8\000@\000X\016¢\006\002\n\000R\020\020\n\032\0020\0138\006X\004¢\006\002\n\000R\020\020\033\032\004\030\0010\034X\016¢\006\002\n\000R\036\020\035\032\0060\036j\002`\037X\016¢\006\016\n\000\032\004\b \020!\"\004\b\"\020#\002\007\n\005\b20\001¨\006k"}, d2 = {"Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "", "<init>", "()V", "source", "", "getSource", "()Ljava/lang/CharSequence;", "currentPosition", "", "path", "Lkotlinx/serialization/json/internal/JsonPath;", "isWs", "", "", "ensureHaveChars", "", "isNotEof", "prefetchOrEof", "position", "canConsumeValue", "consumeNextToken", "", "tryConsumeComma", "isValidValueStart", "c", "expectEof", "peekedString", "", "escapedString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "getEscapedString", "()Ljava/lang/StringBuilder;", "setEscapedString", "(Ljava/lang/StringBuilder;)V", "expected", "unexpectedToken", "fail", "", "expectedToken", "wasConsumed", "message", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "fail$kotlinx_serialization_json", "peekNextToken", "tryConsumeNull", "doConsume", "skipWhitespaces", "peekLeadingMatchingValue", "keyToMatch", "isLenient", "peekString", "discardPeeked", "indexOf", "char", "startPos", "substring", "endPos", "consumeKeyString", "insideString", "consumeStringChunked", "consumeChunk", "Lkotlin/Function1;", "stringChunk", "writeRange", "fromIndex", "toIndex", "currentChunkHasEscape", "consumeString", "startPosition", "current", "appendEscape", "lastPosition", "decodedString", "takePeeked", "consumeStringLenientNotNull", "wasUnquotedString", "consumeStringLenient", "appendRange", "appendEsc", "appendHex", "require", "condition", "Lkotlin/Function0;", "require$kotlinx_serialization_json", "fromHexChar", "skipElement", "allowLenientStrings", "toString", "failOnUnknownKey", "key", "hint", "consumeNumericLiteral", "", "consumeNumericLiteralFully", "consumeBoolean", "consumeBooleanLenient", "start", "consumeBooleanLiteral", "literalSuffix", "withPositionRollback", "T", "action", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nAbstractJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer$fail$1\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,763:1\n226#1,10:764\n755#1,5:775\n226#1,10:780\n226#1,10:792\n229#2:774\n229#2:790\n1#3:791\n*S KotlinDebug\n*F\n+ 1 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n206#1:764,10\n216#1:775,5\n223#1:780,10\n685#1:792,10\n206#1:774\n223#1:790\n*E\n"})
/*     */ public abstract class AbstractJsonLexer
/*     */ {
/*     */   @JvmField
/*     */   public int currentPosition;
/*     */   @JvmField
/*     */   @NotNull
/* 155 */   public final JsonPath path = new JsonPath(); @Nullable
/*     */   private String peekedString;
/*     */   protected final boolean isWs(char $this$isWs) {
/* 158 */     int $i$f$isWs = 0; return ($this$isWs == ' ' || $this$isWs == '\n' || $this$isWs == '\r' || $this$isWs == '\t');
/*     */   }
/*     */   public void ensureHaveChars() {}
/*     */   public final boolean isNotEof() {
/* 162 */     return (peekNextToken() != 10);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final boolean tryConsumeComma() {
/* 172 */     int current = skipWhitespaces();
/* 173 */     CharSequence source = getSource();
/* 174 */     if (current >= source.length() || current == -1) return false; 
/* 175 */     if (source.charAt(current) == ',') {
/* 176 */       this.currentPosition++;
/* 177 */       return true;
/*     */     } 
/* 179 */     return false;
/*     */   }
/*     */   
/*     */   protected final boolean isValidValueStart(char c) {
/* 183 */     switch (c) { case ',': case ':': case ']': case '}':  }  return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public final void expectEof() {
/* 190 */     byte nextToken = consumeNextToken();
/* 191 */     if (nextToken != 10) {
/* 192 */       fail$default(this, "Expected EOF after parsing, but had " + getSource().charAt(this.currentPosition - 1) + " instead", 0, null, 6, null); throw new KotlinNothingValueException();
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/* 200 */   private StringBuilder escapedString = new StringBuilder(); @NotNull protected final StringBuilder getEscapedString() { return this.escapedString; } protected final void setEscapedString(@NotNull StringBuilder <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.escapedString = <set-?>; }
/*     */ 
/*     */   
/*     */   public final byte consumeNextToken(byte expected) {
/* 204 */     byte token = consumeNextToken();
/* 205 */     if (token != expected)
/*     */     
/*     */     { 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 766 */       boolean wasConsumed$iv = true;
/*     */       
/*     */       int $i$f$fail$kotlinx_serialization_json = 0;
/*     */       
/* 770 */       String expected$iv = AbstractJsonLexerKt.tokenDescription(expected);
/* 771 */       int position$iv = this.currentPosition - 1;
/* 772 */       String s$iv = (this.currentPosition == getSource().length() || position$iv < 0) ? "EOF" : String.valueOf(getSource().charAt(position$iv));
/* 773 */       String str1 = s$iv, str3 = expected$iv; AbstractJsonLexer abstractJsonLexer = this; int $i$a$-fail$kotlinx_serialization_json-AbstractJsonLexer$fail$1 = 0; str1 = str1; String str2 = str3; fail$default(
/* 774 */           abstractJsonLexer, "Expected " + str2 + ", but had '" + str1 + "' instead", position$iv, null, 4, null); throw new KotlinNothingValueException(); }  return token; } @Metadata(mv = {2, 1, 0}, k = 3, xi = 176) public static final class AbstractJsonLexer$fail$1 implements Function2<String, String, String> {
/* 775 */     public static final AbstractJsonLexer$fail$1 INSTANCE = new AbstractJsonLexer$fail$1(); public final String invoke(String expected, String source) { Intrinsics.checkNotNullParameter(expected, "expected"); Intrinsics.checkNotNullParameter(source, "source"); return "Expected " + expected + ", but had '" + source + "' instead"; } } @NotNull public final Void fail$kotlinx_serialization_json(byte expectedToken, boolean wasConsumed, @NotNull Function2 message) { Intrinsics.checkNotNullParameter(message, "message"); int $i$f$fail$kotlinx_serialization_json = 0; String expected = AbstractJsonLexerKt.tokenDescription(expectedToken); int position = wasConsumed ? (this.currentPosition - 1) : this.currentPosition; String s = (this.currentPosition == getSource().length() || position < 0) ? "EOF" : String.valueOf(getSource().charAt(position)); fail$default(this, (String)message.invoke(expected, s), position, null, 4, null); throw new KotlinNothingValueException(); } public byte peekNextToken() { CharSequence source = getSource(); int cpos = this.currentPosition; while (true) { cpos = prefetchOrEof(cpos); if (cpos != -1) { char ch = source.charAt(cpos); switch (ch) { case '\t': case '\n': case '\r': case ' ': cpos++; continue; }  this.currentPosition = cpos; return AbstractJsonLexerKt.charToTokenClass(ch); }  break; }  this.currentPosition = cpos; return 10; } public final boolean tryConsumeNull(boolean doConsume) { int current = skipWhitespaces(); current = prefetchOrEof(current); int len = getSource().length() - current; if (len < 4 || current == -1) return false;  for (int i = 0; i < 4; i++) { if ("null".charAt(i) != getSource().charAt(current + i)) return false;  }  if (len > 4 && AbstractJsonLexerKt.charToTokenClass(getSource().charAt(current + 4)) == 0) return false;  if (doConsume) this.currentPosition = current + 4;  return true; } @Nullable public final String peekString(boolean isLenient) { byte token = peekNextToken(); if (token != 1 && token != 0) return null;  if (token != 1) return null;  String string = isLenient ? consumeStringLenient() : consumeString(); this.peekedString = string; return string; } public final void discardPeeked() { this.peekedString = null; } public int indexOf(char char, int startPos) { return StringsKt.indexOf$default(getSource(), char, startPos, false, 4, null); } @NotNull public String substring(int startPos, int endPos) { return getSource().subSequence(startPos, endPos).toString(); } protected final void unexpectedToken(char expected) { if (this.currentPosition > 0 && expected == '"') { String inputLiteral; AbstractJsonLexer this_$iv = this; int $i$f$withPositionRollback = 0; int snapshot$iv = this_$iv.currentPosition;
/*     */       
/* 777 */       try { int $i$a$-withPositionRollback-AbstractJsonLexer$unexpectedToken$inputLiteral$1 = 0; int i = this.currentPosition; this.currentPosition = i + -1; String str = consumeStringLenient();
/*     */         
/* 779 */         this_$iv.currentPosition = snapshot$iv; } finally { this_$iv.currentPosition = snapshot$iv; }
/*     */        if (Intrinsics.areEqual(inputLiteral, "null")) { fail("Expected string literal but 'null' literal was found", this.currentPosition - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value."); throw new KotlinNothingValueException(); }
/*     */        }
/* 782 */      byte expectedToken$iv = AbstractJsonLexerKt.charToTokenClass(expected); boolean wasConsumed$iv = true;
/*     */     
/*     */     int $i$f$fail$kotlinx_serialization_json = 0;
/*     */     
/* 786 */     String expected$iv = AbstractJsonLexerKt.tokenDescription(expectedToken$iv);
/* 787 */     int position$iv = this.currentPosition - 1;
/* 788 */     String s$iv = (this.currentPosition == getSource().length() || position$iv < 0) ? "EOF" : String.valueOf(getSource().charAt(position$iv));
/* 789 */     String str1 = s$iv, str3 = expected$iv; AbstractJsonLexer abstractJsonLexer = this; int $i$a$-fail$kotlinx_serialization_json-AbstractJsonLexer$fail$1 = 0; str1 = str1; String str2 = str3; fail$default(
/* 790 */         abstractJsonLexer, "Expected " + str2 + ", but had '" + str1 + "' instead", position$iv, null, 4, null); throw new KotlinNothingValueException(); }
/* 791 */   private final boolean insideString(boolean isLenient, char char) { return isLenient ? ((AbstractJsonLexerKt.charToTokenClass(char) == 0)) : ((char != '"')); } public void consumeStringChunked(boolean isLenient, @NotNull Function1<? super String, Unit> consumeChunk) { Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk"); byte nextToken = peekNextToken(); if (isLenient && nextToken != 0) return;  if (!isLenient) consumeNextToken('"');  int currentPosition = this.currentPosition; int lastPosition = currentPosition; char char = getSource().charAt(currentPosition); boolean usedAppend = false; while (insideString(isLenient, char)) { if (!isLenient && char == '\\') { usedAppend = true; currentPosition = prefetchOrEof(appendEscape(lastPosition, currentPosition)); lastPosition = currentPosition; } else { currentPosition++; }  if (currentPosition >= getSource().length()) { writeRange(lastPosition, currentPosition, usedAppend, consumeChunk); usedAppend = false; currentPosition = prefetchOrEof(currentPosition); if (currentPosition == -1) { fail$default(this, "EOF", currentPosition, null, 4, null); throw new KotlinNothingValueException(); }  lastPosition = currentPosition; }  char = getSource().charAt(currentPosition); }  writeRange(lastPosition, currentPosition, usedAppend, consumeChunk); this.currentPosition = currentPosition; if (!isLenient) consumeNextToken('"');  } private final void writeRange(int fromIndex, int toIndex, boolean currentChunkHasEscape, Function1 consumeChunk) { if (currentChunkHasEscape) { consumeChunk.invoke(decodedString(fromIndex, toIndex)); } else { consumeChunk.invoke(substring(fromIndex, toIndex)); }  } @NotNull public final String consumeString() { if (this.peekedString != null) return takePeeked();  return consumeKeyString(); } @NotNull protected final String consumeString(@NotNull CharSequence source, int startPosition, int current) { Intrinsics.checkNotNullParameter(source, "source"); int currentPosition = current; int lastPosition = startPosition; char char = source.charAt(currentPosition); boolean usedAppend = false; while (char != '"') { if (char == '\\') { usedAppend = true; currentPosition = prefetchOrEof(appendEscape(lastPosition, currentPosition)); if (currentPosition == -1) { fail$default(this, "Unexpected EOF", currentPosition, null, 4, null); throw new KotlinNothingValueException(); }  lastPosition = currentPosition; } else if (++currentPosition >= source.length()) { usedAppend = true; appendRange(lastPosition, currentPosition); currentPosition = prefetchOrEof(currentPosition); if (currentPosition == -1) { fail$default(this, "Unexpected EOF", currentPosition, null, 4, null); throw new KotlinNothingValueException(); }  lastPosition = currentPosition; }  char = source.charAt(currentPosition); }  String string = !usedAppend ? substring(lastPosition, currentPosition) : decodedString(lastPosition, currentPosition); this.currentPosition = currentPosition + 1; return string; } private final int appendEscape(int lastPosition, int current) { appendRange(lastPosition, current); return appendEsc(current + 1); } private final String decodedString(int lastPosition, int currentPosition) { appendRange(lastPosition, currentPosition); Intrinsics.checkNotNullExpressionValue(this.escapedString.toString(), "toString(...)"); String result = this.escapedString.toString(); this.escapedString.setLength(0); return result; } private final String takePeeked() { Intrinsics.checkNotNull(this.peekedString); String str1 = this.peekedString, it = str1; int $i$a$-also-AbstractJsonLexer$takePeeked$1 = 0; this.peekedString = null; return str1; } @NotNull public final String consumeStringLenientNotNull() { String result = consumeStringLenient(); if (Intrinsics.areEqual(result, "null") && wasUnquotedString()) { fail$default(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null); throw new KotlinNothingValueException(); }  return result; } private final boolean wasUnquotedString() { return (getSource().charAt(this.currentPosition - 1) != '"'); } @NotNull public final String consumeStringLenient() { if (this.peekedString != null) return takePeeked();  int current = skipWhitespaces(); if (current >= getSource().length() || current == -1) { fail$default(this, "EOF", current, null, 4, null); throw new KotlinNothingValueException(); }  byte token = AbstractJsonLexerKt.charToTokenClass(getSource().charAt(current)); if (token == 1) return consumeString();  if (token != 0) { fail$default(this, "Expected beginning of the string, but got " + getSource().charAt(current), 0, null, 6, null); throw new KotlinNothingValueException(); }  boolean usedAppend = false; while (AbstractJsonLexerKt.charToTokenClass(getSource().charAt(current)) == 0) { current++; if (current >= getSource().length()) { usedAppend = true; appendRange(this.currentPosition, current); int eof = prefetchOrEof(current); if (eof == -1) { this.currentPosition = current; return decodedString(0, 0); }  current = eof; }  }  String result = !usedAppend ? substring(this.currentPosition, current) : decodedString(this.currentPosition, current); this.currentPosition = current; return result; } protected void appendRange(int fromIndex, int toIndex) { this.escapedString.append(getSource(), fromIndex, toIndex); } private final int appendEsc(int startPosition) { int currentPosition = startPosition; currentPosition = prefetchOrEof(currentPosition); if (currentPosition == -1) { fail$default(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null); throw new KotlinNothingValueException(); }  char currentChar = getSource().charAt(currentPosition++); if (currentChar == 'u') return appendHex(getSource(), currentPosition);  char c = AbstractJsonLexerKt.escapeToChar(currentChar); if (c == '\000') { fail$default(this, "Invalid escaped char '" + currentChar + '\'', 0, null, 6, null); throw new KotlinNothingValueException(); }  this.escapedString.append(c); return currentPosition; }
/*     */   private final int appendHex(CharSequence source, int startPos) { if (startPos + 4 >= source.length()) { this.currentPosition = startPos; ensureHaveChars(); if (this.currentPosition + 4 >= source.length()) { fail$default(this, "Unexpected EOF during unicode escape", 0, null, 6, null); throw new KotlinNothingValueException(); }  return appendHex(source, this.currentPosition); }  this.escapedString.append((char)((fromHexChar(source, startPos) << 12) + (fromHexChar(source, startPos + 1) << 8) + (fromHexChar(source, startPos + 2) << 4) + fromHexChar(source, startPos + 3))); return startPos + 4; }
/*     */   public final void require$kotlinx_serialization_json(boolean condition, int position, @NotNull Function0 message) { Intrinsics.checkNotNullParameter(message, "message"); int $i$f$require$kotlinx_serialization_json = 0; if (!condition) { fail$default(this, (String)message.invoke(), position, null, 4, null); throw new KotlinNothingValueException(); }  }
/* 794 */   public final long consumeNumericLiteralFully() { long result = consumeNumericLiteral(); byte next = consumeNextToken(); if (next != 10) { byte expectedToken$iv = 10; boolean wasConsumed$iv = true;
/*     */       
/*     */       int $i$f$fail$kotlinx_serialization_json = 0;
/*     */       
/* 798 */       String expected$iv = AbstractJsonLexerKt.tokenDescription(expectedToken$iv);
/* 799 */       int position$iv = this.currentPosition - 1;
/* 800 */       String s$iv = (this.currentPosition == getSource().length() || position$iv < 0) ? "EOF" : String.valueOf(getSource().charAt(position$iv));
/* 801 */       String str1 = s$iv; AbstractJsonLexer abstractJsonLexer = this; int $i$a$-fail$kotlinx_serialization_json$default-AbstractJsonLexer$consumeNumericLiteralFully$1 = 0; fail$default(abstractJsonLexer, "Expected input to contain a single valid number, but got '" + str1 + "' after it", position$iv, null, 4, null); throw new KotlinNothingValueException(); }
/*     */     
/*     */     return result; }
/*     */ 
/*     */   
/*     */   private final int fromHexChar(CharSequence source, int currentPosition) {
/*     */     char character = source.charAt(currentPosition);
/*     */     if (('A' <= character) ? ((character < 'G')) : false) {
/*     */     
/*     */     } else {
/*     */       fail$default(this, "Invalid toHexChar char '" + character + "' in unicode escape", 0, null, 6, null);
/*     */       throw new KotlinNothingValueException();
/*     */     } 
/*     */     return (('0' <= character) ? ((character < ':')) : false) ? (character - 48) : ((('a' <= character) ? ((character < 'g')) : false) ? (character - 97 + 10) : "JD-Core does not support Kotlin");
/*     */   }
/*     */   
/*     */   public final void skipElement(boolean allowLenientStrings) {
/*     */     List<Byte> tokenStack = new ArrayList();
/*     */     byte lastToken = peekNextToken();
/*     */     if (lastToken != 8 && lastToken != 6) {
/*     */       consumeStringLenient();
/*     */       return;
/*     */     } 
/*     */     while (true) {
/*     */       lastToken = peekNextToken();
/*     */       if (lastToken == 1) {
/*     */         allowLenientStrings ? consumeStringLenient() : consumeKeyString();
/*     */         continue;
/*     */       } 
/*     */       byte b = lastToken;
/*     */       if (b == 8 || b == 6) {
/*     */         tokenStack.add(Byte.valueOf(lastToken));
/*     */       } else if (b == 9) {
/*     */         if (((Number)CollectionsKt.last(tokenStack)).byteValue() != 8)
/*     */           throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found ] instead of } at path: " + this.path, getSource()); 
/*     */         CollectionsKt.removeLast(tokenStack);
/*     */       } else if (b == 7) {
/*     */         if (((Number)CollectionsKt.last(tokenStack)).byteValue() != 6)
/*     */           throw JsonExceptionsKt.JsonDecodingException(this.currentPosition, "found } instead of ] at path: " + this.path, getSource()); 
/*     */         CollectionsKt.removeLast(tokenStack);
/*     */       } else if (b == 10) {
/*     */         fail$default(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
/*     */         throw new KotlinNothingValueException();
/*     */       } 
/*     */       consumeNextToken();
/*     */       if (tokenStack.size() == 0)
/*     */         break; 
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "JsonReader(source='" + getSource() + "', currentPosition=" + this.currentPosition + ')';
/*     */   }
/*     */   
/*     */   public final void failOnUnknownKey(@NotNull String key) {
/*     */     Intrinsics.checkNotNullParameter(key, "key");
/*     */     String processed = substring(0, this.currentPosition);
/*     */     int lastIndexOf = StringsKt.lastIndexOf$default(processed, key, 0, false, 6, null);
/*     */     throw new JsonDecodingException("Encountered an unknown key '" + key + "' at offset " + lastIndexOf + " at path: " + this.path.getPath() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + JsonExceptionsKt.minify(getSource(), lastIndexOf));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Void fail(@NotNull String message, int position, @NotNull String hint) {
/*     */     Intrinsics.checkNotNullParameter(message, "message");
/*     */     Intrinsics.checkNotNullParameter(hint, "hint");
/*     */     String hintMessage = ((hint.length() == 0)) ? "" : ('\n' + hint);
/*     */     throw JsonExceptionsKt.JsonDecodingException(position, message + " at path: " + this.path.getPath() + hintMessage, getSource());
/*     */   }
/*     */   
/*     */   public final long consumeNumericLiteral() {
/*     */     int current = skipWhitespaces();
/*     */     current = prefetchOrEof(current);
/*     */     if (current >= getSource().length() || current == -1) {
/*     */       fail$default(this, "EOF", 0, null, 6, null);
/*     */       throw new KotlinNothingValueException();
/*     */     } 
/*     */     if (++current == getSource().length()) {
/*     */       fail$default(this, "EOF", 0, null, 6, null);
/*     */       throw new KotlinNothingValueException();
/*     */     } 
/*     */     boolean hasQuotation = (getSource().charAt(current) == '"');
/*     */     long accumulator = 0L;
/*     */     long exponentAccumulator = 0L;
/*     */     boolean isNegative = false;
/*     */     boolean isExponentPositive = false;
/*     */     boolean hasExponent = false;
/*     */     int start = current;
/*     */     while (current != getSource().length()) {
/*     */       char ch = getSource().charAt(current);
/*     */       if ((ch == 'e' || ch == 'E') && !hasExponent) {
/*     */         if (current == start) {
/*     */           fail$default(this, "Unexpected symbol " + ch + " in numeric literal", 0, null, 6, null);
/*     */           throw new KotlinNothingValueException();
/*     */         } 
/*     */         isExponentPositive = true;
/*     */         hasExponent = true;
/*     */         current++;
/*     */         continue;
/*     */       } 
/*     */       if (ch == '-' && hasExponent) {
/*     */         if (current == start) {
/*     */           fail$default(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
/*     */           throw new KotlinNothingValueException();
/*     */         } 
/*     */         isExponentPositive = false;
/*     */         current++;
/*     */         continue;
/*     */       } 
/*     */       if (ch == '+' && hasExponent) {
/*     */         if (current == start) {
/*     */           fail$default(this, "Unexpected symbol '+' in numeric literal", 0, null, 6, null);
/*     */           throw new KotlinNothingValueException();
/*     */         } 
/*     */         isExponentPositive = true;
/*     */         current++;
/*     */         continue;
/*     */       } 
/*     */       if (ch == '-') {
/*     */         if (current != start) {
/*     */           fail$default(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
/*     */           throw new KotlinNothingValueException();
/*     */         } 
/*     */         isNegative = true;
/*     */         current++;
/*     */         continue;
/*     */       } 
/*     */       byte token = AbstractJsonLexerKt.charToTokenClass(ch);
/*     */       if (token == 0) {
/*     */         current++;
/*     */         int digit = ch - 48;
/*     */         if (!((0 <= digit) ? ((digit < 10) ? 1 : 0) : 0)) {
/*     */           fail$default(this, "Unexpected symbol '" + ch + "' in numeric literal", 0, null, 6, null);
/*     */           throw new KotlinNothingValueException();
/*     */         } 
/*     */         if (hasExponent) {
/*     */           exponentAccumulator = exponentAccumulator * 10L + digit;
/*     */           continue;
/*     */         } 
/*     */         accumulator = accumulator * 10L - digit;
/*     */         if (accumulator > 0L) {
/*     */           fail$default(this, "Numeric value overflow", 0, null, 6, null);
/*     */           throw new KotlinNothingValueException();
/*     */         } 
/*     */       } 
/*     */     } 
/*     */     boolean hasChars = (current != start);
/*     */     if (start == current || (isNegative && start == current - 1)) {
/*     */       fail$default(this, "Expected numeric literal", 0, null, 6, null);
/*     */       throw new KotlinNothingValueException();
/*     */     } 
/*     */     if (hasQuotation) {
/*     */       if (!hasChars) {
/*     */         fail$default(this, "EOF", 0, null, 6, null);
/*     */         throw new KotlinNothingValueException();
/*     */       } 
/*     */       if (getSource().charAt(current) != '"') {
/*     */         fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
/*     */         throw new KotlinNothingValueException();
/*     */       } 
/*     */       current++;
/*     */     } 
/*     */     this.currentPosition = current;
/*     */     if (hasExponent) {
/*     */       double doubleAccumulator = accumulator * consumeNumericLiteral$calculateExponent(exponentAccumulator, isExponentPositive);
/*     */       if (doubleAccumulator > 9.223372036854776E18D || doubleAccumulator < -9.223372036854776E18D) {
/*     */         fail$default(this, "Numeric value overflow", 0, null, 6, null);
/*     */         throw new KotlinNothingValueException();
/*     */       } 
/*     */       if (!((Math.floor(doubleAccumulator) == doubleAccumulator) ? 1 : 0)) {
/*     */         fail$default(this, "Can't convert " + doubleAccumulator + " to Long", 0, null, 6, null);
/*     */         throw new KotlinNothingValueException();
/*     */       } 
/*     */       accumulator = (long)doubleAccumulator;
/*     */     } 
/*     */     if (accumulator != Long.MIN_VALUE) {
/*     */     
/*     */     } else {
/*     */       fail$default(this, "Numeric value overflow", 0, null, 6, null);
/*     */       throw new KotlinNothingValueException();
/*     */     } 
/*     */     return isNegative ? accumulator : "JD-Core does not support Kotlin";
/*     */   }
/*     */   
/*     */   private static final double consumeNumericLiteral$calculateExponent(long exponentAccumulator, boolean isExponentPositive) {
/*     */     boolean bool = isExponentPositive;
/*     */     if (bool == true) {
/*     */     
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */     return !bool ? Math.pow(10.0D, -(exponentAccumulator)) : "JD-Core does not support Kotlin";
/*     */   }
/*     */   
/*     */   public final boolean consumeBoolean() {
/*     */     return consumeBoolean(skipWhitespaces());
/*     */   }
/*     */   
/*     */   public final boolean consumeBooleanLenient() {
/*     */     int current = skipWhitespaces();
/*     */     if (current == getSource().length()) {
/*     */       fail$default(this, "EOF", 0, null, 6, null);
/*     */       throw new KotlinNothingValueException();
/*     */     } 
/*     */     current++;
/*     */     boolean hasQuotation = (getSource().charAt(current) == '"');
/*     */     boolean result = consumeBoolean(current);
/*     */     if (hasQuotation) {
/*     */       if (this.currentPosition == getSource().length()) {
/*     */         fail$default(this, "EOF", 0, null, 6, null);
/*     */         throw new KotlinNothingValueException();
/*     */       } 
/*     */       if (getSource().charAt(this.currentPosition) != '"') {
/*     */         fail$default(this, "Expected closing quotation mark", 0, null, 6, null);
/*     */         throw new KotlinNothingValueException();
/*     */       } 
/*     */       this.currentPosition++;
/*     */     } 
/*     */     return result;
/*     */   }
/*     */   
/*     */   private final boolean consumeBoolean(int start) {
/*     */     int current = prefetchOrEof(start);
/*     */     if (current >= getSource().length() || current == -1) {
/*     */       fail$default(this, "EOF", 0, null, 6, null);
/*     */       throw new KotlinNothingValueException();
/*     */     } 
/*     */     switch (getSource().charAt(current++) | 0x20) {
/*     */       case 116:
/*     */         consumeBooleanLiteral("rue", current);
/*     */       case 102:
/*     */         consumeBooleanLiteral("alse", current);
/*     */     } 
/*     */     fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
/*     */     throw new KotlinNothingValueException();
/*     */   }
/*     */   
/*     */   private final void consumeBooleanLiteral(String literalSuffix, int current) {
/*     */     if (getSource().length() - current < literalSuffix.length()) {
/*     */       fail$default(this, "Unexpected end of boolean literal", 0, null, 6, null);
/*     */       throw new KotlinNothingValueException();
/*     */     } 
/*     */     for (int i = 0, j = literalSuffix.length(); i < j; i++) {
/*     */       char expected = literalSuffix.charAt(i);
/*     */       char actual = getSource().charAt(current + i);
/*     */       if (expected != (actual | 0x20)) {
/*     */         fail$default(this, "Expected valid boolean literal prefix, but had '" + consumeStringLenient() + '\'', 0, null, 6, null);
/*     */         throw new KotlinNothingValueException();
/*     */       } 
/*     */     } 
/*     */     this.currentPosition = current + literalSuffix.length();
/*     */   }
/*     */   
/*     */   private final <T> T withPositionRollback(Function0 action) {
/*     */     int $i$f$withPositionRollback = 0, snapshot = this.currentPosition;
/*     */     try {
/*     */       return (T)action.invoke();
/*     */     } finally {
/*     */       InlineMarker.finallyStart(1);
/*     */       this.currentPosition = snapshot;
/*     */       InlineMarker.finallyEnd(1);
/*     */     } 
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected abstract CharSequence getSource();
/*     */   
/*     */   public abstract int prefetchOrEof(int paramInt);
/*     */   
/*     */   public abstract boolean canConsumeValue();
/*     */   
/*     */   public abstract byte consumeNextToken();
/*     */   
/*     */   public abstract void consumeNextToken(char paramChar);
/*     */   
/*     */   public abstract int skipWhitespaces();
/*     */   
/*     */   @Nullable
/*     */   public abstract String peekLeadingMatchingValue(@NotNull String paramString, boolean paramBoolean);
/*     */   
/*     */   @NotNull
/*     */   public abstract String consumeKeyString();
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\AbstractJsonLexer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */