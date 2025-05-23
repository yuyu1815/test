/*    */ package ai.grazie.model.cloud.paging;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020 \n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\022\020\003\032\b\022\004\022\002H\0050\004\"\004\b\001\020\005J,\020\006\032\b\022\004\022\002H\0050\004\"\004\b\001\020\0052\f\020\007\032\b\022\004\022\002H\0050\b2\n\020\t\032\006\022\002\b\0030\nJ(\020\006\032\b\022\004\022\002H\0050\004\"\004\b\001\020\0052\f\020\007\032\b\022\004\022\002H\0050\b2\006\020\013\032\0020\fJ)\020\r\032\016\022\n\022\b\022\004\022\002H\0170\0040\016\"\004\b\001\020\0172\f\020\020\032\b\022\004\022\002H\0170\016HÆ\001¨\006\021"}, d2 = {"Lai/grazie/model/cloud/paging/IterableWithNext$Companion;", "", "()V", "empty", "Lai/grazie/model/cloud/paging/IterableWithNext;", "T", "from", "values", "", "page", "Lai/grazie/model/cloud/paging/IterablePage;", "pageSize", "", "serializer", "Lkotlinx/serialization/KSerializer;", "T0", "typeSerial0", "model-cloud"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final <T0> KSerializer<IterableWithNext<T0>> serializer(@NotNull KSerializer typeSerial0) {
/* 27 */     Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0"); return (KSerializer<IterableWithNext<T0>>)new IterableWithNext.$serializer(typeSerial0); } @NotNull
/* 28 */   public final <T> IterableWithNext<T> empty() { return new IterableWithNext<>(CollectionsKt.emptyList(), false); }
/*    */   @NotNull
/* 30 */   public final <T> IterableWithNext<T> from(@NotNull List<? extends T> values, @NotNull IterablePage page) { Intrinsics.checkNotNullParameter(values, "values"); Intrinsics.checkNotNullParameter(page, "page"); return new IterableWithNext<>(values, (values.size() == page.getSize())); } @NotNull
/*    */   public final <T> IterableWithNext<T> from(@NotNull List<? extends T> values, int pageSize) {
/* 32 */     Intrinsics.checkNotNullParameter(values, "values"); return new IterableWithNext<>(values, (values.size() == pageSize));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\paging\IterableWithNext$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */