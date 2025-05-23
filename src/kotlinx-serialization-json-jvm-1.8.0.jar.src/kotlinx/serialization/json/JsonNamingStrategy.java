/*     */ package kotlinx.serialization.json;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.ExperimentalSerializationApi;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
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
/*     */ @ExperimentalSerializationApi
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003\bç\001\030\000 \t2\0020\001:\001\tJ \020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\003H&¨\006\nÀ\006\003"}, d2 = {"Lkotlinx/serialization/json/JsonNamingStrategy;", "", "serialNameForJson", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementIndex", "", "serialName", "Builtins", "kotlinx-serialization-json"})
/*     */ public interface JsonNamingStrategy
/*     */ {
/*     */   @NotNull
/*     */   public static final Builtins Builtins = Builtins.$$INSTANCE;
/*     */   
/*     */   @NotNull
/*     */   String serialNameForJson(@NotNull SerialDescriptor paramSerialDescriptor, int paramInt, @NotNull String paramString);
/*     */   
/*     */   @ExperimentalSerializationApi
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\007\n\002\020\016\n\002\b\002\n\002\020\f\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\030\020\f\032\0020\r2\006\020\016\032\0020\r2\006\020\017\032\0020\020H\002R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\006\020\003\032\004\b\007\020\bR\034\020\t\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\n\020\003\032\004\b\013\020\b¨\006\021"}, d2 = {"Lkotlinx/serialization/json/JsonNamingStrategy$Builtins;", "", "<init>", "()V", "SnakeCase", "Lkotlinx/serialization/json/JsonNamingStrategy;", "getSnakeCase$annotations", "getSnakeCase", "()Lkotlinx/serialization/json/JsonNamingStrategy;", "KebabCase", "getKebabCase$annotations", "getKebabCase", "convertCamelCase", "", "serialName", "delimiter", "", "kotlinx-serialization-json"})
/*     */   @SourceDebugExtension({"SMAP\nJsonNamingStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonNamingStrategy.kt\nkotlinx/serialization/json/JsonNamingStrategy$Builtins\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1179#2:179\n1180#2:181\n1#3:180\n*S KotlinDebug\n*F\n+ 1 JsonNamingStrategy.kt\nkotlinx/serialization/json/JsonNamingStrategy$Builtins\n*L\n149#1:179\n149#1:181\n*E\n"})
/*     */   public static final class Builtins
/*     */   {
/*     */     @NotNull
/*     */     public final JsonNamingStrategy getSnakeCase() {
/*  96 */       return SnakeCase; } @NotNull
/*  97 */     private static final JsonNamingStrategy SnakeCase = new JsonNamingStrategy$Builtins$SnakeCase$1();
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003*\001\000\b\n\030\0002\0020\001J \020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\003H\026J\b\020\t\032\0020\003H\026¨\006\n"}, d2 = {"kotlinx/serialization/json/JsonNamingStrategy$Builtins$SnakeCase$1", "Lkotlinx/serialization/json/JsonNamingStrategy;", "serialNameForJson", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementIndex", "", "serialName", "toString", "kotlinx-serialization-json"})
/*     */     public static final class JsonNamingStrategy$Builtins$SnakeCase$1 implements JsonNamingStrategy {
/*     */       public String serialNameForJson(SerialDescriptor descriptor, int elementIndex, String serialName) {
/* 102 */         Intrinsics.checkNotNullParameter(descriptor, "descriptor"); Intrinsics.checkNotNullParameter(serialName, "serialName"); return JsonNamingStrategy.Builtins.$$INSTANCE.convertCamelCase(serialName, '_');
/*     */       } public String toString() {
/* 104 */         return "kotlinx.serialization.json.JsonNamingStrategy.SnakeCase";
/*     */       }
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final JsonNamingStrategy getKebabCase() {
/* 131 */       return KebabCase; } @NotNull
/* 132 */     private static final JsonNamingStrategy KebabCase = new JsonNamingStrategy$Builtins$KebabCase$1();
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\003*\001\000\b\n\030\0002\0020\001J \020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\003H\026J\b\020\t\032\0020\003H\026¨\006\n"}, d2 = {"kotlinx/serialization/json/JsonNamingStrategy$Builtins$KebabCase$1", "Lkotlinx/serialization/json/JsonNamingStrategy;", "serialNameForJson", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "elementIndex", "", "serialName", "toString", "kotlinx-serialization-json"})
/*     */     public static final class JsonNamingStrategy$Builtins$KebabCase$1 implements JsonNamingStrategy {
/*     */       public String serialNameForJson(SerialDescriptor descriptor, int elementIndex, String serialName) {
/* 137 */         Intrinsics.checkNotNullParameter(descriptor, "descriptor"); Intrinsics.checkNotNullParameter(serialName, "serialName"); return JsonNamingStrategy.Builtins.$$INSTANCE.convertCamelCase(serialName, '-');
/*     */       } public String toString() {
/* 139 */         return "kotlinx.serialization.json.JsonNamingStrategy.KebabCase";
/*     */       }
/*     */     }
/*     */ 
/*     */     
/*     */     private final String convertCamelCase(String serialName, char delimiter) {
/* 145 */       int i = serialName.length() * 2; StringBuilder stringBuilder1 = new StringBuilder(i), $this$convertCamelCase_u24lambda_u241 = stringBuilder1; int $i$a$-buildString-JsonNamingStrategy$Builtins$convertCamelCase$1 = 0;
/* 146 */       Object bufferedChar = null;
/* 147 */       int previousUpperCharsCount = 0;
/*     */       
/* 149 */       CharSequence $this$forEach$iv = serialName; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 179 */       byte b = 0; if (b < $this$forEach$iv.length()) { char element$iv = $this$forEach$iv.charAt(b), c = element$iv; int $i$a$-forEach-JsonNamingStrategy$Builtins$convertCamelCase$1$1 = 0; if (Character.isUpperCase(c)) { if (previousUpperCharsCount == 0 && (($this$convertCamelCase_u24lambda_u241.length() > 0)) && StringsKt.last($this$convertCamelCase_u24lambda_u241) != delimiter)
/* 180 */             $this$convertCamelCase_u24lambda_u241.append(delimiter);  if (bufferedChar != null) { char p0 = bufferedChar.charValue(); int $i$a$-let-JsonNamingStrategy$Builtins$convertCamelCase$1$1$1 = 0;
/*     */             $this$convertCamelCase_u24lambda_u241.append(p0); }
/*     */           else
/*     */           {  }
/*     */           
/*     */           previousUpperCharsCount++;
/*     */           bufferedChar = Character.valueOf(Character.toLowerCase(c)); }
/*     */         else
/*     */         { if (bufferedChar != null) {
/*     */             if (previousUpperCharsCount > 1 && Character.isLetter(c))
/*     */               $this$convertCamelCase_u24lambda_u241.append(delimiter); 
/*     */             $this$convertCamelCase_u24lambda_u241.append(bufferedChar.charValue());
/*     */             previousUpperCharsCount = 0;
/*     */             bufferedChar = null;
/*     */           } 
/*     */           $this$convertCamelCase_u24lambda_u241.append(c); }
/*     */          }
/*     */       
/*     */       if (bufferedChar != null)
/*     */         $this$convertCamelCase_u24lambda_u241.append(bufferedChar.charValue()); 
/*     */       return stringBuilder1.toString();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonNamingStrategy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */