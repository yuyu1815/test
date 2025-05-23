/*     */ package kotlinx.serialization.json;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.json.internal.StringOpsKt;
/*     */ import kotlinx.serialization.json.internal.SuppressAnimalSniffer;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\006\n\002\020\016\n\002\b\006\n\002\020\b\n\000\b\000\030\0002\0020\001B%\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007¢\006\004\b\b\020\tJ\b\020\021\032\0020\016H\026J\023\020\022\032\0020\0052\b\020\023\032\004\030\0010\003H\002J\b\020\024\032\0020\025H\027R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\004\020\nR\026\020\006\032\004\030\0010\007X\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\016X\004¢\006\b\n\000\032\004\b\017\020\020¨\006\026"}, d2 = {"Lkotlinx/serialization/json/JsonLiteral;", "Lkotlinx/serialization/json/JsonPrimitive;", "body", "", "isString", "", "coerceToInlineType", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "(Ljava/lang/Object;ZLkotlinx/serialization/descriptors/SerialDescriptor;)V", "()Z", "getCoerceToInlineType$kotlinx_serialization_json", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "content", "", "getContent", "()Ljava/lang/String;", "toString", "equals", "other", "hashCode", "", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nJsonElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonLiteral\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,350:1\n1#2:351\n*E\n"})
/*     */ public final class JsonLiteral
/*     */   extends JsonPrimitive
/*     */ {
/*     */   private final boolean isString;
/*     */   @Nullable
/*     */   private final SerialDescriptor coerceToInlineType;
/*     */   @NotNull
/*     */   private final String content;
/*     */   
/*     */   public boolean isString() {
/* 144 */     return this.isString; } @Nullable
/* 145 */   public final SerialDescriptor getCoerceToInlineType$kotlinx_serialization_json() { return this.coerceToInlineType; }
/* 146 */   public JsonLiteral(@NotNull Object body, boolean isString, @Nullable SerialDescriptor coerceToInlineType) { super(null); this.isString = isString; this.coerceToInlineType = coerceToInlineType;
/* 147 */     this.content = body.toString();
/*     */ 
/*     */     
/* 150 */     if (this.coerceToInlineType != null && !this.coerceToInlineType.isInline()) { String str = "Failed requirement."; throw new IllegalArgumentException(str.toString()); }
/*     */      }
/*     */    @NotNull
/*     */   public String toString() {
/* 154 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$toString_u24lambda_u240 = stringBuilder1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 351 */     int $i$a$-buildString-JsonLiteral$toString$1 = 0;
/*     */     StringOpsKt.printQuoted($this$toString_u24lambda_u240, getContent());
/*     */     return isString() ? stringBuilder1.toString() : getContent();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getContent() {
/*     */     return this.content;
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (other == null || getClass() != other.getClass())
/*     */       return false; 
/*     */     (JsonLiteral)other;
/*     */     if (isString() != ((JsonLiteral)other).isString())
/*     */       return false; 
/*     */     if (!Intrinsics.areEqual(getContent(), ((JsonLiteral)other).getContent()))
/*     */       return false; 
/*     */     return true;
/*     */   }
/*     */   
/*     */   @SuppressAnimalSniffer
/*     */   public int hashCode() {
/*     */     int result = Boolean.hashCode(isString());
/*     */     result = 31 * result + getContent().hashCode();
/*     */     return result;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonLiteral.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */