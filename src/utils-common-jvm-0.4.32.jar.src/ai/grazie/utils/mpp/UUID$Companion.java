/*    */ package ai.grazie.utils.mpp;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.util.List;
/*    */ import java.util.UUID;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.ArraysKt;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.LongCompanionObject;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\022\n\002\b\002\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\020\t\n\002\030\002\n\002\020 \n\002\020\005\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\016\020\007\032\0020\0042\006\020\b\032\0020\tJ\006\020\n\032\0020\004J\017\020\013\032\b\022\004\022\0020\0040\fHÆ\001J\032\020\r\032\0020\016*\0020\0172\f\020\005\032\b\022\004\022\0020\0210\020H\002¨\006\022"}, d2 = {"Lai/grazie/utils/mpp/UUID$Companion;", "", "()V", "ofBytes", "Lai/grazie/utils/mpp/UUID;", "bytes", "", "ofText", "text", "", "random", "serializer", "Lkotlinx/serialization/KSerializer;", "of", "", "Lkotlin/Long$Companion;", "", "", "utils-common"})
/*    */ public final class Companion {
/*    */   @NotNull
/* 18 */   public final KSerializer<UUID> serializer() { return UUID.Serializer.INSTANCE; } private Companion() {} @NotNull
/*    */   public final UUID random() {
/* 20 */     Intrinsics.checkNotNullExpressionValue(UUID.randomUUID(), "randomUUID()"); return new UUID(UUID.randomUUID());
/*    */   }
/*    */   @NotNull
/*    */   public final UUID ofText(@NotNull String text) {
/* 24 */     Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullExpressionValue(UUID.fromString(text), "fromString(text)"); return new UUID(UUID.fromString(text));
/*    */   }
/*    */   @NotNull
/*    */   public final UUID ofBytes(@NotNull byte[] bytes) {
/* 28 */     Intrinsics.checkNotNullParameter(bytes, "bytes"); return new UUID(new UUID(of(LongCompanionObject.INSTANCE, ArraysKt.take(bytes, 8)), of(LongCompanionObject.INSTANCE, CollectionsKt.take(ArraysKt.drop(bytes, 8), 8))));
/*    */   }
/*    */   
/*    */   private final long of(LongCompanionObject $this$of, List bytes) {
/* 32 */     ByteBuffer buffer = ByteBuffer.allocate(8);
/* 33 */     buffer.put(CollectionsKt.toByteArray(bytes));
/* 34 */     buffer.flip();
/*    */     
/* 36 */     return buffer.getLong();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\UUID$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */