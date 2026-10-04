package com.example.ui.screens;

import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridItemSpan;
import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: LazyStaggeredGridDsl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", ExifInterface.GPS_DIRECTION_TRUE, "index", "", "invoke", "androidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridDslKt$items$4$1"}, k = 3, mv = {2, 2, 0}, xi = 48)
final class DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256$$inlined$items$default$3 extends Lambda implements Function1<Integer, StaggeredGridItemSpan> {
    final /* synthetic */ List $items;
    final /* synthetic */ Function1 $span;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardScreenKt$DashboardScreen$lambda$276$lambda$275$lambda$274$lambda$257$lambda$256$$inlined$items$default$3(Function1 function1, List list) {
        super(1);
        this.$span = function1;
        this.$items = list;
    }

    public final StaggeredGridItemSpan invoke(int i) {
        return (StaggeredGridItemSpan) this.$span.invoke(this.$items.get(i));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
