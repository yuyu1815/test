/*    */ package ai.grazie.model.cloud.paging;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\005\n\002\020\b\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J)\020\003\032\016\022\n\022\b\022\004\022\002H\0060\0050\004\"\004\b\001\020\0062\f\020\007\032\b\022\004\022\002H\0060\004HÆ\001J\032\020\b\032\b\022\004\022\002H\t0\005\"\004\b\001\020\t2\006\020\n\032\0020\013¨\006\f"}, d2 = {"Lai/grazie/model/cloud/paging/IterablePage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/cloud/paging/IterablePage;", "T0", "typeSerial0", "start", "T", "size", "", "model-cloud"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final <T0> KSerializer<IterablePage<T0>> serializer(@NotNull KSerializer typeSerial0) {
/* 18 */     Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0"); return (KSerializer<IterablePage<T0>>)new IterablePage.$serializer(typeSerial0); } @NotNull
/* 19 */   public final <T> IterablePage<T> start(int size) { return new IterablePage<>(null, size); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\paging\IterablePage$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */