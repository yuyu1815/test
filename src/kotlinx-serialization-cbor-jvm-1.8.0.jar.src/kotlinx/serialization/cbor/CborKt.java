/*     */ package kotlinx.serialization.cbor;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.ExperimentalSerializationApi;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\034\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\032+\020\000\032\0020\0012\b\b\002\020\002\032\0020\0012\027\020\003\032\023\022\004\022\0020\005\022\004\022\0020\0060\004¢\006\002\b\007H\007¨\006\b"}, d2 = {"Cbor", "Lkotlinx/serialization/cbor/Cbor;", "from", "builderAction", "Lkotlin/Function1;", "Lkotlinx/serialization/cbor/CborBuilder;", "", "Lkotlin/ExtensionFunctionType;", "kotlinx-serialization-cbor"})
/*     */ public final class CborKt
/*     */ {
/*     */   @ExperimentalSerializationApi
/*     */   @NotNull
/*     */   public static final Cbor Cbor(@NotNull Cbor from, @NotNull Function1 builderAction) {
/* 109 */     Intrinsics.checkNotNullParameter(from, "from"); Intrinsics.checkNotNullParameter(builderAction, "builderAction"); CborBuilder builder = new CborBuilder(from);
/* 110 */     builderAction.invoke(builder);
/* 111 */     return new CborImpl(new CborConfiguration(
/* 112 */           builder.getEncodeDefaults(), 
/* 113 */           builder.getIgnoreUnknownKeys(), 
/* 114 */           builder.getEncodeKeyTags(), 
/* 115 */           builder.getEncodeValueTags(), 
/* 116 */           builder.getEncodeObjectTags(), 
/* 117 */           builder.getVerifyKeyTags(), 
/* 118 */           builder.getVerifyValueTags(), 
/* 119 */           builder.getVerifyObjectTags(), 
/* 120 */           builder.getUseDefiniteLengthEncoding(), 
/* 121 */           builder.getPreferCborLabelsOverNames(), 
/* 122 */           builder.getAlwaysUseByteString()), 
/* 123 */         builder.getSerializersModule());
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\CborKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */